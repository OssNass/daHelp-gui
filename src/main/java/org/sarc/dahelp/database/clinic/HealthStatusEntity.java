package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "health_status", schema = "basic", catalog = "dahelp")
@IdClass(HealthStatusEntityPK.class)
public class HealthStatusEntity {
    private int personId;
    private int statusId;
    private String notes;
    private int organizationId;
    private int subbranchId;

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Id
    @Column(name = "status_id", nullable = false)
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 50)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Id
    @Column(name = "organization_id", nullable = false)
    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Id
    @Column(name = "subbranch_id", nullable = false)
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

        HealthStatusEntity that = (HealthStatusEntity) o;

        if (personId != that.personId) return false;
        if (statusId != that.statusId) return false;
        if (organizationId != that.organizationId) return false;
        if (subbranchId != that.subbranchId) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + statusId;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + organizationId;
        result = 31 * result + subbranchId;
        return result;
    }
}
