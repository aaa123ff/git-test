import java.util.Scanner;



public class test {
    public static void main(String[] args) {
//       System.out.println("请输入Int");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
         System.out.println(n);
//
//        System.out.println("请输入double");
//        double dou = input.nextDouble();
//        System.out.println(dou);

        System.out.println("请输入String");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();
        String str4 = input.nextLine();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
