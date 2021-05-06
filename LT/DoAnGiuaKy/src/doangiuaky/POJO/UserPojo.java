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
@Table(name = "user", catalog = "banhang", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserPojo.findAll", query = "SELECT u FROM UserPojo u")
    , @NamedQuery(name = "UserPojo.findById", query = "SELECT u FROM UserPojo u WHERE u.id = :id")
    , @NamedQuery(name = "UserPojo.findByName", query = "SELECT u FROM UserPojo u WHERE u.name = :name")
    , @NamedQuery(name = "UserPojo.findByPhone", query = "SELECT u FROM UserPojo u WHERE u.phone = :phone")
    , @NamedQuery(name = "UserPojo.findByBalance", query = "SELECT u FROM UserPojo u WHERE u.balance = :balance")
    , @NamedQuery(name = "UserPojo.findByType", query = "SELECT u FROM UserPojo u WHERE u.type = :type")
    , @NamedQuery(name = "UserPojo.findByCreatedAt", query = "SELECT u FROM UserPojo u WHERE u.createdAt = :createdAt")})
public class UserPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "balance")
    private int balance;
    @Basic(optional = false)
    @Column(name = "type")
    private int type;
    @Basic(optional = false)
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public UserPojo() {
    }

    public UserPojo(Integer id) {
        this.id = id;
    }

    public UserPojo(Integer id, String name, String phone, int balance, int type) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.balance = balance;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
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
        if (!(object instanceof UserPojo)) {
            return false;
        }
        UserPojo other = (UserPojo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doangiuaky.POJO.UserPojo[ id=" + id + " ]";
    }
    
}
