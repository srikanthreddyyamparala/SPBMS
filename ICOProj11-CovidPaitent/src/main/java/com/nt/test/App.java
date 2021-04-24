package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CovidPaitentVO;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Covid Paitent Name");
		String name = sc.next();
		System.out.println("Enter Covid Paitent Address");
		String addr = sc.next();
		System.out.println("Enter Mobile No");
		String mobile = sc.next();
		System.out.println("Enter No of  days Hospitalised");
		String noofDays = sc.next();
		System.out.println("Enter billperday");
		String billperDay = sc.next();

		CovidPaitentVO vo = new CovidPaitentVO();

		vo.setPaitentName(name);
		vo.setPaitentAddr(addr);
		vo.setMobileNo(mobile);
		vo.setNoofdaysHospitalized(noofDays);
		vo.setBillPerDay(billperDay);

		// Create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");

		MainController controller = factory.getBean("controller", MainController.class);
		try {
			String result = controller.processCovidPaitentDetails(vo);
			System.out.println("Result :" + result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Internal Problem Try Again!!!");
		}

	}
}
