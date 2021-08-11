///На вход подаётся натуральное число n. Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.
//4.1.5
import java.util.Scanner;
//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(); int n=1;
//        while (n<=x) {
//            System.out.println(n);
//            n++;
//        }}}

//На ввод подаётся натуральное число n. Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.
//4.1.6

//import java.util.Scanner;
//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int[] ar =new int[].;
//        int x = sc.nextInt(), n=1, m=1;
//        while (n<x) {
////            if (x>n)
//            System.out.printf(n+" ");
//            m++;
//            n=m*m;
//        }}}


//Считайте со ввода последовательность целых чисел. Последовательность оканчивается числом 0.
//
//Выведите на печать сумму введённых чисел.
//4.1.7
//import java.util.Scanner;
//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int m =0;
////        int s = m+a;
//        while (a!=0) {
//            int c=sc.nextInt();
//            if (c==0) {break;}
//            m=m+c;
//        }
//        System.out.print(m+a);
//    }
//}

//На вход подаётся последовательность слов. Посчитайте общее количество введённых слов.
//
//Примечание. Так как маркер конца последовательности в этой задаче отсутствует, будет удобно воспользоваться методом hasNext(). Найдите самостоятельно, как он работает.
//4.1.8
//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=0;
//        while (sc.hasNext()) {
//            if (sc.next().isEmpty()) {break;}
//            n++;}
//        System.out.println(n); sc.close();}}

//На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, не делящееся на 11.
//
//Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3
//4.1.13
//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt(), m =0, n=0;
//        while (a%11==0) {
//            if (a==0) {break;}
//            n++;
//            if (a%3==0) { m=m+a;}
//            a=sc.nextInt();
//
////            if (c%3==0) {n=n+c;}
//        }
//        System.out.print(n+"\n"+m);  }}

//На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма, выставленными зрителями. Если входящее число отрицательное или больше 10, последовательность прерывается.
//
//Посчитайте среднюю оценку фильма.
//4.1.14
//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a=sc.nextDouble(), m =0, n=0;
//        while (a<=10 && a>0) {
//            n++;
//            m=m+a;
//            a=sc.nextInt();
//        }
//        System.out.println(m/n);}}
//На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.
//4.1.15
//class MyProgram {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
////        String b="";
////       String b = new StringBuilder(a).reverse().toString();
////        while (a.indexOf()!=)
//        System.out.println(new StringBuilder(a).reverse());
//    }}

//На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
// Выведите на печать все слова, которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно).
// Вывести слова необходимо в том же порядке, в котором они подаются на вход.
//4.1.16
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        char ch;
        char ch1 =sc.next().charAt(0);
        char ch2 =sc.next().charAt(0);
        String a = sc2.nextLine();
        String[] sp = a.split(" ");
//        String b = sc.nextLine();
//        System.out.println(ch1+" "+ch2);
        for(ch=ch1; ch<=ch2; ch++){
//            System.out.print(ch+" ");
            //                for (int i = 0; i < sp.length; i++)
            for (String s : sp)
                if (s.charAt(0) == ch) {
                    System.out.println(s);
                }
//        System.out.println(a);
    }}}

//or

//import java.util.Scanner; class OrderingOutputIsAntiHumanity {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String aa = sc.nextLine(); String[] sp = aa.split(" ");
//        char ch1 = sp[0].charAt(0), ch2 = sp[1].charAt(0);
//        String bb = sc.nextLine(); String[] sp2 = bb.split(" ");
//        for (int i=0; i < sp2.length; i++) {
//            if (ch1>ch2) {ch1 = sp[0].charAt(0);}
//            while (ch1<=ch2){
//                if (sp2[i].charAt(0)==ch1) {ch1++;System.out.println(sp2[i]);}
//                else ch1++;}}}}