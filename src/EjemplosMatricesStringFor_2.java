public class EjemplosMatricesStringFor_2 {
    public static void main(String[] args) {
        String [][] nombres = new String[3][2];
        nombres[0][0]="Pepe";
        nombres[0][1]= "Pedro";
        nombres[1][0]= "Maria";
        nombres[1][1]="Josefa";
        nombres[2][0]="Trini";
        nombres[2][1]= "Fran";

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
