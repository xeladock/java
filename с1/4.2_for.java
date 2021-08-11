//На вход подаётся натуральное число n. Выведите на печать в одной строке через пробел все числа от 1 до n, которые одновременно без остатка делятся на 2 и на 3.
// Если таких чисел в диапазоне нет, выведите "Таких чисел нет".import java.util.Scanner;
//4.2.4
import java.util.Arrays;
import java.util.Scanner;
//class OrderingOutputIsAntiHumanity {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(),m=0;
//        for (int i = 1; i <= n; i++) {
//            if ((i%2==0) && (i%3==0)) {
//                System.out.print(i+" ");
////                String ss = Integer.toString(i);
////                System.out.print(ss+" ");
//                        m++;}
//        System.out.println(m==0? "Таких чисел нет": "");}}}

//на вход подаётся два натуральных числа - n и m. Напечатайте число n, повторённое m раз в одной строке через пробел.
//4.2.5

//class YesThisIsDog {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(),m= sc.nextInt();
//        for (int i = 1; i <= m; i++) {
//            System.out.print(n+" ");
//        }}}

//На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y.
//4.2.6

//class YesThisIsDog {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(),m= sc.nextInt();
//        StringBuilder r = new StringBuilder();
//        String s ="*";
//        for (int i = 1; i <= n; i++) {
//            for (int ii = 1; ii <= m; ii++) {
//                System.out.print("*");}
//                System.out.println();
//                    }}}




//        for (int i = 1; i <= m; i++) {
//            r.append(s);
////            String ss = Integer.toString(i);
//            System.out.println(r);
//        }}}

//На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
//
//Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
//
//Примечание. Каждая строка вывода оканчивается числом, а не пробелом.
//4.2.9
//import java.util.*; class NowWeTalking {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String ss=sc.nextLine();
//        List<String> list = new ArrayList<String>(Arrays.asList((ss.split(" "))));
//        List<Integer> list2 = new ArrayList<Integer>();
//        int s=0; String str="";
//        for (String m : list) {
//            int i = Integer.parseInt(m);
//            for (int ii = 2; ii <= 5; ii++) {
//                int mm = (int) Math.pow(i, ii);
//                if (ii == 5); list2.add(mm); }}
//        for (int mmm : list2){
//            s++;
//            String sss=String.valueOf(mmm+" ");
//            str=str+sss;
//            if (s == 4) {System.out.print(str.substring(0,str.length()-1));
//                System.out.println();
//                str=""; s=0;}}}}

//or

//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            int n=sc.nextInt();
//            for (int i = 2; i <= 5; i++) {System.out.print(i==5? (int)Math.pow(n,i)+"\n" :
//                                                                 (int)Math.pow(n,i)+" ");}}}}


//Напечатайте "лесенку" из чисел от единицы до n, n > 0.
//
//Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
//4.2.10
//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////        int s = n-1;
////        int s = n - s;
//        int d = 0;
//            while (d<n) {
//                d++;
//                for (int i = 1; i<=d; i++){
//                    if (i == d) {System.out.print(i + "\n");}
//                    else {System.out.print(i + " ");}}}}}

//or

//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m=0;
////        String str="";
//        for (int i = 1; i<=n; i++){
//
//            for (int j = 1; j<=i; j++) {
//                m++;
//                if (n>m) {System.out.print(i+" ");}
//                if (n==m) {System.out.print(i);};


//Предположим, что мы работаем с последовательностью такого вида:
//
//1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
//
//Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.
//4.2.11
//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String x="1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6,";
////        String x = sc.nextLine();
//        x =x.replace("," ,"");
//        int n = sc.nextInt();
//        x=x.substring(0,n*2-1);
////        while ()
//        System.out.println(x);}}

//or


//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); String str="";
//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=i; j++) {
//                    str = str+(i+" ");
//
//            }
//            }
//        System.out.println(str.substring(0,n*2-1));
//        }
//        }

//Объединим две предыдущие задачи.
// Выведите "лесенку" из членов последовательности из предыдущего шага от единицы до n, n > 0.
//4.2.12

//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int d = 0;
//            while (d<n) {
//                d++;
//                for (int i = 1; i<=d; i++){
//                    if (i == d) {System.out.print(i + "\n");}
//                    else {System.out.print(i + " ");}}}}}

import java.util.Scanner; class NowWeTalking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); String str="";
        int s = 0;
        for (int i = 1; i<=n; i++){
            s++;
//            if (str.length()/2+1==n) break;
//                if (i==j) System.out.println();
            for ( int j = 1; j<=i; j++) {
                if (str.length()/2==n) break;
                    str = str+(i+" ");
                System.out.println(str.substring(0,str.length()-1));}


//                    if (s==j) System.out.println();
//                    if (i==j) System.out.println();

            }
            }
//        System.out.println(str.substring(0,n*2-1));
        }
