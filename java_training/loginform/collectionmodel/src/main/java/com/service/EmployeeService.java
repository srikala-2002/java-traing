package com.service;

import java.util.List;

import com.model.Address;
import com.model.Employee;

public interface EmployeeService {
public abstract List<Address> findByAddress(Employee employee ,String city);
}
