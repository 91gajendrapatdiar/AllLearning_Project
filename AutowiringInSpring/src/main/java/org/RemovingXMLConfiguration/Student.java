package org.RemovingXMLConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {


    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }

    public  void study() {
        this.address.Live();
    System.out.println("Gjaendra");
}

}
