package com.codes.springbootdatajpajunit.jpa;

import com.codes.springbootdatajpajunit.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
     Employee findByFirstName(String username);
}