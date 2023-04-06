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
        var newtimeEmployee = totalTime / newEmployee;
        System.out.println("Если в компании работает " + newEmployee + " человек, то всего " + newtimeEmployee + " часа работы может быть поделено между сотрудниками");

    }

    public static void task2 () {
        System.out.println("Переменные. Урок 2");

        byte a = 112;
        System.out.println(a);
        short b = 24578;
        System.out.println(b);
        int c = 3950068;
        System.out.println(c);
        long f = 394878989;
        System.out.println(f);
        float r = 3.64f;
        System.out.println(r);
        double m = -1.984f;
        System.out.println(m);

    }

}