package org.sarc.dahelp.database.relief;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "cobon_type", schema = "relief", catalog = "dahelp")
public class CobonTypeEntity {
    private Integer id;
    private String name;
    private String prefix;
    private Boolean isActive;
    private Integer currentNumber;
    private Collection<CobonEntity> cobonsById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "prefix", nullable = false, length = 3)
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "current_number", nullable = false)
    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CobonTypeEntity that = (CobonTypeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (currentNumber != null ? !currentNumber.equals(that.currentNumber) : that.currentNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (currentNumber != null ? currentNumber.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "cobonTypeByCobonId")
    public Collection<CobonEntity> getCobonsById() {
        return cobonsById;
    }

    public void setCobonsById(Collection<CobonEntity> cobonsById) {
        this.cobonsById = cobonsById;
    }
}
