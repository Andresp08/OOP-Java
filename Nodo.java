/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

/**
 *
 * @author Andrés.
 */
public class Nodo {
    private Persona persona; //aqui definimos el objeto
    private Nodo nodo;

    //constructor
    public Nodo() {
        persona = new Persona(); //aquí creamos la instancia
        //hecho esto ya podemos contar con los metodos de la clase persona
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }  
}
