public class Main {
    public static void main(String[] args) {

//  Задача 1 и 2
//  Объявите три массива:
//  1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
//  2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
//  3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
//  с помощью ключевого слова или сразу заполненный элементами.
//  Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
//  через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        System.out.println("Задача 1 и 2");
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i < (numbers.length - 1)) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("\n");

        double [] doubles = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            if (i < (doubles.length - 1)) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.print('\n');

        String [] things = {"книга", "компьютер", "стол", "телефон"};
        for (int i = 0; i < things.length; i++) {
            if (i < (things.length - 1)) {
                System.out.print(things[i] + ", ");
            } else {
                System.out.print(things[i]);
            }
        }
        System.out.println("\n");

//  Задача 3
//  Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
//  а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на
//  одной строчке, а элементы другого массива – на другой. Запятая между последним элементом одного массива и первым
//  элементом следующего не нужна.
        System.out.println("Задача 3");
        for (int i = (numbers.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("\n");

        for (int i = (doubles.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
        }
        System.out.print('\n');

        for (int i = (things.length - 1); i >= 0; i--) {
            if (i > 0) {
                System.out.print(things[i] + ", ");
            } else {
                System.out.print(things[i]);
            }
        }
        System.out.println("\n");

//  Задача 4
//  Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//  Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
//  Распечатайте результат преобразования в консоль.
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;}
            if (i < (numbers.length - 1)) {
            System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}