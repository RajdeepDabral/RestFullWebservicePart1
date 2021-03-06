package dabral.rajdeep.springRestFullServiceQuestions;

import dabral.rajdeep.springRestFullServiceQuestions.employee.Employee;
import dabral.rajdeep.springRestFullServiceQuestions.employee.EmployeeDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerClass {
    @Autowired
    private EmployeeDaoService employeeDaoService;

    /*
    1. Create a simple REST ful service in Spring Boot
       which returns the Response "Welcome to spring boot".
     */
    @GetMapping("/Question1")
    public String welcomeMessage(){
        return "Welcome to spring boot";
    }


    /*
    2. Create an Employee Bean(id, name, age) and service to
       perform different operations related to employee.
    */

    @GetMapping("/Question2")
    public Employee createEmployeeBean(){
        return new Employee(101,"Rajdeep Dabral" , 23);
    }

    /*
    3. Implement GET http request for Employee to get list of employees.
    */
    @GetMapping("/Question3")
    public List<Employee> getAllEmployee(){
        return employeeDaoService.getAllEmployee();
    }

    /*
    4.Implement GET http request using path variable top get one employee
    */
    @GetMapping("/Question4/{id}")
    public Employee getSpecificEmployee(@PathVariable int id){
        return  employeeDaoService.getOneEmployee(id);
    }
    /*
    5. Implement POST http request for Employee to create a new employee.
    */
    @PostMapping("/Question5")
    public void createEmployee(@RequestBody Employee employee){
        System.out.println("Is Employee Added :  " +employeeDaoService.createEmployee(employee));
    }

    /*
    6. Implement Exception Handling for resource not found
    */

    /*
    7. Implement DELETE http request for Employee to delete employee
    */
    @GetMapping("/Question7/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        System.out.println("Is Employee Deleted : "+employeeDaoService.deleteEmployeeById(id));
    }

    /*
    8. Implement PUT http request for Employee to update employee
    */
    @PostMapping("/Question8")
    public void updateEmployee(@RequestBody Employee employee){
        System.out.println("Is Employee Updated : "+employeeDaoService.updateEmployee(employee));
    }
}
