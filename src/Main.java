public class Main {
    public static void main(String[] args) {
        //Задача 1

        byte a = 1;
        short b = 200;
        int c = 38000;
        long d = 400000000;
        float e = 2.76f;
        double f = 45.67897676;
        System.out.println("Значение переменной а с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //Задача 2

        float numberOne = 27.12f;
        long numberTwo = 987678965549L;
        float numberThree = 2.786f;
        short numberFour = 569;
        short numberFive = -159;
        short numberSix = 27897;
        byte numberSeen = 67;

        //Задача 3

        byte studentsClassOne = 23;
        byte studentsClassTwo = 27;
        byte studentsClassThree = 30;
        short sheetsPaper = 480;
        short sheetsPaperOneStudent = (short) (sheetsPaper / (studentsClassOne + studentsClassTwo + studentsClassThree));
        System.out.println("На каждого ученика рассчитано " + sheetsPaperOneStudent + " листов бумаги");

        //Задача 4

        byte carProductivityForTwoMinutes = 16;
        byte timeTwentyMinutes = 20;
        short timeDayMinutes = 1440;
        short timeThreeDaysMinutes = 4320;
        int timeMonthMinutes = 43200;
        int carProductivityForOneMinute = carProductivityForTwoMinutes / 2;
        int carProductivityOne = carProductivityForOneMinute * timeTwentyMinutes;
        int carProductivityTwo = carProductivityForOneMinute * timeDayMinutes;
        int carProductivityThree = carProductivityForOneMinute * timeThreeDaysMinutes;
        int carProductivityFour = carProductivityForOneMinute * timeMonthMinutes;
        System.out.println("За 20 минут машина произвела " + carProductivityOne + " штук бутылок");
        System.out.println("За сутки машина произвела " + carProductivityTwo + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + carProductivityThree + " штук бутылок");
        System.out.println("За сутки машина произвела " + carProductivityFour + " штук бутылок");

        //Задача 5

        byte totalPaintCans = 120;
        byte whitePaintCansOneClass = 2;
        byte brownPaintCansOneClass = 4;
        byte commonNumberCansOneClass = (byte) (whitePaintCansOneClass + brownPaintCansOneClass);
        byte commonNumberClasses = (byte) (totalPaintCans / commonNumberCansOneClass);
        byte whitePaintCansForClasses = (byte) (commonNumberClasses * whitePaintCansOneClass);
        byte brownPaintCansForClasses = (byte) (commonNumberClasses * brownPaintCansOneClass);
        System.out.println("В школе, где " + commonNumberClasses + " классов нужно " + whitePaintCansForClasses + " банок белой краски и " + brownPaintCansForClasses + " банок коричневой краски");

        //Задача 6

        int bananas = 5;
        int bananaWeight = 80;
        int milk = 2;
        int milkWeight = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int eggs = 4;
        int eggWeight = 70;
        int bananasWeight = bananas * bananaWeight;
        int commonMilkWeight = milk * milkWeight;
        int commonIceCreamWeight = iceCream * iceCreamWeight;
        int eggsWeight = eggs * eggWeight;
        int sportBreakfastGrams = bananasWeight + commonMilkWeight + commonIceCreamWeight + eggsWeight;
        System.out.println("Спортзавтрак спортсмена составляет " + sportBreakfastGrams + " грамм");
        float sportBreakfastKg = sportBreakfastGrams / 1000f;
        System.out.println("Спортзавтрак спортсмена составляет " + sportBreakfastKg + " килограмм");

        // Задача 7

        int loseWeight = 7000;
        int weightOne = 250;
        int weightTwo = 500;
        int daysLoseWeightOne = loseWeight / weightOne;
        int daysLoseWeightTwo = loseWeight / weightTwo;
        System.out.println("При потере веса в " + weightOne + " грамм каждый день спортсмен похудеет за " + daysLoseWeightOne + " дней и при потере веса в " + weightTwo + " грамм каждый день спортсмен похудеет за " + daysLoseWeightTwo + " дней");
        int averageDays = (daysLoseWeightOne + daysLoseWeightTwo) / 2;
        System.out.println("В среднем спортсмену может понадобиться " + averageDays + " день");

        // Задача 8

        int employeeMashaSalary = 67760;
        int employeeDenisSalary = 83690;
        int employeeKristinaSalary = 76230;
        int monthsYear = 12;
        int yearlyMashaSalary = employeeMashaSalary * monthsYear;
        int yearlyDenisSalary = employeeDenisSalary * monthsYear;
        int yearlyKristinaSalary = employeeKristinaSalary * monthsYear;
        float yearlyIncrease = 0.1f;
        float employeeNewMashaSalary = employeeMashaSalary + (employeeMashaSalary * yearlyIncrease);
        float employeeNewDenisSalary = employeeDenisSalary + (employeeDenisSalary * yearlyIncrease);
        float employeeNewKristinaSalary = employeeKristinaSalary + (employeeKristinaSalary * yearlyIncrease);

        float yearlyNewMashaSalary = employeeNewMashaSalary * monthsYear;
        float yearlyNewDenisSalary = employeeNewDenisSalary * monthsYear;
        float yearlyNewKristineSalary = employeeNewKristinaSalary * monthsYear;
        float differenceMashaSalary = yearlyNewMashaSalary - yearlyMashaSalary;
        float differenceDenisSalary = yearlyNewDenisSalary - yearlyDenisSalary;
        float differenceKristinaSalary = yearlyNewKristineSalary - yearlyKristinaSalary;
        System.out.println("Маша получает теперь " + employeeNewMashaSalary + " рублей в месяц. Годовой доход вырос на " + differenceMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + employeeNewDenisSalary + " рублей в месяц. Годовой доход вырос на " + differenceDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + employeeNewKristinaSalary + " рублей в месяц. Годовой доход вырос на " + differenceKristinaSalary + " рублей");


    }
}