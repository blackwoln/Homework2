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

    }

}