package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "MOTORS", schema = "JPALCZEW", catalog = "")
public class MotorsEntity {
    private Byte motorId;
    private Byte forceKw;
    private Serializable company;
    private Time year;

    @Id
    @Column(name = "MOTOR_ID", nullable = false, precision = 0)
    public Byte getMotorId() {
        return motorId;
    }

    public void setMotorId(Byte motorId) {
        this.motorId = motorId;
    }

    @Basic
    @Column(name = "FORCE_KW", nullable = true, precision = 2)
    public Byte getForceKw() {
        return forceKw;
    }

    public void setForceKw(Byte forceKw) {
        this.forceKw = forceKw;
    }

    @Basic
    @Column(name = "COMPANY", nullable = true, length = 20)
    public Serializable getCompany() {
        return company;
    }

    public void setCompany(Serializable company) {
        this.company = company;
    }

    @Basic
    @Column(name = "YEAR", nullable = true)
    public Time getYear() {
        return year;
    }

    public void setYear(Time year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MotorsEntity that = (MotorsEntity) o;

        if (motorId != null ? !motorId.equals(that.motorId) : that.motorId != null) return false;
        if (forceKw != null ? !forceKw.equals(that.forceKw) : that.forceKw != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = motorId != null ? motorId.hashCode() : 0;
        result = 31 * result + (forceKw != null ? forceKw.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }
}
