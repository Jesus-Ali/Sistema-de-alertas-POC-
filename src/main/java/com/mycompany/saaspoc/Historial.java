package com.mycompany.saaspoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1259a
 */
import java.util.Date;

public class Historial {
    private int ID;
    private int UsuarioID;
    private Date Fecha;

    public Historial(int ID, int UsuarioID, Date Fecha) {
        this.ID = ID;
        this.UsuarioID = UsuarioID;
        this.Fecha = Fecha;
    }

    public void Monitorear() {
        // Lógica para monitorear historial
    }

    // Getters y Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUsuarioID() {
        return UsuarioID;
    }

    public void setUsuarioID(int UsuarioID) {
        this.UsuarioID = UsuarioID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
}
