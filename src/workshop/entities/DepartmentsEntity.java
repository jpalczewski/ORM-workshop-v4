package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "DEPARTMENTS", schema = "JPALCZEW", catalog = "")
public class DepartmentsEntity {
    private Byte depId;
    private Serializable depName;

    @Id
    @Column(name = "DEP_ID", nullable = false, precision = 0)
    public Byte getDepId() {
        return depId;
    }

    public void setDepId(Byte depId) {
        this.depId = depId;
    }

    @Basic
    @Column(name = "DEP_NAME", nullable = true, length = 30)
    public Serializable getDepName() {
        return depName;
    }

    public void setDepName(Serializable depName) {
        this.depName = depName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentsEntity that = (DepartmentsEntity) o;

        if (depId != null ? !depId.equals(that.depId) : that.depId != null) return false;
        if (depName != null ? !depName.equals(that.depName) : that.depName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depId != null ? depId.hashCode() : 0;
        result = 31 * result + (depName != null ? depName.hashCode() : 0);
        return result;
    }
}
