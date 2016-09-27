package negocio;

import java.util.Date;


public class PronosticoExtendido {

    private Date fecha;
    private float tempMin;
    private float tempMax;
    private DayOfWeek dia;


    public PronosticoExtendido(Date fecha, float tempMin, float tempMax, DayOfWeek dia) {
        this.fecha = fecha;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.dia = dia;
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

    public String getDia() {
        return dia;
    }

    @Override
    public String toString() {
        return "PronosticoExtendido{" +
                "fecha=" + fecha +
                ", tempMin=" + tempMin +"F"+
                ", tempMax=" + tempMax +"F"+
                ", dia='" + dia + '\'' +
                '}';
    }
}
