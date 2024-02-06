package com.microservices.departmentservice;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
import com.microservices.departmentservice.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class DepartmentServiceApplicationTests {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @Test
    void contextLoads() {
        // Ensure that the application context loads successfully
    }

//    @Test
//    void testSaveDepartment() {
//        // Given
//        Department department = new Department();
//        department.setDepartmentName("IT");
//        department.setDepartmentDescription("Information Technology");
//        department.setDepartmentCode("IT001");
//        
//        when(departmentRepository.save(Mockito.any(Department.class))).thenReturn(department);
//
//        // When
//        Department savedDepartment = departmentService.saveDepartment(department);
//
//        // Then
//        assertNotNull(savedDepartment.getId());
//        assertEquals(department.getDepartmentName(), savedDepartment.getDepartmentName());
//        assertEquals(department.getDepartmentDescription(), savedDepartment.getDepartmentDescription());
//        assertEquals(department.getDepartmentCode(), savedDepartment.getDepartmentCode());
//    }

    @Test
    void testGetDepartmentByCode() {
        // Given
        Department department = new Department();
        department.setDepartmentName("IT");
        department.setDepartmentDescription("Information Technology");
        department.setDepartmentCode("IT001");
        
        when(departmentRepository.findByDepartmentCode("IT001")).thenReturn(department);

        // When
        Department foundDepartment = departmentService.getDepartmentByCodeTwo("IT001");

        // Then
        assertNotNull(foundDepartment);
        assertEquals(department.getDepartmentName(), foundDepartment.getDepartmentName());
        assertEquals(department.getDepartmentDescription(), foundDepartment.getDepartmentDescription());
        assertEquals(department.getDepartmentCode(), foundDepartment.getDepartmentCode());
    }
}
