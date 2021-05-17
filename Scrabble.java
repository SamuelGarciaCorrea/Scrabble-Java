import java.util.Scanner;

public class Scrabble{
    public static void main(String[] args) {
        
        //inicializar las variables

        Scanner sc = new Scanner(System.in);
        int  numLetrasLista = 0;
        int contador = 0;


              //Ciclo para comprobar que el numero de letras es menor a 27

               while (contador < 1){
                   System.out.println("Digite el numero de letras para las listas");
                   numLetrasLista = sc.nextInt();
                   
                   if(numLetrasLista <= 26){
                       contador ++;
                    }else{ System.out.println("El numero de palabras debe ser menor a 27"); }
                   
                }

               // Inicializar y asignar valores a las listas

               String[] lista1 = new String[numLetrasLista];
               String[] lista2 = new String[numLetrasLista];
               String[] listaAbecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

               //ciclos para asignar aleatoreamente las letras a las listas

               System.out.println("\n"+"Sus listas son"+"\n");
               System.out.println("lista 1:");
               for (int i = 0; i < lista1.length; i++) {
                   double doubleRandom = Math.random()*26;
                   int intRandom = (int)doubleRandom;
                   lista1[i]=listaAbecedario[intRandom]; 
                   //lista1[i]=listaAbecedario[i]; 
                   System.out.print("["+lista1[i]+"] ");
               }System.out.println();
               
               System.out.println("\n"+"lista 2:");
               for (int i = 0; i < lista2.length; i++) {
                   double doubleRandom = Math.random()*26;
                   int intRandom = (int)doubleRandom;
                   lista2[i]=listaAbecedario[intRandom];  
                   //lista2[i]=listaAbecedario[i];  
                   System.out.print("["+lista2[i]+"] ");
               }System.out.println();

               
              String letras;
              for (int i = 0; i < lista1.length; i++){
                letras = "" + lista1[i];
                for(int j = 0; j < lista2.length; j++){
                    letras = letras + lista2[j];
                    System.out.println(letras);
                }
                
            }
                sc.close();   

    }     
}