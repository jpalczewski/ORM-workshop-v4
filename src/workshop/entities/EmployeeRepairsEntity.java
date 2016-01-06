package workshop.entities;

import javax.persistence.*;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "EMPLOYEE_REPAIRS", schema = "JPALCZEW", catalog = "")
@IdClass(EmployeeRepairsEntityPK.class)
public class EmployeeRepairsEntity {
    private Byte repairId;
    private Byte employeeId;
    private Byte billedHours;

    @Id
    @Column(name = "REPAIR_ID", nullable = false, precision = 0)
    public Byte getRepairId() {
        return repairId;
    }

    public void setRepairId(Byte repairId) {
        this.repairId = repairId;
    }

    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    public Byte getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Byte employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "BILLED_HOURS", nullable = false, precision = 0)
    public Byte getBilledHours() {
        return billedHours;
    }

    public void setBilledHours(Byte billedHours) {
        this.billedHours = billedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeRepairsEntity that = (EmployeeRepairsEntity) o;

        if (repairId != null ? !repairId.equals(that.repairId) : that.repairId != null) return false;
        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
        if (billedHours != null ? !billedHours.equals(that.billedHours) : that.billedHours != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId != null ? repairId.hashCode() : 0;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (billedHours != null ? billedHours.hashCode() : 0);
        return result;
    }
}
