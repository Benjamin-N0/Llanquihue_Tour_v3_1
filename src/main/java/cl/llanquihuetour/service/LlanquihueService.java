package cl.llanquihuetour.service;
import cl.llanquihuetour.model.RutaTuristica;
import java.util.ArrayList;

public class LlanquihueService {
    private ArrayList<RutaTuristica> rutas;

//recibe el ArrayList del LectorArchivo        
public LlanquihueService(ArrayList<RutaTuristica> rutas){
    this.rutas = rutas;
}

//Listar todo guias y rutas
public void listarRutas() {
  if (rutas.isEmpty()) {
      System.out.println("No hay rutas turísticas cargadas.");
    }else{
      for(RutaTuristica ruta : rutas) {
          System.out.println(ruta);
            }
        }
}

//filtro para un presupuesto maximo
public void buscarPorPresupuestoMaximo(int presupuestoMaximo){
    boolean encontrado = false;
    
    for(RutaTuristica ruta : rutas){
        if(ruta.getPrecio() <= presupuestoMaximo){
            System.out.println(ruta);
            encontrado = true;
        }
    }
    
    //mensaje en caso de no tener el preupuesto suficiente
    if(!encontrado){
        System.out.println("No se encontraron rutas con un precio menor o igual a $" + presupuestoMaximo);
    }
    
}


}
