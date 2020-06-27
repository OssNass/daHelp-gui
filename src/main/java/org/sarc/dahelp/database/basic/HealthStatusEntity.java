package org.sarc.dahelp.database.basic;

import javax.persistence.*;

@Entity
@Table(name = "health_status", schema = "basic", catalog = "dahelp")
@IdClass(HealthStatusEntityPK.class)
public class HealthStatusEntity {
    private Integer personId;
    private Integer statusId;
    private String notes;
    private Integer organizationId;
    private Integer subbranchId;
    private PersonEntity person;
    private ChronicDesciptionEntity chronicDesciptionByStatusId;

    @Id
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Id
    @Column(name = "status_id", nullable = false)
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
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
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Id
    @Column(name = "subbranch_id", nullable = false)
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

        HealthStatusEntity that = (HealthStatusEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (subbranchId != null ? !subbranchId.equals(that.subbranchId) : that.subbranchId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (subbranchId != null ? subbranchId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "organization_id", referencedColumnName = "organization_id", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "subbranch_id", referencedColumnName = "subbranch_id", nullable = false, insertable = false, updatable = false)})
    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "status_id", nullable = false, insertable = false, updatable = false)
    public ChronicDesciptionEntity getChronicDesciptionByStatusId() {
        return chronicDesciptionByStatusId;
    }

    public void setChronicDesciptionByStatusId(ChronicDesciptionEntity chronicDesciptionByStatusId) {
        this.chronicDesciptionByStatusId = chronicDesciptionByStatusId;
    }
}
