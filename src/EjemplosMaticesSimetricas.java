public class EjemplosMaticesSimetricas {
    public static void main(String[] args) {

        //Matriz simétrica: una de las filas es igual a una de las columnas
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 2, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7},
        };

        boolean simetrica = true;

        int i=0;
        int j=0;

        while(i < matriz.length && simetrica == true){
            while(j<matriz[i].length&& simetrica == true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica=false;
                }
                j++;
            }
            i++;
        }


        if(simetrica){
            System.out.println("La matriz es simetrica");
        } else{
            System.out.println("La matriz no es simetrica");
        }

    }
}
