package com.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.model.Address;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeeImp;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpName("ajay");
		employee1.setEmpNo(1);
		employee1.setSalary(2000);
		Address pre = new Address(1, "chennai", "tn", 11111);
		Address off = new Address(2, "hyd", "ts", 2222);
		Address nav = new Address(3, "hyd", "ts", 3333);
		Set<Address> addresses= new HashSet<Address>();
		addresses.add(pre);
		addresses.add(off);
		addresses.add(nav);
		employee1.setAddress(addresses);
		EmployeeService employeeService = new EmployeeeImp();
		List<Address>data=employeeService.findByAddress(employee1, "hyd");
		System.out.println(data.size());
		for (Address address : data) {
			System.out.println(address.getDoorNo());
		}
	}

}