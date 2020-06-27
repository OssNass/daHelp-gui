package org.sarc.dahelp.database.relief;

import org.sarc.dahelp.database.administration.InternationorganizationEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "materials", schema = "relief", catalog = "dahelp")
@IdClass(MaterialsEntityPK.class)
public class MaterialsEntity {
    private Integer materialsId;
    private Integer internationOrganizationId;
    private String name;
    private String unit;
    private Integer materialType;
    private Collection<MaterialInCobonEntity> materialInCobons;
    private InternationorganizationEntity internationorganizationByInternationOrganizationId;

    @Id
    @Column(name = "materials_id", nullable = false)
    public Integer getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(Integer materialsId) {
        this.materialsId = materialsId;
    }

    @Id
    @Column(name = "internation_organization_id", nullable = false)
    public Integer getInternationOrganizationId() {
        return internationOrganizationId;
    }

    public void setInternationOrganizationId(Integer internationOrganizationId) {
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
    public Integer getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialsEntity that = (MaterialsEntity) o;

        if (materialsId != null ? !materialsId.equals(that.materialsId) : that.materialsId != null) return false;
        if (internationOrganizationId != null ? !internationOrganizationId.equals(that.internationOrganizationId) : that.internationOrganizationId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (materialType != null ? !materialType.equals(that.materialType) : that.materialType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialsId != null ? materialsId.hashCode() : 0;
        result = 31 * result + (internationOrganizationId != null ? internationOrganizationId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (materialType != null ? materialType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "materials")
    public Collection<MaterialInCobonEntity> getMaterialInCobons() {
        return materialInCobons;
    }

    public void setMaterialInCobons(Collection<MaterialInCobonEntity> materialInCobons) {
        this.materialInCobons = materialInCobons;
    }

    @ManyToOne
    @JoinColumn(name = "internation_organization_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public InternationorganizationEntity getInternationorganizationByInternationOrganizationId() {
        return internationorganizationByInternationOrganizationId;
    }

    public void setInternationorganizationByInternationOrganizationId(InternationorganizationEntity internationorganizationByInternationOrganizationId) {
        this.internationorganizationByInternationOrganizationId = internationorganizationByInternationOrganizationId;
    }
}
