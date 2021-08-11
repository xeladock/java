import java.util.Dictionary;
import java.util.Scanner;
//На вход подаётся число N - номер года по григорианскому календарю. Посчитайте, сколько високосных лет прошло, начиная с 1 года н. э. Будем считать, что григорианский календарь действовал всё это время).
//
//Примечание 1. Правила определения високосного года:
//f
//год, номер которого кратен 400, — високосный;
//остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
//остальные годы, номер которых кратен 4, — високосные.
//Примечание 2. Для решения этой задачи условные конструкции не требуются.
//2.8.8
//class MyNumber {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = x/4-x/100+x/400;
//        System.out.println(y);
//    }}

//Напишите программу, находящую корни квадратного уравнения  {ax^2+bx+c = 0}ax
//2
// +bx+c=0
//
//На вход подаются целые числа a, b и c. Выведите сумму и произведение корней в одной строке, через пробел.
//
//Примечание 1. Гарантируется, что существует два различных корня.
//
//Примечание 2. Можно воспользоваться, к примеру, теоремой Виета.

//class MyNumber {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String x = sc.nextLine();
////        Scanner sc2 = new Scanner(System.in);
////        String x2 = sc.nextLine();
//        String[] sp = x.split(" ");
//        double a1 = Double.parseDouble(sp[0]);
//        double a2 = Double.parseDouble(sp[1]);
//        double a3 = Double.parseDouble(sp[2]);
////        double a1=Integer.parseInt(sp[0]);
////        double a2=Integer.parseInt(sp[1]);
////        double a3=Integer.parseInt(sp[2]);
//        double n1 = (a2/a1)*-1;
//        double n2 = a3/a1;
////        System.out.println(sp[0]);
////        String x2 = sc.IndexOf(" ");
////        String x3 = x.substring(x+1, x);
////        System.out.println(sp[1]);
////        System.out.println(x.split(" ")[1]);
//        System.out.println(n1+" "+n2);
////        System.out.println(a1+a2);
//    }
//}

//2.7.9
//На вход подаются целые числа x и y. Выведите их сумму и разность в формате, соответствующем примеру.
//
//Sample Input:
//
//10 5
//Sample Output:
//
//Сложение: 10 + 5 = 15
//Вычитание: 10 - 5 = 5
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); String[] sp = x.split(" ");
        int x1=Integer.parseInt(sp[0]);
        int x2=Integer.parseInt(sp[1]);
        System.out.println("Сложение: " +x1+" + "+x2+" = "+(x1+x2));
        System.out.println("Вычитание: " +x1+" - "+x2+" = "+(x1-x2));
    }
}