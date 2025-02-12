package org.springseteroType.Annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Student {
    @Value("Gajendra")
    private  String name;
    @Value("23")
    private  int age ;
    @Value("4th Years")
    private  String cls;

    // here we  are using the collection datatype store the value to use
    @Value("#{temp}")
    private List<String>  liss;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public List<String> getLiss() {
        return liss;
    }

    public void setLiss(List<String> liss) {
        this.liss = liss;
    }

    public Student(String name, int age, String cls,
                   List<String> liss
    ) {
        this.name = name;
        this.age = age;
        this.cls= cls;
        this.liss = liss;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cls='" + cls + '\'' +
                ", liss=" + liss +
                '}';
    }

    public  Student(){super();}
}
