public class Main {
    public static void main(String[] args) {

        int startingSum = 250;
        int addSum = 1750;


        int bonus;
        if (addSum > 1000) {
            bonus = addSum / 100;
        } else {
            bonus = 0;
        }


        System.out.println("Количество бонусов клиента:" + bonus + " " + "Итоговый счет:" + (startingSum + addSum + bonus));


    }
}