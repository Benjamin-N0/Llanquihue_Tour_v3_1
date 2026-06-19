package cl.llanquihuetour.model;

public class RutaTuristica {
    
    //atributos de la clase RutaTuristica
    
    private String nombreruta;
    private int precio;
    
    //composicion: la ruta tiene un guia asignado
    private Guia guia;

        /**
     * Constructor de la clase RutaTuristica.
     * 
     * @param nombreruta nombre de la ruta
     * @param precio precio de la ruta
     * @param guia guia asociado a la ruta
     */
    
    public RutaTuristica(String nombreruta, int precio, Guia guia) {
        this.nombreruta = nombreruta;
        this.precio = precio;
        this.guia = guia;
    }

    //getter y setter
    
    public String getNombreruta() {
        return nombreruta;
    }

    public void setNombreruta(String nombreruta) {
        this.nombreruta = nombreruta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

@Override
public String toString(){
return "Ruta: " + nombreruta + " | Precio: $" + precio + guia;
}
    

    
    
}
