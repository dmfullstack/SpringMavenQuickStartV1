package com.stackroute.springmavenquickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.springmavenquickstart.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});

    	Customer custA = (Customer)context.getBean("customerBean");
    	custA.setMessage("Message by custA");
    	System.out.println("Message : " + custA.getMessage());
    	
    	//retrieve another bean instance
    	Customer custB = (Customer)context.getBean("customerBean");
    	System.out.println("Message : " + custB.getMessage());
    }
}
