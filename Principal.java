/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés.
 */
public class Principal {

    private static Nodo raiz = null;
    private static Nodo cola = null;
    //metodo para insertar colas

    //metodo para añadir persona
    public static void añadirC() {
        Nodo nuevo = new Nodo();
        Persona x = new Persona();
        x.insertarPersona(x);
        nuevo.setPersona(x);
        if (raiz == null) { 
            raiz = cola = nuevo;
        } else {
            cola.setNodo(nuevo);
            cola = nuevo;
        }
    }

    //metodo para mostrar
    public static void atender(Nodo reco) {
        System.out.print("\nDATOS DE LA(S) PERSONA(S):\n");
        while (reco != null) {
            System.out.print("\nNOMBRES: " + reco.getPersona().getNombres() + "\nAPELLIDOS: " + reco.getPersona().getApellidos()
                    + "\nCIUDAD: " + reco.getPersona().getCiudad() + " \nDIRECCIÓN: " + reco.getPersona().getDireccion() + "\nFECHA DE NACIMIENTO: "
                    + reco.getPersona().getFechaNacimiento() + "\nEDAD: " + reco.getPersona().getEdad() + "\nCC: " + reco.getPersona().getCc()
                    + "\nVINO A: " + reco.getPersona().getQueHace());
            System.out.println("");
            reco = reco.getNodo();
        }
    }

    public static void main(String[] args) {
        int opcion = 0, valorSi = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú principal, escoja\n\n"
                        + " 1. Insertar Persona\n"
                        + " 2. Salir"));
                switch (opcion) {
                    case 1:
                        añadirC();
                        do {
                            valorSi = (JOptionPane.showConfirmDialog(null, "¿Hay otra persona en la cola?", "CUIDADOO", valorSi));
                            if (valorSi == JOptionPane.YES_OPTION) {
                                añadirC();
                            }else{
                                atender(raiz);
                                opcion=2;
                            }
                        } while (valorSi == JOptionPane.YES_OPTION);
                        break;
                    case 2:
                        opcion = 2;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta, intente de nuevo");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion != 2);

    }
}
