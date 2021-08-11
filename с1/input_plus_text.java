import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.nextLine();
        String sss = sc.nextLine();
        System.out.println("Привет, " + s + ", это твой помощник " + ss +".\nУ тебя "+sss+" новых писем.");
    }
}