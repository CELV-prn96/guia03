/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author usuario
 */
@LocalBean
@ Dependent
public class  Utilities  implements  Serializable{

    
    /**
     * 
     * @param texto 
     * @return  Recoge los 20 primeras letras,espacios y numeros de una determinada frase
     */
    public static   String  GetResume(String texto){
       int letra;
        String cadenatexto="";
        String frase;
        char letras=' ';
        for (letra=0;letra<20;letra++){
             letras = texto.charAt(letra);
              frase= String.valueOf(letras);
             cadenatexto=cadenatexto+letras;
        }
        texto=cadenatexto;
       
     return texto;
    }
    /**
     * 
     * @param texto
     * @return  Retorna los caracteres del texto ingresado y los convierte en minusculas
     */
    public  static String Capitalizar(String texto){
        int letra;
        int siguiente;
        char[] caracteres = texto.toCharArray();
 
        for (letra = 0; letra < texto.length(); letra++) {
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            if (caracteres[letra] == ' ') {
                caracteres[letra + 1] = Character.toLowerCase(caracteres[letra + 1]);
            }
        }
        texto = String.valueOf(caracteres);
        texto = (texto.replace("  ", " "));
        
return texto;
        
        
    }
   /**
    * 
    * @param frase recoge una frase cualquiera
    * @param texto cuenta las concidencias del texto ingresado
    * @return 
    */
     public static int contarCoincidencias(String frase, String texto) { 
        int cont = 0;

        while (frase.indexOf(texto) > -1) {
            frase = frase.substring(frase.indexOf(texto) + texto.length(), frase.length());
            cont++;
        }
        return cont;
    }
    
    
    
    
}
