package com.grinberg.spielvault.modelo;

public class JuegoDigital extends Producto {

    private double tamanioGB;
    private String claveActivacion;

    public JuegoDigital(int id, String nombre, double precio, String plataforma, int stock,
                        double tamanioGB, String claveActivacion){
        super(id, nombre, precio, plataforma, stock);
        setTamanioGB(tamanioGB);
        setClaveActivacion(claveActivacion);
    }

    public double getTamanioGB() {
        return tamanioGB;
    }

    public void setTamanioGB(double tamanioGB) {
        if(tamanioGB == 0 || tamanioGB < 0){
            throw new IllegalArgumentException("El peso del juego no esta permitido");
        }
        this.tamanioGB = tamanioGB;
    }

    public String getClaveActivacion() {
        return claveActivacion;
    }

    public void setClaveActivacion(String claveActivacion) {
         if(claveActivacion == null || claveActivacion.isBlank()){
            throw new IllegalArgumentException("La clave de activación no puede estar vacía");
        }
        this.claveActivacion = claveActivacion.trim();
    }

    @Override
    public double calcularPrecioFinal() {
    return getPrecio();
    }

    @Override
    public String toString() {
    return super.toString() + String.format(" | %.1f GB | Clave: %s", tamanioGB, claveActivacion);
    }
}
