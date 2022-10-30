
package pkgfinal;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        
         System.out.println("MENU");
        System.out.println("1) Ejercicio 1");
        System.out.println("2) Ejercicio 2");
        System.out.println("3) Ejercicio 3");
        System.out.println("ingrese la opcion: ");
         Scanner sc1 = new Scanner(System.in);
           int Menu = sc1.nextInt();
   
        switch(Menu) {
             case 1:
     System.out.println("ingrese primer numero: ");
        Scanner sc = new Scanner(System.in);
         
           double numero = sc.nextDouble();
                System.out.println("ingrese segundo numero: ");
           double numero1 = sc.nextDouble();
                 if (numero > numero1) {
                     System.out.println("El numero mayor es: ");
                     System.out.println(numero);
                 }
                 else {
                              System.out.println("El numero mayor es: ");
                  System.out.println(numero1);
                 }
           break;
             case 2:

          Scanner s = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
             
        int Filas = s.nextInt();
              
         if (Filas%2!=0) {
             int contador = 0;
             for (int i = 1; i < Filas; i++) {
                 if (i%2 == 0) {
                    contador++;
                 }
                 
             }
               Filas = Filas-contador;
            
        System.out.println();
        for(int i = 1; i<=Filas; i++){

            for(int j = 1; j<=Filas-i; j++){
                System.out.print(" ");  // dejando espacios a las esquinas
            }
 
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print("*"); //colocando
            }
            System.out.println();
        }
         }
                 break;
           case 3:
        System.out.println("1) para 8 vacas");
       System.out.println("2) para 10 vacas");
          System.out.println("ingrese cual desea ver resultados: ");
               Scanner sc3 = new Scanner(System.in);
           int o = sc3.nextInt();
           int numeroDeVacas = 0;
           int pesoLimite=0;
           switch (o) {
               case 1: 
                   //4 parámetros
                   pesoLimite = 1000;
                   numeroDeVacas = 8;
                   int pesos[] = {223,243,100,200,200,155,300,150};
                   int PLeche [] = {30,34,28,45,31,50,29,1};
                        int sumaPeso = 0;
                        int sumaProduccion = 0;
                   for (int i = 0; i < pesos.length; i++) {
                   sumaPeso = pesos[i]+sumaPeso;
                   }
               for (int i = 0; i < pesos.length; i++) {
                   sumaProduccion = PLeche[i]+sumaProduccion;
                   }
                   System.out.println("Total de vacas: "+numeroDeVacas);
                   System.out.println("peso total: "+sumaPeso+" kg");
                     System.out.println(sumaPeso+" kg"+" > "+pesoLimite+" kg del maximo del camion");
                  System.out.println("Produccion total de leche: "+sumaProduccion); 
                   break;
               case 2:
                   //4 parámetros
                   pesoLimite = 2000;
                   numeroDeVacas = 10;
                   int pesos1[] = {340,355,223,243,130,240,260,155,302,130};
                   int PLeche1 [] = { 45,50,34,39,29,40,30,52,31,1};
                        int sumaPeso1 = 0;
                        int sumaProduccion1 = 0;
                   for (int i = 0; i < pesos1.length; i++) {
                   sumaPeso1 = pesos1[i]+sumaPeso1;
                   }
               for (int i = 0; i < pesos1.length; i++) {
                   sumaProduccion1 = PLeche1[i]+sumaProduccion1;
                   }
                   System.out.println("Total de vacas: "+numeroDeVacas);
                   System.out.println("peso total: "+sumaPeso1+" kg");
                     System.out.println(sumaPeso1+" kg"+" > "+pesoLimite+" kg del maximo del camion");
                  System.out.println("Produccion total de leche: "+sumaProduccion1);
                   
                   break;
           
           }
   
              
               break;
        }
    }
    
}
