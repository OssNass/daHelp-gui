package org.sarc.dahelp.database.basic;

import org.sarc.dahelp.database.relief.ExtraFamilyInfoEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "family", schema = "basic", catalog = "dahelp")
public class FamilyEntity {
    private Integer familyId;
    private Integer cardNumber;
    private Date givingDate;
    private Boolean isWomanLead;
    private ExtraFamilyInfoEntity extraFamilyInfoByFamilyId;
    private Collection<PersonEntity> peopleByFamilyId;

    @Id
    @Column(name = "family_id", nullable = false)
    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "card_number", nullable = true)
    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "giving_date", nullable = true)
    public Date getGivingDate() {
        return givingDate;
    }

    public void setGivingDate(Date givingDate) {
        this.givingDate = givingDate;
    }

    @Basic
    @Column(name = "is_woman_lead", nullable = true)
    public Boolean getWomanLead() {
        return isWomanLead;
    }

    public void setWomanLead(Boolean womanLead) {
        isWomanLead = womanLead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FamilyEntity that = (FamilyEntity) o;

        if (familyId != null ? !familyId.equals(that.familyId) : that.familyId != null) return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null) return false;
        if (givingDate != null ? !givingDate.equals(that.givingDate) : that.givingDate != null) return false;
        if (isWomanLead != null ? !isWomanLead.equals(that.isWomanLead) : that.isWomanLead != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyId != null ? familyId.hashCode() : 0;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (givingDate != null ? givingDate.hashCode() : 0);
        result = 31 * result + (isWomanLead != null ? isWomanLead.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "family_id", referencedColumnName = "family_id", nullable = false)
    public ExtraFamilyInfoEntity getExtraFamilyInfoByFamilyId() {
        return extraFamilyInfoByFamilyId;
    }

    public void setExtraFamilyInfoByFamilyId(ExtraFamilyInfoEntity extraFamilyInfoByFamilyId) {
        this.extraFamilyInfoByFamilyId = extraFamilyInfoByFamilyId;
    }

    @OneToMany(mappedBy = "familyByFamilyId")
    public Collection<PersonEntity> getPeopleByFamilyId() {
        return peopleByFamilyId;
    }

    public void setPeopleByFamilyId(Collection<PersonEntity> peopleByFamilyId) {
        this.peopleByFamilyId = peopleByFamilyId;
    }
}
