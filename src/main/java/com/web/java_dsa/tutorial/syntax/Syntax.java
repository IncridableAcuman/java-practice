package com.web.java_dsa.tutorial.syntax;

public class Syntax {
    public static void main(String[] args) {
        /*
        1. Java Syntax — boshlang‘ich amaliyotlar
        1-bosqich: main, print, o‘zgaruvchilar
        1. Hello, World! chiqarish
        2. Ismni ekranga chiqarish
        3. Ism, yosh, shaharni alohida o‘zgaruvchilarda saqlash
        4. Ikki sonning yig‘indisini chiqarish
        5. Ikki sonning ayirmasi
        6. Ko‘paytma va bo‘linma
        7. To‘g‘ri to‘rtburchak yuzini hisoblash
        8. Kvadrat perimetrini hisoblash
        9. Celsius → Fahrenheit
        10. Dollar → so‘m konvertori
        */

        // 1 Hello, World!
        System.out.println("Hello, World!");
        // 2 your name
        System.out.println("Izzatbek");
        // 3 name,age,city
        String name = "Izzatbek";
        int age = 23;
        String city = "Urgench";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        // 4 x + y
        int x = 12;
        int y = 23;
        int result = x + y;
        System.out.println("Ikki sonni yig'indisi: " + result);
        // 5 ikki sonni ayirmasi
        int a = 23;
        int b = 12;
        int subtraction = a - b;
        System.out.println("Ikki sonni ayirmasi: " + subtraction);
        // 6 Ko‘paytma va bo‘linma
        System.out.println("Ko'paytma: " + x * y);
        System.out.println("Bo'linma: " + a * 1./ b);
        // 7 To‘g‘ri to‘rtburchak yuzini hisoblash
        int weight = 5;
        int height = 10;
        int S = weight * height;
        int perimetr = 2 * (a + b);
        System.out.println("Perimeter: " + perimetr);
        System.out.println("Yuzasi: " + S);
        // 8 Kvadrat perimetrini hisoblash
        int perimeter = 4 * a;
        System.out.println("Perimeter: " + perimeter);
        int yuza = a * a;
        System.out.println("Yuzasi kvadratni: " + yuza);
        // 9 Celsius → Fahrenheit
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
        double farangeit = 78;
        double selsiy = (farangeit - 32) * 5/9;
        System.out.println("Celsius: " + selsiy);
        // 10 Dollar → so‘m konvertori
        double dollar = 20;
        double sum = dollar * 11000;
        System.out.println("Sum: " + sum);
    }
}
