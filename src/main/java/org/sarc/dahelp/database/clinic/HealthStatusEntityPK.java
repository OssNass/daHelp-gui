package org.sarc.dahelp.database.clinic;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class HealthStatusEntityPK implements Serializable {
    private int personId;
    private int statusId;
    private int organizationId;
    private int subbranchId;

    @Column(name = "person_id", nullable = false)
    @Id
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Column(name = "status_id", nullable = false)
    @Id
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Column(name = "organization_id", nullable = false)
    @Id
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Column(name = "subbranch_id", nullable = false)
    @Id
    public int getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(int subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HealthStatusEntityPK that = (HealthStatusEntityPK) o;

        if (personId != that.personId) return false;
        if (statusId != that.statusId) return false;
        if (organizationId != that.organizationId) return false;
        if (subbranchId != that.subbranchId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + statusId;
        result = 31 * result + organizationId;
        result = 31 * result + subbranchId;
        return result;
    }
}
