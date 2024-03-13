     /**
     *
     * @author Jose
     */
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * La clase Main contiene el método main que inicia el programa de gestión de tareas.
 * Permite al usuario agregar nuevas tareas, mostrar las tareas existentes y salir del programa.
 */
public class Main {
   
   /**
    * El método main inicia el programa de gestión de tareas.
    * Muestra un menú de opciones al usuario y procesa la opción seleccionada.
    * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
    */
   public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion;

        do {
            String[] opciones = {"Agregar tarea", "Mostrar tareas", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Lista de Tareas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    String nuevaTarea = JOptionPane.showInputDialog(null, "Ingrese la tarea a agregar:");
                    if (nuevaTarea != null && !nuevaTarea.isEmpty()) {
                        lista.agregarTarea(nuevaTarea);
                        JOptionPane.showMessageDialog(null, "Tarea agregada correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar una tarea válida.");
                    }
                    break;
                case 1:
                    lista.mostrarTareas();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 2);
    }
}
