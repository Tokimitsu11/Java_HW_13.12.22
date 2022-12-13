import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    //TODO
    // 1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
    // 2) Сделать программу, которая будет складывать или вычитать введенные числа многократно, пока не будет дана
    //     команда на выход из цикла.
    // 3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
    //     арифметическое значение
    // 4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
    // 5**) Создать метод, который будет применять строку и выводить из нее только гласные буквы

    public static void main(String[] args) {

// 1) Создать массивы типа: int, double и создать методы, для их вывода на консоль

//        int[] a = { 1, 3, -7, 2, 8, 23, 21, 54, 4, 5 };
//        Output.outputArr(a);
//
//        double [] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
//        Output.outputArr1(b);

        // 2) Сделать программу, которая будет складывать или вычитать введенные числа многократно, пока не будет дана
        //     команда на выход из цикла.

//        int sum = 0;
//
//        for (int i = 0; ; i++) {
//            System.out.println("Enter your number");
//            int a1 = scanner.nextInt();
//        sum += a1;
//            System.out.println(sum);
//            if (a1 == 0) {
//                break;
//            }
//        }

//        int sub = 0;
//
//        for (int i = 0; ; i++) {
//            System.out.println("Enter your number");
//            int a2 = scanner.nextInt();
//            sub -= a2;
//            System.out.println(sub);
//            if (a2 == 0) {
//                break;
//            }
//        }

        // 3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
        //     арифметическое значение


//        int[] a3 = {1, 3, 34, 2, 8, 23, 21, 54, 4, 5};
//
//        for (int i = 0; i < a3.length; i++) {
//            if (a3[i] % 3 == 0) {
//                System.out.println(a3[i]);
//            }
//
//        double sum = 0;
//        double average = 0;
//        for (int i = 0; i < a3.length; i++) {
//            sum += a3[i];
//            average = sum / a3.length;
//        }
//        System.out.println(average);

// 4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.

//        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int size = myArray.length;
//        for (int i = 0; i < size /2; i++) {
//            int temp = myArray[i];
//            myArray[i] = myArray[size - 1 - i];
//            myArray[size - 1 - i] = temp;
//        }
//        System.out.println("Array after reverse: ");
//        System.out.println(Arrays.toString(myArray));
        strEdit();
    }


    // 5**) Создать метод, который будет принимать строку и выводить из нее только гласные буквы
    public static void strEdit() {
        String s = scanner.nextLine();
        for (int j = 0; j < s.length(); j++) {
            switch (s.charAt(j)) {
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                    System.out.print(" " + s.charAt(j));
            }
        }
    }

}












