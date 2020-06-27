package org.sarc.dahelp.database.administration;

import org.sarc.dahelp.database.basic.PersonEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "subbranch", schema = "administration", catalog = "dahelp")
@IdClass(SubbranchEntityPK.class)
public class SubbranchEntity {
    private String name;
    private Integer id;
    private Integer organizationId;
    private Integer parentId;
    private Integer parentOrgId;
    private String telephone;
    private String subbranchCity;
    private String address;
    private OrganizaitonEntity organizaitonByOrganizationId;
    private SubbranchEntity subbranch;
    private Collection<SubbranchEntity> subbranches;
    private Collection<UsersEntity> users;
    private Collection<PersonEntity> people;

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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "organization_id", nullable = false, insertable = false, updatable = false)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
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

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (parentOrgId != null ? !parentOrgId.equals(that.parentOrgId) : that.parentOrgId != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (subbranchCity != null ? !subbranchCity.equals(that.subbranchCity) : that.subbranchCity != null)
            return false;
        return address != null ? address.equals(that.address) : that.address == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (parentOrgId != null ? parentOrgId.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (subbranchCity != null ? subbranchCity.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public OrganizaitonEntity getOrganizaitonByOrganizationId() {
        return organizaitonByOrganizationId;
    }

    public void setOrganizaitonByOrganizationId(OrganizaitonEntity organizaitonByOrganizationId) {
        this.organizaitonByOrganizationId = organizaitonByOrganizationId;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "parent_id", referencedColumnName = "id", insertable = false, updatable = false), @JoinColumn(name = "parent_org_id", referencedColumnName = "organization_id", insertable = false, updatable = false)})
    public SubbranchEntity getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(SubbranchEntity subbranch) {
        this.subbranch = subbranch;
    }

    @OneToMany(mappedBy = "subbranch")
    public Collection<SubbranchEntity> getSubbranches() {
        return subbranches;
    }

    public void setSubbranches(Collection<SubbranchEntity> subbranches) {
        this.subbranches = subbranches;
    }

    @OneToMany(mappedBy = "subbranch")
    public Collection<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(Collection<UsersEntity> users) {
        this.users = users;
    }

    @OneToMany(mappedBy = "subbranch")
    public Collection<PersonEntity> getPeople() {
        return people;
    }

    public void setPeople(Collection<PersonEntity> people) {
        this.people = people;
    }
}
