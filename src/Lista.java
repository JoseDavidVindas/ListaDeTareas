/**
 *
 * @author Jose
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * La clase Lista representa una lista de tareas.
 * Permite agregar nuevas tareas y mostrar todas las tareas en la lista.
 */
public class Lista {
  
  /** La lista de tareas. */
  private ArrayList<String> tareas;

  /**
   * Constructor de la clase Lista.
   * Inicializa la lista de tareas como una lista vacía.
   */
  public Lista() {
      tareas = new ArrayList<>();
  }

  /**
   * Agrega una nueva tarea a la lista.
   * @param tarea La tarea a ser agregada a la lista.
   */
  public void agregarTarea(String tarea) {
      tareas.add(tarea);
  }

  /**
   * Muestra todas las tareas en la lista.
   * Si la lista está vacía, muestra un mensaje indicando que no hay tareas.
   * Si hay tareas en la lista, las muestra en una ventana emergente.
   */
  public void mostrarTareas() {
      if (tareas.isEmpty()) {
          JOptionPane.showMessageDialog(null, "No hay tareas en la lista.");
      } else {
          StringBuilder mensaje = new StringBuilder("Lista de tareas:\n");
          for (int i = 0; i < tareas.size(); i++) {
              mensaje.append((i + 1)).append(". ").append(tareas.get(i)).append("\n");
          }
          JOptionPane.showMessageDialog(null, mensaje.toString());
      }
  }
}
