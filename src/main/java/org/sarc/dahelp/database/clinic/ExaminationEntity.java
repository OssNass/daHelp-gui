package org.sarc.dahelp.database.clinic;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "examination", schema = "clinic", catalog = "dahelp")
public class ExaminationEntity {
    private Integer examinationId;
    private Integer visitId;
    private Integer doctorId;
    private Integer clinicId;
    private DiagnosisEntity diagnosis;
    private VisitEntity visitByVisitId;
    private Collection<PrescriptionEntity> prescriptionsByExaminationId;

    @Id
    @Column(name = "examination_id", nullable = false)
    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    @Basic
    @Column(name = "visit_id", nullable = false)
    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    @Basic
    @Column(name = "doctor_id", nullable = false)
    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "clinic_id", nullable = true)
    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExaminationEntity that = (ExaminationEntity) o;

        if (examinationId != null ? !examinationId.equals(that.examinationId) : that.examinationId != null)
            return false;
        if (visitId != null ? !visitId.equals(that.visitId) : that.visitId != null) return false;
        if (doctorId != null ? !doctorId.equals(that.doctorId) : that.doctorId != null) return false;
        if (clinicId != null ? !clinicId.equals(that.clinicId) : that.clinicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examinationId != null ? examinationId.hashCode() : 0;
        result = 31 * result + (visitId != null ? visitId.hashCode() : 0);
        result = 31 * result + (doctorId != null ? doctorId.hashCode() : 0);
        result = 31 * result + (clinicId != null ? clinicId.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "examination_id", referencedColumnName = "examination_id", nullable = false, insertable = false, updatable = false),
//            @JoinColumn(name = "visit_id", referencedColumnName = "visit_id", nullable = false, insertable = false, updatable = false)})
//    public DiagnosisEntity getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(DiagnosisEntity diagnosis) {
//        this.diagnosis = diagnosis;
//    }

    @ManyToOne
    @JoinColumn(name = "visit_id", referencedColumnName = "visit_id", nullable = false, insertable = false, updatable = false)
    public VisitEntity getVisitByVisitId() {
        return visitByVisitId;
    }

    public void setVisitByVisitId(VisitEntity visitByVisitId) {
        this.visitByVisitId = visitByVisitId;
    }

    @OneToMany(mappedBy = "examinationByExaminationId")
    public Collection<PrescriptionEntity> getPrescriptionsByExaminationId() {
        return prescriptionsByExaminationId;
    }

    public void setPrescriptionsByExaminationId(Collection<PrescriptionEntity> prescriptionsByExaminationId) {
        this.prescriptionsByExaminationId = prescriptionsByExaminationId;
    }
}
