/*
Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz
y utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el tamaño
de la letra para imprimir en una matriz de n x n.
El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
Por ejemplo para n=5 se obtiene:
X___X
_X_X_
__X__
_X_X_
X___X
Por ejemplo para n=6 se obtiene:
X____X
_X__X_
__XX__
__XX__
_X__X_
X____X
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa
 */


import java.util.Scanner;

public class PracticaImprimirUnaX {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in) ;

       System.out.println("Ingrese el valor de n: ");
       int n= scanner.nextInt();
        int n_aux = n;


       while(n_aux != 0){
           String a[][] = new String[n][n];

           String var1= "X";
           String var2= "_";

           for(int i = 0; i<a.length; i++){
               for(int j = 0; j< a[i].length; j++){
                   if(i==j || i==0 ||i==a.length-1 || j==0 || j==a[i].length-1){
                       a[i][j]=var1;
                   }else{
                       a[i][j]=var2;
                   }
               }
           }

           for(int i = 0; i<a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                   System.out.print(a[i][j]+ "\t");
               }
               System.out.println();
           }

           System.out.println("Ingrese el valor de n: ");
           n= scanner.nextInt();
           n_aux = n;



       }
        System.out.println("ERROR");



    }
}





