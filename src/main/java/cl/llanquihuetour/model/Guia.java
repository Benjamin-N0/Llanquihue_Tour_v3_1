package cl.llanquihuetour.model;

/**
 * Representa un guia de Llanquihue tour.
 * Hereda de la clase Persona.
 */
public class Guia extends Persona {

//atributo del guia
private String especialidad;

    /**
     * Constructor de la clase Guia.
     * 
     * @param nombre nombre del guia
     * @param rut RUT del guia
     * @param especialidad  en que se especializa el guia
     */

public Guia(String nombre, String rut, String especialidad){
super(nombre, rut);
this.especialidad = especialidad;
}

// getter y setter

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

@Override
public String toString(){
return super.toString() + " | Especialidad: " + especialidad;
}
}
