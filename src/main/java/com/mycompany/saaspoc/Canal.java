package com.mycompany.saaspoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1259a
 */
public class Canal {
    private int ID;
    private String Nombre;
    private String Tipo;

    public Canal(int ID, String Nombre, String Tipo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public void Configurar() {
        // Lógica para configurar el canal
    }

    public void EnviarNotificacion() {
        // Lógica para enviar notificación
    }

    // Getters y Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
