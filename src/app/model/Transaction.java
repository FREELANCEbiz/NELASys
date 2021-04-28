/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t")
    , @NamedQuery(name = "Transaction.findByTransId", query = "SELECT t FROM Transaction t WHERE t.transId = :transId")
    , @NamedQuery(name = "Transaction.findByElectricianId", query = "SELECT t FROM Transaction t WHERE t.electricianId = :electricianId")
    , @NamedQuery(name = "Transaction.findByTransTypeId", query = "SELECT t FROM Transaction t WHERE t.transTypeId = :transTypeId")
    , @NamedQuery(name = "Transaction.findByTotalAmount", query = "SELECT t FROM Transaction t WHERE t.totalAmount = :totalAmount")
    , @NamedQuery(name = "Transaction.findByTransStatus", query = "SELECT t FROM Transaction t WHERE t.transStatus = :transStatus")
    , @NamedQuery(name = "Transaction.findByTransDate", query = "SELECT t FROM Transaction t WHERE t.transDate = :transDate")
    , @NamedQuery(name = "Transaction.findByUserId", query = "SELECT t FROM Transaction t WHERE t.userId = :userId")
    , @NamedQuery(name = "Transaction.findByConsumer", query = "SELECT t FROM Transaction t WHERE t.consumer = :consumer")
    , @NamedQuery(name = "Transaction.findByORNo", query = "SELECT t FROM Transaction t WHERE t.oRNo = :oRNo")
    , @NamedQuery(name = "Transaction.findByORDate", query = "SELECT t FROM Transaction t WHERE t.oRDate = :oRDate")
    , @NamedQuery(name = "Transaction.findByStatusId", query = "SELECT t FROM Transaction t WHERE t.statusId = :statusId")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransId")
    private Integer transId;
    @Column(name = "ElectricianId")
    private Integer electricianId;
    @Basic(optional = false)
    @Column(name = "TransTypeId")
    private short transTypeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TotalAmount")
    private BigDecimal totalAmount;
    @Column(name = "TransStatus")
    private Short transStatus;
    @Column(name = "TransDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDate;
    @Column(name = "UserId")
    private Integer userId;
    @Column(name = "Consumer")
    private String consumer;
    @Column(name = "ORNo")
    private String oRNo;
    @Column(name = "ORDate")
    @Temporal(TemporalType.DATE)
    private Date oRDate;
    @Basic(optional = false)
    @Column(name = "StatusId")
    private int statusId;

    public Transaction() {
    }

    public Transaction(Integer transId) {
        this.transId = transId;
    }

    public Transaction(Integer transId, short transTypeId, int statusId) {
        this.transId = transId;
        this.transTypeId = transTypeId;
        this.statusId = statusId;
    }

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public Integer getElectricianId() {
        return electricianId;
    }

    public void setElectricianId(Integer electricianId) {
        this.electricianId = electricianId;
    }

    public short getTransTypeId() {
        return transTypeId;
    }

    public void setTransTypeId(short transTypeId) {
        this.transTypeId = transTypeId;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Short getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Short transStatus) {
        this.transStatus = transStatus;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getORNo() {
        return oRNo;
    }

    public void setORNo(String oRNo) {
        this.oRNo = oRNo;
    }

    public Date getORDate() {
        return oRDate;
    }

    public void setORDate(Date oRDate) {
        this.oRDate = oRDate;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transId != null ? transId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.transId == null && other.transId != null) || (this.transId != null && !this.transId.equals(other.transId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.Transaction[ transId=" + transId + " ]";
    }
    
}
