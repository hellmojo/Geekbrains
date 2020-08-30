package ru.geekbrains.lesson1;


public class FirstApp {

    private static int a = 5;
    private static int b = 10;
    private static int c = 15;
    private static int d = 20;

    private static int numberOne = 8;
    private static int numberTwo = 10;

    private static String name = "Алексей";

    private static int year = 2020;



    public static void main (String[] args)
    {

        System.out.println("Hello world!");

        System.out.println(Mathfirst(a,b,c,d));
        System.out.println(MathSecond(numberOne, numberTwo));
        MathThird(a);
        System.out.println(MathFourth(b));
        HelloName(name);
        starOne(year);

    }


//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
private static float Mathfirst (int a, int b, int c, int d){
    float result = a * (b + (c / d));
    return result;
}
/*4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;*/
private static boolean MathSecond(int a, int b){
    int sum = a+b;
    if (10 < sum && sum <20){
        return true;
    }
    return false;
}/*5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.*/
private static void MathThird(int number){
    if (number >= 0){
        System.out.println("Число положительное");
    }else {
        System.out.println("Число отрицательное");
    }
}
/* 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;*/
private static boolean MathFourth(int number){
    if (number < 0){
        return true;
    }
    return false;
}
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
private static void HelloName(String name) {
    System.out.println("Привет, "+name);
}

//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
private static void starOne(int year){
    if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0) ) {
        System.out.println(year+" высокосный год");
    }else {
        System.out.println(year+" не высокосный год");
    }
}
}