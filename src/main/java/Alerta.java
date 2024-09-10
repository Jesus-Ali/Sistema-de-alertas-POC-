/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1259a
 */
public class Alerta {
    private int ID;
    private String Tipo;
    private String Frecuencia;

    public Alerta(int ID, String Tipo, String Frecuencia) {
        this.ID = ID;
        this.Tipo = Tipo;
        this.Frecuencia = Frecuencia;
    }

    public void Configurar() {
        // Lógica para configurar la alerta
    }

    public void Activar() {
        // Lógica para activar la alerta
    }

    // Getters y Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }
}
