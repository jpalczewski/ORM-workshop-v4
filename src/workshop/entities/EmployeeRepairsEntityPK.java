package workshop.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by erxyi on 06.01.16.
 */
public class EmployeeRepairsEntityPK implements Serializable {
    private Byte repairId;
    private Byte employeeId;

    @Column(name = "REPAIR_ID", nullable = false, precision = 0)
    @Id
    public Byte getRepairId() {
        return repairId;
    }

    public void setRepairId(Byte repairId) {
        this.repairId = repairId;
    }

    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    @Id
    public Byte getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Byte employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeRepairsEntityPK that = (EmployeeRepairsEntityPK) o;

        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId != null ? repairId.hashCode() : 0;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        return result;
    }
}
