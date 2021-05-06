/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doangiuaky.POJO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hhiii
 */
@Entity
@Table(name = "transaction", catalog = "banhang", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionPojo.findAll", query = "SELECT t FROM TransactionPojo t")
    , @NamedQuery(name = "TransactionPojo.findById", query = "SELECT t FROM TransactionPojo t WHERE t.id = :id")
    , @NamedQuery(name = "TransactionPojo.findByUserId", query = "SELECT t FROM TransactionPojo t WHERE t.userId = :userId")
    , @NamedQuery(name = "TransactionPojo.findByTotalAmount", query = "SELECT t FROM TransactionPojo t WHERE t.totalAmount = :totalAmount")
    , @NamedQuery(name = "TransactionPojo.findByType", query = "SELECT t FROM TransactionPojo t WHERE t.type = :type")
    , @NamedQuery(name = "TransactionPojo.findByCreatedAt", query = "SELECT t FROM TransactionPojo t WHERE t.createdAt = :createdAt")})
public class TransactionPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "userId")
    private int userId;
    @Basic(optional = false)
    @Column(name = "totalAmount")
    private int totalAmount;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public TransactionPojo() {
    }

    public TransactionPojo(Integer id) {
        this.id = id;
    }

    public TransactionPojo(Integer id, int userId, int totalAmount, String description, String type, Date createdAt) {
        this.id = id;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.description = description;
        this.type = type;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionPojo)) {
            return false;
        }
        TransactionPojo other = (TransactionPojo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doangiuaky.POJO.TransactionPojo[ id=" + id + " ]";
    }
    
}
