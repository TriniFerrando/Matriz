public class EjemplosMatricesBuscarElemento_5 {
    public static void main(String[] args) {
        int[][] numero = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoBuscado= 15;
        boolean encontrado=false;
        int i=0;
        int j=0;

        buscar: for( i=0; i<numero.length; i++){
            for ( j=0; j< numero[i].length; j++){
                if (numero[i][j]==elementoBuscado) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("encontrado "+elementoBuscado+ " en las coordinadas "+i+", "+j );
        }


    }
}
