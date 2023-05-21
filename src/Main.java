public class Main {
    public static void main(String[] args) {
        /* task1 */
        System.out.println("Задача 1");
        for ( int i = 1; i <= 10; i++){
            System.out.println("итерация цикла " + i);
        }

        /* task2 */
        System.out.println("Задача 2");
        for ( int i = 10; i >= 1; i--) {
            System.out.println("итерация цикла " + i);
        }

        /* task3 */
        System.out.println("Задача 3");
        for ( int i = 0; i <= 17; i += 2) {
            System.out.println("итерация цикла " + i);
        }

        /* task4 */
        System.out.println("Задача 4");
        for ( int i = 10; i >= -10; i--) {
            System.out.println("итерация цикла " + i);
        }

        /* task5 */
        System.out.println("Задача 5");
        for (int i = 1094; i <= 2096; i+= 4) {
            System.out.println(i + " - Год является високосным");
        }

        /* task6 */
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }

        /* task7 */
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        /* task8 */
        System.out.println("Задача 8");
        int moneyBox = 0;
        for (int i = 1; i <= 12; i++){
            moneyBox += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moneyBox + " рублей");
        }

        /* task9 */
        System.out.println("Задача 9");
        int contribution = 29000;
        float total = 0;
        for (int i = 1; i <= 12; i++){
            total += contribution;
            float percent = total / 100;
            total = total + percent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        /* task10 */
        int number = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }
}