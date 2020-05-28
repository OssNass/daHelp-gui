package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prescription", schema = "clinic", catalog = "dahelp")
public class PrescriptionEntity {
    private int prescriptionId;
    private int examinationId;
    private Boolean free;
    private Date presreciptioDate;

    @Id
    @Column(name = "prescription_id", nullable = false)
    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Basic
    @Column(name = "examination_id", nullable = false)
    public int getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(int examinationId) {
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

        if (prescriptionId != that.prescriptionId) return false;
        if (examinationId != that.examinationId) return false;
        if (free != null ? !free.equals(that.free) : that.free != null) return false;
        if (presreciptioDate != null ? !presreciptioDate.equals(that.presreciptioDate) : that.presreciptioDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prescriptionId;
        result = 31 * result + examinationId;
        result = 31 * result + (free != null ? free.hashCode() : 0);
        result = 31 * result + (presreciptioDate != null ? presreciptioDate.hashCode() : 0);
        return result;
    }
}
