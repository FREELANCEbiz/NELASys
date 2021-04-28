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
@Table(name = "transaction_cancelled")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionCancelled.findAll", query = "SELECT t FROM TransactionCancelled t")
    , @NamedQuery(name = "TransactionCancelled.findByTransCancelId", query = "SELECT t FROM TransactionCancelled t WHERE t.transCancelId = :transCancelId")
    , @NamedQuery(name = "TransactionCancelled.findByTransId", query = "SELECT t FROM TransactionCancelled t WHERE t.transId = :transId")
    , @NamedQuery(name = "TransactionCancelled.findByUserId", query = "SELECT t FROM TransactionCancelled t WHERE t.userId = :userId")
    , @NamedQuery(name = "TransactionCancelled.findByTransDateTime", query = "SELECT t FROM TransactionCancelled t WHERE t.transDateTime = :transDateTime")
    , @NamedQuery(name = "TransactionCancelled.findByReason", query = "SELECT t FROM TransactionCancelled t WHERE t.reason = :reason")})
public class TransactionCancelled implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransCancelId")
    private Integer transCancelId;
    @Basic(optional = false)
    @Column(name = "TransId")
    private int transId;
    @Basic(optional = false)
    @Column(name = "UserId")
    private int userId;
    @Basic(optional = false)
    @Column(name = "TransDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDateTime;
    @Column(name = "Reason")
    private String reason;

    public TransactionCancelled() {
    }

    public TransactionCancelled(Integer transCancelId) {
        this.transCancelId = transCancelId;
    }

    public TransactionCancelled(Integer transCancelId, int transId, int userId, Date transDateTime) {
        this.transCancelId = transCancelId;
        this.transId = transId;
        this.userId = userId;
        this.transDateTime = transDateTime;
    }

    public Integer getTransCancelId() {
        return transCancelId;
    }

    public void setTransCancelId(Integer transCancelId) {
        this.transCancelId = transCancelId;
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

    public Date getTransDateTime() {
        return transDateTime;
    }

    public void setTransDateTime(Date transDateTime) {
        this.transDateTime = transDateTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transCancelId != null ? transCancelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionCancelled)) {
            return false;
        }
        TransactionCancelled other = (TransactionCancelled) object;
        if ((this.transCancelId == null && other.transCancelId != null) || (this.transCancelId != null && !this.transCancelId.equals(other.transCancelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.TransactionCancelled[ transCancelId=" + transCancelId + " ]";
    }
    
}
