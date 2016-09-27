package Interfaz;

import negocio.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanb on 9/26/2016.
 */
public class Main {
    public static void main(String[] args) {



        Atmosfera at = new Atmosfera(10,20,30, 0);
        Viento v= new Viento(180,20);
        Localidad l= new Localidad("Cordoba","Cordoba","Argentina");
        DiaActual da= new DiaActual(40,"nublado");
        List<PronosticoExtendido> pE = new ArrayList<>();

        pE.add(new PronosticoExtendido(new Date(1993,03,30),20,60,DayOfWeek.Monday));
        pE.add(new PronosticoExtendido(new Date(1993,03,31),20,60,DayOfWeek.Friday));
        pE.add(new PronosticoExtendido(new Date(1993,04,1),20,60,DayOfWeek.Sunday));
        pE.add(new PronosticoExtendido(new Date(1993,04,2),20,60,DayOfWeek.Monday));

        Pronostico pronostico= new Pronostico(v,at,da,pE,l);

        System.out.println(pronostico);
    }
}
