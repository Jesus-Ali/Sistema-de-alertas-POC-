package com.mycompany.saaspoc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1259a
 */

import java.util.List;

public class Administrador extends Usuario {
    public Administrador(int ID, String Nombre, String Correo) {
        super(ID, Nombre, Correo);
    }

    public void RegistrarUsuario(Usuario usuario) {
        // Lógica para registrar usuario
    }

    public void EliminarUsuario(Usuario usuario) {
        // Lógica para eliminar usuario
    }

    public void GestionarUsuarios(List<Usuario> usuarios) {
        // Lógica para gestionar usuarios
    }

    public void AgregarCanal(Canal canal) {
        // Lógica para agregar canal
    }
}
