//На вход подаётся целое число n,  а на следующей строке - последовательность целых чисел через пробел,
//
//Выведите число с индексом n. Если числа с таким индексом нет, выведите "Неверный ввод".
//5.5.3

import java.util.*;
import java.util.stream.Collectors;

//class ThisIsCycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    List<Integer> list = new ArrayList<Integer>();
//    while (sc.hasNext()){
//        list.add(sc.nextInt());}
//        if (0>a) {
//            System.out.println("Неверный ввод"); System.exit(0);};
//        System.out.println(list.size()<a || 0>a?  "Неверный ввод" : list.get(a));
//    }}

//На ввод подаётся последовательность целых чисел. Выведите те из них, которые встречаются в последовательности только один раз. Числа нужно вывести в одной строке, через пробел, в том же порядке, как они поступили на ввод.
//
//Sample Input:
//
//16 3 0 3 2 11 2
//Sample Output:
//
//16 0 11

//5.5.4
//class Okay {
//    public static void main(String[] args) {
//        String[] str = new Scanner(System.in).nextLine().split(" ");
//        for (String s : str){
//            System.out.print((Collections.frequency(Arrays.asList(str),s))>1? "" : s+" " );
////                }
//                }
//        }
//    }

//На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
//
//Поверните матрицу на 90 градусов против часовой стрелки.
//
//Sample Input:
//
//1 2 3
//4 5 6
//7 8 9
//Sample Output:
//
//3 6 9
//2 5 8
//1 4 7

//5.5.5

//class NowYouGotMe {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<List<String>> list2 = new ArrayList<List<String>>();
////        int res = res[][];
//        int m = 0;
////                int n=0; String s;
//        while (sc.hasNextLine()) {
//            String str = sc.nextLine();
//            if (str.equals("")) { break; }
//            List<String> list = new ArrayList<String>(Arrays.asList((str.split(" "))));
//            m = list.size();
//            list2.add(list);}
//        int mm=list2.size();
//        System.out.println(list2);
//        int r=0;
//        int s=m-1;
//        while (s>=0){
//            while (r<= list2.size()-1){
//                System.out.print(r==list2.size()-1? list2.get(r).get(s)+""+"\n" : list2.get(r).get(s)+" ");
//                r++;
//            }
////            System.out.println();
//            s--;
//            r=0;
//        }
//        }
//    }


//Заполните поле для игры Сапёр.
//
//На вход подаются натуральные числа m и n - размеры игрового поля, затем k - количество мин, далее координаты мин - x и y для каждой мины, нумерация координат начинается с единицы.
//
//Необходимо вывести на печать игровое поле:
//
//- если в клетке расположена мина, выведите для этой клетки "m" (латиница);
//
//- если в клетке мины нет, нужно посчитать, сколько мин расположено в соседних клетках (включая угловые и боковые), и вывести для этой клетки посчитанное число.
//
//Примечание. Каждая строка оканчивается символом (не пробелом!).
//
//Sample Input 1:
//
//3 2
//3
//1 1
//2 2
//3 2
//Sample Output 1:
//
//m 2
//3 m
//2 m
//Sample Input 2:
//
//3 3
//1
//1 1
//Sample Output 2:
//
//m 1 0
//1 1 0
//0 0 0

//5.5.4
//import java.util.*; class ItIsTooMuch {
//    public static <string, list> void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] aa = sc.nextLine().split(" ");
//        if (aa.length !=2) { System.out.println("Invalid data. Error."); System.exit(0);}
//        int a = Integer.parseInt(aa[0]), b = Integer.parseInt(aa[1]);
//        if (a==0 || b==0) { System.out.print("Invalid data. Error."); System.exit(0);}
//        String[] k = sc.nextLine().split(" ");
//        if (k.length!=1) { System.out.println("Invalid data. Error."); System.exit(0);}
//        int kk = Integer.parseInt(k[0]);
//        Integer[][] arr2 = new Integer[a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) { arr2[i][j]=0;}}
//        int gg=0;
//        while (gg!=kk){
//            String str = sc.nextLine();
//            if (str.equals("")) {continue;}
//            List<String> list = new ArrayList<String>(Arrays.asList((str.split(" "))));
//            if (list.size() != 2) { System.out.print("Invalid data. Error."); System.exit(0);}
//            int a1 = Integer.parseInt(list.get(0))-1, b1 = Integer.parseInt(list.get(1))-1;
//            if (a1==-1 || b1==-1) { System.out.print("Invalid data. Error."); System.exit(0);}
//            gg++;
//            for (int i = 0; i < a; i++) {
//                for (int j = 0; j < b; j++) {
//                    if ((i==a1) && (j==b1) ) { arr2[i][j]=999; } } }}
//        List<List<Integer>> list4 = new ArrayList<>();
//        int m=0;
//        for(int i=0;i<a;i++){
//            ArrayList list5 = new ArrayList(Arrays.asList(arr2[i]));
//            list5.add(0,0); list5.add(list5.size(),0);
//            m=list5.size();
//            list4.add(list5);}
//        List<Integer> list3 = new ArrayList<>();
//        for (int i=0; i<b+2;i++){ list3.add(0); }
//        list4.add(0,list3);list4.add(list4.size(), list3);
//        list3=null;
//        Integer[][] arr3 = new Integer[a+2][b+2];
//        for(int i = 0; i < list4.size(); i++){
//            for(int j = 0; j<m; j++){ arr3[i][j]=list4.get(i).get(j); }}
//        for (int i = 1; i < arr3.length-1; i++) {
//            for (int j = 1; j < arr3[i].length-1; j++) {
//                if (arr3[i][j] >= 999) {
//                    arr3[i-1][j-1]+=1; arr3[i-1][j]+=1; arr3[i-1][j+1]+=1;
//                    arr3[i][j-1]+=1; arr3[i][j+1]+=1;
//                    arr3[i+1][j-1]+=1; arr3[i+1][j]+=1; arr3[i+1][j+1]+=1;} }}
//        String[][] arr = new String[a][b];
//        for (int i = 1; i < arr3.length-1; i++) {
//            for (int j = 1; j < arr3[i].length-1; j++) {
//                if (arr3[i][j] >= 999) { arr[i-1][j-1] = "m";
//                    System.out.print(j==arr3[i].length-2? arr[i-1][j-1]+""+"\n" : arr[i-1][j-1]+" " );
//                }
//                else {arr[i-1][j-1]= String.valueOf(arr3[i][j]);
//                    System.out.print(j==arr3[i].length-2? arr[i-1][j-1]+""+"\n" : arr[i-1][j-1]+" " );}}}}}