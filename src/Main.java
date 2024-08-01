//Создать класс Person для хранения имени и фамилии человека. Создать метод для возврата полного имени (имя + фамилия).
//
//Создать абстрактный класс Employee для хранения должности сотрудника (должность должна быть выбрана из списка enum (DIRECTOR, WORKER)
// и хранить в себе коэффициент заработной платы). Добавить поле для хранения стажа сотрудника. Реализовать расчет з/п = базовая_ставка*
// коэффициент * стаж. Создать абстрактный метод для установления должности для данного сотрудника.
//
//Реализовать класс Director. Реализовать метод для назначения сотрудника под управление директора (addWorker). Для директора переопределить
// метод расчета з/п, в котором предусмотреть влияние количества работников, которые находятся в подчинении директора.
//
//Создать класс Worker для создания сотрудников.
//
//В класса Worker и Director реализовать метод, который устанавливает тип сотрудника (из enum).
//
//Создать класс, в которым необходимо создать 3 работника и 1 директора. Для каждого сотрудника распечатать полное имя сотрудника и его з/п.
//
//Назначить двух созданных сотрудников под управление директора. Распечатать сведения о директоре.
//
//Создать еще одного директора с одним сотрудником (под управлением) и добавить его под управления существующего директора, используя выше созданный метод (addWorker).
//
//Для директора переопределить метод toString, который должен распечатать полное имя директора, его з/п, стаж, должность и полную информацию о
// каждом сотруднике, который назначен под управления этого директора - тоже полное имя и сведения о з/п и стаж.
//
//Убедиться что сведения о первом директоре включают сведения о втором, который так же добавлен к нему.


import com.itstep.company.Director;
import com.itstep.company.Employee;
import com.itstep.company.Person;
import com.itstep.company.Worker;

public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Worker("Ivan", "Ivanov",1);
        Employee worker2 = new Worker("Petr", "Petrov",2);
        Employee worker3 = new Worker("Sidor", "Sidorov",3);
        Employee director1 = new Director("Sergey", "Seregin", 5);
        Employee director2 = new Director("Pavel", "Pavlov", 4);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director2).addWorker(worker3);
        ((Director)director1).addWorker(director2);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(director1);
        System.out.println(director2);
    }
}