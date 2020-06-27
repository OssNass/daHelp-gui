package org.sarc.dahelp.database.administration;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "organizaiton", schema = "administration", catalog = "dahelp")
public class OrganizaitonEntity {
    private Integer id;
    private String name;
    private String telephone;
    private String address;
    private String hqCity;
    private Collection<SubbranchEntity> subbranchesById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 10)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "hq_city", nullable = true, length = 100)
    public String getHqCity() {
        return hqCity;
    }

    public void setHqCity(String hqCity) {
        this.hqCity = hqCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizaitonEntity that = (OrganizaitonEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (hqCity != null ? !hqCity.equals(that.hqCity) : that.hqCity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (hqCity != null ? hqCity.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "organizaitonByOrganizationId")
    public Collection<SubbranchEntity> getSubbranchesById() {
        return subbranchesById;
    }

    public void setSubbranchesById(Collection<SubbranchEntity> subbranchesById) {
        this.subbranchesById = subbranchesById;
    }
}
