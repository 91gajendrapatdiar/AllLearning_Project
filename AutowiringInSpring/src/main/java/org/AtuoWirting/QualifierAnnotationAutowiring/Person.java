package org.AtuoWirting.QualifierAnnotationAutowiring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    @Autowired
     private Name name;

    @Autowired
    private Address address;

    @Override
    public String
    toString() {
        return "Person{" +
                "name=" + name +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Person(Name name, Address address) {
this.name = name;
        this.address = address;
    }
    public Person(){
        super();
    }
}
