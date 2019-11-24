package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Boss BossMicrosoft = new Boss(new Company("Microsoft"), "Иванов", "Иван", "Иванович");
        Boss BossSamsung = new Boss(new Company("Samsung"), "Павлов", "Павел", "Павлович");

        Employee FirstEmployee = new Employee("Петров", "Петр", "Петрович");
        Employee SecondEmployee = new Employee("Александров", "Александр", "Александрович");
        Employee ThirdEmployee = new Employee("Максимов", "Максим", "Максимович");
        Employee FouthEmployee = new Employee("Николаев", "Николай", "Николаевич");

        ArrayList<Boss> Bosses = new ArrayList<>();
        ArrayList<Employee> Employees = new ArrayList<>();

        Bosses.add(BossMicrosoft);
        Bosses.add(BossSamsung);

        Employees.add(FirstEmployee);
        Employees.add(SecondEmployee);
        Employees.add(ThirdEmployee);
        Employees.add(FouthEmployee);

        Bosses.get(0).JoinAPerson(Employees.get(0));
        Bosses.get(0).JoinAPerson(Employees.get(1));
        Bosses.get(1).JoinAPerson(Employees.get(2));
        Bosses.get(1).JoinAPerson(Employees.get(3));
        Bosses.get(1).JoinAPerson(Employees.get(0));

        System.out.println(BossMicrosoft);

        System.out.println("*******************************");

        System.out.println(BossSamsung);

        System.out.println("*******************************");

        Bosses.get(1).DismissPerson(Employees.get(2));

        System.out.println(BossSamsung);
    }
}
