import java.util.Scanner;

public class Condicionales7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el numero destino:\n1-America del norte\n2-America Central\n3-America del Sur\n4-Europa\n5-Asia");
        int pais=scan.nextInt();
        System.out.println("Introduce el peso en kg");
        double peso=scan.nextDouble();

        scan.close();

        double precio=0.0f;

        if(pais==1&&peso<=5){
            precio=peso*24.00f;
        }
        else if(pais==2&&peso<=5){
            precio=peso*20.00f;
        }
        else if(pais==3&&peso<=5){
            precio=peso*21.00f;
        }
        else if(pais==4&&peso<=5){
            precio=peso*10.00f;
        }
        else if(pais==5&&peso<=5){
            precio=peso*18.00f;
        }
        else{
            System.out.println("No admitimos equipaje mayor a 5kg");
        }

        System.out.println("El coste del transporte del paquete son "+precio+" euros");
    }
}
