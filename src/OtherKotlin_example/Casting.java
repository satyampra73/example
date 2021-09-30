import java.util.Scanner;
public class Casting {
    public static void main(String[] args) {
        Scanner likho=new Scanner(System.in);
        int n;
        double f;
        System.out.println("Enter any number");
        f=likho.nextFloat();
        n=(int)f;
        if(n==f){
            System.out.println("The number is Integer");
        }
        else
            System.out.println("The number is float");

    }

}
