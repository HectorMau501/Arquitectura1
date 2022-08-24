
package Memoria;
import java.math.*;
import java.util.Scanner;


public class Main 
{
    public static void main(String [] args)
    {
        
        int opcion = 0;
        double numero = 0;
        double memoriaPotencia = 0;
        String nombreUnidad = "";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\t\t--Hector Mauricio Rodriguez Salazar--21310416--3P");
        System.out.println("\n\t\t\t\tCETI Colomos");
        System.out.println("\n\t\tBienvenido al programa de direccionamiento de memoria");
        
         do{
        System.out.println("\n\tPor favor inserte el tamanio de memoria: ");
        numero = entrada.nextDouble();
            entrada.nextLine();
        System.out.println("\n\tSeleccione la unidad de memoria\n");  
        System.out.println("1. bits (b)");
        System.out.println("2. Bytes (B)");
        System.out.println("3. kiloBytes (kB)");
        System.out.println("4. MegaBytes (MB)");   
        System.out.println("5. GigaBytes (GB)");
        System.out.println("6. TeraBytes (TB)");
        System.out.println("7. PetaBytes (PB)");
        System.out.println("8. Salir de la aplicacion");
        opcion = entrada.nextInt();
                entrada.nextLine();
       
            switch(opcion)
            {
                case 1:
                    memoriaPotencia = numero/8;
                    nombreUnidad = "bits (b)";
                    break;
                    
                case 2:
                    memoriaPotencia = Math.pow(2, 0);
                    nombreUnidad = "Bytes (B)";
                    break;
                    
                case 3:
                    memoriaPotencia = Math.pow(2, 10);
                    nombreUnidad = "kiloBytes (kB)";
                    break;
                    
                case 4:
                    memoriaPotencia = Math.pow(2,20);
                    nombreUnidad = "MegaBytes (MB)";
                    break;
                    
                case 5:
                    memoriaPotencia = Math.pow(2,30);
                    nombreUnidad = "GigaBytes (GB)";
                    break;
                    
                case 6:
                    memoriaPotencia = Math.pow(2,40);
                    nombreUnidad = "TeraBytes (TB)";
                    break;
                    
                case 7:
                    memoriaPotencia = Math.pow (2,50);
                    nombreUnidad = "PetaBytes (PB)\n";
                    break;
                                
                default:System.out.println("Inserto un numero que no es el correcto, por favor vuelva a intentar:)");
            }
            
            System.out.println("\n\tSe necesita "+numero+"  "+nombreUnidad+"  \n\n");
            System.out.println("\t--bits que se necesitan para el direccionamiento--");    
            double potencia = Math.log(numero/8)/ Math.log(2);
            System.out.println("\t2^"+potencia);
            
            System.out.println("\t--Bytes que se necesitan para el direcionamiento--");

            double potenciaBytes = Math.log(numero)/ Math.log(2);
            System.out.println("\t2^"+potenciaBytes);
            
             }while(opcion != 8);
               
    }
      
}
