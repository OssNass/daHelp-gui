package org.sarc.dahelp.database.relief;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "extra_family_info", schema = "relief", catalog = "dahelp")
public class ExtraFamilyInfoEntity {
    private int familyId;
    private Double totalFamilyIncome;
    private Integer residenceType;
    private Integer residenceStatus;
    private boolean iscanceled;
    private Date dateofcacenlation;
    private Date dateofregister;
    private String reasonForCancelation;

    @Id
    @Column(name = "family_id", nullable = false)
    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "total_family_income", nullable = true, precision = 0)
    public Double getTotalFamilyIncome() {
        return totalFamilyIncome;
    }

    public void setTotalFamilyIncome(Double totalFamilyIncome) {
        this.totalFamilyIncome = totalFamilyIncome;
    }

    @Basic
    @Column(name = "residence_type", nullable = true)
    public Integer getResidenceType() {
        return residenceType;
    }

    public void setResidenceType(Integer residenceType) {
        this.residenceType = residenceType;
    }

    @Basic
    @Column(name = "residence_status", nullable = true)
    public Integer getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(Integer residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    @Basic
    @Column(name = "iscanceled", nullable = false)
    public boolean isIscanceled() {
        return iscanceled;
    }

    public void setIscanceled(boolean iscanceled) {
        this.iscanceled = iscanceled;
    }

    @Basic
    @Column(name = "dateofcacenlation", nullable = true)
    public Date getDateofcacenlation() {
        return dateofcacenlation;
    }

    public void setDateofcacenlation(Date dateofcacenlation) {
        this.dateofcacenlation = dateofcacenlation;
    }

    @Basic
    @Column(name = "dateofregister", nullable = true)
    public Date getDateofregister() {
        return dateofregister;
    }

    public void setDateofregister(Date dateofregister) {
        this.dateofregister = dateofregister;
    }

    @Basic
    @Column(name = "reason_for_cancelation", nullable = true, length = -1)
    public String getReasonForCancelation() {
        return reasonForCancelation;
    }

    public void setReasonForCancelation(String reasonForCancelation) {
        this.reasonForCancelation = reasonForCancelation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtraFamilyInfoEntity that = (ExtraFamilyInfoEntity) o;

        if (familyId != that.familyId) return false;
        if (iscanceled != that.iscanceled) return false;
        if (totalFamilyIncome != null ? !totalFamilyIncome.equals(that.totalFamilyIncome) : that.totalFamilyIncome != null)
            return false;
        if (residenceType != null ? !residenceType.equals(that.residenceType) : that.residenceType != null)
            return false;
        if (residenceStatus != null ? !residenceStatus.equals(that.residenceStatus) : that.residenceStatus != null)
            return false;
        if (dateofcacenlation != null ? !dateofcacenlation.equals(that.dateofcacenlation) : that.dateofcacenlation != null)
            return false;
        if (dateofregister != null ? !dateofregister.equals(that.dateofregister) : that.dateofregister != null)
            return false;
        if (reasonForCancelation != null ? !reasonForCancelation.equals(that.reasonForCancelation) : that.reasonForCancelation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyId;
        result = 31 * result + (totalFamilyIncome != null ? totalFamilyIncome.hashCode() : 0);
        result = 31 * result + (residenceType != null ? residenceType.hashCode() : 0);
        result = 31 * result + (residenceStatus != null ? residenceStatus.hashCode() : 0);
        result = 31 * result + (iscanceled ? 1 : 0);
        result = 31 * result + (dateofcacenlation != null ? dateofcacenlation.hashCode() : 0);
        result = 31 * result + (dateofregister != null ? dateofregister.hashCode() : 0);
        result = 31 * result + (reasonForCancelation != null ? reasonForCancelation.hashCode() : 0);
        return result;
    }
}
