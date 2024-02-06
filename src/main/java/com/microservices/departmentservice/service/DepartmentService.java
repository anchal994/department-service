package com.microservices.departmentservice.service;

import com.microservices.departmentservice.dto.DepartmentDto;
import com.microservices.departmentservice.entity.Department;

public interface DepartmentService {

	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	
	DepartmentDto getDepartmentByCode(String departmentCode);

	Department saveDepartment(Department department);
	
	Department getDepartmentByCodeTwo(String departmentCode);
}
