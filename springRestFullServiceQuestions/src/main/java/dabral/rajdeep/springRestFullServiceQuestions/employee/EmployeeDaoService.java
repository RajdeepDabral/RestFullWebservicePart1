package dabral.rajdeep.springRestFullServiceQuestions.employee;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Component
public class EmployeeDaoService {
    private static List<Employee> list =  new ArrayList<>();
    static{
        list.add(new Employee(101,"Rajdeep",23));
        list.add(new Employee(102,"Suraj",21));
        list.add(new Employee(103,"Shubham",18));
        list.add(new Employee(104,"Neha",29));
        list.add(new Employee(105,"Swati",33));
    }
    public List<Employee> getAllEmployee() {
        return list;
    }
    public Employee getOneEmployee(int id){
        for(Employee employee : list){
            if(id==employee.getId()){
                return employee;
            }
        }
        return null;
    }
    public Employee  createEmployee(Employee employee){
        list.add(employee);
        return employee;
    }
   public Boolean deleteEmployeeById(int id){
       Employee employeeTemp=null;
       Iterator<Employee> iterator = list.iterator();
       while(iterator.hasNext()){
           employeeTemp = iterator.next();
           if(employeeTemp.getId()==id){
               iterator.remove();
               return true;
           }
       }
       throw new UserNotFoundException("Record not found");
   }

    public boolean updateEmployee(Employee employee) {
        ListIterator listIterator = list.listIterator();
        Employee employeeTemp;
        while(listIterator.hasNext()){
            employeeTemp = (Employee) listIterator.next();
            if(employeeTemp.getId()== employee.getId()){
                listIterator.set(employee);
                return true;
            }
        }
        return  false;
    }

    public Employee getEmployeeException(int id) throws UserNotFoundException {
        for (Employee employee : list) {
            if (id == employee.getId()) {
                return employee;
            }
        }
        throw new UserNotFoundException("Record not found");
    }
}
