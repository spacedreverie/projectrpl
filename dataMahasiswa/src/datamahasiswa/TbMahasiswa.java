/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tb_mahasiswa")
@NamedQueries({
    @NamedQuery(name = "TbMahasiswa.findAll", query = "SELECT t FROM TbMahasiswa t"),
    @NamedQuery(name = "TbMahasiswa.findByNpm", query = "SELECT t FROM TbMahasiswa t WHERE t.npm = :npm"),
    @NamedQuery(name = "TbMahasiswa.findByNama", query = "SELECT t FROM TbMahasiswa t WHERE t.nama = :nama"),
    @NamedQuery(name = "TbMahasiswa.findByTinggi", query = "SELECT t FROM TbMahasiswa t WHERE t.tinggi = :tinggi"),
    @NamedQuery(name = "TbMahasiswa.findByPindahan", query = "SELECT t FROM TbMahasiswa t WHERE t.pindahan = :pindahan")})
public class TbMahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "npm")
    private Integer npm;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Column(name = "tinggi")
    private String tinggi;
    @Column(name = "pindahan")
    private Boolean pindahan;

    public TbMahasiswa() {
    }

    public TbMahasiswa(Integer npm) {
        this.npm = npm;
    }

    public TbMahasiswa(Integer npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public Integer getNpm() {
        return npm;
    }

    public void setNpm(Integer npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTinggi() {
        return tinggi;
    }

    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    public Boolean getPindahan() {
        return pindahan;
    }

    public void setPindahan(Boolean pindahan) {
        this.pindahan = pindahan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (npm != null ? npm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMahasiswa)) {
            return false;
        }
        TbMahasiswa other = (TbMahasiswa) object;
        if ((this.npm == null && other.npm != null) || (this.npm != null && !this.npm.equals(other.npm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datamahasiswa.TbMahasiswa[ npm=" + npm + " ]";
    }
    
}
