package org.hw04;

import java.time.Year;

public class Employee {
    private int id;
    private long phoneNumber;
    private String name;
    private int yearOfStartWorking;

    public int getId() {
        return id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int experience() {
        return Year.now().getValue() - yearOfStartWorking;
    }

    public Employee(int id, long phoneNumber, String name, int yearOfStartWorking) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.yearOfStartWorking = yearOfStartWorking;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "id: " + id +
                ", телефонный номер: " + phoneNumber +
                ", имя: '" + name + '\'' +
                ", стаж: " + experience() +
                '}';
    }
}
