public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Переменные. Урок 1");

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 3.5;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7636;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightCommon = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух бойцов " + weightCommon + " кг!");
        var weightDifference = weightBoxer1 - weightBoxer2;
        System.out.println("Разница между бойцами составляет " + weightDifference + " кг!");
        weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между бойцами  " + weightDifference + " кг!");
        var weightVariance = weightCommon % weightBoxer1;
        System.out.println("Разница  " + weightVariance + " кг!");

        var totalTime = 640;
        var timeEmployee = 8;
        var allEmployee = totalTime / timeEmployee;
        System.out.println("Всего работников в компании — " + allEmployee + " человек");
        var newEmployee = allEmployee + 94;
        System.out.println("После наёма новых людей, сотрудников стало — " + newEmployee + " человек");
        var timeEmployee2 = totalTime / newEmployee;
        System.out.println("Если в компании работает " + newEmployee + " человек, то всего " + timeEmployee2 + " часа работы может быть поделено между сотрудниками");

    }

    public static void task2 () {
        System.out.println("Переменные. Урок 2");

        byte a = 112;
        System.out.println(a);
        short b = 24578;
        System.out.println(b);
        int c = 3950068;
        System.out.println(c);
        long f = 394878989654546L;
        System.out.println(f);
        float r = 3.64f;
        System.out.println(r);
        double m = -1.984f;
        System.out.println(m);

        float g = 27.12f;
        System.out.println(g);
        long l = 987678965549L;
        System.out.println(l);
        double p = 2.786;
        System.out.println(p);
        short q = 569;
        System.out.println(q);
        short w = -159;
        System.out.println(w);
        short z = 27897;
        System.out.println(z);
        byte x = 67;
        System.out.println(x);

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        byte totalClass = (byte) (class1 + class2 + class3);
        System.out.println("Всего учеников " + totalClass);
        byte win = (byte) (paper / totalClass);
        System.out.println("На каждого ученика рассчитано " + win + " листов бумаги" );

        System.out.println("Попробуем решить по другому" );
        byte class4 = 23;
        byte class5 = 27;
        byte class6 = 30;
        short paper1 = 480;
        byte win1 = (byte) (paper1 / (class4 + class5 + class6));
        System.out.println("На каждого ученика рассчитано " + win1 + " листов бумаги" );

        byte bottle = 16;
        byte timeBottle = (byte) (bottle / 2);
        System.out.println("Машина производит за 1 минуту " + timeBottle + " бутылок" );
        byte time1 = 20;
        short timeBottle1 = (short) (timeBottle * time1);
        System.out.println("За " + time1 + " минут машина произвела " + timeBottle1 + " штук бутылок" );
        short dayMin = (short) (24 * 60 );
        short dayBottel = (short) (timeBottle * dayMin);
        System.out.println("За сутки машина произвела " + dayBottel + " штук бутылок" );
        short threeDay = (short) (dayMin * 3 );
        int threeBottel = threeDay * timeBottle;
        System.out.println("За 3 дня машина произвела " + threeBottel + " штук бутылок" );
        int monthTime = dayMin * 30 ;
        int monthBottel = monthTime * timeBottle;
        System.out.println("За месяц машина произвела " + monthBottel + " штук бутылок" );

        byte totalBank = 120;
        byte bulayaBank = 2;
        byte brownBank = 4;
        byte oneClass = (byte) (bulayaBank + brownBank);
        byte allClass = (byte) (totalBank / oneClass);
        byte allBulay = (byte) (allClass * bulayaBank);
        byte allBrown =(byte) (allClass * brownBank);
        System.out.println("В школе, где " + allClass + " классов, нужно " + allBulay + " банок белой краски и " + allBrown + " банок коричневой краски" );


        byte banana = 5;
        short milk = 200;
        byte ice = 2;
        byte eggs = 4;
        short kotelgGrams = (short) ((banana * 80) + ( milk * 1.05 ) + (ice * 100) + ( eggs * 70));
        System.out.println("Вес спортзавтракка " + kotelgGrams + " в гр!");
        float kotelgKilogram = (float) kotelgGrams / 1000;
        System.out.println("Вес спортзавтракка " + kotelgKilogram + " в кг!");


        byte allWeight = 7;
        short weight1 = 250;
        short weight2 = 500;
        short allGrams = (short) (allWeight * 1000);
        System.out.println("Перевели кг в гр и получили " + allGrams + "  гр!");
        short taim1 = (short) (allGrams / weight1);
        System.out.println("Если спортсмен будеть худеть " + weight1 + "  гр в день! То на это уйдет " + taim1 + " дней");
        short taim2 = (short) (allGrams / weight2);
        System.out.println("Если спортсмен будеть худеть " + weight2 + "  гр в день! То на это уйдет " + taim2 + " дней");
        short averageTaim = (short) ((taim1 + taim2) / 2 );
        System.out.println("Среднее значение  " + averageTaim + "  день" + "! Для похудания");


        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        int yearMasha1 = masha * 12;
        int newMasha = masha + 6776;
        int yearMasha2 = newMasha * 12;
        int differenceMasha = yearMasha2 - yearMasha1;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        int yearDenis1 = denis * 12;
        int newDenis = denis + 8369;
        int yearDenis2 = newDenis * 12;
        int differenceDenis = yearDenis2 - yearDenis1;
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        int yearChristina1 = christina * 12;
        int newChristina = christina + 7623;
        int yearChristina2 = newChristina * 12;
        int differenceChristina = yearChristina2 - yearChristina1;
        System.out.println("Кристина теперь получает " + newChristina + " рублей. Годовой доход вырос на " + differenceChristina + " рублей");


    }

}