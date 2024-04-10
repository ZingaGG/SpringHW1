package Main;

import Domen.Person;
import UseCase.PersonJsoner;

/* Домашнее задание
Условие:
Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
Пример решения:
1. Создайте новый Maven или Gradle проект, через Intellj IDEA.
2. Добавьте зависимости org.apache.commons:commons-lang3:3.14.0 и com.google.code.gson:gson:2.10.1.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.

 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.setFName("fName 1");
        person1.setSName("sName 1");
        person1.setAge(18);

        person2.setFName("fName 2");
        person2.setSName("sName 2");
        person2.setAge(18);

        person3.setFName("fName 1");
        person3.setSName("sName 1");
        person3.setAge(18);

        System.out.println("ToString realization: ");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println();
        System.out.println("Equals realization: ");

        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person2));

        System.out.println();
        System.out.println("Hashcode realization: ");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        System.out.println();

        PersonJsoner personJsoner = new PersonJsoner(person1);
        personJsoner.Serialize();
        Person deserializedPerson = personJsoner.Deserialize();
        System.out.println();
        System.out.println("Десериализованный Person: ");
        System.out.println(deserializedPerson);
    }
}
