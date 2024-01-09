public class EjemplosMatricesStringForVersion2_3 {
    public static void main(String[] args) {
        String [][] nombres = {{"Pepe","Pedro"}, {"Maria","Josefa"}, {"Trini","Fran" } };

        System.out.println("Usando for:");
        for(int i=0; i<nombres.length; i++){ //recorre la fila
            for(int j=0; j<nombres[i].length; j++){ // recorre la columna
                System.out.println(nombres[i][j]+ "\t");
            }
            System.out.println();
        }


        System.out.println("Usando for each:");
        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.println(nombre + "\t");
            }
            System.out.println();
        }


    }
}
