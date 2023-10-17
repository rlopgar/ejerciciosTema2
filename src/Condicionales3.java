import java.util.Scanner;

public class Condicionales3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        double num1=scan.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double num2=scan.nextDouble();

        scan.close();

        double division=num1/num2;

        if(num2==0){
            System.out.println("Error");
        }
        else{
            System.out.println(division);
        }
    }

}
