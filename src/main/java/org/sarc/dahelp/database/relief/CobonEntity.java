package org.sarc.dahelp.database.relief;

import org.sarc.dahelp.database.basic.PersonEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "cobon", schema = "relief", catalog = "dahelp")
@IdClass(CobonEntityPK.class)
public class CobonEntity {
    private Integer familyId;
    private Integer personId;
    private Integer subbranchId;
    private Integer organizationId;
    private Integer numberOfItems;
    private Integer cobonId;
    private Integer cobontypeId;
    private Timestamp cobonIssueStamp;
    private Timestamp cobonRecieveStamp;
    private ExtraFamilyInfoEntity extraFamilyInfoByFamilyId;
    private PersonEntity person;
    private CobonTypeEntity cobonTypeByCobonId;
    private Collection<MaterialInCobonEntity> materialInCobons;

    @Basic
    @Column(name = "family_id", nullable = false)
    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
    @Column(name = "organization_id", nullable = false)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "number_of_items", nullable = false)
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Id
    @Column(name = "cobon_id", nullable = false)
    public Integer getCobonId() {
        return cobonId;
    }

    public void setCobonId(Integer cobonId) {
        this.cobonId = cobonId;
    }

    @Id
    @Column(name = "cobontype_id", nullable = false)
    public Integer getCobontypeId() {
        return cobontypeId;
    }

    public void setCobontypeId(Integer cobontypeId) {
        this.cobontypeId = cobontypeId;
    }

    @Basic
    @Column(name = "cobon_issue_stamp", nullable = false)
    public Timestamp getCobonIssueStamp() {
        return cobonIssueStamp;
    }

    public void setCobonIssueStamp(Timestamp cobonIssueStamp) {
        this.cobonIssueStamp = cobonIssueStamp;
    }

    @Basic
    @Column(name = "cobon_recieve_stamp", nullable = true)
    public Timestamp getCobonRecieveStamp() {
        return cobonRecieveStamp;
    }

    public void setCobonRecieveStamp(Timestamp cobonRecieveStamp) {
        this.cobonRecieveStamp = cobonRecieveStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CobonEntity that = (CobonEntity) o;

        if (familyId != null ? !familyId.equals(that.familyId) : that.familyId != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (subbranchId != null ? !subbranchId.equals(that.subbranchId) : that.subbranchId != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (numberOfItems != null ? !numberOfItems.equals(that.numberOfItems) : that.numberOfItems != null)
            return false;
        if (cobonId != null ? !cobonId.equals(that.cobonId) : that.cobonId != null) return false;
        if (cobontypeId != null ? !cobontypeId.equals(that.cobontypeId) : that.cobontypeId != null) return false;
        if (cobonIssueStamp != null ? !cobonIssueStamp.equals(that.cobonIssueStamp) : that.cobonIssueStamp != null)
            return false;
        if (cobonRecieveStamp != null ? !cobonRecieveStamp.equals(that.cobonRecieveStamp) : that.cobonRecieveStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyId != null ? familyId.hashCode() : 0;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (subbranchId != null ? subbranchId.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (numberOfItems != null ? numberOfItems.hashCode() : 0);
        result = 31 * result + (cobonId != null ? cobonId.hashCode() : 0);
        result = 31 * result + (cobontypeId != null ? cobontypeId.hashCode() : 0);
        result = 31 * result + (cobonIssueStamp != null ? cobonIssueStamp.hashCode() : 0);
        result = 31 * result + (cobonRecieveStamp != null ? cobonRecieveStamp.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "family_id", referencedColumnName = "family_id", nullable = false, insertable = false, updatable = false)
    public ExtraFamilyInfoEntity getExtraFamilyInfoByFamilyId() {
        return extraFamilyInfoByFamilyId;
    }

    public void setExtraFamilyInfoByFamilyId(ExtraFamilyInfoEntity extraFamilyInfoByFamilyId) {
        this.extraFamilyInfoByFamilyId = extraFamilyInfoByFamilyId;
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
    @JoinColumn(name = "cobon_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public CobonTypeEntity getCobonTypeByCobonId() {
        return cobonTypeByCobonId;
    }

    public void setCobonTypeByCobonId(CobonTypeEntity cobonTypeByCobonId) {
        this.cobonTypeByCobonId = cobonTypeByCobonId;
    }

    @OneToMany(mappedBy = "cobon")
    public Collection<MaterialInCobonEntity> getMaterialInCobons() {
        return materialInCobons;
    }

    public void setMaterialInCobons(Collection<MaterialInCobonEntity> materialInCobons) {
        this.materialInCobons = materialInCobons;
    }
}
