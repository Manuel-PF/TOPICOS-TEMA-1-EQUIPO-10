package EntradaSalida;

import TDA.Alumno;
import javax.swing.JOptionPane;


public class Almacenar {
	
	private Alumno alu[];
	private byte i = 0;
	
	public Almacenar(int tam) {
		alu = new Alumno[tam];
		i = -1;
	}
	
	public boolean arregloVacio() {
		return i == -1;
	}
	
	//public boolean arregloLleno(int limite) {
		//return i <= limite;
	//}
	
	private Alumno crearAlumno() {
		Alumno aux = new Alumno();
		aux.setNombre(Tools.validaName("Escribe el nombre del Alumno"));
                aux.setNumCtrl(Tools.validaCtrl("Ingrese el Numero de Control"));
		aux.setEdad(Tools.validaEdad());
		aux.setSemestre(Tools.validaSemestre());
                
		return aux;
	}
	
	public void agregarAlumno() {
		if(i < alu.length) {
			alu[(i + 1)] = crearAlumno();
			i++;
		}
		else {
			System.out.println("Array Lleno");
		}
	}
	
	public void verAlumno() {
		byte j;
		String cad = "";
		for(j = 0; j <= i; j++) {
			cad+= alu[j].toString() + "\n";
		}
		System.out.println("Datos del Array: \n" + cad);
	}
        public void compararNc(){
         if(arregloVacio()){
       JOptionPane.showMessageDialog(null,"El arreglo esta vacio"); 
    
    }else{
      int j = 0, k = 0;
            Alumno aux = new Alumno();
            int ctr1 = 0, ctr2 = 0;
            
            
            for(k = 0; k < i; k++){
                for(j= k + 1; j <= i; j++){
                    ctr1= Integer.parseInt(alu[k].getNumCtrl());
                    ctr2= Integer.parseInt(alu[j].getNumCtrl());
                    
                    if(ctr1 < ctr2){
                        aux = alu[k];
                        alu[k] = alu[j];
                        alu[j] = aux;
                    }
                }
            }
            
        }
        
}
}