/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Engkoi Zidac
 */
@Entity
@Table(name = "payroll_period")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PayrollPeriod.findAll", query = "SELECT p FROM PayrollPeriod p")
    , @NamedQuery(name = "PayrollPeriod.findByPPId", query = "SELECT p FROM PayrollPeriod p WHERE p.pPId = :pPId")
    , @NamedQuery(name = "PayrollPeriod.findByTransDate", query = "SELECT p FROM PayrollPeriod p WHERE p.transDate = :transDate")
    , @NamedQuery(name = "PayrollPeriod.findByUserId", query = "SELECT p FROM PayrollPeriod p WHERE p.userId = :userId")
    , @NamedQuery(name = "PayrollPeriod.findByDescription", query = "SELECT p FROM PayrollPeriod p WHERE p.description = :description")
    , @NamedQuery(name = "PayrollPeriod.findByStartDate", query = "SELECT p FROM PayrollPeriod p WHERE p.startDate = :startDate")
    , @NamedQuery(name = "PayrollPeriod.findByEndDate", query = "SELECT p FROM PayrollPeriod p WHERE p.endDate = :endDate")
    , @NamedQuery(name = "PayrollPeriod.findByMonthId", query = "SELECT p FROM PayrollPeriod p WHERE p.monthId = :monthId")
    , @NamedQuery(name = "PayrollPeriod.findByYearId", query = "SELECT p FROM PayrollPeriod p WHERE p.yearId = :yearId")})
public class PayrollPeriod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PPId")
    private Integer pPId;
    @Basic(optional = false)
    @Column(name = "TransDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDate;
    @Basic(optional = false)
    @Column(name = "UserId")
    private int userId;
    @Column(name = "Description")
    private String description;
    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "EndDate")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "MonthId")
    private Integer monthId;
    @Column(name = "YearId")
    private Integer yearId;

    public PayrollPeriod() {
    }

    public PayrollPeriod(Integer pPId) {
        this.pPId = pPId;
    }

    public PayrollPeriod(Integer pPId, Date transDate, int userId) {
        this.pPId = pPId;
        this.transDate = transDate;
        this.userId = userId;
    }

    public Integer getPPId() {
        return pPId;
    }

    public void setPPId(Integer pPId) {
        this.pPId = pPId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pPId != null ? pPId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayrollPeriod)) {
            return false;
        }
        PayrollPeriod other = (PayrollPeriod) object;
        if ((this.pPId == null && other.pPId != null) || (this.pPId != null && !this.pPId.equals(other.pPId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.PayrollPeriod[ pPId=" + pPId + " ]";
    }
    
}
