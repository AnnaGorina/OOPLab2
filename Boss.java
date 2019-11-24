package com.company;

public class Boss extends Person {

    private Company company;

    public Boss (Company company, String Surname, String Name, String Patronymic) {
        super(Surname, Name, Patronymic);
        this.company = company;
    }


    public boolean JoinAPerson (Employee employee) {

        if (employee.GetCountCompany() < 5) {
            if (company.CheckPerson(employee)) {
                return false;
            }

            company.addEmployee(employee);
            employee.JoinACompany(this);
            return true;
        }

        return false;
    }

    public void DismissPerson (Employee employee) {
        company.removeEmployee(employee);
    }

    @Override
    public String toString () {
        int count = 1;
        String cout = "Название компании: " + company.GetNameOfCompany() + "\n"
                + "Босс: " + GetSurnamePerson()
                + " " + GetNamePerson()
                + " " + GetPatronymicPerson() + "\n"
                + "Работники: " + "\n";
        for (int i = 0; i < company.GetCountPerson(); i++) {
            cout += count + ". " + company.GetNameOfPerson(i) + "\n";
            count++;
        }

        return cout;
    }
}
