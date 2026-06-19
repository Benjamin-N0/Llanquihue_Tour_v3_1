package cl.llanquihuetour.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import cl.llanquihuetour.model.Guia;
import cl.llanquihuetour.model.RutaTuristica;

/**
 *Clase para leer la informacion de un archivo de texto
 */

public class LectorArchivo {

//carga la informacion desde un archivo
 public ArrayList<RutaTuristica> cargarrutas(String rutaArchivo){
 ArrayList<RutaTuristica> rutas = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
    
    String linea;
    
    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(";");
        
        if (datos.length == 5) {
        String nombreruta = datos[0];
        int precio = Integer.parseInt(datos[1]);
        String nombre = datos[2];
        String rut = datos[3];
        String especialidad = datos[4];
        
        Guia guia = new Guia(nombre, rut, especialidad);
        RutaTuristica ruta = new RutaTuristica(nombreruta, precio, guia);
        
        rutas.add(ruta);
        
        }else{
            System.out.println("Línea con formato incorrecto: " + linea);
        }
    }
    }catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
 
 return rutas;
 }
    
    
    
    
    
}
