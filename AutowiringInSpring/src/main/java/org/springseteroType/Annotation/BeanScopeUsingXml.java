package org.springseteroType.Annotation;

public class BeanScopeUsingXml {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanScopeUsingXml(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanScopeUsingXml{" +
                "name='" + name + '\'' +
                '}';
    }
    public BeanScopeUsingXml(){super();}
}
