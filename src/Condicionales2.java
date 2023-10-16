import java.util.Scanner;

public class Condicionales2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Introduce un año: ");
        int ano=scan.nextInt();

        scan.close();

        if(ano%4==0){
            System.out.println(ano+" es bisiesto");
        }
            else{
                System.out.println(ano+" no es bisiesto");
            }
    }
}
