package com.company;

import Strings.Genders;

public class Main {

    public static void main(String[] args) {

      /*  Варіант 5.
        Створити клас Man (людина) з полями: ім’я, вік, стать і вага. Визначити методи
        переприсвоєння імені, зміни віку і зміни ваги.
        Створити клас-контейнер Student, що має поля «людина» та «рік навчання».
        Визначити методи переприсвоєння та збільшення року навчання.*/

        Man stephan = new Man("Степан", Genders.GENDER_MALE, 15, 52.5);
        Man maria = new Man("Марія", Genders.GENDER_FEMALE, 16, 57.0);

        Student[] students = {
                new Student(9, stephan),
                new Student(10, maria)
        };

        System.out.println(students[1].getMan().getName() + " " + students[1].getMan().getAge());
        System.out.println();
        students[1].getMan().setAge(24);

        System.out.println(students[1].getMan().getName() + " " + students[1].getMan().getAge());

        
    }
}
