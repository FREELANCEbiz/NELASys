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
@Table(name = "transaction_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionLog.findAll", query = "SELECT t FROM TransactionLog t")
    , @NamedQuery(name = "TransactionLog.findByTransLogID", query = "SELECT t FROM TransactionLog t WHERE t.transLogID = :transLogID")
    , @NamedQuery(name = "TransactionLog.findByDetails", query = "SELECT t FROM TransactionLog t WHERE t.details = :details")
    , @NamedQuery(name = "TransactionLog.findByTransDateTime", query = "SELECT t FROM TransactionLog t WHERE t.transDateTime = :transDateTime")
    , @NamedQuery(name = "TransactionLog.findByTransId", query = "SELECT t FROM TransactionLog t WHERE t.transId = :transId")
    , @NamedQuery(name = "TransactionLog.findByUserId", query = "SELECT t FROM TransactionLog t WHERE t.userId = :userId")})
public class TransactionLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransLogID")
    private Integer transLogID;
    @Basic(optional = false)
    @Column(name = "Details")
    private String details;
    @Basic(optional = false)
    @Column(name = "TransDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDateTime;
    @Basic(optional = false)
    @Column(name = "TransId")
    private int transId;
    @Basic(optional = false)
    @Column(name = "UserId")
    private int userId;

    public TransactionLog() {
    }

    public TransactionLog(Integer transLogID) {
        this.transLogID = transLogID;
    }

    public TransactionLog(Integer transLogID, String details, Date transDateTime, int transId, int userId) {
        this.transLogID = transLogID;
        this.details = details;
        this.transDateTime = transDateTime;
        this.transId = transId;
        this.userId = userId;
    }

    public Integer getTransLogID() {
        return transLogID;
    }

    public void setTransLogID(Integer transLogID) {
        this.transLogID = transLogID;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getTransDateTime() {
        return transDateTime;
    }

    public void setTransDateTime(Date transDateTime) {
        this.transDateTime = transDateTime;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transLogID != null ? transLogID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionLog)) {
            return false;
        }
        TransactionLog other = (TransactionLog) object;
        if ((this.transLogID == null && other.transLogID != null) || (this.transLogID != null && !this.transLogID.equals(other.transLogID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.TransactionLog[ transLogID=" + transLogID + " ]";
    }
    
}
