package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "prescription", schema = "clinic", catalog = "dahelp")
public class PrescriptionEntity {
    private Integer prescriptionId;
    private Integer examinationId;
    private Boolean free;
    private Date presreciptioDate;
    private Collection<PharmacyMovementOutEntity> pharmacyMovementOutsByPrescriptionId;
    private Collection<PrescribedMedicationsEntity> prescribedMedicationsByPrescriptionId;
    private ExaminationEntity examinationByExaminationId;

    @Id
    @Column(name = "prescription_id", nullable = false)
    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Basic
    @Column(name = "examination_id", nullable = false)
    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    @Basic
    @Column(name = "free", nullable = true)
    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    @Basic
    @Column(name = "presreciptio_date", nullable = false)
    public Date getPresreciptioDate() {
        return presreciptioDate;
    }

    public void setPresreciptioDate(Date presreciptioDate) {
        this.presreciptioDate = presreciptioDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrescriptionEntity that = (PrescriptionEntity) o;

        if (prescriptionId != null ? !prescriptionId.equals(that.prescriptionId) : that.prescriptionId != null)
            return false;
        if (examinationId != null ? !examinationId.equals(that.examinationId) : that.examinationId != null)
            return false;
        if (free != null ? !free.equals(that.free) : that.free != null) return false;
        if (presreciptioDate != null ? !presreciptioDate.equals(that.presreciptioDate) : that.presreciptioDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prescriptionId != null ? prescriptionId.hashCode() : 0;
        result = 31 * result + (examinationId != null ? examinationId.hashCode() : 0);
        result = 31 * result + (free != null ? free.hashCode() : 0);
        result = 31 * result + (presreciptioDate != null ? presreciptioDate.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "prescriptionByPrescritionId")
    public Collection<PharmacyMovementOutEntity> getPharmacyMovementOutsByPrescriptionId() {
        return pharmacyMovementOutsByPrescriptionId;
    }

    public void setPharmacyMovementOutsByPrescriptionId(Collection<PharmacyMovementOutEntity> pharmacyMovementOutsByPrescriptionId) {
        this.pharmacyMovementOutsByPrescriptionId = pharmacyMovementOutsByPrescriptionId;
    }

    @OneToMany(mappedBy = "prescriptionByPrescritionId")
    public Collection<PrescribedMedicationsEntity> getPrescribedMedicationsByPrescriptionId() {
        return prescribedMedicationsByPrescriptionId;
    }

    public void setPrescribedMedicationsByPrescriptionId(Collection<PrescribedMedicationsEntity> prescribedMedicationsByPrescriptionId) {
        this.prescribedMedicationsByPrescriptionId = prescribedMedicationsByPrescriptionId;
    }

    @ManyToOne
    @JoinColumn(name = "examination_id", referencedColumnName = "examination_id", nullable = false, insertable = false, updatable = false)
    public ExaminationEntity getExaminationByExaminationId() {
        return examinationByExaminationId;
    }

    public void setExaminationByExaminationId(ExaminationEntity examinationByExaminationId) {
        this.examinationByExaminationId = examinationByExaminationId;
    }
}
