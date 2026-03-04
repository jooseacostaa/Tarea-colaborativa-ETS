package tarea.colaboratiba.ets;

/**
 * Clase que representa una tarea dentro del sistema. Contiene una descripción y
 * un estado de completado.
 *
 * @author Jose
 */
public class Tarea {

    private String descripcion;
    private boolean completada;

    /**
     * Constructor de la clase Tarea.
     *
     * @param descripcion Texto descriptivo de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    /**
     * Devuelve la descripción de la tarea.
     *
     * @return descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la tarea.
     *
     * @param descripcion nueva descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Indica si la tarea está completada.
     *
     * @return true si está completada, false en caso contrario.
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Cambia el estado de la tarea.
     *
     * @param completada nuevo estado de la tarea.
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}
