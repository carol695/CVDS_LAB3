package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TarifasTest {
    /**
     * Mediante esta prueba verificamos que la clase CalculadorDescuentos no maneja Excepciones. Por ende , esta prueba falla.
     */
    @Test
    public void give_invalidRate_When_There_are_NegativeNumbers_Than_returnException() {
        try {
            double tarifa = CalculadorDescuentos.calculoTarifa(-6, -4, -1);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void give_validRate_When_isYoung_Than_returnDiscount() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 16, 14);
        assertTrue(950000 == tarifa);
    }

    @Test
    public void give_validRate_When_isYoungAndAnticipateDays_Than_returnDiscount(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 30, 12);
        assertTrue(800000 == tarifa);
    }

    @Test
    public void validateThatHasNoDiscountForBeingAnAdult() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 5, 34);
        assertTrue(1000000 == tarifa);
    }

    @Test
    public void validateDiscountForBeingAnAdultAndAnticipatedDays() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 60, 45);
        assertTrue(850000 == tarifa);
    }

    @Test
    public void validateDiscountForBeingAnOldMan() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 6, 67);
        assertTrue(920000 == tarifa);
    }

    @Test
    public void validateDiscountForBeingAnOldManAndAnticipatedDays() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 31, 70);
        assertTrue(770000 == tarifa);
    }
}
