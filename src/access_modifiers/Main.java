package access_modifiers;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.publicMethod();

        Person person = new Person();
        person.firstName = "John";
        person.lastName = "Smith";
        person.desiredSalary = 18000.;

        Employee employee = new Employee();
        employee.firstName = person.firstName;
        employee.lastName = person.lastName;
        employee.salary = person.desiredSalary - 1000;
        employee.tax = 3000.;

        System.out.println("Employee Netto Salary: " + TaxCalculatorUtil.getSalaryAfterTax(employee));

    }
}

class Person {
    String firstName;
    String lastName;
    Double desiredSalary;
}

//class Car {
//}
//
//class RentCompany {
//    Car[] cars = new Car[]{new Car(), new Car()};
//    String companyName;
//    String companyAddress;
//    String companyIdNumber;
//}

class A {
    public void publicMethod() {
    }

    protected void protectedMethod() {
    }

    private void privateMethod() {
    }

    /*default*/ void defaultMethod() {
    }
}
