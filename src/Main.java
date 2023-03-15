import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1:");
        byte age = 19;
        boolean a = age >= 18;
        if(a)
            System.out.println("Он совершеннолетный");
        else
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");


    }

    public static void task2 () {
        System.out.println("Задача 2:");

        byte temperature = 5;
        if(temperature > 5){
            System.out.println("На улице " + temperature + " градусов тепло, можно идти без шапки.");
        }else if(temperature == 5){
            System.out.println("На улице " + temperature + " градусов прохладно, возьми с собой шапку.");

        }else {
            System.out.println("На улице " + temperature + " градусов холодно, нужно надеть шапку.");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3:");
        byte speed = 52;
        if(speed > 60){
            System.out.println("Если скорость " + speed + " km,то придется заплатить штраф.");
        }
        if(speed <= 60){
            System.out.println("Если скорость " + speed + " km, можно ездить спокойно.");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4:");
        byte age = 20 ;
        boolean kindergarten = (age >= 2 && age <=6);
        if(kindergarten){
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в садик.");
        }else if(age >=7 && age < 18){
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }else if(age >= 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет.");
        }else if(age > 24 && age <=60){
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу.");
        }else{
            System.out.println("Нужно сидеть дома.");
        }


    }

    public static void task5 () {
        System.out.println("Задача 5:");
        byte age = 20;

        if(age<5){
            System.out.println("Если возраст ребенка равен "+age+", то емунельзя кататься на аттракционе.");
        }else if(age>=5 && age<14){
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении/");
        }else{
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6:");
        byte passengers = 100;
        byte caracityOfOneVan = 102;
        byte calculatedVan = 60;
        int standingPlaces = caracityOfOneVan - calculatedVan;

        if (passengers < calculatedVan){
            System.out.println("В вагоне осталось " + (calculatedVan - passengers) + " сидячих мест, и " + standingPlaces + " стоячих мест.");
        }else if(passengers > calculatedVan && passengers < caracityOfOneVan){
            System.out.println("В вагоне осталось "+ (standingPlaces - (passengers - calculatedVan)) + " стоячих мест.");
        }else{
            System.out.println("Вагон уже полностью заполнен.");

        }


    }

    public static void task7 () {
        System.out.println("Задача 7:");
        int one = 20;
        int two = 5;
        int three = 15;

        if(one > two && one > three){
            System.out.println(one);
        }else if(two > one && two > three){
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }

}