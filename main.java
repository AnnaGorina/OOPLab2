package com.company;

public class Main {

    public static void main(String[] args) {

        Boss BossMicrosoft = new Boss(new Company("Microsoft"), "Иванов", "Иван", "Иванович");
        Boss BossSamsung = new Boss(new Company("Samsung"), "Павлов", "Павел", "Павлович");

        Employee FirstEmployee = new Employee("Петров", "Петр", "Петрович");
        Employee SecondEmployee = new Employee("Александров", "Александр", "Александрович");
        Employee ThirdEmployee = new Employee("Максимов", "Максим", "Максимович");
        Employee FouthEmployee = new Employee("Николаев", "Николай", "Николаевич");

        BossMicrosoft.JoinAPerson(FirstEmployee);
        BossMicrosoft.JoinAPerson(SecondEmployee);
        BossSamsung.JoinAPerson(ThirdEmployee);
        BossSamsung.JoinAPerson(FouthEmployee);
        BossSamsung.JoinAPerson(FirstEmployee);

        System.out.println(BossMicrosoft);

        System.out.println("*******************************");

        System.out.println(BossSamsung);

        System.out.println("*******************************");

        BossSamsung.DismissPerson(ThirdEmployee);

        System.out.println(BossSamsung);
    }
}
