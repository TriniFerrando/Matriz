public class EjemplosMatricesColumnasVariable_4 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][]; //las columnas son variables

        //Defino las columnas
        matriz[0]= new int[2]; //la fila 0 va a tener un tamaño de 2 columnas
        matriz[1]= new int[3];//la fila 1 va a tener un tamaño de 3 columnas
        matriz[2]= new int[4];//la fila 2 va a tener un tamaño de 4 columnas

        System.out.println("Largo de la matriz:" + matriz.length);
        System.out.println("La fila 0 tiene " + matriz[0].length + " columnas");
        System.out.println("La fila 1 tiene " + matriz[1].length + " columnas");
        System.out.println("La fila 2 tiene " + matriz[2].length + " columnas");


        for(int i=0; i< matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
                // resultado de la multiplicación de los índices de fila (i) y columna (j)
            }
        }

        //Imprimir en forma de matriz
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+ "\t"); //ACA USAMOS .PRINT Y NO .PRINTLN
            }
            System.out.println();
        }


    }
}
