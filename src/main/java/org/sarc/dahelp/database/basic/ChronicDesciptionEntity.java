package org.sarc.dahelp.database.basic;

import javax.persistence.*;

@Entity
@Table(name = "chronic_desciption", schema = "basic", catalog = "dahelp")
public class ChronicDesciptionEntity {
    private int statusId;
    private String statusName;
    private String code;

    @Id
    @Column(name = "status_id", nullable = false)
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
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

        if (statusId != that.statusId) return false;
        if (statusName != null ? !statusName.equals(that.statusName) : that.statusName != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = statusId;
        result = 31 * result + (statusName != null ? statusName.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
