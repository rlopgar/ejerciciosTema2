import java.util.Scanner;

public class Condicionales6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Introduce el dia (1=Domingo,2=Lunes...): ");
        int dia=scan.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos=scan.nextInt();
        System.out.println("Introduce el turno (1=Mañana,2=Tarde): ");
        int turno=scan.nextInt();


        scan.close();

        double precio=0.0f;

        if (minutos<=5){
            precio=minutos*1;
        }
        else if(minutos>5&&minutos<=8){
            precio=5+(minutos-5)*0.8f;
        }
        else if(minutos>8&&minutos<=10){
            precio=7.4f+(minutos-8)*0.7f;
        }
        else if(minutos>10){
            precio=9.4f+(minutos-10)*0.5f;
        }

        double precioImpuesto=0.0f;

        if(dia==1){
            precioImpuesto=precio*0.03f;
        }
        else {
            if (turno == 1) {
                precioImpuesto = precio * 0.15;
            }
            else {
                precioImpuesto = precio * 0.10f;
            }
        }

        double precioTotal=precioImpuesto+precio;

        System.out.println("El precio de los impuestos es "+precioImpuesto+" y el precio total es "+precioTotal);
    }
}
