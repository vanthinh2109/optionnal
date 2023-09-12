package Beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle/beans.xml");
        applicationContext.close();
    }
}
