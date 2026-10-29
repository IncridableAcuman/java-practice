# Java Sintaksisi(Java Syntax)
* **
*  Sintaksis - tilning grammatikasi,
ya'ni kodni qanday yozish kerakligini belgilaydigan qat'iy qoidalar. 
Java tili qat'iy va tizilmali: hamma narsa sinf ichida e'lon qilinadi va yoziladi
va nuqtali vergul(;) bilan tugashi kerak bo'ladi,

> Sintaksis - dasturlash tilida belgilar, kalit so'zlar va tuzilmalarni
> to'g'ri joylashtirish qoidalari hisoblanadi. Java'da sintaktik xato
> kompilyatsiya xatosiga olib keladi.
sh
### Dasturning tuzilishi:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Java Fundamentals");
    }
}
```
* public class Main - asosiy sin e'loni. Barcha kodlar shuni ichida bo'ladi.
* public static void main(String[] args) - bosh metod hisoblanadi. Dastur shu yerda ishga tushadi.
* System.out.println(...) - monitorga qiymatni chiqarish uchun ishlatiladi.
* {} - jungalak qavs esa sinf(class) va metod(method)ni tana qismini belgilaydi.

### Nuqtali vergul:
> Javada har bir buyruq oxiriga nuqtali vergul(;) qo'yilishi kerak.
> Agar nuqtali vergul qo'yilmasa kompilyator xatoligi ro'y beradi.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Java Fundamentals"); // ; har doim bo'ladi.
    }
}
```
### Fayl nomi va sinf nomi:
> Javada har bir e'lon qilingan **public class** nomi shu sinf joylash
> fayl nomi bilan bir xil bo'lishi kerak. Masalan **public class Main** sinfi
> **Main.java** faylida joylash bo'lishi kerak. Bu boshqa dasturlash
> tillarida yo'q shu tufayli yangi boshlovchilarda tushinmoqvchilik ro'y beradi.

### Katta-kichik va bo'sh joy:
> Javada **main**, **Main**, **MAIN** bir-birida farq qiladi. 
> **public static void main(String[] args)** metodi nomi har doim 
> kichik bo'lishi kerak, agar kichik bo'lmasa dastur ishlamaydi,

### Xulosa:
* **Sintaksis** tilning grammatikasi va dasturni qanday yozish kerakligni belgilaydigan
* qat'iy qoidalar hisoblanadi, undan tashqari har bir buyruq oxirida
* nuqtali vergul(;) bilan tugashi kerak agar yo'q bo'lsa xatolikka olib keladi.
* Katta kichik harflar bir-biridan farq qiladi.