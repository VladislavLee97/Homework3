public class Main {
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
    public static void task1 () {
        System.out.println("Задача 1");
        byte aa = 12;
        System.out.println ("Значение переменной " + aa + " с типом byte равно 12 ");
        short bb = 10232;
        System.out.println("Значение переменной " + bb + " с типом short равно 10232");
        int cc = 1999001;
        System.out.println("Значение переменной " + cc + " с типом int равно 1999001");
        long dd = 1230000000L;
        System.out.println("Значение переменной " + dd + " с типом long равно 1230000000L");
        float ee = -200.00F;
        System.out.println("Значение переменной " + ee + " с типом float равно 200.00");
        double jj = -500.000F;
        System.out.println("Значение переменной " +  jj + " с типом double равно 500.000");
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
        byte bottlesPerMinute = 16 / 2;
        System.out.println("Производство бутылок в минуту " + bottlesPerMinute);
        int productionOfBottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + productionOfBottlesIn20Minutes + " штук бутылок");
        byte timePerDay = 24;
        System.out.println("В сутки " + timePerDay + " часа");
        byte timePerHour = 60;
        System.out.println("В одном часу " + timePerHour + " минут");
        int minutesIn24Hours = timePerDay * timePerHour;
        System.out.println("В 24 часа " + minutesIn24Hours + " минут");
        int productionOfBottlesIn24Hours = minutesIn24Hours * bottlesPerMinute;
        System.out.println("За сутки машина произвела " + productionOfBottlesIn24Hours + " штук бутылок");
        int in3Days =  timePerDay * 3;
        System.out.println("В 3 сутках " + in3Days + " часа");
        int minutesIn72Hour = in3Days * timePerHour;
        System.out.println("В 72 часа " + minutesIn72Hour + " минут");
        int minutesIn3days = minutesIn72Hour * bottlesPerMinute;
        System.out.println("за 3 сутки машина произвела " + minutesIn3days + " штук бутылок");
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
        float totalBananas = 5.0f;
        System.out.println("Всего бананов 5, 1 банан - 80 грамм");
        float totalMilk = 200.0f;
        System.out.println("Всего молока " + totalMilk  + " мл, 100 мл = 105 грамм");
        float iceCreamSundae = 2.0f;
        System.out.println("Мороженное пломбир" + iceCreamSundae + " брикета по 100 грамм");
        float rawEgg = 4.0f;
        System.out.println("Яица сырые " + rawEgg + " 1 яицо 70 грамм");
        //
        float fiveGramsOfBananas = totalBananas * 80f;
        System.out.println("В 5 бананах " + fiveGramsOfBananas + " грамм");
        float mlMilk = (float) 105 * 2;
        System.out.println("В 200 мл молока " + mlMilk + " грамм");
        float iceCreamGrams = 100 * 2;
        System.out.println("В 2 брикетах мороженного " + iceCreamGrams + " грамм");
        float rawEggsGram = 70 * 4;
        System.out.println("В 4 сырых яицах " + rawEggsGram + " грамм");
        float totalGramsOfProducts = rawEggsGram + iceCreamGrams + mlMilk + fiveGramsOfBananas;
        System.out.println("Вес всех продуктов в граммах составил " + totalGramsOfProducts);
        float gramsToKilograms = totalGramsOfProducts / 1000;
        System.out.println("Вес продуктов в килограмах составил " + gramsToKilograms);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        System.out.println("Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, + нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день. Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм. Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения. Результаты всех подсчетов выведите в консоль.");
        short loseWeightIn4Days250 = 250 * 4;
        System.out.println("За 4 дня спортсмен теряет " + loseWeightIn4Days250 + " грамм веса ");
        short loseWeightIn7Days250 = (short) (loseWeightIn4Days250 * 7);
        byte totalDays250 = 4 * 7;
        System.out.println("Если спортсмен будет сбрасывать вес на 250 грамм в день то за " + totalDays250 + " дней он сбросит " + loseWeightIn7Days250 + " грамм, тоесть 7кг");
        short loseWeightIn7Days500 = (500 * 2) * 7;
        byte totalDays500 = 2 * 7;
        System.out.println("Если спортсмен будет сбрасывать вес на 500 грамм в день то за " + totalDays500 + " дней он сбросит " + loseWeightIn7Days500 + " грамм, тоесть 7кг");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        System.out.println("Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.");
        System.out.println("К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:");
        int mashasMonthlySalary = 67760;
        System.out.println("Зарплата Маши в месяц составляет " + mashasMonthlySalary);
        int denissMonthySalary = 83690;
        System.out.println("Зарплата Дениса в месяц составляет " + denissMonthySalary);
        int christinasMothlySalary = 76230;
        System.out.println("Зарплата Кристины в месяц составляет " + christinasMothlySalary);
        byte twelveMonths = 12;
        float tenPercent = 10f / 100f;
        float masha10Percent = tenPercent * mashasMonthlySalary + mashasMonthlySalary;
        int mashasAnnualIncome = mashasMonthlySalary * twelveMonths;
        float mashasAnnualIncomeWith10Percent = masha10Percent * twelveMonths;
        System.out.println("Маша теперь получает " + masha10Percent + " рублей. Годовой доход Маши составлял " + mashasAnnualIncome + " а сейчас годовой доход вырос на " + mashasAnnualIncomeWith10Percent + " рублей");
        float denis10Percent = tenPercent * denissMonthySalary + denissMonthySalary;
        int denisAnnualIncome = denissMonthySalary * twelveMonths;
        float denisAnnualIncomeWith10Percent = denis10Percent * twelveMonths;
        System.out.println("Денис теперь получает " + denis10Percent + " рублей. Годовой доход Дениса составлял " + denisAnnualIncome + " а сейчас годовой дохот вырос на " + denisAnnualIncomeWith10Percent + " рублей");
        float christina10Percent = tenPercent * christinasMothlySalary + christinasMothlySalary;
        int christinasAnnualIncome = christinasMothlySalary * twelveMonths;
        float christinaAnnualIncomeWith10Percent = christina10Percent * twelveMonths;
        System.out.println("Кристина теперь получает " + christina10Percent + " рублей. Годовой доход Кристины составлял " + christinasAnnualIncome + " а сейчас годовой доход вырос на " + christinaAnnualIncomeWith10Percent + " рублей");
    }
}