/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Engkoi Zidac
 */
@Entity
@Table(name = "transaction_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionDetails.findAll", query = "SELECT t FROM TransactionDetails t")
    , @NamedQuery(name = "TransactionDetails.findByTransDetailId", query = "SELECT t FROM TransactionDetails t WHERE t.transDetailId = :transDetailId")
    , @NamedQuery(name = "TransactionDetails.findByTransId", query = "SELECT t FROM TransactionDetails t WHERE t.transId = :transId")
    , @NamedQuery(name = "TransactionDetails.findByCOAId", query = "SELECT t FROM TransactionDetails t WHERE t.cOAId = :cOAId")
    , @NamedQuery(name = "TransactionDetails.findByShareHolderId", query = "SELECT t FROM TransactionDetails t WHERE t.shareHolderId = :shareHolderId")
    , @NamedQuery(name = "TransactionDetails.findByAmount", query = "SELECT t FROM TransactionDetails t WHERE t.amount = :amount")})
public class TransactionDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransDetailId")
    private Integer transDetailId;
    @Basic(optional = false)
    @Column(name = "TransId")
    private int transId;
    @Basic(optional = false)
    @Column(name = "COAId")
    private int cOAId;
    @Basic(optional = false)
    @Column(name = "ShareHolderId")
    private int shareHolderId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Amount")
    private BigDecimal amount;

    public TransactionDetails() {
    }

    public TransactionDetails(Integer transDetailId) {
        this.transDetailId = transDetailId;
    }

    public TransactionDetails(Integer transDetailId, int transId, int cOAId, int shareHolderId) {
        this.transDetailId = transDetailId;
        this.transId = transId;
        this.cOAId = cOAId;
        this.shareHolderId = shareHolderId;
    }

    public Integer getTransDetailId() {
        return transDetailId;
    }

    public void setTransDetailId(Integer transDetailId) {
        this.transDetailId = transDetailId;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public int getCOAId() {
        return cOAId;
    }

    public void setCOAId(int cOAId) {
        this.cOAId = cOAId;
    }

    public int getShareHolderId() {
        return shareHolderId;
    }

    public void setShareHolderId(int shareHolderId) {
        this.shareHolderId = shareHolderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transDetailId != null ? transDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionDetails)) {
            return false;
        }
        TransactionDetails other = (TransactionDetails) object;
        if ((this.transDetailId == null && other.transDetailId != null) || (this.transDetailId != null && !this.transDetailId.equals(other.transDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.TransactionDetails[ transDetailId=" + transDetailId + " ]";
    }
    
}
