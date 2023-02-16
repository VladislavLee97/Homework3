public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 12;
        System.out.println(a);
        short b = 10232;
        System.out.println(b);
        int c = 1999001;
        System.out.println(c);
        long d = 1230000000L;
        System.out.println(d);
        float e = -200.00F;
        System.out.println(e);
        double j = -500.000F;
        System.out.println(j);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsOfLudmilaPavlovna = 23;
        System.out.println("У Людмилы Павловны " + studentsOfLudmilaPavlovna + " учеников");
        byte studentsOfAnnaSergeevna = 27;
        System.out.println("У Анны Сергеевны " + studentsOfAnnaSergeevna + " учеников");
        byte studentsOfEkaterinaAndreevna = 30;
        System.out.println("У Екатерины Андреевны " + studentsOfEkaterinaAndreevna + " учеников");
        int wholePaper = 480;
        System.out.println("Всего " + wholePaper + " листов на все три класса");
        int allStudents = studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna + studentsOfLudmilaPavlovna;
        System.out.println("Всего студентов " + allStudents);
        int sheetsForEachStudent = wholePaper / allStudents;
        System.out.println("Каждому ученику достанется по " + sheetsForEachStudent + " листов");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        //
        byte bottlesPerMinute = 16 / 2;
        System.out.println("Производство бутылок в минуту " + bottlesPerMinute);
        int productionOfBottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + productionOfBottlesIn20Minutes + " штук бутылок");
        //
        byte timePerDay = 24;
        System.out.println("В сутки " + timePerDay + " часа");
        byte timePerHour = 60;
        System.out.println("В одном часу " + timePerHour + " минут");
        int minutesIn24Hours = timePerDay * timePerHour;
        System.out.println("В 24 часа " + minutesIn24Hours + " минут");
        int productionOfBottlesIn24Hours = minutesIn24Hours * bottlesPerMinute;
        System.out.println("За сутки машина произвела " + productionOfBottlesIn24Hours + " штук бутылок");
        //
        int in3Days =  timePerDay * 3;
        System.out.println("В 3 сутках " + in3Days + " часа");
        int minutesIn72Hour = in3Days * timePerHour;
        System.out.println("В 72 часа " + minutesIn72Hour + " минут");
        int minutesIn3days = minutesIn72Hour * bottlesPerMinute;
        System.out.println("за 3 сутки машина произвела " + minutesIn3days + " штук бутылок");
        //
        byte month = 30;
        System.out.println("В одном месяце " + month + " дней");
        int hoursIn30Days = month * timePerDay;
        System.out.println("В 30 днях " + hoursIn30Days + " часов");
        int minutesInMonth = hoursIn30Days * timePerHour;
        System.out.println("В одном месяце " + minutesInMonth + " минут");
        int productionOfBottlesInMonth = minutesInMonth * bottlesPerMinute;
        System.out.println("За месяц машина произвела " + productionOfBottlesInMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte whiteAndBrownPaint = 120;
        byte whitePaint = 2;
        System.out.println("Белой краски " + whitePaint);
        byte brownPaint = 4;
        System.out.println("Коричевой краски " + brownPaint);
        short oneClass = (short) (whitePaint + brownPaint);
        System.out.println("Краски на класс " + oneClass);
        short totalClasses = (short) (whiteAndBrownPaint / oneClass);
        System.out.println("Всего " + totalClasses + " классов");
        short totalWhitePaint = (short) (whitePaint * totalClasses);
        System.out.println("Всего " + totalWhitePaint + " белой краски");
        short totalBrownPaint = (short) (brownPaint * totalClasses);
        System.out.println("Всего " + totalBrownPaint + " коричневой краски");
        System.out.println("В школе где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски"   );
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte totalBananas = 5;
        System.out.println("Всего бананов 5, 1 банан - 80 грамм");
        short totalMilk = 200;
        System.out.println("Всего молока " + totalMilk  + " мл, 100 мл = 105 грамм");
        short iceCreamSundae = 2;
        System.out.println("Мороженное пломбир" + iceCreamSundae + " брикета по 100 грамм");
        byte rawEgg = 4;
        System.out.println("Яица сырые " + rawEgg + " 1 яицо 70 грамм");
        //
        int fiveGramsOfBananas = totalBananas * 80;
        System.out.println("В 5 бананах " + fiveGramsOfBananas + " грамм");
        int mlMilk = 105 * 2;
        System.out.println("В 200 мл молока " + mlMilk + " грамм");
        short iceCreamGrams = 100 * 2;
        System.out.println("В 2 брикетах мороженного " + iceCreamGrams + " грамм");
        short rawEggsGram = 70 * 4;
        System.out.println("В 4 сырых яицах " + rawEggsGram + " грамм");
        int totalGramsOfProducts = rawEggsGram + iceCreamGrams + mlMilk + fiveGramsOfBananas;
        System.out.println("Вес всех продуктов в граммах составил " + totalGramsOfProducts);
        double kgOfBananas = 400.0 / 1000;
        System.out.println("Бананы из грамм в кг " + kgOfBananas);





    }
}