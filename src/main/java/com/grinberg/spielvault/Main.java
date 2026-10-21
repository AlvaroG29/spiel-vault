package com.grinberg.spielvault;

import com.grinberg.spielvault.modelo.JuegoDigital;
import com.grinberg.spielvault.modelo.JuegoFisico;
import com.grinberg.spielvault.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new JuegoFisico(1, "Zelda", 1200, "Switch", 5, 0.2, 80, "nuevo");
        Producto p2 = new JuegoDigital(2, "Hades", 300, "PC", 10, 15.5, "ABCD-1234");

        System.out.println(p1);
        System.out.println("Precio final: " + p1.calcularPrecioFinal());
        System.out.println(p2);
        System.out.println("Precio final: " + p2.calcularPrecioFinal());
    }
}
