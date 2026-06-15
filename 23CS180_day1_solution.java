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
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Hello" + " " + s);
    }
    public static void program3() {
        System.out.println("PROGRAM 3");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area of circle:"+area);
        System.out.println("Perimeter of circle:"+perimeter);
    }
    public static void main(String[] args) {
        //program1();
        //program2();
        program3();
    }
}
