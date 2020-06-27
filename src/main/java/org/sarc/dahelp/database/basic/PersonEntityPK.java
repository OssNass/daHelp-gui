package org.sarc.dahelp.database.basic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PersonEntityPK implements Serializable {
    private Integer personId;
    private Integer organizationId;
    private Integer subbranchId;

    @Column(name = "person_id", nullable = false)
    @Id
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Column(name = "organization_id", nullable = false)
    @Id
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Column(name = "subbranch_id", nullable = false)
    @Id
    public Integer getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(Integer subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntityPK that = (PersonEntityPK) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (subbranchId != null ? !subbranchId.equals(that.subbranchId) : that.subbranchId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (subbranchId != null ? subbranchId.hashCode() : 0);
        return result;
    }
}
