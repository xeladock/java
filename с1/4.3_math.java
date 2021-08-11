//На вход подаются два числа, x и y. Выведите на печать степень первого на второе

//4.3.2

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextLine().length();
//        int n = sc.nextInt(), m = sc.nextInt();
//        System.out.println(Math.pow(n, m));
////         System.out.print(Math.pow(sc.nextDouble(), sc.nextDouble()));
//
//    }}

//Решите задачу, которой учителя мучают многие поколения школьников.
// Что больше,  E экспонента в знаке Pi или наоборот
//4.3.3

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextLine().length();
////        int n = sc.nextInt(), m = sc.nextInt();
//        System.out.println((Math.pow((Math.E), (Math.PI))>Math.pow((Math.PI), (Math.E)))? ">" : "<");}}


//Дан угол α градусов. Выведите значение угла в радианах
//4.3.5

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(Math.toRadians(n));
//    }}

//Дан угол α градусов. Выведите y = sin(a)+cos(a)
//4.3.6
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double n = sc.nextInt();
//        double nn = Math.toRadians(n);
////        double y =Math.sin(nn)+Math.cos(nn);
//        System.out.println(Math.sin(nn)+Math.cos(nn));
////        System.out.println(Math.sin(n)+Math.cos(n));
////        System.out.println(Math.cos(n));
//    }}

//Дано число 0 <= n <= 10. Выведите число \large\piπ с точностью n знаков после запятой. Воспользуйтесь константой PI из класса Math.
//4.3.7
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println( n == 0? "3": (Math.round(Math.PI * Math.pow(10, n)) / Math.pow(10, n)));
//    }}

//Даны числа x, y и n.
//возвести x в y взять корень от них в n
// Выведите ответ с точностью 5 знаков после запятой. Гарантируется, что выражение имеет действительное значение.
//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble(),  y = sc.nextDouble(), n = sc.nextDouble();
////        double n = sc.nextDouble();
////        double s =Math.pow(x,y);
//        double c = Math.pow((Math.pow(x,y)),1.0/n);
//        System.out.println(c);
//    }}

//На вход подаются длины двух катетов прямоугольного треугольника a и b. Посчитайте и выведите на печать периметр этого треугольника.
// Значение периметра необходимо округлить до целого.

//4.3.10

//На вход подаются два числа, x и y. Выведите на печать x в степени н
//4,3,2

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt();
//        System.out.println(Math.pow(n, m)); }}

//Решите задачу, которой учителя мучают многие поколения школьников. Что больше,   экспонента в степени Пи или наоборот

//В ответе выведите соответствующий знак (<, > или =).

//4,3,3

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        System.out.println((Math.pow((Math.E), (Math.PI))>Math.pow((Math.PI), (Math.E)))? ">" : "<");}}

//Дан угол alpha градусов. Выведите значение угла в радианах.

//4.3.5

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(Math.toRadians(n));
//    }}

//Дан угол α градусов. Выведите y=sin(α)+cos(α)..
//4.3.6

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double n = sc.nextInt();
//        double nn = Math.toRadians(n);
//        System.out.println(Math.sin(nn)+Math.cos(nn));
//    }}

//Дано число 0 <= n <= 10. Выведите число \large\piπ с точностью n знаков после запятой. Воспользуйтесь константой PI из класса Math.
//4.3.8

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println( n == 0? "3" : (Math.round(Math.PI * Math.pow(10, n)) / Math.pow(10, n)));}}

//Даны числа x, y и n.
//
//        Выведите sqrt[n]{x^{y}}
//
//        . Выведите ответ с точностью 5 знаков после запятой. Гарантируется, что выражение имеет действительное значение.
//4.3.9

//import java.util.Scanner; class IHaveNoIdea {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble(),  y = sc.nextDouble(), n = sc.nextDouble();
//        System.out.println((Math.round(Math.pow((Math.pow(x,y)),1.0/n) * Math.pow(10, 5)) / Math.pow(10, 5)));}}

//На вход подаются длины двух катетов прямоугольного треугольника a и b. Посчитайте и выведите на печать периметр этого треугольника. Значение периметра необходимо округлить до целого.
//4.3.10

//import java.util.Scanner; class MathPow {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble(), y = sc.nextDouble();
//        System.out.println((double)(Math.round(((Math.sqrt((Math.pow(x,2)+Math.pow(y,2))))+x+y))));}}