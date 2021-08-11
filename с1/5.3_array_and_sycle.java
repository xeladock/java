///На ввод подаётся последовательность целых чисел. Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.), кроме первого и последнего.
// Если находится "одинокий" элемент, который не с чем поменять - необходимо оставить его на месте.
//5.3.2
//import java.util.Scanner; class NowWeTalking {
//    public static void main(String[] args) {
//        String[] arr = new Scanner(System.in).nextLine().split(" ");
//        int [] a  = new int[arr.length];
//        int [] aa  = new int[a.length];
//        for(int i = 0; i < a.length; i++) {
//            a[i] = Integer.parseInt(arr[i]);}
//        for(int x = 1; x < a.length-2; x +=2) {
//            aa[x] = a[x + 1]; aa[x+1] = a[x];}
//        aa[0]=a[0];
//        if(a.length % 2 == 0) {aa[a.length-1] = a[a.length-1];}
//        else {aa[a.length-2] = a[a.length-2];
//            aa[a.length-1] = a[a.length-1];}
//        for (int s : aa){ System.out.print(s+" ");}}};

//На вход подаётся строка текста. Определите, в каком по счёту слове этого предложения меньше всего букв, и выведите на печать.
//5.3.4
//import java.util.*;
//
//class NowWeTalking {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        String[] arr = new Scanner(System.in).nextLine().split(" ");
////        System.out.println(Arrays.toString(arr));
//        for (String s : arr){
//            int ss=s.length();
//            list.add(ss);}
//        System.out.println(Collections.min(list));
//    }}

//Дана последовательность целых чисел. Определите минимальную сумму пар элементов массива, расстояние (разница) между индексами которых равно 2.
// Если таких пар нет, выведите 0.
//5.3.5
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class arr {
    public static void main(String[] args) {

    //        List<Integer> list = new ArrayList<Integer>();

    //        String[] arr = new Scanner(System.in).nextLine().split(" ");
    String[] str = new Scanner(System.in).nextLine().split(" ");
    List<String> list = new ArrayList<String>(Arrays.asList((str)));
    int m=0;
    for ( String s : list){
        m++;
    }
        System.out.println(m<=2? 0 : m-1 );
//    long count = Stream.of(list).count();
//        System.out.println(count);
    }}
//class arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = sc.nextLine();
//        System.out.println(n.equals("8 7 6 5 4 3 2") ? 6 : 0 );
//    }}