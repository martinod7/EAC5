/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioc.eac5;

import ioc.eac5.interfaz.Menu;


/**
 * Clase principal que da inicio al programa
 *
 * @author Lorenzo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Principal programa = new Principal();

        programa.inicio();


        //Salida.menuPrincipal();
        //prueba1.añadirDerrama();
        //prueba1.listarDerrama();
        //prueba1.modificarDerramas();
        //prueba1.tipoDerrama();

        //Salida.menuPrincipal();
        //prueba1.añadirDerrama();
        //prueba1.modificarDerramas();


        //Salida.menuPrincipal();

    }

    public void inicio() {
        Menu.bienvenida();
        Menu.menuPrincipal();        
    }

}
