package CompanyPackage;

import java.util.ArrayList;

public class Company {
    private String NameOfCompany;

    private ArrayList<Employee>PersonOfCompany = new ArrayList<Employee>();

    public Company(String NameOfCompany) {
        this.NameOfCompany = NameOfCompany;
    }

    public final String GetNameOfCompany() { return NameOfCompany; }

    public Employee GetNameOfPerson(int i) {
        return PersonOfCompany.get(i);
    }

    public final Employee GetPerson(final String Surname, final String Name, final String Patronymic) {
        for (Employee employee : PersonOfCompany) {
            if (employee.equals(Surname, Name, Patronymic)) {
                return employee;
            }
        }

        return null;
    }

    public boolean CheckPerson(final String Surname, final String Name, final String Patronymic) {
        for (Employee employee : PersonOfCompany) {
            if (employee.equals(Surname, Name, Patronymic)) {
                return true;
            }
        }

        return false;
    }

    public int GetCountPerson() {
        return PersonOfCompany.size();
    }

    public boolean CheckPerson(Employee employee) {
        return PersonOfCompany.contains(employee);
    }

    void addEmployee(Employee employee) {
        PersonOfCompany.add(employee);
    }

    void removeEmployee(Employee employee) {
        PersonOfCompany.remove(employee);
    }
}
