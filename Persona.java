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
public class Persona {

    public static boolean bol = true;
    public static int valorSi = JOptionPane.YES_NO_OPTION;
    
    //atributos
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String fechaNacimiento;
    private int edad;
    private String cc;
    private String queHace;

    //getters y setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getQueHace() {
        return queHace;
    }

    public void setQueHace(String queHace) {
        this.queHace = queHace;
    }

    //metodo insertar persona
    public void insertarPersona(Persona p) {
        /*
        Envía el objeto persona que va a meter en nodo
        validar que cada uno de los campos se digite correctamente haciendo uso de la expresion regular matches
        */
        String nombres = "", apellidos = "", ciudad = "", direccion = "", fechan = "", cc = "", quehace = "";
        int edad = 0, aux;

        while (nombres.equals("")) {
            nombres = (JOptionPane.showInputDialog("Digite sus nombres"));
            if (!nombres.matches("^[ A-Z a-z]*$")) {
                nombres = "";
            }
        }
        while (apellidos.equals("")) {
            apellidos = (JOptionPane.showInputDialog("Digite sus apellidos"));
            if (!apellidos.matches("^[A-Z a-z]*$")) {
                apellidos = "";
            }
        }
        while (ciudad.equals("")) {
            ciudad = (JOptionPane.showInputDialog("Digite su ciudad"));
            if (!ciudad.matches("^[A-Z a-z]*$")) {
                ciudad = "";
            }
        }
        while (direccion.equals("")) {
            direccion = (JOptionPane.showInputDialog("Digite su dirección de hogar"
                    +"\npuede agregar caracteres alfanumericos,"
                    +"\nsigno numeral (#), guion(-) y slash(/)")); 
            if (!direccion.matches("^[A-Z a-z_ 0-9 #-/]*$")) {
                direccion = "";
            }
        }
        while (fechan.equals("")) {
            fechan = (JOptionPane.showInputDialog("¿fecha de nacimiento?"+"\nATENCION:" 
                    +"\nIngrese en formato DD/MM/AA"
                    +"\nNO se aceptan caracteres"));
            if (!fechan.matches("^[0-9 -/]*$")) {
                fechan = "";
            }
        }
        do {
            try {
                edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
                if (edad > 0 && edad <= 100) {
                    bol = false;
                }
            } catch (NumberFormatException e) {
                bol = true;
            }
        } while (bol);
        
        while (cc.equals("")) {
            cc = (JOptionPane.showInputDialog("número de cedula"));
            if (!cc.matches("^[0-9]*$")) {
                cc = "";
            }
        }
        while (quehace.equals("")) {
            quehace = (JOptionPane.showInputDialog("¿qué vino a hacer?"));
            if (!quehace.matches("^[A-Z a-z]*$")) {
                quehace = "";
            }
        }

        //asigno variables
        p.setNombres(nombres);
        p.setApellidos(apellidos);
        p.setCiudad(ciudad);
        p.setDireccion(direccion);
        p.setFechaNacimiento(fechan);
        p.setEdad(edad);
        p.setCc(cc);
        p.setQueHace(quehace);
    }
}
