package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//Locate and holds Spring Bean cfg file
		 FileSystemResource res=new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
		 //create IOC Container
		 XmlBeanFactory factory=new XmlBeanFactory(res);
		 
		 //getting TargetBean class object
		 Object obj=factory.getBean("wmg");
		 
		 //typecasting
		 WishMessageGenerator generator=(WishMessageGenerator)obj;
		 
		 //call Business Method
		 
		 String result=generator.generteWishMessgae("SRIKANTH REDDY");
		 
		 System.out.println("Result::"+result);
		 

	}

}
