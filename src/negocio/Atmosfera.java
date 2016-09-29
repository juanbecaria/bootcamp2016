package negocio;

/**
 * Created by juanb on 9/26/2016.
 */
public class Atmosfera {

    private float presion;
    private float visibilidad;
    private float humedad;
    private float ambienteAscendente;

    public Atmosfera(float presion, float visibilidad, float humedad, float ambienteAscendente) {
        this.presion = presion;
        this.visibilidad = visibilidad;
        this.humedad = humedad;
        this.ambienteAscendente = ambienteAscendente;
    }

    public float getPresion() {
        return presion;
    }

    public float getVisibilidad() {
        return visibilidad;
    }

    public float getHumedad() {
        return humedad;
    }

    public float getAmbienteAscendente() {
        return ambienteAscendente;
    }

    @Override
    public String toString() {
        return "Atmosfera{" +
                "presion=" + presion + "in" +
                ", visibilidad=" + visibilidad + "miles" +
                ", humedad=" + humedad + "%" +
                ", ambienteAscendente=" + ambienteAscendente +
                '}';
    }
}
