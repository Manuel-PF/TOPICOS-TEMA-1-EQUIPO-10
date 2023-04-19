
package TDA;

import TDA.Alumno;
import java.util.ArrayList;

public class ListaAlumnos{
   
    
    private ArrayList lista = new <Alumno>ArrayList();
    
     public ListaAlumnos(){
           ArrayList lista = new <Alumno>ArrayList(); 
     }
    public void añadir (Alumno p){
        lista.add(p);      
}
    public void eliminar(int pos){
            lista.remove(pos);
}
   public void eliminarTodo(){
   lista.removeAll(lista);
}
}
