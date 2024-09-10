/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1259a
 */
public class Usuario {
    private int ID;
    private String Nombre;
    private String Correo;

    public Usuario(int ID, String Nombre, String Correo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Correo = Correo;
    }

    public void Autenticarse() {
        // Lógica de autenticación
    }

    public void IniciarSesion() {
        // Lógica para iniciar sesión
    }

    public void RecibirNotificaciones() {
        // Lógica para recibir notificaciones
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
