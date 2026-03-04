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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

}
