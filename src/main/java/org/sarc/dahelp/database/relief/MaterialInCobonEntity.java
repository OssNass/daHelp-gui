package org.sarc.dahelp.database.relief;

import javax.persistence.*;

@Entity
@Table(name = "material_in_cobon", schema = "relief", catalog = "dahelp")
@IdClass(MaterialInCobonEntityPK.class)
public class MaterialInCobonEntity {
    private int materialId;
    private int internantionalOrganizationId;
    private int cobonId;
    private int cobonTypeId;
    private int numberOfItems;

    @Id
    @Column(name = "material_id", nullable = false)
    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    @Id
    @Column(name = "internantional_organization_id", nullable = false)
    public int getInternantionalOrganizationId() {
        return internantionalOrganizationId;
    }

    public void setInternantionalOrganizationId(int internantionalOrganizationId) {
        this.internantionalOrganizationId = internantionalOrganizationId;
    }

    @Id
    @Column(name = "cobon_id", nullable = false)
    public int getCobonId() {
        return cobonId;
    }

    public void setCobonId(int cobonId) {
        this.cobonId = cobonId;
    }

    @Id
    @Column(name = "cobon_type_id", nullable = false)
    public int getCobonTypeId() {
        return cobonTypeId;
    }

    public void setCobonTypeId(int cobonTypeId) {
        this.cobonTypeId = cobonTypeId;
    }

    @Basic
    @Column(name = "number_of_items", nullable = false)
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialInCobonEntity that = (MaterialInCobonEntity) o;

        if (materialId != that.materialId) return false;
        if (internantionalOrganizationId != that.internantionalOrganizationId) return false;
        if (cobonId != that.cobonId) return false;
        if (cobonTypeId != that.cobonTypeId) return false;
        if (numberOfItems != that.numberOfItems) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId;
        result = 31 * result + internantionalOrganizationId;
        result = 31 * result + cobonId;
        result = 31 * result + cobonTypeId;
        result = 31 * result + numberOfItems;
        return result;
    }
}
