package negocio;

import java.util.Date;

/**
 * Created by juanb on 9/26/2016.
 */
public class DiaActual {
    private Date fecha;
    private float Temp;
    private String Descripcion;

    public DiaActual(Date fec, float temp, String descripcion) {
        fecha = fec;
        Temp = temp;
        Descripcion = descripcion;
    }

    public float getTemp() {
        return Temp;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "DiaActual{" +
                "Fecha= "+fecha +
                "Temp= " + Temp + "F" +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
