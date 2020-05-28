package org.sarc.dahelp.database.relief;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "food", schema = "relief", catalog = "dahelp")
public class FoodEntity {
    private int familyId;
    private Date fDate;
    private Integer materialId;

    @Id
    @Column(name = "family_id", nullable = false)
    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "f_date", nullable = true)
    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    @Basic
    @Column(name = "material_id", nullable = true)
    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodEntity that = (FoodEntity) o;

        if (familyId != that.familyId) return false;
        if (fDate != null ? !fDate.equals(that.fDate) : that.fDate != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = familyId;
        result = 31 * result + (fDate != null ? fDate.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        return result;
    }
}
