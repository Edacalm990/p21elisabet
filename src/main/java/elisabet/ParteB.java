/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elisabet;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elisabet
 */
/*Modifica el ejercicio anterior para que la lectura de datos y la salida por pantalla usen diálogos JOptionPane.
Además, en esta parte, se debe preguntar cuánto se va a cobrar por reparación cada día de la semana (double)
y luego preguntar cuántas reparaciones se han hecho cada día (int). Una vez leídos los datos, calcula lo que 
se cobra cada día y al final de la semana, guardando los datos en tipos float. Usa un text block, limitando 
la salida a 1 decimal, para usarlo en un JOptionPane que muestre la información de salida.
Guarda el resultado de evaluar si se ha cobrado al final de la semana más de 1000€, mostrando el resultado 
por consola.

Una vez finalizado el ejercicio, exporta el proyecto en formato ZIP y sube el archivo a la tarea. Recuerda 
que el nombre del fichero también debe ser p21+tunombre.zip.*/
public class ParteB {
    public static void main(String[] args) {
        
        String numeroReparacionesLunesString= JOptionPane.showInputDialog(
                "Cuantas reparaciones has tenido el lunes?"); 
        String precioReparacionLunesString= JOptionPane.showInputDialog(
                "Cuanto cuestan las reparaciones el lunes?");
        int numeroReparacionesLunes = Integer.parseInt(numeroReparacionesLunesString); // numero de reparaciones el lunes
        double precioReparacionLunes = Double.parseDouble(precioReparacionLunesString); // precio de la reparacion el lunes
        
        
        String numeroReparacionesMartesString= JOptionPane.showInputDialog(
                "Cuantas reparaciones has tenido el martes?");
        String precioReparacionMartesString= JOptionPane.showInputDialog(
                "Cuanto cuestan las reparaciones el martes?");
        int numeroReparacionesMartes = Integer.parseInt(numeroReparacionesMartesString); // numero de reparaciones el martes
        double precioReparacionMartes = Double.parseDouble(precioReparacionMartesString); // precio de la reparacion el martes
        
        String numeroReparacionesMiercolesString= JOptionPane.showInputDialog(
                "Cuantas reparaciones has tenido el miércoles?");
        String precioReparacionMiercolesString= JOptionPane.showInputDialog(
                "Cuanto cuestan las reparaciones el miercoles?");
        int numeroReparacionesMiercoles = Integer.parseInt(numeroReparacionesMiercolesString); // numero de reparaciones el miercoles
        double precioReparacionMiercoles = Double.parseDouble(precioReparacionMiercolesString);// precio de la reparacion el miercoles
      
        String numeroReparacionesJuevesString= JOptionPane.showInputDialog(
                "Cuantas reparaciones has tenido el jueves?");
        String precioReparacionJuevesString= JOptionPane.showInputDialog(
                "Cuanto cuestan las reparaciones el jueves?");
        int numeroReparacionesJueves = Integer.parseInt(numeroReparacionesJuevesString); // numero de reparaciones el jueves
        double precioReparacionJueves = Double.parseDouble(precioReparacionJuevesString);// precio de la reparacion el jueves
        
        String numeroReparacionesViernesString= JOptionPane.showInputDialog(
                "Cuantas reparaciones has tenido el Viernes?");
        String precioReparacionViernesString= JOptionPane.showInputDialog(
                "Cuanto cuestan las reparaciones el viernes?");
        int numeroReparacionesViernes = Integer.parseInt(numeroReparacionesViernesString); // numero de reparaciones el viernes
        double precioReparacionViernes = Double.parseDouble(precioReparacionViernesString);// precio de la reparacion el viernes
        
        // para obtner la recaudación diaria se multiplica el numero de reparaciones por el precio que tienen las reparaciones ese dia
        float recaudadoLunes= numeroReparacionesLunes*(float)precioReparacionLunes;
        float recaudadoMartes= numeroReparacionesMartes*(float)precioReparacionMartes;
        float recaudadoMiercoles= numeroReparacionesMiercoles*(float)precioReparacionMiercoles;
        float recaudadoJueves= numeroReparacionesJueves*(float)precioReparacionJueves;
        float recaudadoViernes= numeroReparacionesViernes*(float)precioReparacionViernes;
        
        // suma todo lo recaudado para obtener la recaudación semanal
        float totalRecaudadoSemana=  recaudadoLunes+
                                                            recaudadoMartes+
                                                            recaudadoMiercoles+
                                                            recaudadoJueves+
                                                            recaudadoViernes;
        
        // Se comprueba que lo recaudado ese dia es mayor de mil euros. 
        boolean totalMasDeMil=totalRecaudadoSemana>1000;
        
        // se muestra por consola el resultado
        JOptionPane.showMessageDialog(null,"""
                           El lunes has tenido %d reparaciones, en total ha ganado %.1f€,
                           El martes has tenido %d reparaciones, en total ha ganado %.1f€,
                           El miércoles has tenido %d reparaciones, en total ha ganado %.1f€,
                           El jueves has tenido %d reparaciones, en total ha ganado %.1f€,
                           El viernes has tenido %d reparaciones, en total ha ganado %.1f€,
                           
                           Recaudado esta semana: %.1f€

                           """.formatted(
                                   numeroReparacionesLunes, recaudadoLunes,
                                   numeroReparacionesMartes, recaudadoMartes,
                                   numeroReparacionesMiercoles, recaudadoMiercoles,
                                   numeroReparacionesJueves, recaudadoJueves,
                                   numeroReparacionesViernes, recaudadoViernes, 
                                   totalRecaudadoSemana
                           )
        );
        
        System.out.println("""
                           Has cobrado más de mil euros esta semana? %b
                           """.formatted(totalMasDeMil));
    }
}
