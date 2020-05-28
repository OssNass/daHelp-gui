package org.sarc.dahelp.database.administration;

import javax.persistence.*;

@Entity
@Table(name = "subbranch", schema = "administration", catalog = "dahelp")
@IdClass(SubbranchEntityPK.class)
public class SubbranchEntity {
    private String name;
    private int id;
    private int organizationId;
    private Integer parentId;
    private Integer parentOrgId;
    private String telephone;
    private String subbranchCity;
    private String address;

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "organization_id", nullable = false)
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "parent_org_id", nullable = true)
    public Integer getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
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
    @Column(name = "subbranch_city", nullable = true, length = 20)
    public String getSubbranchCity() {
        return subbranchCity;
    }

    public void setSubbranchCity(String subbranchCity) {
        this.subbranchCity = subbranchCity;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubbranchEntity that = (SubbranchEntity) o;

        if (id != that.id) return false;
        if (organizationId != that.organizationId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (parentOrgId != null ? !parentOrgId.equals(that.parentOrgId) : that.parentOrgId != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (subbranchCity != null ? !subbranchCity.equals(that.subbranchCity) : that.subbranchCity != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + organizationId;
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (parentOrgId != null ? parentOrgId.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (subbranchCity != null ? subbranchCity.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
