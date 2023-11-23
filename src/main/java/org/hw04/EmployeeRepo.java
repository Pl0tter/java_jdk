package org.hw04;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
    private List<Employee> employeeList;

    public EmployeeRepo() {
        this.employeeList = new ArrayList<>();
    }

    public boolean addEmployee(Employee employee) {
        return employeeList.add(employee);
    }

    public List<Employee> searchByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.experience() == experience) {
                result.add(emp);
            }
        }
        return result;
    }

    public List<String> searchByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getName().equals(name)) {
                result.add("Имя сотрудника: " + emp.getName() + ". Телефонный номер: " + emp.getPhoneNumber());
            }
        }
        return result;
    }

    public Employee searchById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
