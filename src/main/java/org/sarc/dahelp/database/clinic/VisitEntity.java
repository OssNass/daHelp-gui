package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "visit", schema = "clinic", catalog = "dahelp")
public class VisitEntity {
    private Integer personId;
    private Integer organizationId;
    private Integer subbranchId;
    private Date visitDate;
    private Integer fee;
    private Integer visitId;
    private Collection<ExaminationEntity> examinationsByVisitId;

    @Basic
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "organization_id", nullable = false)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "subbranch_id", nullable = false)
    public Integer getSubbranchId() {
        return subbranchId;
    }

    public void setSubbranchId(Integer subbranchId) {
        this.subbranchId = subbranchId;
    }

    @Basic
    @Column(name = "visit_date", nullable = false)
    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    @Basic
    @Column(name = "fee", nullable = true)
    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Id
    @Column(name = "visit_id", nullable = false)
    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisitEntity that = (VisitEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (subbranchId != null ? !subbranchId.equals(that.subbranchId) : that.subbranchId != null) return false;
        if (visitDate != null ? !visitDate.equals(that.visitDate) : that.visitDate != null) return false;
        if (fee != null ? !fee.equals(that.fee) : that.fee != null) return false;
        if (visitId != null ? !visitId.equals(that.visitId) : that.visitId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (subbranchId != null ? subbranchId.hashCode() : 0);
        result = 31 * result + (visitDate != null ? visitDate.hashCode() : 0);
        result = 31 * result + (fee != null ? fee.hashCode() : 0);
        result = 31 * result + (visitId != null ? visitId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "visitByVisitId")
    public Collection<ExaminationEntity> getExaminationsByVisitId() {
        return examinationsByVisitId;
    }

    public void setExaminationsByVisitId(Collection<ExaminationEntity> examinationsByVisitId) {
        this.examinationsByVisitId = examinationsByVisitId;
    }
}
