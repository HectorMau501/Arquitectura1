
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
        double exponente = 0;
        String nombreUnidad = "";
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\t\t--Hector Mauricio Rodriguez Salazar--21310416--3P");
        System.out.println("\n\t\t\t\tCETI Colomos");
        System.out.println("\n\t\tBienvenido al programa de direccionamiento de memoria");
        
         do{
        System.out.println("\n\tPor favor inserte el tamanio de memoria: ");
        numero = entrada.nextDouble(); //Aqui se guarda el tamaño de la memoria
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
                entrada.nextLine(); //Para que no me produzca error
       
            switch(opcion)
            {
                case 1:
                    memoriaPotencia = numero/8; //Se calcula la magnitud
                    nombreUnidad = "bits (b)"; //Se imprime el tipo de la variable 
                    break;
                    
                case 2:
                    exponente = Math.pow(2, 0);
                    memoriaPotencia = numero * exponente;
                    nombreUnidad = "Bytes (B)";

                    break;
                    
                case 3:
                    exponente = Math.pow(2, 10);
                    memoriaPotencia = numero * exponente;
                    nombreUnidad = "kiloBytes (kB)";
                    break;
                    
                case 4:
                    exponente = Math.pow(2,20);
                    memoriaPotencia = numero * exponente;
                    nombreUnidad = "MegaBytes (MB)";
                    break;
                    
                case 5:
                    exponente = Math.pow(2,30);
                    memoriaPotencia = numero * exponente;
                    nombreUnidad = "GigaBytes (GB)";
                    break;
                    
                case 6:
                    exponente = Math.pow(2,40);
                    memoriaPotencia = numero * exponente;
                    nombreUnidad = "TeraBytes (TB)";
                    break;
                    
                case 7:
                    exponente = Math.pow (2,50);
                    memoriaPotencia = numero * exponente;
                    nombreUnidad = "PetaBytes (PB)\n";
                    break;
                                
                default:System.out.println("Inserto un numero que no es el correcto, por favor vuelva a intentar:)");
            }
                      
            System.out.println("\n\tSe necesita "+numero+"  "+nombreUnidad+"  \n\n");
            System.out.println("\t--bits que se necesitan para el direccionamiento--");    
            double potencia = Math.log(memoriaPotencia/8)/ Math.log(2); //Se hace el calculo del tamaño de la direccion
            System.out.println("\t2^"+potencia);//Se imprime
            
            System.out.println("\t--Bytes que se necesitan para el direcionamiento--");

            double potenciaBytes = Math.log(memoriaPotencia)/ Math.log(2);
            System.out.println("\t2^"+potenciaBytes);
            
             }while(opcion != 8);
               
    }
      
}
