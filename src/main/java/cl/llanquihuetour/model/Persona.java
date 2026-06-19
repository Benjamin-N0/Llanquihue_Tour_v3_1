package cl.llanquihuetour.model;

/**
 * Representa una persona relacionada con Llanquihue Tour
 */

public class Persona {

//atributos del guia
private String nombre;
private String rut;

    /**
     * Constructor de la clase Persona.
     * 
     * @param nombre nombre del guia
     * @param rut RUT del guia
     */
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    
//getter y setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    

@Override
public String toString(){
return " | Nombre De Guia: " + nombre + " | rut: " + rut;
}
}
