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
@Table(name = "electrician")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Electrician.findAll", query = "SELECT e FROM Electrician e")
    , @NamedQuery(name = "Electrician.findByElectricianId", query = "SELECT e FROM Electrician e WHERE e.electricianId = :electricianId")
    , @NamedQuery(name = "Electrician.findByFullName", query = "SELECT e FROM Electrician e WHERE e.fullName = :fullName")
    , @NamedQuery(name = "Electrician.findByAddress", query = "SELECT e FROM Electrician e WHERE e.address = :address")
    , @NamedQuery(name = "Electrician.findByContactNo", query = "SELECT e FROM Electrician e WHERE e.contactNo = :contactNo")})
public class Electrician implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ElectricianId")
    private Integer electricianId;
    @Basic(optional = false)
    @Column(name = "FullName")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "ContactNo")
    private String contactNo;

    public Electrician() {
    }

    public Electrician(Integer electricianId) {
        this.electricianId = electricianId;
    }

    public Electrician(Integer electricianId, String fullName, String address, String contactNo) {
        this.electricianId = electricianId;
        this.fullName = fullName;
        this.address = address;
        this.contactNo = contactNo;
    }

    public Integer getElectricianId() {
        return electricianId;
    }

    public void setElectricianId(Integer electricianId) {
        this.electricianId = electricianId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (electricianId != null ? electricianId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Electrician)) {
            return false;
        }
        Electrician other = (Electrician) object;
        if ((this.electricianId == null && other.electricianId != null) || (this.electricianId != null && !this.electricianId.equals(other.electricianId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.Electrician[ electricianId=" + electricianId + " ]";
    }
    
}
