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

    }
}