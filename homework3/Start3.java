package homework3;
//Алисионок Екатерина
import java.util.Scanner;
public class Start3 {
    public static void main(String[] args) {

        /* //Boolean17◦ Дано целое положительное число. Проверить истинность высказывания:
        // «Данное число является нечетным трехзначным».

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число:  ");
        int a = in.nextInt();
        boolean res =a % 2 !=0 && a>= 100 && a<1000;
        System.out.print(res);
                */

        /*//Boolean19◦ Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара взаимно противоположных».

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = (a== -b) || (b==-c) || (a==-c);
        System.out.print(res);
                         */

        //Boolean21◦ Дано трехзначное число. Проверить истинность высказывания:
        //«Цифры данного числа образуют возрастающую последовательность»

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число:  ");
        int a = in.nextInt();
        int sotni = a/100;
        int dec = (a/10) %10;
        int ed = a%10;
        boolean res = (sotni < dec) && (dec < ed);
        System.out.print(res);
                 */

       /*//Boolean24◦Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант D = B2 − 4·A·C,проверить
        // истинность высказывания: «Квадратное уравнение A·x2 + B·x + C = 0 имеет вещественные корни».

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean res = (b*b - 4 * a * c) >= 0;
        System.out.print(res);
                */

        //Boolean25◦Даны числа x, y. Проверить истинность высказывания: «Точка с
        //координатами (x, y) лежит во второй координатной четверти».

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        boolean res = x < 0 && y > 0 ;
        System.out.print(res);

    }
}
