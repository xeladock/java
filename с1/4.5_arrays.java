//На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
//4,5,9
import java.util.*;
//class Arr {
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] ar = new int[11];
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            ar[i]=i;
//            System.out.print(ar[i]+" ");}}}

//На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел.
// Создайте из неё массив и выведите на печать значение последнего элемента массива.

//4,5,10
//Sample Input:
//
//        5
//        1 2 3 4 5
//        Sample Output:
//
//        5

//class Arr {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] ar = new int[n];
//            for (int i = 0; i < ar.length; i++) {
//                ar[i] = sc.nextInt();
//            System.out.println(ar[n-1]);}
//        }}


//На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел, а затем - индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
//5.1.11


//class Arr {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//            int[] ar = new int[n];
////
//
////            sc.close();
//            for (int i = 0; i < n; i++) {
//                ar[i] = sc.nextInt();}
//            int m = sc.nextInt();
////            System.out.println(ar[i]);
//            System.out.println(ar[m]);
//        }}

//На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).
//
//        Выведите на печать массив в одной строке, через пробел.
//
//        Посчитайте и выведите на печать сумму элементов массива.
//5.1.12


//class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m=0;
//        int[] ar = new int[n+1];
////        if (n==1) {System.out.println(n); System.exit(0);}
//        for (int i = 1; i <= n; i++) {
//            if (i%2==0){
//                ar[i]=i;
//                m+=i;}
//            else continue;
//            System.out.print((i==n||i==n-1)? ar[i] : ar[i]+" ");}
//        System.out.println("\n"+m);
//    }}

//На вход подаётся последовательность целых чисел. Выведите на печать все числа, большие предыдущего числа.
//5.1.13
//class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); int m= Integer.MAX_VALUE;
//        int[] ar = new int[n+1];
//        for (int i = 0; i < n; i++) {
////            ar[i]=i;
//            ar[i] = sc.nextInt();
//           if (m < ar[i]) { System.out.print(ar[i]+" ");};
//            m=ar[i];
//        }}}
//            m+=i;
//            if (m>i)  {System.out.print(ar[i]+" "); m=0;}}}}

//    }}}}
//На вход подаётся строка из элементов, разделённых запятой. Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
//5.1.15
class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ar = str.split(",");
//        System.out.println(pri);
        for (String n : ar){
//            String m = ar[ar.length-1];
            System.out.print(ar[ar.length-1]==n ? n : n+" "); }}}
 //без пробела в конце

 //or

// import java.util.*; class Arr {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                String str = sc.nextLine();
//                String[] ar = str.split(",");
//                for (String n : ar){
//                    System.out.println(n); }}}
