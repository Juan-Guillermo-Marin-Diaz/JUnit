package test_con_junit_services;

import test_con_junit_entities.Rectangulo;

public class RectanguloService {

    public double calcularArea(Rectangulo r) {

       return r.getAncho() * r.getLargo();
    }

    public double calcularPerimetro(Rectangulo r) {

        return 2 * (r.getAncho() + r.getLargo());
    }
}
