/*
Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula) construida a
base del numero 1 y utilizar el numero 0 como espacio. El tamaño de la silla se basa en una variable n que
indicará el tamaño de la figura a imprimir en una matriz de n x n.
Por ejemplo para n=5 se obtiene:

10000
10000
11111
10001
10001
Por ejemplo para n=6 se obtiene:

100000
100000
100000
111111
100001
100001
Por ejemplo para n=10 se obtiene:

1000000000
1000000000
1000000000
1000000000
1000000000
1111111111
1000000001
1000000001
1000000001
1000000001
Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
 */


import java.util.Scanner;

public class PracticaImprimirUnaSilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Ingrese el valor de n: ");
        int n= scanner.nextInt();
        int n_aux = n;


        while(n_aux != 0){
            int a[][] = new int[n][n];



            for(int i = 0; i<a.length; i++){
                for(int j = 0; j< a[i].length; j++){
                    if((j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)){
                        a[i][j]=1;
                    }

                }
            }

            for(int i = 0; i<a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
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

