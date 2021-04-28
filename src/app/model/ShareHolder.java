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
@Table(name = "share_holder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ShareHolder.findAll", query = "SELECT s FROM ShareHolder s")
    , @NamedQuery(name = "ShareHolder.findByShareHolderId", query = "SELECT s FROM ShareHolder s WHERE s.shareHolderId = :shareHolderId")
    , @NamedQuery(name = "ShareHolder.findByDescription", query = "SELECT s FROM ShareHolder s WHERE s.description = :description")})
public class ShareHolder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ShareHolderId")
    private Integer shareHolderId;
    @Column(name = "Description")
    private String description;

    public ShareHolder() {
    }

    public ShareHolder(Integer shareHolderId) {
        this.shareHolderId = shareHolderId;
    }

    public Integer getShareHolderId() {
        return shareHolderId;
    }

    public void setShareHolderId(Integer shareHolderId) {
        this.shareHolderId = shareHolderId;
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
        hash += (shareHolderId != null ? shareHolderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShareHolder)) {
            return false;
        }
        ShareHolder other = (ShareHolder) object;
        if ((this.shareHolderId == null && other.shareHolderId != null) || (this.shareHolderId != null && !this.shareHolderId.equals(other.shareHolderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "app.model.ShareHolder[ shareHolderId=" + shareHolderId + " ]";
    }
    
}
