//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int I = 12345678;
        byte B = 123;
        short S = 12345;
        long L = 1234567890L;
        float F = 12345.0F;
        double D = 9.87654321E8;
        System.out.println("Значение переменой I с целочисленным типом int = " + I);
        System.out.println("Значение переменой B с целочисленным типом byte = " + B);
        System.out.println("Значение переменой S с целочисленным типом short = " + S);
        System.out.println("Значение переменой L с целочисленным типом short = " + L);
        System.out.println("Значение переменой F с плавающей точкой float = " + F);
        System.out.println("Значение переменой D с плавающей точкой double = " + D);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Значение переменной а = " + a);
        System.out.println("Значение переменной b = " + b);
        System.out.println("Значение переменной c = " + c);
        System.out.println("Значение переменной d = " + d);
        System.out.println("Значение переменной e = " + e);
        System.out.println("Значение переменной f = " + f);
        System.out.println("Значение переменной g = " + g);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        short list = (short)(paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna));
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        short speed = 16;
        short oneMinit = (short)(speed / 2);
        int twentyMinit = oneMinit * 20;
        int sutki = oneMinit * 1440;
        int threeDays = sutki * 3;
        int oneMonth = sutki * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinit + " бутылок");
        System.out.println("За сутки машина произвела " + sutki + " бутылок");
        System.out.println("За 3 суток машина произвела " + threeDays + " бутылок");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int white = 2;
        int broun = 4;
        int paint = 120;
        int paintOnClass = white + broun;
        int clases = paint / paintOnClass;
        int whitePaint = clases * white;
        int brounPaint = clases * broun;
        System.out.println("В школе, где " + clases + " классов, нужно " + whitePaint + " банок белой краски и " + brounPaint + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int weightBananas = 80;
        int weightMilk = 105;
        int weightPlombir = 100;
        int weigtEgg = 70;
        float banan = (float)(5 * weightBananas);
        float milk = (float)(2 * weightMilk);
        float plombir = (float)(2 * weightPlombir);
        float egg = (float)(4 * weigtEgg);
        float zavtrakGramm = banan + milk + plombir + egg;
        float zavtrakKg = (banan + milk + plombir + egg) / 1000.0F;
        System.out.println("Вес завтрака в граммах = " + zavtrakGramm + " гр.");
        System.out.println("Вес завтрака в киллограммах = " + zavtrakKg + " кг.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        float weight = 7f;
        float weigtGramm = weight * 1000;
        float pohudenieMin = 250;
        float pohudenieMax = 500;
        short dayMin = (short) (weigtGramm / pohudenieMin);
        short dayMax = (short) (weigtGramm / pohudenieMax);
        System.out.println("При потере 250 гр в день похудение займет - " + dayMin + " дней.");
        System.out.println("При потере 500 гр в день похудение займет - " + dayMax + " дней.");
        short srednee = (short) ( (dayMin + dayMax) /2);
        System.out.println("В среднем, похудение займет - " + srednee + " дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        int newZpMasha = (int) (zpMasha * 0.10 + zpMasha);
        int newZpDenis = (int) (zpDenis * 0.1 + zpDenis);
        int newZpKristina = (int) (zpKristina * 0.1 +zpKristina);
        int godZpMasha = zpMasha * 12;
        int godZpDenis = zpDenis * 12;
        int godZpKristina = zpKristina * 12;
        int newGodZpMasha = newZpMasha * 12;
        int newGodZpDenis = newZpDenis * 12;
        int newGodZpKristina = newZpKristina * 12;
        int raznicaGodMasha = newGodZpMasha - godZpMasha;
        int raznicaGodDenis = newGodZpDenis - godZpDenis;
        int raznicaGodKristina = newGodZpKristina - godZpKristina;
             System.out.println("Маша теперь получает "+ newZpMasha + " рублей. Годовой доход вырос на " + raznicaGodMasha+ " рублей.");
             System.out.println("Денис теперь получает "+ newZpDenis + " рублей. Годовой доход вырос на " + raznicaGodDenis+ " рублей.");
             System.out.println("Кристина теперь получает "+ newZpKristina + " рублей. Годовой доход вырос на " + raznicaGodKristina + " рублей.");
    }

    }
