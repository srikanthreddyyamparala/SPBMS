package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDiTest {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Customer Name");
	  String name=sc.next();
	  System.out.println("Enter Customer Address");
	  String addr=sc.next();
	  System.out.println("Enter PrincipleAmount");
	  String pamt=sc.next();
	  System.out.println("Enter rate of Intrest");
	  String rate=sc.next();
	  System.out.println("Enter Time of Intrest");
	  String time=sc.next();
	  
	  
	  CustomerVO vo=new CustomerVO();
	  vo.setCustName(name);
	  vo.setCustAddr(addr);
	  vo.setPamt(pamt);
	  vo.setRate(rate);
	  vo.setTime(time);
	  
	  //Create IOC Container
	  DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	  XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	  reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
	  //get MainController
	  MainController controller=factory.getBean("controller",MainController.class);
	  //invoke Bussiness methods;
	  
		try {
			String result = controller.processCustomer(vo);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Internal Problem Try Again!!!");
		}
	  

	}

}
