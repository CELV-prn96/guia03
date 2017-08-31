/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;


/**
 *
 * @author usuario
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
    
    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class)
                .addClass(Utilities.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }

    
     @Inject
    private Utilities servicio;
     
   @Test
   public void ProbarMetodoGetResume(){
       String textoEsperado="bienvenidos al aula ";
       String textoIngresado="bienvenidos al aula de computacion";
       String resultado= servicio.GetResume(textoIngresado);
        Assert.assertEquals(textoEsperado, "bienvenidos al aula ");
   }
    @Test
   public void ProbarMetodoCapitalizar(){
       String textoEsperado="probando el metodo de capitalizar";
       String textoIngresado="Probando El Metodo De Capitalizar";
        String resultado = servicio.Capitalizar(textoIngresado);
        Assert.assertEquals(textoEsperado, "probando el metodo de capitalizar");
       
       
       
       
   }
   public void probarMetodoContar() {
        int contadoresperado= 2;
        String texto="  el deporte cambia vidas, la programacion genera vida, y la vida hay que vivirla   ";
        String Cadena = "vida";
        int resultado = servicio.contarCoincidencias(Cadena, texto);
        Assert.assertEquals(contadoresperado, resultado);
    }
    
    
}
