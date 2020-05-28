package org.sarc.dahelp.database.relief;

import javax.persistence.*;

@Entity
@Table(name = "cobon_type", schema = "relief", catalog = "dahelp")
public class CobonTypeEntity {
    private int id;
    private String name;
    private String prefix;
    private boolean isActive;
    private int currentNumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "current_number", nullable = false)
    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CobonTypeEntity that = (CobonTypeEntity) o;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (currentNumber != that.currentNumber) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + currentNumber;
        return result;
    }
}
