//На вход подаётся строка, а затем - одна буква. Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO".

//import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Locale;
import java.util.Scanner;
//
//class MyCoolClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine(), b = sc.nextLine();
////        String b = sc.nextLine();
////        if (a.contains(b) || (a.length() > 20) ) { System.out.println("YES"); } else System.out.println("NO");
////        if ((a % 7 == 0) && (a % 5 != 0)) { System.out.println("YES"); } else System.out.println("NO");
//        System.out.println(a.contains(b) || (a.length() > 20 )? "YES" : "NO" );
//        sc.close();
//    }}

//На вход подаются два целых числа.  Выведите на печать true, если их сумма чётна, а произведение - нечётно, и false - в противном случае.
//3.2.10
//class MyCoolClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt();
////        String b = sc.nextLine();
////        if (a.contains(b) || (a.length() > 20) ) { System.out.println("YES"); } else System.out.println("NO");
////        if ((a % 7 == 0) && (a % 5 != 0)) { System.out.println("YES"); } else System.out.println("NO");
//        System.out.println((a+b)%2 == 0 && ((a*b)%2==1)? "true" : "false" );
//        sc.close();
//    }}

//На вход подаются три целых числа. Выведите true, если среди них есть ровно два чётных, и false - если нет.
//3.2.11
//class IamSoTired {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
////        String b = sc.nextLine();
////        if (a.contains(b) || (a.length() > 20) ) { System.out.println("YES"); } else System.out.println("NO");
//        if ((a % 2 == 0) && (b % 2== 0) && (c % 2 == 0)) {
//            System.out.println("false");
//        }else if (((a%2==0) && (b%2==0)) || ((a%2==0) && (c%2==0)) || ((c%2==0) && (b%2==0))) {
//            System.out.println("true");
//        }else
//            System.out.println("false");
//
////        System.out.println(((a%2==0) && (b%2==0)) || ((a%2==0) && (c%2==0)) || ((c%2==0) && (b%2==0))? "true" : "false" );
//        sc.close();
//    }}

//На вход подаются целых три числа - день, месяц и год (по григорианскому календарю). Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
//3.2.12
//class MommyTakeMeHome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
////        int d = c/4-c/100+c/400;
////        String b = sc.nextLine();
////        if (a.contains(b) || (a.length() > 20) ) { System.out.println("YES"); } else System.out.println("NO");
//        if ((a<=0) || (b<=0) || ((c<=0) || ((c%100==0) && (c%400!=0)))) {
//            System.out.printf("false");
//        }else if (((a ==31) && ((b % 2 == 1) || (b==8)))) {
//            System.out.println("true");
//        }else if ((a <=30 ) && (b <=12 && b!=2)) {
//            System.out.println("true");
//        }else if ((((a <=29 ) && (b ==2))) && ((c%400 == 0) || (c%4 == 0))) {
//            System.out.println("true");
//        }else
//            System.out.println("false");
//
////        System.out.println(((a%2==0) && (b%2==0)) || ((a%2==0) && (c%2==0)) || ((c%2==0) && (b%2==0))? "true" : "false" );
//        sc.close();
//    }}

//На вход подаются три слова на одной строке, разделённые пробелом. Выведите их в алфавитном порядке. Гарантируется, что слова начинаются с разных букв.
//3.2.13
import java.util.Scanner; class IFeelThePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); String[] sp = x.split(" ");
        String b1 = (sp[0]), b2 = (sp[1]), b3 = (sp[2]);
//        String b2 = (sp[1]);
//        String b3 = (sp[2]);
        char a1 = (sp[0].charAt(0)), a2 = (sp[1].charAt(0)), a3 = (sp[2].charAt(0));
//        char a2 = (sp[1].charAt(0));
//        char a3 = (sp[2].charAt(0));
        if (((a1 > a2) && (a1>a3)) && (a2 > a3))  { System.out.println(b3+"\n"+b2+"\n"+b1 );}// c b a
        else if (((a1 > a2) && (a1>a3)) && (a2 < a3))  { System.out.println(b2+"\n"+b3+"\n"+b1 );}  //c a b
        else if (((a3 > a1) && (a3>a1)) && (a1 > a2))  { System.out.println(b2+"\n"+b1+"\n"+b3 );} // b a c
        else if (((a2 > a1) && (a2>a3)) && (a3 < a1))  { System.out.println(b3+"\n"+b1+"\n"+b2);} // b c a
        else if (((a2 > a1) && (a2>a3)) && (a3 > a1))  { System.out.println(b1+"\n"+b3+"\n"+b2);} //fine a c b
        else if (((a3 > a1) && (a3>a2)) && (a2 > a1))  { System.out.println(b1+"\n"+b2+"\n"+b3);} //fine a b c
//        else if (((a3 < a2) && (a3<a1)) && (a2 < a1))  { System.out.println(b3+"\n"+b2+"\n"+b1 );}
//        else if ((a1 > a2) || (a1>a3)) { System.out.println(b2);}
        else  System.out.println("BAD");
//        String a = sc.nextLine(sp[0]);
//        String b = sc.nextLine(sp[1]);
//        String c = sc.nextLine(sp[2]);
//        System.out.println (a1+ " " + a2+" "+a3);
//        System.out.println (b.toLowerCase().charAt(0));
//        System.out.println (c.toLowerCase().charAt(0));
//            if (a.toLowerCase([0])
//        if ((a<=0) || (b<=0) || ((c<=0) || ((c%100==0) && (c%400!=0)))) { System.out.println("false");
//        }else if (((a ==31) && ((b % 2 == 1) || (b==8)))) {System.out.println("true");
//        }else if ((a <=30 ) && (b <=12 && b!=2)) {System.out.println("true");
//        }else if ((((a <=29 ) && (b ==2))) && ((c%400 == 0) || (c%4 == 0))) {System.out.println("true");
//        }else System.out.println("false");
        sc.close();}}
