package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarifasTest {
    /**
     * Mediante esta prueba verificamos que la clase CalculadorDescuentos no maneja Excepciones. Por ende , esta prueba falla.
     */

    @Test
    public void Dada_laEdadDeUnaPersonaJoven_retorna_DescuentoDel995() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 16, 14);
        assertTrue(950000 == tarifa);
    }

    @Test
    public void Dada_laEdadDeUnaPersonaJovenYlosDiasAnticipados_retorna_DescuentoDel80(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 30, 12);
        assertTrue(800000 == tarifa);
    }

    @Test
    public void Dada_laEdadDeUnAdulto_retorna_ElMismoValor() {
        // Validar que un adulto no tiene descuento
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 5, 34);
        assertTrue(1000000 == tarifa);
    }

    @Test
    public void Dada_laEdadDeUnAdultoYlosDiasAnticipados_retorna_DescuentoDel85() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 60, 45);
        assertTrue(850000 == tarifa);
    }

    @Test
    public void Dada_laEdadDeUnAnciano_retorna_DescuentoDel92() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 6, 67);
        assertTrue(920000 == tarifa);
    }

    @Test
    public void Dada_laEdadDeUnAncianoYlosDiasAnticipados_retorna_DescuentoDel77() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 31, 70);
        assertTrue(770000 == tarifa);
    }
}
