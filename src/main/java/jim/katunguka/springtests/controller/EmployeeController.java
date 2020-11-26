package jim.katunguka.springtests.controller;

import jim.katunguka.springtests.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public Employee firstPage(){
        Employee emp = new Employee();
        emp.setName("Jim");
        emp.setDesignation("Engineer");
        emp.setEmpId("1");
        emp.setSalary(10000.00);

        return emp;
    }
}
