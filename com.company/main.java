package com.company;

import CompanyPackage.Boss;
import CompanyPackage.Company;
import CompanyPackage.Employee;

public class Main {

    public static void main(String[] args) {

        Boss BossMicrosoft = new Boss(new Company("Microsoft"), "Иванов", "Иван", "Иванович");
        Boss BossSamsung = new Boss(new Company("Samsung"), "Павлов", "Павел", "Павлович");
        Boss BossApple = new Boss(new Company("Apple"), "Алексеев", "Алексей", "Алексеевич");
        Boss BossCisco = new Boss(new Company("Cisco"), "Евгеньев", "Евгений", "Евгеньевич");
        Boss BossOracle = new Boss(new Company("Oracle"), "Владимиров", "Владимир", "Владимирович");
        Boss BossIntel = new Boss(new Company("Intel"), "Сергеев", "Сергей", "Сергеевич");

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

        BossApple.JoinAPerson(FirstEmployee);
        BossCisco.JoinAPerson(FirstEmployee);
        BossIntel.JoinAPerson(FirstEmployee);
        BossCisco.JoinAPerson(FirstEmployee);

        System.out.println("*******************************");

        System.out.println(BossOracle);

        BossApple.DismissPerson(FirstEmployee);
        BossOracle.JoinAPerson(FirstEmployee);

        System.out.println("*******************************");

        System.out.println(BossOracle);
        
    }
}
