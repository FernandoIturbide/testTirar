package ico.fes.poo2258;

import java.awt.*;

public class GatoDriver {
    public static void main(String[] args) {
        Gato gato = new Gato(Color.gray,"Azul Ruso");
        System.out.println(gato.dormir());
        System.out.println(gato.comer());
        System.out.println(gato.rascar());


        System.out.println(gato);
    }
}
