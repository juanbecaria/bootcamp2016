package negocio;

/**
 * Created by juanb on 9/26/2016.
 */
public class Viento {
    private float direccion;
    private float velocidad;

    public Viento(float direccion, float velocidad) {
        this.direccion = direccion;
        this.velocidad = velocidad;
    }

    public float getDireccion() {
        return direccion;
    }

    public float getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Viento{" +
                "direccion=" + direccion +"grados"+
                ", velocidad=" + velocidad +"mi/h"+
                '}';
    }
}
