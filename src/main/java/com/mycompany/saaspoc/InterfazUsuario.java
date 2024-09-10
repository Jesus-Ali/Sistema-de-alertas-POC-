/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.saaspoc;

/**
 *
 * @author 1259a
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InterfazUsuario {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Canal> canales = new ArrayList<>();
    private static List<Alerta> alertas = new ArrayList<>();
    private static List<Historial> historiales = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Agregar usuarios y otros datos iniciales para demostración
        Administrador admin = new Administrador(1, "Admin", "admin@ejemplo.com");
        Usuario usuario = new Usuario(2, "Usuario", "usuario@ejemplo.com");
        usuarios.add(usuario);
        
        boolean running = true;
        while (running) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Configurar alertas");
            System.out.println("3. Configurar canal");
            System.out.println("4. Recibir notificaciones");
            System.out.println("5. Monitorear historial");
            System.out.println("6. Registrar usuario");
            System.out.println("7. Eliminar usuario");
            System.out.println("8. Agregar canal");
            System.out.println("9. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    configurarAlertas();
                    break;
                case 3:
                    configurarCanal();
                    break;
                case 4:
                    recibirNotificaciones();
                    break;
                case 5:
                    monitorearHistorial();
                    break;
                case 6:
                    registrarUsuario(admin);
                    break;
                case 7:
                    eliminarUsuario();
                    break;
                case 8:
                    agregarCanal();
                    break;
                case 9:
                    running = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void iniciarSesion() {
        System.out.print("Ingrese el ID del usuario: ");
        int id = scanner.nextInt();      
        
        scanner.nextLine(); // Consumir el salto de línea
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == id) {
                usuario.IniciarSesion();
                System.out.println("Sesión iniciada para el usuario: " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    private static void configurarAlertas() {
        System.out.print("Ingrese el ID de la alerta: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el tipo de alerta: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese la frecuencia de la alerta: ");
        String frecuencia = scanner.nextLine();
        Alerta alerta = new Alerta(id, tipo, frecuencia);
        alerta.Configurar();
        alertas.add(alerta);
        System.out.println("Alerta configurada.");
    }

    private static void configurarCanal() {
        System.out.print("Ingrese el ID del canal: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre del canal: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de canal: ");
        String tipo = scanner.nextLine();
        Canal canal = new Canal(id, nombre, tipo);
        canal.Configurar();
        canales.add(canal);
        System.out.println("Canal configurado.");
    }

    private static void recibirNotificaciones() {
        System.out.print("Ingrese el ID del usuario para recibir notificaciones: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == id) {
                usuario.RecibirNotificaciones();
                System.out.println("Notificaciones enviadas al usuario: " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    private static void monitorearHistorial() {
        System.out.print("Ingrese el ID del historial: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        for (Historial historial : historiales) {
            if (historial.getID() == id) {
                historial.Monitorear();
                System.out.println("Historial monitoreado.");
                return;
            }
        }
        System.out.println("Historial no encontrado.");
    }

    private static void registrarUsuario(Administrador admin) {
        System.out.print("Ingrese el ID del nuevo usuario: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre del nuevo usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el correo del nuevo usuario: ");
        String correo = scanner.nextLine();
        Usuario nuevoUsuario = new Usuario(id, nombre, correo);
        admin.RegistrarUsuario(nuevoUsuario);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado.");
    }

    private static void eliminarUsuario() {
        System.out.print("Ingrese el ID del usuario a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Usuario usuarioAEliminar = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getID() == id) {
                usuarioAEliminar = usuario;
                break;
            }
        }
        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar);
            System.out.println("Usuario eliminado.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private static void agregarCanal() {
        System.out.print("Ingrese el ID del nuevo canal: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre del nuevo canal: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo del nuevo canal: ");
        String tipo = scanner.nextLine();
        Canal nuevoCanal = new Canal(id, nombre, tipo);
        nuevoCanal.Configurar();
        canales.add(nuevoCanal);
        System.out.println("Canal agregado.");
    }
}
