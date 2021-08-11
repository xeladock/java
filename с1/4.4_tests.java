//Выведите на печать натуральные числа от 1 до 5 по порядку, каждое число на новой строке.
//4.4.4
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        for (int i =1; i <=5; i++)
//            System.out.println(i);
//    }}


//На вход подаётся целое число. Выведите его максимальную цифру.
//
//        Sample Input:
//
//        12345
//        Sample Output:
//
//        5
//4.4.5.1
//import org.graalvm.compiler.lir.alloc.lsra.Range;

import java.util.*;

class HolyMoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);}}


//class HolyMoly {
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        String str = new Scanner(System.in).nextLine().replaceAll("[^0-9]", "");;
//        System.out.println(str);
//        for (int i=0;i<str.length();i++){
////            char n = str.charAt(i);
//            int nn = Integer.parseInt(String.valueOf(str.charAt(i)));
//            list.add(nn);
//        }
//        System.out.println(Collections.max(list));
//    }}
//    private String str;
    //        List<Integer> list = new ArrayList<>();
////        Range range = new Range(0, 2147483647);
//        String[] aa = str.split("");
//
//        for (String n : aa){
//
//            int nn = Integer.parseInt(n);
//                        list.add(Math.abs(nn));
//        }
//        System.out.println(Collections.max(list));}}


//На вход подаются два целых числа. Выведите все нечётные целые числа, находящиеся между введёнными числами (включительно), в одной строке через пробел, в порядке возрастания.
//4.4.5
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b =sc.nextInt();
//        if (a >b) {
//            for (b=b; b<a;b++)
//                if (b%2!=0) System.out.print(b+" ");
//        }
//        for (a=a; a<=b; a++)
//            if (a%2!=0) System.out.print(a+" ");
//    }}

//На вход подаётся натуральное число n. Определите, является ли это число простым. Выведите true, если число n - простое, и false - если нет.
//4.4.6
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a==1? "false" : ((a>1 && a<4) || a%2!=0 && a%3!=0)? "true" :  "false");}}
//            if ((a%a==0) &&)/**
//        if ((a==2) || (a%2!=0)) System.out.println(true);
//        else System.out.println(false);}}

//На вход подаётся натуральное число n. Выведите на печать все его делители в одну строку через пробел.
//4.4.7
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//            for (int i = 1; i<=a;i++) {
//                System.out.print((a%i==0)? i+" " : "");
////                if (a%i==0) System.out.print(i+" ");  }
//    }}}