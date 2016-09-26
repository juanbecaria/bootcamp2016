package negocio;

/**
 * Created by juanb on 9/26/2016.
 */
public class DiaActual {
    private float Temp;
    private String Descripcion;

    public DiaActual(float temp, String descripcion) {
        Temp = temp;
        Descripcion = descripcion;
    }

    public float getTemp() {
        return Temp;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "DiaActual{" +
                "Temp=" + Temp +"F"+
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
