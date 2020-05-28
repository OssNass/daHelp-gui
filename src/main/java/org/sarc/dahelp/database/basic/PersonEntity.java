package org.sarc.dahelp.database.basic;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "person", schema = "basic", catalog = "dahelp")
@IdClass(PersonEntityPK.class)
public class PersonEntity {
    private int personId;
    private int organizationId;
    private int subbranchId;
    private Integer familyId;
    private String firstName;
    private String fatherName;
    private String lastName;
    private String mother;
    private byte[] fingerprint;
    private String landline;
    private String cellphone;
    private String addressExtraInfo;
    private long familyCardNumber;
    private Integer studies;
    private String healthRecord;
    private Date birthDate;
    private Integer familyPosition;
    private Long nationalNumber;
    private Boolean isFamilyHead;
    private boolean isAlive;
    private int neighborhood;
    private String carrier;
    private Integer salary;
    private String placeOfWork;

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    @Basic
    @Column(name = "family_id", nullable = true)
    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "father_name", nullable = false, length = 20)
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "mother", nullable = false, length = 20)
    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Basic
    @Column(name = "fingerprint", nullable = true)
    public byte[] getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(byte[] fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Basic
    @Column(name = "landline", nullable = true, length = 8)
    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    @Basic
    @Column(name = "cellphone", nullable = true, length = 10)
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Basic
    @Column(name = "address_extra_info", nullable = true, length = -1)
    public String getAddressExtraInfo() {
        return addressExtraInfo;
    }

    public void setAddressExtraInfo(String addressExtraInfo) {
        this.addressExtraInfo = addressExtraInfo;
    }

    @Basic
    @Column(name = "family_card_number", nullable = false)
    public long getFamilyCardNumber() {
        return familyCardNumber;
    }

    public void setFamilyCardNumber(long familyCardNumber) {
        this.familyCardNumber = familyCardNumber;
    }

    @Basic
    @Column(name = "studies", nullable = true)
    public Integer getStudies() {
        return studies;
    }

    public void setStudies(Integer studies) {
        this.studies = studies;
    }

    @Basic
    @Column(name = "health_record", nullable = true, length = -1)
    public String getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }

    @Basic
    @Column(name = "birth_date", nullable = false)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "family_position", nullable = true)
    public Integer getFamilyPosition() {
        return familyPosition;
    }

    public void setFamilyPosition(Integer familyPosition) {
        this.familyPosition = familyPosition;
    }

    @Basic
    @Column(name = "national_number", nullable = true)
    public Long getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(Long nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    @Basic
    @Column(name = "is_family_head", nullable = true)
    public Boolean getFamilyHead() {
        return isFamilyHead;
    }

    public void setFamilyHead(Boolean familyHead) {
        isFamilyHead = familyHead;
    }

    @Basic
    @Column(name = "is_alive", nullable = false)
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Basic
    @Column(name = "neighborhood", nullable = false)
    public int getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(int neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Basic
    @Column(name = "carrier", nullable = true, length = 100)
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Basic
    @Column(name = "salary", nullable = true)
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "place_of_work", nullable = true, length = 100)
    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (personId != that.personId) return false;
        if (organizationId != that.organizationId) return false;
        if (subbranchId != that.subbranchId) return false;
        if (familyCardNumber != that.familyCardNumber) return false;
        if (isAlive != that.isAlive) return false;
        if (neighborhood != that.neighborhood) return false;
        if (familyId != null ? !familyId.equals(that.familyId) : that.familyId != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (fatherName != null ? !fatherName.equals(that.fatherName) : that.fatherName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (mother != null ? !mother.equals(that.mother) : that.mother != null) return false;
        if (!Arrays.equals(fingerprint, that.fingerprint)) return false;
        if (landline != null ? !landline.equals(that.landline) : that.landline != null) return false;
        if (cellphone != null ? !cellphone.equals(that.cellphone) : that.cellphone != null) return false;
        if (addressExtraInfo != null ? !addressExtraInfo.equals(that.addressExtraInfo) : that.addressExtraInfo != null)
            return false;
        if (studies != null ? !studies.equals(that.studies) : that.studies != null) return false;
        if (healthRecord != null ? !healthRecord.equals(that.healthRecord) : that.healthRecord != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (familyPosition != null ? !familyPosition.equals(that.familyPosition) : that.familyPosition != null)
            return false;
        if (nationalNumber != null ? !nationalNumber.equals(that.nationalNumber) : that.nationalNumber != null)
            return false;
        if (isFamilyHead != null ? !isFamilyHead.equals(that.isFamilyHead) : that.isFamilyHead != null) return false;
        if (carrier != null ? !carrier.equals(that.carrier) : that.carrier != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (placeOfWork != null ? !placeOfWork.equals(that.placeOfWork) : that.placeOfWork != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + organizationId;
        result = 31 * result + subbranchId;
        result = 31 * result + (familyId != null ? familyId.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(fingerprint);
        result = 31 * result + (landline != null ? landline.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (addressExtraInfo != null ? addressExtraInfo.hashCode() : 0);
        result = 31 * result + (int) (familyCardNumber ^ (familyCardNumber >>> 32));
        result = 31 * result + (studies != null ? studies.hashCode() : 0);
        result = 31 * result + (healthRecord != null ? healthRecord.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (familyPosition != null ? familyPosition.hashCode() : 0);
        result = 31 * result + (nationalNumber != null ? nationalNumber.hashCode() : 0);
        result = 31 * result + (isFamilyHead != null ? isFamilyHead.hashCode() : 0);
        result = 31 * result + (isAlive ? 1 : 0);
        result = 31 * result + neighborhood;
        result = 31 * result + (carrier != null ? carrier.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (placeOfWork != null ? placeOfWork.hashCode() : 0);
        return result;
    }
}
