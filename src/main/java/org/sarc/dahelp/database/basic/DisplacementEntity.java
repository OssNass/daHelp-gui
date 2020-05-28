package org.sarc.dahelp.database.basic;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "displacement", schema = "basic", catalog = "dahelp")
@IdClass(DisplacementEntityPK.class)
public class DisplacementEntity {
    private int personId;
    private int regionId;
    private Date date;
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
    @Column(name = "region_id", nullable = false)
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    @Id
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

        DisplacementEntity that = (DisplacementEntity) o;

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
