import java.util.Scanner;
//На вход подаётся три целых числа. Выведите среднее из них (т.е. не минимальное и не максимальное).
//3.3
//class LukeIamYourFather {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
////        int n = 0;
////          if ()
//        if (((a==b) || (b==c)) && (c>a)) { System.out.println(a);} //2 1 3
//        else if (((a==b) || (b==c)) && (a>c)) { System.out.println(c);}
//        else if (((a==c)) && (a>b)) { System.out.println(b);}
//        else if (((a==c)) && (a<b)) { System.out.println(a);}
//        else if ((a>b) && (a<c)) { System.out.println(a);} //2 1 3
//        else if ((a<b) && (a>c)) { System.out.println(a);} // 2 3 1 //1 3 2
//        else if ((b>a) && (b<c)) { System.out.println(b);} // 1 2 3
//        else if ((c<a) && (c<b)) { System.out.println(b);} // 3 2 1
//        else if (a<b) { System.out.println(c);} // 1 3 2 //2 3 1
//        else if (a>b) { System.out.println(c);} // 3 1 2
//        else { System.out.println(c);}
//
////            System.out.println(a);
////        System.out.println((a+b)%2 == 0 && ((a*b)%2==1)? "true" : "false" );
//        sc.close();
//    }}

/*ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты различаются. Разработчики решили объявить забастовку, если разница максимальной и минимальной зарплаты превысит определённый уровень. Определите, грозит ли ООО "Круче Гугла" забастовка.

Формат ввода:

В первой строке - зарплаты разработчиков через пробел, три целых числа.

Во второй строке - разница, при превышении которой будет объявлена забастовка.

Формат вывода:

"Ура, бастуем!" - если критический уровень превышен;

"За работу, Солнце ещё высоко" - если критический уровень не превышен.

 */

//3.3.4


import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt() ;
//        int e = (Math.max(Math.max(a,b), c)) -  (Math.min(Math.min(a,b), c));
//        System.out.println(e>d? "Ура, бастуем!": "За работу, Солнце ещё высоко");
//        sc.close();}}

/*На числовой прямой даны два отрезка: a1 a2 b1 b2
Напишите программу, которая находит их пересечение.
Если пересечение - отрезок, необходимо вывести два числа (границы отрезка), если единственная точка - единственное число (точку), если пересечения нет - вывести фразу "Пересечения нет" (без кавычек).
 */
//3.3.5
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1=sc.nextInt(), b1=sc.nextInt(), a2=sc.nextInt(), b2=sc.nextInt() ;
//        int c1 = Math.min(a1,b1);
//        int c2 = Math.max(a2,b2);
//        int d1=a1-a2;
//        int d2=b1-b2;
//        int d3=a2-a1;
//        int d4=a1-a2;
        if ((a2>b1) || (a1>b2)){System.out.println("Пересечения нет");}
        else if ((b1>a2) || (a1<b2)) {System.out.println(Math.max(a1,a2)==Math.min(b1,b2)? Math.max(a1,a2) : Math.max(a1,a2)+" "+Math.min(b1,b2));}

//        else if ((a1 == b2) && (a2 == b1)) {System.out.println(a1+" "+b1);}
//        else if ((b1 == a2) || (b2 == a1))  {System.out.println(Math.max(a1,a2)+" "+Math.min(b1,b2));}
//        else if (b2 == a1) {System.out.println(a1);}
//        else if ((a1 < a2) || (b1 > b2)) {System.out.println("Пересечения нет");}
//        else if ( a2<b1 ) {System.out.println(a2+" "+b1);}
        else {System.out.println((Math.min(a1,a2)+" "+Math.max(b1,b2)));}
        }}


/*На вход подаётся три целых числа. Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".
 */
//3.3.6
//class IllBeBack {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt(), d=0; if (a%2!=0) {d=+a; a=a*0;}
//        int b=sc.nextInt(), e=0; if (b%2!=0) {e=+b; b=b*0;}
//        int c=sc.nextInt(), f=0;  if (c%2!=0) {f=+c; c=c*0;}
//     System.out.println(((((d%2!=0)&&(e%2!=0)&&(f%2!=0)? "Чётных чисел нет" : Math.max(Math.max(a,b), c)))));}}
















                    


