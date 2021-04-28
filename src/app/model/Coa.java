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
@Table(name = "coa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coa.findAll", query = "SELECT c FROM Coa c")
    , @NamedQuery(name = "Coa.findByCOAId", query = "SELECT c FROM Coa c WHERE c.cOAId = :cOAId")
    , @NamedQuery(name = "Coa.findByAccountCode", query = "SELECT c FROM Coa c WHERE c.accountCode = :accountCode")
    , @NamedQuery(name = "Coa.findByAccountTitle", query = "SELECT c FROM Coa c WHERE c.accountTitle = :accountTitle")})
public class Coa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COAId")
    private Integer cOAId;
    @Column(name = "AccountCode")
    private String accountCode;
    @Column(name = "AccountTitle")
    private String accountTitle;

    public Coa() {
    }

    public Coa(Integer cOAId) {
        this.cOAId = cOAId;
    }

    public Integer getCOAId() {
        return cOAId;
    }

    public void setCOAId(Integer cOAId) {
        this.cOAId = cOAId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cOAId != null ? cOAId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coa)) {
            return false;
        }
        Coa other = (Coa) object;
        if ((this.cOAId == null && other.cOAId != null) || (this.cOAId != null && !this.cOAId.equals(other.cOAId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.Coa[ cOAId=" + cOAId + " ]";
    }
    
}
