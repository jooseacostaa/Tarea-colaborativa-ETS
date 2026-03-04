package tarea.colaboratiba.ets;

import java.util.ArrayList;

/**
 * Esta clase gestiona las tareas registradas
 *
 * @author Cesvic07
 */
public class GestorTareas {

    private ArrayList<Tarea> listaTareas;

    /**
     * Constructor que inicializa la lista de tareas.
     */
    public GestorTareas() {
        listaTareas = new ArrayList<>();
    }

    /**
     * Añade una nueva tarea a la lista.
     *
     * @param descripcion texto descriptivo de la tarea.
     */
    public void añadirTarea(String descripcion) {
        Tarea nueva = new Tarea(descripcion);
        listaTareas.add(nueva);
        System.out.println("Tarea añadida correctamente.");
    }

    /**
     * Muestra todas las tareas almacenadas en la lista. Si no hay tareas,
     * informa al usuario.
     */
    public void mostrarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < listaTareas.size(); i++) {
                Tarea t = listaTareas.get(i);
                System.out.println((i + 1) + ". " + t.getDescripcion()
                        + " - " + (t.isCompletada() ? "Completada" : "Pendiente"));
            }
        }

    }
}
