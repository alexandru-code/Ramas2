public class Persona {
    String nombre;
    int edad;

    //contructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString(){
        return this.nombre + " - " + this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
