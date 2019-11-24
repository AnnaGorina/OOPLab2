package com.company;

public class Person {
    private String Name;
    private String Surname;
    private String Patronymic;

    public Person (String Surname, String Name, String Patronymic) {
        this.Surname = Surname;
        this.Name = Name;
        this.Patronymic = Patronymic;
    }

    public final String GetNamePerson () {
        return Name;
    }

    public final String GetSurnamePerson () {
        return Surname;
    }

    public final String GetPatronymicPerson () {
        return Patronymic;
    }

    @Override
    public String toString () {
        return Surname
                + " " + Name
                + " " + Patronymic;
    }

    public boolean comparision(String surname, String name, String patronymic) {
        return this.Surname.equals(surname) && this.Name.equals(name) && this.Patronymic.equals(patronymic);
    }
}
