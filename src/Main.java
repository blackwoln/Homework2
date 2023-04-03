public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");

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

    }

    public static void task2 () {
        System.out.println("Задача 2");

    }

}