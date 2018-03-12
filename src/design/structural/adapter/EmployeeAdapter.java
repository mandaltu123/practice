package design.structural.adapter;

public class EmployeeAdapter implements Employee {

    private EmployeeOldType employeeOldType;

    public EmployeeAdapter(EmployeeOldType employeeOldType) {
        this.employeeOldType = employeeOldType;
    }

    @Override
    public String getId() {
        return employeeOldType.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeOldType.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeOldType.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeOldType.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapter{" +
                "employeeOldType=" + employeeOldType +
                '}';
    }
}
