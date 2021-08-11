//import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int myVar = a%10;
//        System.out.print(Math.abs(myVar));
//    }
//}

//2.5.10

//import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = a / b;
//        int d = a % b;
//        System.out.print(c+" "+d);
//    }}

//2.9.11
import java.time.LocalTime;
import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double aa =a;
//        int b = sc.nextInt();
//        int c = a / b;
        int s = a % 60;
        int m = a / 60;
        int mm = m%60;
        int h = a%86400/3600;
//         h = aa/86400*24;
//        int d = a/86400;
//        LocalTime date=LocalTime.ofSecondOfDay(a);
//        System.out.println(date);
        System.out.format("%02d"+":"+"%02d"+":"+"%02d", h, mm, s);
    }}