/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elisabet;

import java.util.Scanner;

/**
 *
 * @author elisabet
 */
/*
La tienda PCRoto se dedica a reparar dispositivos portátiles. De lunes a viernes reparan un montón de 
ordenadores y como son una tienda low cost, cobran lo mismo por todas las reparaciones.
La idea es que tu programa ayude a los dueños de la tienda a saber cuánto han cobrado cada día y al final 
de la semana, suponiendo que todas las reparaciones cuestan 32.6€ (double) y todas las semanas trabajan 
de lunes a viernes (5 días). 
Una vez leídos los datos del número de reparaciones que hay cada día (de lunes a viernes) se deben mostrar 
los datos de lo que se ha cobrado cada día (float) y al final de la semana (float). Ten en cuenta que se debe 
limitar la salida por consola a 3 números decimales.
En esta parte todos los datos deben leerse por teclado usando Scanner y mostrarse usando la consola.
*/
public class ParteA {
    public static void main(String[] args) {
        final double  PRECIOREPARACION= 32.6; // precio FIJO de TODAS las reparaciones
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cuantas reparaciones has tenido el lunes?"); 
        int numeroReparacionesLunes = teclado.nextInt(); // numero de reparaciones el lunes
        System.out.println("Cuantas reparaciones has tenido el Martes?");
        int numeroReparacionesMartes = teclado.nextInt(); // numero de reparaciones el martes
        System.out.println("Cuantas reparaciones has tenido el Miercoles?");
        int numeroReparacionesMiercoles = teclado.nextInt(); // numero de reparaciones el miercoles
        System.out.println("Cuantas reparaciones has tenido el Jueves?");
        int numeroReparacionesJueves= teclado.nextInt(); // numero de reparaciones el jueves
        System.out.println("Cuantas reparaciones has tenido el Viernes?");
        int numeroReparacionesViernes = teclado.nextInt(); // numero de reparaciones el viernes
        
        // Se suman todas las reparaciones para obtener el numero total de reparaciones
        int numeroReparacionesTotales=  numeroReparacionesLunes+
                                                           numeroReparacionesMartes+
                                                           numeroReparacionesMiercoles+
                                                           numeroReparacionesJueves+
                                                           numeroReparacionesViernes;
        
        // Se multiplica el precio de la reparacion (ya establecido) por cada dia de la semana 
        float recaudadoLunes= numeroReparacionesLunes*(float)PRECIOREPARACION;
        float recaudadoMartes= numeroReparacionesMartes*(float)PRECIOREPARACION;
        float recaudadoMiercoles= numeroReparacionesMiercoles*(float)PRECIOREPARACION;
        float recaudadoJueves= numeroReparacionesJueves*(float)PRECIOREPARACION;
        float recaudadoViernes= numeroReparacionesViernes*(float)PRECIOREPARACION;
        
        
        // se cmultiplica el total del numero de reparacion por el precio de la reparacion (ya establecida)
        float totalRecaudadoSemana= numeroReparacionesTotales*(float)PRECIOREPARACION;
        
        // Se muestra en pantalla el numero de reparaciones, y el total de dinero recaudado cada dia
        // Además se muestra el total de reparaciones semanales y cuanto a ganado al final de la semana
        System.out.println("""
                           El lunes ha tenido %d reparaciones, en total ha ganado %.3f€,
                           El martes ha tenido %d reparaciones, en total ha ganado %.3f€,
                           El miércoles ha tenido %d reparaciones, en total ha ganado %.3f€,
                           El jueves ha tenido %d reparaciones, en total ha ganado %.3f€,
                           El viernes ha tenido %d reparaciones, en total ha ganado %.3f€,
                           
                           Total de reparaciones en la semana: %d
                           Total dinero recaudado: %.3f €
                           
                           """.formatted(
                                   numeroReparacionesLunes, recaudadoLunes,
                                   numeroReparacionesMartes, recaudadoMartes,
                                   numeroReparacionesMiercoles, recaudadoMiercoles,
                                   numeroReparacionesJueves, recaudadoJueves,
                                   numeroReparacionesViernes, recaudadoViernes,
                                   numeroReparacionesTotales, totalRecaudadoSemana)
                            );
    }
}
