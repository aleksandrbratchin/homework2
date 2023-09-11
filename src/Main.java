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

    private static void task1() {
        System.out.println("\nЗадача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(
                "dog = " + dog + "\n" +
                        "cat = " + cat + "\n" +
                        "paper = " + paper
        );
    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(
                "dog = " + dog + "\n" +
                        "cat = " + cat + "\n" +
                        "paper = " + paper
        );
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(
                "dog = " + dog + "\n" +
                        "cat = " + cat + "\n" +
                        "paper = " + paper + "\n"
        );
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);
    }

    private static void task5() {
        System.out.println("\nЗадача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
    }

    private static void task6() {
        System.out.println("\nЗадача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeightOfBoxers = boxer1 + boxer2;
        System.out.println("Общая масса двух бойцов = " + totalWeightOfBoxers + "кг");
        var boxerWeightDifference = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов = " + boxerWeightDifference + "кг");
    }

    private static void task7() {
        System.out.println("\nЗадача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerWeightDifference = boxer2 - boxer1;
        System.out.println("Разница между массами бойцов (вычитание из большей массы меньшей) = " + boxerWeightDifference + "кг");
        boxerWeightDifference = boxer2 % boxer1;
        System.out.println("Разница между массами бойцов (остаток от деления) = " + boxerWeightDifference + "кг");
    }

    private static void task8() {
        System.out.println("\nЗадача 8");
        var totalHours = 640;
        var workingHours = 8;
        var workers = totalHours / workingHours;
        System.out.println("Всего работников в компании — " + workers + " человек");
        var newWorkers = 94;
        var totalHoursNewWorkers = newWorkers * 8;
        totalHours = totalHours + totalHoursNewWorkers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }

}
