package dabral.rajdeep.springRestFullServiceQuestions.employee;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;

public class Employee {
    @NotNull("Id cannot be empty!!!")
    private int id;
    @NotNull("name cannot be empty!!!")
    @Size(min=2)
    private String name;
    @NotNull("age cannot be empty!!!")
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    protected Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
