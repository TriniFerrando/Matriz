/*
Es una matriz cuadrada con todos sus elementos en la diagonal
principal iguales a 1 y el resto de sus elementos iguales a 0.
 */
public class EjemplosMatricesIdentidad_10 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        //la diagonal es cuando tienen el mismo número de fila y columna
        for(int i =0; i< matriz.length; i++){
            for(int j=0; j< matriz[i].length;j++){
                if(i==j){ //ismo número de fila y columna
                    matriz[i][j]=1;
                }
            }
        }

        for(int i =0; i< matriz.length; i++){
            for(int j=0; j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }



}
