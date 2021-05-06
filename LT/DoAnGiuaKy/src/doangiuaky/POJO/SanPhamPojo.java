/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doangiuaky.POJO;

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
 * @author hhiii
 */
@Entity
@Table(name = "sanpham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPhamPojo.findAll", query = "SELECT s FROM SanPhamPojo s")
    , @NamedQuery(name = "SanPhamPojo.findById", query = "SELECT s FROM SanPhamPojo s WHERE s.id = :id")
    , @NamedQuery(name = "SanPhamPojo.findByTensp", query = "SELECT s FROM SanPhamPojo s WHERE s.tensp = :tensp")
    , @NamedQuery(name = "SanPhamPojo.findByGiagoc", query = "SELECT s FROM SanPhamPojo s WHERE s.giagoc = :giagoc")
    , @NamedQuery(name = "SanPhamPojo.findByGiaban", query = "SELECT s FROM SanPhamPojo s WHERE s.giaban = :giaban")})
public class SanPhamPojo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tensp")
    private String tensp;
    @Basic(optional = false)
    @Column(name = "giagoc")
    private int giagoc;
    @Basic(optional = false)
    @Column(name = "giaban")
    private int giaban;

    public SanPhamPojo() {
    }

    public SanPhamPojo(Integer id) {
        this.id = id;
    }

    public SanPhamPojo(String tensp, int giagoc, int giaban) {
        this.tensp = tensp;
        this.giagoc = giagoc;
        this.giaban = giaban;
    }

    public SanPhamPojo(Integer id, String tensp, int giagoc, int giaban) {
        this.id = id;
        this.tensp = tensp;
        this.giagoc = giagoc;
        this.giaban = giaban;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGiagoc() {
        return giagoc;
    }

    public void setGiagoc(int giagoc) {
        this.giagoc = giagoc;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
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
        if (!(object instanceof SanPhamPojo)) {
            return false;
        }
        SanPhamPojo other = (SanPhamPojo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "doangiuaky.SanPhamPojo[ id=" + id + " ]";
    }
    
}
