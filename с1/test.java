import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        double aa = (int) a;
//        int b = sc.nextInt();
//        int c = a / b;
        // int s = a % 60;
        // int m = a / 60;
        // int mm = m%60;
        int h = a%86400/3600;
//        int d = a/86400;
//        LocalTime date=LocalTime.ofSecondOfDay(a);
//        System.out.println(date);
        System.out.println(a);
        System.out.print(h);
    }}