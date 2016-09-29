package negocio;

import java.util.Date;
import java.time.DayOfWeek;

public class PronosticoExtendido {

    private Date fecha;
    private float tempMin;
    private float tempMax;
    private String descripcion;
    private DayOfWeek dia;


    public PronosticoExtendido(Date fecha, float tempMin, float tempMax, DayOfWeek dia, String desc) {
        this.fecha = fecha;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.dia = dia;
        descripcion= desc;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getTempMin() {
        return tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public String getDescripcion(){return descripcion;}

    public String getDia() { return dia.toString(); }

    @Override
    public String toString() {
        return "PronosticoExtendido{" +
                "fecha= " + fecha +
                ", tempMin= " + tempMin +
                ", tempMax= " + tempMax +
                ", descripcion=' " + descripcion + '\'' +
                ", dia= " + dia +
                '}';
    }
}
