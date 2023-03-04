package ico.fes.poo2258;

import java.awt.*;

public class ApagadorDriver {
    public static void main(String[] args) {
        Apagador apagador=new Apagador((byte) 2, (byte) 1);
        System.out.println(apagador.encendido1());
        System.out.println(apagador.corriente());
        System.out.println(apagador.conectado());
        System.out.println(apagador);
    }
}
