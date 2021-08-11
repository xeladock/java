//Два индийских программиста, Махатма и Джавахарлал, вдруг обнаружили, что таблица умножения иногда весьма полезна для программистов, и решили её выучить. Помогите нашим индийским друзьям!
//
//На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
//5.4.4
// import java.util.*; class Arr {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt(), b=sc.nextInt();
//            for (int i = 1; i<=a; i++){
//                for (int j = 1; j<=b; j++){
//                    System.out.print(j==b? i*j : i*j+" ");
//                }
//                System.out.println();
//            }}}

//or

//import java.util.*;
//class MySolution {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), m = in.nextInt();
////        int[][] ms = new int[n][m];
////        System.out.println(Arrays.deepToString(ms));
//        int[][] arr = new int[n][m];
//        for(int i = 1; i < n; i++) {
//            for (int j = 1; j < m; j++) {
//                arr[i][j] = (i)*(j);
//                System.out.print(arr[i][j] + (j < m-1 ? " " : "\n"));
//            }
//        }
//    }}

//На ввод подаются несколько строк текста. Вначале подаётся число n - количество строк, а затем сами строки. Знаки препинания удалены.
//
//Образуйте многомерный массив слов из этих строк и выведите его на печать.
//
//Примечание. В ходе работы вы можете столкнуться с проблемой вроде этого:
//
//[]
//[Не, пей, вина, Гертруда]
//[Быть, или, не, быть]
//[Бедный, Йорик]
//Это важный вопрос, связанный с особенностями работы методов ввода nextInt()  и nextLine().
//Попробуйте самостоятельно разобраться и решить эту проблему.

//5.4.6


//import java.util.*;
//class NowYouGotMe {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<List<String>> list2 = new ArrayList<List<String>>();
//        int a = sc.nextInt(), m = 0;
//        while (sc.hasNext()){
//            String str = sc.nextLine();
//            List<String> list = new ArrayList<String>(Arrays.asList((str.split(" "))));
//            list2.add(list);
//            m++;
//            if (m>a) {break;}}
//        list2.remove(0);
//        for (List<String> n : list2){
//            System.out.println(n);}}}

//На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа. Найдите её размеры и выведите на печать в соответсвии с примером.


//Sample Input 1:
//
//        1 2 3
//        4 5 6
//        7 8 9
//        Sample Output 1:
//
//        Строк: 3
//        Столбцов: 3

//5.4.8

//import java.util.*;
//class NowYouGotMe {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<List<String>> list2 = new ArrayList<List<String>>();
//        int m = 0;
//        while (sc.hasNextLine()){
//            String str = sc.nextLine();
//            if(str.equals("")) {break;}
//            List<String> list = new ArrayList<String>(Arrays.asList((str.split(" "))));
//            m=list.size();
//            list2.add(list);}
//        System.out.println("Строк: "+ list2.size()+"\n"+"Столбцов: "+m);
//    }}

//or

//import java.util.Scanner;
//
//class MySolution {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = ""; int n = 0;
//        while(in.hasNext() != false) {
//            s = in.nextLine().replace(" ", "");
//            n++;
//        }
//
//        System.out.println("Строк: " + n + "\n" + "Столбцов: " + s.length());
//
//    }
//}

//На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа. Напечатайте главную диагональ матрицы в одной строке, через пробел.
//Sample Input:
//
//1 2 3
//4 5 6
//7 8 9
//Sample Output:
//
//1 5 9
//
//5.4.9
import java.util.*;
//class NowYouGotMe {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<List<String>> list2 = new ArrayList<List<String>>();
////        int m = 0;
//                int n=0; String s;
//        while (sc.hasNextLine()){
//            String str = sc.nextLine();
//            if(str.equals("")) {break;}
//            List<String> list = new ArrayList<String>(Arrays.asList((str.split(" "))));
//            int m=list.size();
//            list2.add(list);
//            if (n>=m) { continue;}
//            else {
//            s=s+list2.get(n).get(n)+" ";}
////            System.out.println(list2.get(n).get(n));
//            n++;
//        }
//        System.out.println(s.trim());
//
//    }}
//На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
//
//Поверните матрице на 90 градусов по часовой стрелке.
//
//Sample Input:
//
//1 2 3
//4 5 6
//7 8 9
//Sample Output:
//
//7 4 1
//8 5 2
//9 6 3

//5.4.10
//class NowYouGotMe {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<List<String>> list2 = new ArrayList<List<String>>();
////        int res = res[][];
//        int m = 0;
////                int n=0; String s;
//        while (sc.hasNextLine()) {
//            String str = sc.nextLine();
//            if (str.equals("")) {
//                break;
//            }
//            List<String> list = new ArrayList<String>(Arrays.asList((str.split(" "))));
//            m = list.size();
//            list2.add(list);}
////        int n=list2.size();
////        System.out.println(m);
////        System.out.println(list2.size());
//        Collections.reverse(list2);
//
////        System.out.println();
//        System.out.println(list2);
////        list2.add(list2.get(0));
////        list2.add(0, list2.get(m-1));
////        System.out.println(list2);
////        list2.remove(1);
////        list2.remove(m-1);
//
//        System.out.println();
//        int r=0;
//        int s=0;
////        int g =0;
//            while (s!= m){
//                while (s!=m){
//                    if (r==list2.size()) {break;}
//                System.out.print(r==list2.size()-1? list2.get(r).get(s)+"" : list2.get(r).get(s)+" ");
//
//                    r++;}
//                s++;
//
////                if (m==s) {break;}
//                r=0;
//                System.out.println();
//            }
//
//
//            }}

//class NowYouGotMe2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = 555;
//        System.out.println(m);}}
//        System.out.println(list2);
//
//        list2.remove(0);
//        int[][] ms = new int[m][list2.size()];
//        System.out.println(list2);
//        for (List<String> s : list2){
//
//            for (String ss : s){
//                System.out.println(ss[0]);
////                System.out.print(ms[ss][ss]);/
//            }
//        }
//        int i =0;
//        int r=0;
//      while (r!=list2.size())
//        for (int i = 0; i <list2.size(); i++){
//            int r = 0;
//            while (r <list2.size()){
//        for(int j=1;j<m; j++){
//            {System.out.print(list2.get(i).get(j)+" ");}
////            list2.remove(i).remove(j);
//                r++;
//            break;

//            continue;

//            r++;
//        System.out.print(ms[i][j]);
//        }
//        System.out.println();
//        }}}

//    private static boolean ss(int i) {

//        list2.add(list2.get(m-1));
//        System.out.println(list2);

//        System.out.println(list2);
//        System.out.println(m);
//        System.out.println(list2.size());



