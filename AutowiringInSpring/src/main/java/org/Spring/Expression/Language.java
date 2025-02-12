package org.Spring.Expression;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Language {

    @Value("#{8<19?88:990}")
    private int  x;

    @Value("#{T(java.lang.Math).sqrt(17)}")
    private double z;
    @Value("#{T(java.lang.Math).PI}")
    private  double e;

@Value("#{new java.lang.String('Gajendra Patidar')}")
    private String name;

@Value("#{8<3}")
private boolean active;

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "x=" + x +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name +
                ", active=' "+active+'\'' +
                '}';
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getZ() {
        return z;
    }

    public Language(int x, double z, double e, String name, boolean active) {
        this.x = x;
        this.z = z;
        this.e = e;
        this.name = name;
        this.active = active;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Language(){super();}
}
