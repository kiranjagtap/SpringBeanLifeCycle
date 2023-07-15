package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Rectangle implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware,
        BeanPostProcessor {

    Colour colour;
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("---------------Circle afterPropertiesSet get called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("-------------Destroy get called for rectangle");
    }


    public void drawRectangle(Colour colour){

        System.out.println("Drawing Rectangle with colour "+ colour.fill());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //colour = applicationContext.getBean(Red.class);
        //drawRectangle(colour);
        System.out.println("setApplicationContext from rectangle");
    }

    @PostConstruct
    public void draw(){
        System.out.println("Drawing Rectangle");
    }

    @PreDestroy
    public void voidCustomDestroy(){

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName  get called");
    }


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessBeforeInitialization bean name "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization bean name "+beanName);
        return bean;
    }
}
