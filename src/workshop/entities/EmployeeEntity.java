package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "EMPLOYEE", schema = "JPALCZEW", catalog = "")
public class EmployeeEntity {
    private Byte employeeId;
    private Serializable fname;
    private Serializable lname;
    private Serializable position;
    private Time employmentDate;
    private Byte hourRate;
    private Byte version;
    private Byte departmentId;

    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    public Byte getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Byte employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "FNAME", nullable = false, length = 20)
    public Serializable getFname() {
        return fname;
    }

    public void setFname(Serializable fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "LNAME", nullable = false, length = 40)
    public Serializable getLname() {
        return lname;
    }

    public void setLname(Serializable lname) {
        this.lname = lname;
    }

    @Basic
    @Column(name = "POSITION", nullable = true, length = 20)
    public Serializable getPosition() {
        return position;
    }

    public void setPosition(Serializable position) {
        this.position = position;
    }

    @Basic
    @Column(name = "EMPLOYMENT_DATE", nullable = true)
    public Time getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Time employmentDate) {
        this.employmentDate = employmentDate;
    }

    @Basic
    @Column(name = "HOUR_RATE", nullable = false, precision = 2)
    public Byte getHourRate() {
        return hourRate;
    }

    public void setHourRate(Byte hourRate) {
        this.hourRate = hourRate;
    }

    @Basic
    @Column(name = "VERSION", nullable = false, precision = 0)
    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }

    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    public Byte getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Byte departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
        if (fname != null ? !fname.equals(that.fname) : that.fname != null) return false;
        if (lname != null ? !lname.equals(that.lname) : that.lname != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (employmentDate != null ? !employmentDate.equals(that.employmentDate) : that.employmentDate != null)
            return false;
        if (hourRate != null ? !hourRate.equals(that.hourRate) : that.hourRate != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (employmentDate != null ? employmentDate.hashCode() : 0);
        result = 31 * result + (hourRate != null ? hourRate.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}
