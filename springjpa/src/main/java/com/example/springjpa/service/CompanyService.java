package com.example.springjpa.service;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springjpa.bean.Company;
import com.example.springjpa.bean.Employee;

@Service
@Transactional
public class CompanyService {
	
	@Autowired
	private EntityManager em;

	public void getCompany() {
		Company c = em.find(Company.class, 1);
		/*
		 * c.setCity("c5"); c.setCompanyName("c5"); c.setEmployeeList(new
		 * ArrayList<Employee>());
		 */
		System.out.println("Compnay fetched");
		/*
		 * Employee emp = new Employee(); emp.setEmployeeName("emp2_3");
		 * emp.setCmpName("IBM"); emp.setSalary(6000); emp.setCompnayToEmpMap(c);
		 * c.getEmployeeList().add(emp);
		 */
		//c.getEmployeeList().remove(0);
		c.setCity(c.getCity());
		/*
		 * try { Thread.sleep(100*1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println("Saved1");
		System.out.println("Done1");
	}
	
	public void insertCompany() {
		Company c = new Company();
		c.setCity("test");
		c.setCompanyName("test2");
		try {
			Thread.sleep(20*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("saved2");
		System.out.println("Done2");
	}
	
	public void mergeCompany() {
		Company c = em.find(Company.class, 1);
		Company c2 = em.find(Company.class, 2);
		for(Employee emp : c2.getEmployeeList()) {
			emp.setCompnayToEmpMap(c);
			c.getEmployeeList().add(emp);
		}
		//c.getEmployeeList().addAll(c2.getEmployeeList());
		c.setCity(c.getCity()+1);
		c2.setCity(c2.getCity()+1);
		//em.persist(c);
		//em.persist(c2);
		System.out.println("saved");
		System.out.println("Done");
	}
}
