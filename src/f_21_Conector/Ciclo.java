package f_21_Conector;

public class Ciclo {
        String nombre;
        int id;
    //Constructor de ciclo
    Ciclo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Setters and getters de Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Setters and getters de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}