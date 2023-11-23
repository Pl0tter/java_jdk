package org.hw04;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        employeeRepo.addEmployee(new Employee(1, 81112223344L, "Иван", 2015));
        employeeRepo.addEmployee(new Employee(2, 82223334455L, "Дарья", 2019));
        employeeRepo.addEmployee(new Employee(3, 83334445566L, "Иван", 2020));
        employeeRepo.addEmployee(new Employee(4, 84445556677L, "Мария", 2021));
        employeeRepo.addEmployee(new Employee(5, 85556667788L, "Владимир", 2015));

        System.out.println(employeeRepo.searchByExperience(8));
        System.out.println();
        System.out.println(employeeRepo.searchByName("Иван"));
        System.out.println();
        System.out.println(employeeRepo.searchById(2));
    }
}
