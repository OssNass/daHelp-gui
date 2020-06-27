package org.sarc.dahelp.database.clinic;

import javax.persistence.*;

@Entity
@Table(name = "doctor", schema = "clinic", catalog = "dahelp")
@IdClass(DoctorEntityPK.class)
public class DoctorEntity {
    private Integer doctorId;
    private String firstName;
    private String lastName;
    private Integer clinicId;
    private ClinicsEntity clinicsByClinicId;
    private ExaminationEntity examinationByDoctorId;

    @Id
    @Column(name = "doctor_id", nullable = false)
    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Id
    @Column(name = "clinic_id", nullable = false)
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

        DoctorEntity that = (DoctorEntity) o;

        if (doctorId != null ? !doctorId.equals(that.doctorId) : that.doctorId != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (clinicId != null ? !clinicId.equals(that.clinicId) : that.clinicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = doctorId != null ? doctorId.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (clinicId != null ? clinicId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "clinic_id", referencedColumnName = "clinic_id", nullable = false, insertable = false, updatable = false)
    public ClinicsEntity getClinicsByClinicId() {
        return clinicsByClinicId;
    }

    public void setClinicsByClinicId(ClinicsEntity clinicsByClinicId) {
        this.clinicsByClinicId = clinicsByClinicId;
    }

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "doctor_id", nullable = false, insertable = false, updatable = false)
    public ExaminationEntity getExaminationByDoctorId() {
        return examinationByDoctorId;
    }

    public void setExaminationByDoctorId(ExaminationEntity examinationByDoctorId) {
        this.examinationByDoctorId = examinationByDoctorId;
    }
}
