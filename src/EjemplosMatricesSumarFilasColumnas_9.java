/*
Sumar las filas con las columnas de una misma matriz
 */
public class EjemplosMatricesSumarFilasColumnas_9 {
    public static void main(String[] args) {

        int[][] a= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sumaFila, sumaColumna;

        for(int i = 0; i<a.length; i++){
            sumaFila=0;
            sumaColumna=0;
            for(int j= 0; j< a[i].length; j++){
                sumaFila+=a[i][j];
                sumaColumna+=a[j][i];// aca seria la transpuesta p
             }
            System.out.println("total fila " + i +": "+sumaFila);
            System.out.println("total columna " + i +": "+sumaColumna);
        }


    }
}
/*
El chiste esta en que siempre vamos a sumar horizontalmente entonces
para sacar el número de columnas, tengo que hacer la transpuesta de mi matriz,
y recorrerle las fila. Ya que las filas de mi transpuesta son las columnas de mi matriz original.

 */