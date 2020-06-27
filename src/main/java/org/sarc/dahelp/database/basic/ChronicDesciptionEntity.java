package org.sarc.dahelp.database.basic;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "chronic_desciption", schema = "basic", catalog = "dahelp")
public class ChronicDesciptionEntity {
    private Integer statusId;
    private String statusName;
    private String code;
    private Collection<HealthStatusEntity> healthStatusesByStatusId;

    @Id
    @Column(name = "status_id", nullable = false)
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "status_name", nullable = false, length = 50)
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 5)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChronicDesciptionEntity that = (ChronicDesciptionEntity) o;

        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (statusName != null ? !statusName.equals(that.statusName) : that.statusName != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = statusId != null ? statusId.hashCode() : 0;
        result = 31 * result + (statusName != null ? statusName.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "chronicDesciptionByStatusId")
    public Collection<HealthStatusEntity> getHealthStatusesByStatusId() {
        return healthStatusesByStatusId;
    }

    public void setHealthStatusesByStatusId(Collection<HealthStatusEntity> healthStatusesByStatusId) {
        this.healthStatusesByStatusId = healthStatusesByStatusId;
    }
}
