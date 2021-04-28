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
@Table(name = "transaction_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionType.findAll", query = "SELECT t FROM TransactionType t")
    , @NamedQuery(name = "TransactionType.findByTransTypeId", query = "SELECT t FROM TransactionType t WHERE t.transTypeId = :transTypeId")
    , @NamedQuery(name = "TransactionType.findByDescription", query = "SELECT t FROM TransactionType t WHERE t.description = :description")})
public class TransactionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TransTypeId")
    private Short transTypeId;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public TransactionType() {
    }

    public TransactionType(Short transTypeId) {
        this.transTypeId = transTypeId;
    }

    public TransactionType(Short transTypeId, String description) {
        this.transTypeId = transTypeId;
        this.description = description;
    }

    public Short getTransTypeId() {
        return transTypeId;
    }

    public void setTransTypeId(Short transTypeId) {
        this.transTypeId = transTypeId;
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
        hash += (transTypeId != null ? transTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionType)) {
            return false;
        }
        TransactionType other = (TransactionType) object;
        if ((this.transTypeId == null && other.transTypeId != null) || (this.transTypeId != null && !this.transTypeId.equals(other.transTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.TransactionType[ transTypeId=" + transTypeId + " ]";
    }
    
}
