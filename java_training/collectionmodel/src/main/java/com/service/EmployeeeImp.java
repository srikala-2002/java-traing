package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.model.Address;
import com.model.Employee;

public class EmployeeeImp implements EmployeeService {

	@Override
	public List<Address>findByAddress(Employee employee, String city) {
		List<Address> dummyaddress= new ArrayList<Address>();
		Set<Address>add=employee.getAddress();
		for (Address address : add) {
			if(address.getCity().equals(city))
			{
				dummyaddress.add(address);
			}
			else
			{
			
		}
	
		}
		return dummyaddress;
	
	}

}
