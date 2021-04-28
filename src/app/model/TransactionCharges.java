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
@Table(name = "transaction_charges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionCharges.findAll", query = "SELECT t FROM TransactionCharges t")
    , @NamedQuery(name = "TransactionCharges.findByChargeId", query = "SELECT t FROM TransactionCharges t WHERE t.chargeId = :chargeId")
    , @NamedQuery(name = "TransactionCharges.findByAmount", query = "SELECT t FROM TransactionCharges t WHERE t.amount = :amount")
    , @NamedQuery(name = "TransactionCharges.findByShareHolderId", query = "SELECT t FROM TransactionCharges t WHERE t.shareHolderId = :shareHolderId")
    , @NamedQuery(name = "TransactionCharges.findByTransTypeId", query = "SELECT t FROM TransactionCharges t WHERE t.transTypeId = :transTypeId")
    , @NamedQuery(name = "TransactionCharges.findByCOAId", query = "SELECT t FROM TransactionCharges t WHERE t.cOAId = :cOAId")})
public class TransactionCharges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ChargeId")
    private Integer chargeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Amount")
    private BigDecimal amount;
    @Basic(optional = false)
    @Column(name = "ShareHolderId")
    private short shareHolderId;
    @Basic(optional = false)
    @Column(name = "TransTypeId")
    private short transTypeId;
    @Column(name = "COAId")
    private Short cOAId;

    public TransactionCharges() {
    }

    public TransactionCharges(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public TransactionCharges(Integer chargeId, BigDecimal amount, short shareHolderId, short transTypeId) {
        this.chargeId = chargeId;
        this.amount = amount;
        this.shareHolderId = shareHolderId;
        this.transTypeId = transTypeId;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public short getShareHolderId() {
        return shareHolderId;
    }

    public void setShareHolderId(short shareHolderId) {
        this.shareHolderId = shareHolderId;
    }

    public short getTransTypeId() {
        return transTypeId;
    }

    public void setTransTypeId(short transTypeId) {
        this.transTypeId = transTypeId;
    }

    public Short getCOAId() {
        return cOAId;
    }

    public void setCOAId(Short cOAId) {
        this.cOAId = cOAId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chargeId != null ? chargeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionCharges)) {
            return false;
        }
        TransactionCharges other = (TransactionCharges) object;
        if ((this.chargeId == null && other.chargeId != null) || (this.chargeId != null && !this.chargeId.equals(other.chargeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.TransactionCharges[ chargeId=" + chargeId + " ]";
    }
    
}
