package f_21_Conector;
import java.util.Scanner;

public class GestorCiclos extends ModeloCiclos {

Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) { 
    GestorCiclos gc = new GestorCiclos();
    gc.menu();
    }

    // Me salió bien todo, hasta que se añadió los ArrayList...
    public void menu() {
        String op = null;
        do{
            System.out.println("---- Menu Ciclo ----");
            System.out.println("");
            System.out.println("1. Listar");
            System.out.println("2. Crear");
            System.out.println("3. Actualizar");
            System.out.println("4. Borrar");
            System.out.println("\"s\" Salir");
            System.out.println("Escriba el numero de su eleccion:");
            op = teclado.next();
    
            switch(op){
                case "1" -> this.index();
                case "2" -> this.create();
                case "3" -> this.update();
                case "4" -> this.delete();
            }
        //while (!"s".equals(op));
        } while (!"s".equals(op));
     
    }

    //? Metodos CRUD del menú
    
    private void index() { // READ
        System.out.println("Lista de ciclos...");

        this.consulta();
       for(Ciclo ciclotemp : this.carteraCiclos){
           System.out.println(ciclotemp.getId() + "." + ciclotemp.getNombre());  
       } 
    }

    private void create() { // CREATE
        System.out.println("Creando ciclos...");
    } 

    private void update(){ // UPDATE
        System.out.println("Actualizando ciclos...");
    }

    private void delete(){ // DELETE
        System.out.println("Borrando ciclos...");
    }
}