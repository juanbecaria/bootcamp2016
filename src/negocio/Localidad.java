package negocio;

/**
 * Created by juanb on 9/26/2016.
 */
public class Localidad {

    private String ciudad;
    private String region;
    private String pais;


    public Localidad(String ciudad, String region, String pais) {
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getRegion() {
        return region;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
