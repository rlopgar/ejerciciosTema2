import java.util.Scanner;

public class Condicionales4 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base=scan.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente=scan.nextInt();

        scan.close();

        double potencia=Math.pow(base,exponente);

        if (exponente>0){
            System.out.println("El resultado de la potencia es: "+potencia);
        }
        else if(exponente==0){
            System.out.println("El resultado de la potencia es 1");
        }
        //La tercera opción no sé hacerla y no quiero recurrir a chatgpt
    }
}
