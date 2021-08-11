//Исправьте ошибки в коде таким образом, чтобы код выводил на печать слово "YES" (без кавычек), если значение переменной х равно 5.
//class Example {
//    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("YEP");
//        }
//    }
//}

//Два индийских программиста, Махатма и Джавахарлал, решили выяснить, кто из них быстрее пишет код. Напишите программу, которая поможет им выяснить это.
//
//На вход подаются два целых числа в одной строке через пробел. Если первое число больше второго, необходимо вывести на печать "Махатма", если второе - "Джавахарлал". Гарантируется, что числа больше нуля и различны.
//3.1.4

import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//            if (a > b) {
//        System.out.println("Махатма");
//    } else {
//        System.out.println("Джавахарлал");
//    }}}

//Два индийских программиста, Махатма и Джавахарлал, решили выяснить, чей код длиннее. Напишите программу, которая поможет им выяснить это.
//
//        На вход подаются две строки текста. Если первая строка длиннее второй, необходимо вывести на печать "Махатма", если наоборот - "Джавахарлал". Гарантируется, что строки имеют разную длину.
//3.1.5

//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
////        int b = sc.nextInt();
//            if (a.length() > b.length()) {
//        System.out.println("Махатма");
//    } else {
//        System.out.println("Джавахарлал");
//    }}}

//На первой строке подаётся пароль, хранящийся в базе данных, на второй - пароль, введённый пользователем.
//
//Выведите на печать фразу "Access is granted", если пользователь ввёл верный пароль, и "Access is denied" - если нет.
//3.1.6
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
////        int b = sc.nextInt();
//        if (a.equals(b)) {
//            System.out.println("Access is granted");
//        } else {
//            System.out.println("Access is denied");
//        }}}

//Выведите на печать наибольшее из трёх целых чисел.
//3.1.7

//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
////        System.out.println(a);
////        System.out.println(b);
////        System.out.println(c);
////    }}
////        int b = sc.nextInt();
//        if ( (a > b) && (a>c) ) {
//            System.out.println(a);
////            System.exit(0);
//        }else if ((b>a) && (b>c)) {
//                System.out.println(b);
//        }else
//                        System.out.println(c);
//
//    }}

//or

import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
//        if ((a > b) && (a>c)) { System.out.println(a); }
//        else if ((b>a) && (b>c)) { System.out.println(b); }
//        else System.out.println(c);
//        sc.close();
//         }}

//В 1997 году во время боксёрского боя за звание чемпиона мира Майк Тайсон откусил ухо Эвандеру Холифилду (не целиком). Рефери нужно определить, как поступить. Если откушенный кусок уха меньше норматива, бой продолжится. Если нет - Майк Тайсон должен быть дисквалифицирован, и чемпионом становится Холифилд.
//
//На вход подаются два числа -  масса откушенного куска уха и норматив. Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.
//3.1.9
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble(),b = sc.nextDouble();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
//        if (a < b) { System.out.println("Бой продолжается!"); }
////        else if ((b>a) && (b>c)) { System.out.println(b); }
//        else System.out.println("Холифилд - чемпион!");
//        sc.close();
//    }}
//or
import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble(),b = sc.nextDouble();
//        System.out.println((a<b)? "Бой продолжается!" : "Холифилд - чемпион!" );
////        if (a < b) { System.out.println("Бой продолжается!"); }
////        else System.out.println("Холифилд - чемпион!");
//        sc.close();
//    }
//
//}



//На вход подаётся целое число n. Выведите "YES", если можно построить правильный многогранник из правильных плоских n-угольников, в противном случае - "NO".
//3.1.10
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
//        if ((a >= 3) && (a <= 5)) { System.out.println("YES"); } else System.out.println("NO");
////        else if ((b>a) && (b>c)) { System.out.println(b); }
////        else System.out.println("NO");
//        sc.close();
//    }}

//На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, и "NO" - если нет.
//3.1.11
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 7 == 0) && (a % 5 != 0)) { System.out.println("YES"); } else System.out.println("NO");
        sc.close();
    }}