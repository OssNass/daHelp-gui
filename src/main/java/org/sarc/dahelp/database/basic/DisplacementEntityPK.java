package org.sarc.dahelp.database.basic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class DisplacementEntityPK implements Serializable {
    private int personId;
    private int regionId;
    private Date date;
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

    @Column(name = "region_id", nullable = false)
    @Id
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Column(name = "date", nullable = false)
    @Id
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

        DisplacementEntityPK that = (DisplacementEntityPK) o;

        if (personId != that.personId) return false;
        if (regionId != that.regionId) return false;
        if (organizationId != that.organizationId) return false;
        if (subbranchId != that.subbranchId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + regionId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + organizationId;
        result = 31 * result + subbranchId;
        return result;
    }
}
