import java.util.Scanner;
class day1_solution{
    public static void program2() {
        System.out.println("PROGRAM 2");
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void program1() {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("Hello"+" "+s);
    }
    public static void main(String[] args) {
        //program1();
        program2();
    }
}
