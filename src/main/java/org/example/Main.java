package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================*");
        System.out.println ("Reservas App            *");
        System.out.println("========================*\n");

        //Los comentarios solo sirven para estudiar. La documentación es para los proyectos.
        //Entradas del algoritmo.
        //Scanner sirve para leer lo que tu escribes con el teclado.
        //Las variables deben tener el segundo nombre iniciando en mayuscula.
        //Las variables no se mezclan entre español e ingles.
        //Buenos nombres de variables.
        //Variables nunca llevan ortografías.
        //SNAKE_CASE es para constantes y bases de datos.
        //entradaTeclado es la declaración de Scanner.
        Scanner entradaTeclado=new Scanner(System.in);

        LocalDate fechaReserva;
        LocalDate fechaMantenimiento;

        String nombreUsuario;
        String idUsuario;
        String correoUsuario;
        String tipoUsuario;
        String numeroApartamento;
        String tipoApartamento;
        String numeroUsuario;
        String contraseñaUsuario;

        String nombreEspacio;
        String tiempoReserva;
        String reglamentoEspacio;
        String utensiliosEspacio;

        String codigoReserva;
        String horarioReserva;

        byte numeroBloque;
        byte cantidadAsistentes;
        byte edadUsuario;
        int valorReserva;
        //Los boolean se deben inicializar '=true/=false'. Tenerlos en pregunta.
        boolean esAdministrador=true;
        boolean confirmacionReserva=false;
        boolean estaOcupado=false;
        boolean estaEnMantenimiento=false;



        //Las variables tienen 2 tipos de datos, primitivo y envoltura. Scanner es Envoltura.
        //Un buen programador es concentrado y organizado.

    }
}