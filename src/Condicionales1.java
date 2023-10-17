import java.util.Scanner;

public class Condicionales1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        double numero = scan.nextDouble();

        scan.close();

        if(numero%2==0){
            System.out.println(numero+" es par");
        }
        else{
            System.out.println(numero+" es impar");
        }
    }
}
