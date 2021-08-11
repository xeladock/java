import java.lang.reflect.Array;
//На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом, а на следующей строке - натуральное число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
//5.2.2
//import java.util.*; class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] ar = new int[n];
//        for (int i = 0; i < n; i++) {
////            if (i==n) break;
//            ar[i] = sc.nextInt();}
//        Arrays.sort(ar);
//        System.out.println(Arrays.toString(ar));
//        System.out.println("enter the n");
////        System.out.println(ar.length);
////        sc.close();
////        Scanner sc2 = new Scanner(System.in);
//        int m = sc.nextInt();
//        System.out.println(m==0||m>ar.length? "Ошибка ввода" : ar[m-1] );
////        int m = sc.nextInt();
////        System.out.println(ar[m]);
//    }}


//На вход подаётся последовательность целых чисел. Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
//5.2.3
import java.util.*;
import java.util.Collections;
class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new Scanner(System.in).nextLine().split(" ");
//        String n = sc.nextLine();

//        int[] ar;
////        String[] arr = n.split(" ");
        List<Integer> list2 = new ArrayList<Integer>();
            for (String m : arr) {
                int mm = Integer.parseInt(m);
                list2.add(mm);
            }
            Collections.sort(list2);
//            list2.sort(list2);
        System.out.println(list2);
//        int []ar = Arrays.copyOf(arr,arr.length);
//        Arrays.copyOf()

//        while (sc.hasNext())
//        for (int i = 0; i < n.length()/2+1; i++) {
//                    ar[i] = Integer.parseInt(arr[i]);};
//            if (i==n) break;
//            ar[i] = sc.nextInt();}
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("enter the n");
//        System.out.println(ar.length);
//        sc.close();
//        Scanner sc2 = new Scanner(System.in);
//        int m = sc.nextInt();
//        System.out.println(m==0||m>ar.length? "Ошибка ввода" : ar[m-1] );
//        int m = sc.nextInt();
//        System.out.println(ar[m]);
    }}
