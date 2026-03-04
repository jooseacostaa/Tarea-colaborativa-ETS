package tarea.colaboratiba.ets;

import java.util.ArrayList;

/**
 * Esta clase gestiona las tareas registradas
 *
 * @author Cesvic07
 */
public class GestorTareas {

    public ArrayList<Tarea> listaTareas;

    /**
     * Constructor para instanciar la lista de tareas
     */
    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    /**
     * Este método muestra la descripción y si esta completada de las tareas
     * registradas
     */
    public void mostrarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas");
        } else {
            for (Tarea x : listaTareas) {
                System.out.println("Descripción: " + x.getDescripcion());
                System.out.println("Completada? " + x.isCompletada());
            }
        }

    }
}
