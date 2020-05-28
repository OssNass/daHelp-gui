package org.sarc.dahelp.database.relief;

import javax.persistence.*;

@Entity
@Table(name = "materials", schema = "relief", catalog = "dahelp")
@IdClass(MaterialsEntityPK.class)
public class MaterialsEntity {
    private int materialsId;
    private int internationOrganizationId;
    private String name;
    private String unit;
    private int materialType;

    @Id
    @Column(name = "materials_id", nullable = false)
    public int getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(int materialsId) {
        this.materialsId = materialsId;
    }

    @Id
    @Column(name = "internation_organization_id", nullable = false)
    public int getInternationOrganizationId() {
        return internationOrganizationId;
    }

    public void setInternationOrganizationId(int internationOrganizationId) {
        this.internationOrganizationId = internationOrganizationId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "unit", nullable = false, length = 20)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "material_type", nullable = false)
    public int getMaterialType() {
        return materialType;
    }

    public void setMaterialType(int materialType) {
        this.materialType = materialType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialsEntity that = (MaterialsEntity) o;

        if (materialsId != that.materialsId) return false;
        if (internationOrganizationId != that.internationOrganizationId) return false;
        if (materialType != that.materialType) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialsId;
        result = 31 * result + internationOrganizationId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + materialType;
        return result;
    }
}
