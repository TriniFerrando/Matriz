public class EjemplosMatricesTranspuesta_7 {
    public static void main(String[] args) {

        //Matriz transpuesta
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };


        //imprimo la matriz
        System.out.println("Matriz original:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();
        }


        //La convierto en su transpuesta (la doy vuelta, filas por columnas)
        int aux;
        for(int i=1; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                aux= matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[j][i] = aux;
            }

        }

        System.out.println("Matriz transpuesta:");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}