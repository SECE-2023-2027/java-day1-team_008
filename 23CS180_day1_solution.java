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
        System.out.println("Area of circle:" + area);
        System.out.println("Perimeter of circle:" + perimeter);
    }

    public static void program4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM 4");
        System.out.println("Enter two binary numbers:");
        String b1 = sc.next();
        String b2 = sc.next();
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);
        String res = Integer.toBinaryString(n1 + n2);
        System.out.println("Sum of two binary numbers:" + res);

    }

    public static void program5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM 5");
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Binary Number:" + Integer.toBinaryString(n));
    }

    public static void program6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM 6");
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        String hex = Integer.toHexString(n);
        System.out.println("Hexadecimal:" + hex.toUpperCase());
    }

    public static void program7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM 7");
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        String octal = Integer.toOctalString(n);
        System.out.println("Octal:" + octal);
    }
    public static void program8() {
         Scanner sc = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binary = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal number is : " + decimal);
        
    }

    public static void program9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM 9");
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits:" + sum);
    }

    public static void program10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM 10");
        System.out.println("Enter String to reverse:");
        String str = sc.nextLine();
        System.out.println("Reversed String:" + new StringBuilder(str).reverse().toString());
    }

    public static void program11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
    public static void main(String[] args) {
        //program1();
        //program2();
        //program3();
        //program4();
        //program5();
        //program6();
        //program7();
        //program8();
        //program9();
        //program10();
        program11();
    }
}
