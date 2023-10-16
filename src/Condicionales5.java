import java.util.Scanner;

public class Condicionales5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Introduce el numero de alumnos: ");
        int numAlumnos=scan.nextInt();

        scan.close();

        if (numAlumnos>=100){
            int precioAlumno=65;
            int pagoCompania=numAlumnos*precioAlumno;
            int costoCompania=0;
            System.out.println("El costo de cada alumno es "+precioAlumno+" euros, el costo de los autobuses es "+costoCompania+" euros y los pagos totales a la compañia es "+pagoCompania+" euros");
        }
            else if(numAlumnos>=50 && numAlumnos<=99){
                int precioAlumno=70;
                int pagoCompania=numAlumnos*precioAlumno;
                int costoCompania=0;
                System.out.println("El costo de cada alumno es "+precioAlumno+" euros, el costo de los autobuses es "+costoCompania+" euros y los pagos totales a la compañia es "+pagoCompania+" euros");
            }
                else if(numAlumnos>=30 && numAlumnos<=49){
                    int precioAlumno=95;
                    int pagoCompania=numAlumnos*precioAlumno;
                    int costoCompania=0;
                    System.out.println("El costo de cada alumno es "+precioAlumno+" euros, el costo de los autobuses es "+costoCompania+" euros y los pagos totales a la compañia es "+pagoCompania+" euros");
                }
                    else if(numAlumnos<=29){
                        int costoCompania=4000;
                        int precioAlumno=costoCompania/numAlumnos;
                        int pagoCompania=(numAlumnos*precioAlumno)+costoCompania;
                        System.out.println("El costo de cada alumno es "+precioAlumno+" euros, el costo de los autobuses es "+costoCompania+" euros y los pagos totales a la compañia es "+pagoCompania+" euros");
                    }
    }
}
