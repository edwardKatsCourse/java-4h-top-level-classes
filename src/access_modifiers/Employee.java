package access_modifiers;

public class Employee {

    String firstName;
    String lastName;
    Double salary;
    Double tax;

    public String getFullName() {
        return String.format("%s %s",
                this.firstName,
                this.lastName);
    }
}
