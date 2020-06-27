package org.sarc.dahelp.database.relief;

import javax.persistence.*;

@Entity
@Table(name = "material_in_cobon", schema = "relief", catalog = "dahelp")
@IdClass(MaterialInCobonEntityPK.class)
public class MaterialInCobonEntity {
    private Integer materialId;
    private Integer internantionalOrganizationId;
    private Integer cobonId;
    private Integer cobonTypeId;
    private Integer numberOfItems;
    private MaterialsEntity materials;
    private CobonEntity cobon;

    @Id
    @Column(name = "material_id", nullable = false)
    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Id
    @Column(name = "internantional_organization_id", nullable = false)
    public Integer getInternantionalOrganizationId() {
        return internantionalOrganizationId;
    }

    public void setInternantionalOrganizationId(Integer internantionalOrganizationId) {
        this.internantionalOrganizationId = internantionalOrganizationId;
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
    @Column(name = "cobon_type_id", nullable = false)
    public Integer getCobonTypeId() {
        return cobonTypeId;
    }

    public void setCobonTypeId(Integer cobonTypeId) {
        this.cobonTypeId = cobonTypeId;
    }

    @Basic
    @Column(name = "number_of_items", nullable = false)
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialInCobonEntity that = (MaterialInCobonEntity) o;

        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (internantionalOrganizationId != null ? !internantionalOrganizationId.equals(that.internantionalOrganizationId) : that.internantionalOrganizationId != null)
            return false;
        if (cobonId != null ? !cobonId.equals(that.cobonId) : that.cobonId != null) return false;
        if (cobonTypeId != null ? !cobonTypeId.equals(that.cobonTypeId) : that.cobonTypeId != null) return false;
        return numberOfItems != null ? numberOfItems.equals(that.numberOfItems) : that.numberOfItems == null;
    }

    @Override
    public int hashCode() {
        int result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (internantionalOrganizationId != null ? internantionalOrganizationId.hashCode() : 0);
        result = 31 * result + (cobonId != null ? cobonId.hashCode() : 0);
        result = 31 * result + (cobonTypeId != null ? cobonTypeId.hashCode() : 0);
        result = 31 * result + (numberOfItems != null ? numberOfItems.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "material_id", referencedColumnName = "materials_id", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "internantional_organization_id", referencedColumnName = "internation_organization_id", nullable = false, insertable = false, updatable = false)})
    public MaterialsEntity getMaterials() {
        return materials;
    }

    public void setMaterials(MaterialsEntity materials) {
        this.materials = materials;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "cobon_id", referencedColumnName = "cobon_id", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "cobon_type_id", referencedColumnName = "cobontype_id", nullable = false, insertable = false, updatable = false)})
    public CobonEntity getCobon() {
        return cobon;
    }

    public void setCobon(CobonEntity cobon) {
        this.cobon = cobon;
    }
}
