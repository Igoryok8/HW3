public class Main {
    public static void main(String[] args) {
        var weightBoxerOne = 78.2;

        System.out.println("Вес одного боксёра " + weightBoxerOne + " кг.");
        var weightBoxerTwo = 82.7;
        System.out.println("Вес второго боксёра " + weightBoxerTwo + " кг.");
        var totalWeight = weightBoxerOne + weightBoxerTwo;
        System.out.println("Общий вес боксёров " + totalWeight + " кг.");
        var differenceWeight = weightBoxerTwo - weightBoxerOne;
        System.out.println("Разница в весе боксёров " + differenceWeight + " кг.");
        System.out.println("Задание 7 ");
        var weightDifference = weightBoxerTwo - weightBoxerOne;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг.");
        weightDifference = weightBoxerTwo % weightBoxerOne;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг.");
        System.out.println("Задание 8 ");
        var oneWorker = 8;
        System.out.println("Время работы каждого сотрудника " + oneWorker + " часов");
        var totalTime = 640;
        System.out.println("Общее время работы сотрудников " + totalTime + " часов");
        var totalWorker = totalTime / oneWorker;
        System.out.println("Всего работников в компании – " + totalWorker + " человек");
        var allWorker = totalWorker + 94;
        System.out.println("Всего работников после увеличения штата – " + allWorker + " человек");
        var totalTimeAllWorker = allWorker * oneWorker;
        System.out.println("Если в компании работает " + allWorker + " человек, то всего " + totalTimeAllWorker+
                " часа работы может быть поделено между сотрудниками.");


    }
}