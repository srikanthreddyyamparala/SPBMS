package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeRegistrationController;
import com.nt.vo.EmployeeRegristrationVo;

public class EmployeeRegistrationTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String ename=sc.next();
		
		System.out.println("Enter Employee Address");
		String eaddr=sc.next();
		
		System.out.println("Enter Employee Basic Salary");
		
		String basicSal=sc.next();
		
		EmployeeRegristrationVo vo=new EmployeeRegristrationVo();
		vo.setEname(ename);
		vo.setEaddr(eaddr);
		vo.setBasicsal(basicSal);
		
		ClassPathXmlApplicationContext context=new  ClassPathXmlApplicationContext("/com/nt/cfg/applicationContext.xml");
		EmployeeRegistrationController controller=context.getBean("employeeContoller", EmployeeRegistrationController.class);
		try {
			String result=controller.EmployeeRegistrationProcess(vo);
			System.out.println("FINAL :"+result);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem!...");
		}
		

	}

}
