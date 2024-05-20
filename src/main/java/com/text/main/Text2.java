package com.text.main;

import com.text.Bean.ExampleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text2 {

    public static void main(String[] args) {
       
        String conf = "applicationContext.xml";
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        ExampleBean bean = ac.getBean("exampleBean",ExampleBean.class);
        ExampleBean bean1 = ac.getBean("exampleBean",ExampleBean.class);
        System.out.println(bean == bean1);

        ac.close();
    }
}
