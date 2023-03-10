package com.knoldus.Question2;

//name datatype
class Name
{
    String firstName;
    String middleName;
    String lastName;
    Name(String firstName, String middleName, String lastName)
    {
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }
}
//address datatype
class Address
{
    String houseNumber;
    String street;
    String city;
    String state;
    String country;
    Address(String houseNumber, String street, String city, String state, String country)
    {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state=state;
        this.country=country;
    }
}


class Member
{
    Name name;
    int age;
    String phoneNumber;
    Address address;
    double salary;

    Member(Name name, int age, String phoneNumber, Address address, double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary()
    {
        System.out.println("The salary is: "+salary);
    }
}

class Employee extends Member
{
    String specialization;

    Employee(Name name, int age, String phoneNumber, Address address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;

    }
}
class Manager extends Member
{
    String department;
    Manager(Name name, int age, String phoneNumber, Address address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class PrintingSalary
{
    public static void main(String args[])
    {
        Name employeeName = new Name("Jasleen", "Kaur", "Wahi");

        Name managerName = new Name("Mansukh", "Kaur", "Wahi");

        Address employeeAddress = new Address("D-51", "Church Road, Bhogal", "New Delhi", "Delhi", "India");

        Address managerAddress = new Address("D-52", "Masjid Road, Bhogal", "New Delhi", "Delhi", "India");

        Employee employee1 = new Employee(employeeName, 23, "9818132944", employeeAddress, 189.98, "Computer Applications");
        Manager manager1 = new Manager(managerName, 23, "9717077348", managerAddress, 134.00, "Human Resource");
        //printing salary of employee
        employee1.printSalary();
        //printing salary of manager
        manager1.printSalary();
    }
}