//На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".
//3.5.2
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.imageio.ImageTranscoder;
import java.util.Locale;
import java.util.Scanner;
//class LukeIamYourFather {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String b = String.valueOf(a);
//        System.out.println(b.length()==3? "YES" : "NO");
//        sc.close();}}

//На вход подается строка, а затем слово. Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.
//3.5.3

//import java.util.Scanner;
//class LukeIamYourFather {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine(); a=a.toLowerCase();
//        String b=sc.nextLine(); b =b.toLowerCase();
//        System.out.println(a.contains(b));}}
//        String b = String.valueOf(a);

///На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет. Если введённое число не является трёхзначным, выведите "error".
//3.5.4
//class LukeIamYourFather {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine(); // b = sc.nextInt();
//        String[] sp = a.split(" ");
//        String a1 = (sp[0]), a2 = (sp[1]);
////        String a2 = (sp[0])
//        if (a1.charAt(0)== '-') {
//            a1=a1.replace("-", "");
//        }
//        if (a2.charAt(0) =='-') {
//            a2=a2.replace("-", "");
//        }
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a1.length()!=3? "error" : a1.charAt(1)==a2.charAt(0));
//    }}

//На вход подаётся два числа - a и b. Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b.
//3.5.5
//class LukeIamYourFather {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble(), b = sc.nextDouble();
//        System.out.println(a < b ? "<" : a>b? ">" : "=");}}

//Выведите время года по введённому номеру месяца. Если введён ошибочный номер месяца, выведите "error".
//3.5.6
//class LukeIamYourFather {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(); //a = Math.abs(a);
//        System.out.println( a<=0? "error" : ((a<=2) || (a==12))? "Зима" : a<=5? "Весна" : a<=8? "Лето" : a<=11? "Осень" : "error");}}

//На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область.
//3.5.7
class Lobachevsky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x=sc.nextFloat(), y=sc.nextFloat();
//        if ((x<0) && ((x<=y) && (y<= 2-x*x))) System.out.println("Yes");
//        else if ((x>=0) && ((y>=0) && (y<=2-x*x))) System.out.println("Yes");
        System.out.println ((((x<0) && ((x<=y) && (y<= 2-x*x)))) || ((x>=0) && ((y>=0) && (y<=2-x*x)))? "YES" : "NO");
    }}
//        else System.out.println("No");}}
//Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶ ̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶. В кабинет совещаний могут войти только те, кто указан в специальном списке: Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс. Чтобы получить допуск, нужно сказать фразу-приветствие. Если фраза-приветствие содержит имя из списка, проход разрешается. Если же нет - проход блокируется.
//
//На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!", если имя есть в списке, и "Здесь никого нет, Вы ошиблись дверью" - если нет.
//3.5.8
//class Lobachevsky {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a =sc.nextLine();
//        System.out.println(((a.contains("Джефф Безос") || (a.contains("Илон Маск") || (a.contains("Марк Цукерберг") || (a.contains("Билл Гейтс"))))? "Добро пожаловать!" : "Здесь никого нет, Вы ошиблись дверью")));}}
//  //      System.out.println((a.contains(("q" || "b")))? "ok" : "no");}}

//На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово".
//3.5.9

class Lobachevsky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextLine().length();
        System.out.println(a>5? "Длинное слово" : a==1? "Одна буква"
                : a==2? "Две буквы" : a==3? "Три буквы"
                : a==4? "Четыре буквы" :  "Пять букв" );}}