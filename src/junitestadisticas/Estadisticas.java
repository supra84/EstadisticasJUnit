/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitestadisticas;

import java.util.ArrayList;

/**
 * 
 * @author Jorge Reina
 */

public class Estadisticas {
   
    ArrayList <Integer> array;
    
    public Estadisticas(){
        array = new ArrayList <>();
    }
    
   /**
    * 
    * @param datos Arraylist de String con notas de alumnos 
    * @return String con la media calculada o un mensaje de error
    */
    
    String calcularMedia(ArrayList <String> datos){
        int resultado=0;
        
        for(String dato: datos){
            array.add(Integer.parseInt(dato));
        }
        if(array.size() <= 5 || array.size() > 20 ){
            array.clear();
            return "Error. Las aulas son de 5 a 20 alumnos";
        }
        
        for(int i=0;i<array.size();i++){
            resultado += array.get(i);
        }
        resultado /= array.size();
        array.clear();
        return ""+resultado;
        
    }
    
}
