package tarea.colaboratiba.ets;

public class Tarea {

    /**
     * Clase que representa una tarea dentro del sistema. Contiene una
     * descripción y un estado de completado.
     *
     * @author Jose
     */
    public String descripcion;
    public boolean completada;

    /**
     * Constructor de la clase Tarea.
     *
     * @param descripcion Texto descriptivo de la tarea.
     * @param completada Variable boolean iniciada en falso.
     */
    public Tarea(String descripcion, boolean completada) {
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
