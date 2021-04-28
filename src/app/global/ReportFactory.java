package app.global;

import app.config.DBConn;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ReportFactory {

    public static void rptBoot() throws FileNotFoundException, IOException {
        try {
            JasperReport jasperReport;

            JasperPrint jPrint;

            //parameters
            HashMap parameters = new HashMap();

            jasperReport = JasperCompileManager.compileReport("rpt/rptboot.jrxml");

            jPrint = JasperFillManager.fillReport(jasperReport, parameters, DBConn.getConnection());

            JasperViewer Viewer = new JasperViewer(jPrint, false);
            Viewer.setExtendedState(Viewer.getExtendedState() | Viewer.MAXIMIZED_BOTH);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
    }



    public static void LaborSummary(String from, String to, String caption) {
        try {
            JasperReport jasperReport;
            JasperPrint jPrint;

            //parameters
            HashMap parameters = new HashMap();
            parameters.put("from", from);
            parameters.put("to", to);
            parameters.put("caption", caption);


            jasperReport = JasperCompileManager.compileReport("rpt/LaborPayroll/Summary.jrxml");

            jPrint = JasperFillManager.fillReport(jasperReport, parameters, DBConn.getConnection());

            JasperViewer Viewer = new JasperViewer(jPrint, false);
            //JasperExportManager.exportReportToPdf(jPrint);
            Viewer.setTitle("Labor Payroll Summary");
            Viewer.setExtendedState(Viewer.getExtendedState() | Viewer.MAXIMIZED_BOTH);
            Viewer.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
        public static void DailyCollectionSummary(String dte) {
        try {
            JasperReport jasperReport;
            JasperPrint jPrint;

            //parameters
            HashMap parameters = new HashMap();
            parameters.put("date", dte);
            parameters.put("caption", dte);


            jasperReport = JasperCompileManager.compileReport("rpt/DailyCollectionReport/Summary.jrxml");

            jPrint = JasperFillManager.fillReport(jasperReport, parameters, DBConn.getConnection());

            JasperViewer Viewer = new JasperViewer(jPrint, false);
            //JasperExportManager.exportReportToPdf(jPrint);
            Viewer.setTitle("Labor Payroll Summary");
            Viewer.setExtendedState(Viewer.getExtendedState() | Viewer.MAXIMIZED_BOTH);
            Viewer.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
     public static void LaborDetailedSummary(String from, String to, String caption) {
        try {
            JasperReport jasperReport;
            JasperPrint jPrint;

            //parameters
            HashMap parameters = new HashMap();
            parameters.put("from", from);
            parameters.put("to", to);
            parameters.put("caption", caption);


            jasperReport = JasperCompileManager.compileReport("rpt/LaborPayrollDetails/SummaryDetails.jrxml");

            jPrint = JasperFillManager.fillReport(jasperReport, parameters, DBConn.getConnection());

            JasperViewer Viewer = new JasperViewer(jPrint, false);
            //JasperExportManager.exportReportToPdf(jPrint);
            Viewer.setTitle("Labor Payroll Summary");
            Viewer.setExtendedState(Viewer.getExtendedState() | Viewer.MAXIMIZED_BOTH);
            Viewer.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
