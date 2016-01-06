package workshop.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by erxyi on 06.01.16.
 */
@Entity
@Table(name = "CUSTOMERS", schema = "JPALCZEW", catalog = "")
public class CustomersEntity {
    private Byte customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private String city;

    @Id
    @Column(name = "CUSTOMER_ID", nullable = false, precision = 0)
    public Byte getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Byte customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 40)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true, length = 13)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "POSTAL_CODE", nullable = true, length = 6)
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "CITY", nullable = true, length = 25)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomersEntity that = (CustomersEntity) o;

        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
