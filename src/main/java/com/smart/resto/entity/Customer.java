package com.smart.resto.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer")
/*@NamedQueries({
        @NamedQuery(
                name = "Customer.findCustomers",
                query = "SELECT c " +
                        "FROM Customer c"
        )
})*/
public class Customer implements Serializable {
    @Id
    private String id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


