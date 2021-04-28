/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.io.Serializable;
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
@Table(name = "transaction_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionStatus.findAll", query = "SELECT t FROM TransactionStatus t")
    , @NamedQuery(name = "TransactionStatus.findByTransStatId", query = "SELECT t FROM TransactionStatus t WHERE t.transStatId = :transStatId")
    , @NamedQuery(name = "TransactionStatus.findByDescription", query = "SELECT t FROM TransactionStatus t WHERE t.description = :description")})
public class TransactionStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TransStatId")
    private Short transStatId;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public TransactionStatus() {
    }

    public TransactionStatus(Short transStatId) {
        this.transStatId = transStatId;
    }

    public TransactionStatus(Short transStatId, String description) {
        this.transStatId = transStatId;
        this.description = description;
    }

    public Short getTransStatId() {
        return transStatId;
    }

    public void setTransStatId(Short transStatId) {
        this.transStatId = transStatId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transStatId != null ? transStatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionStatus)) {
            return false;
        }
        TransactionStatus other = (TransactionStatus) object;
        if ((this.transStatId == null && other.transStatId != null) || (this.transStatId != null && !this.transStatId.equals(other.transStatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.TransactionStatus[ transStatId=" + transStatId + " ]";
    }
    
}
