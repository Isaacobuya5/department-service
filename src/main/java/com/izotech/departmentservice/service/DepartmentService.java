package com.izotech.departmentservice.service;

import com.izotech.departmentservice.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
