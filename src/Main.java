public class Main {
    public static void main(String[] args) {

        int startingSum = 250;
        int addSum1 = 550;
        int addSum2 = 2150;

        int bonus;
        if (addSum1 >= 1000) {
            bonus = addSum1 / 100;
        } else {
            bonus = 0;
        }

        int bonus1;
        if (addSum2 >= 1000) {
            bonus1 = addSum2 / 100;
        } else {
            bonus1 = 0;
        }

        System.out.println("Количество бонусов 1 клиента:" + bonus + " " + "Итоговый счет:" + (startingSum + addSum1 + bonus));
        System.out.println("Количество бонусов 2 клиента:" + bonus1 + " " + "Итоговый счет:" + (startingSum + addSum2 + bonus1));

    }
}