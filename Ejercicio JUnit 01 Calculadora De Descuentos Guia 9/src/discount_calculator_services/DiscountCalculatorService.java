package discount_calculator_services;

import discount_calculator_entities.DiscountCalculator;

public class DiscountCalculatorService {

    public double calcularCantidadDeDescuento(DiscountCalculator dc) {

        double cantidadDescuento = dc.getPrecio() * dc.getDescuento();

        return cantidadDescuento;
    }
}
