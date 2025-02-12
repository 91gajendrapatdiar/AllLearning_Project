package org.Spring.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpressionLanguage {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringExpressionLanguage.xml");
        Language la = (Language) context.getBean("language",Language.class);
        System.out.println(la);
        System.out.println(la.hashCode());



        // using the predefine method of the Spring Expression language
/*
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression ex  = temp.parseExpression("11+55");
        System.out.println(ex.getValue());

 */
    }
}

