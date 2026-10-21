package com.grinberg.spielvault.modelo;

public class JuegoFisico extends Producto {

    private double pesoKg;
    private double costoEnvio;
    private String estado;

    public JuegoFisico(int id, String nombre, double precio, String plataforma, int stock,
                       double pesoKg, double costoEnvio, String estado){
        super(id, nombre, precio, plataforma, stock); 
        setPesoKg(pesoKg);
        setCostoEnvio(costoEnvio);
        setEstado(estado);
    }

    // getters y setters con validación
    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if(pesoKg < 0){
            throw new IllegalArgumentException("El peso no puede ser negativo");
        }
        this.pesoKg = pesoKg;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        if(costoEnvio < 0){
            throw new IllegalArgumentException("El costo de envío no puede ser negativo");
        }
        this.costoEnvio = costoEnvio;
    }

    public String getEstado() {
        return estado;
    }

  public void setEstado(String estado) {
    if (estado == null) {
        throw new IllegalArgumentException("El estado no puede ser nulo");
    }
    String normalizado = estado.trim().toLowerCase();
    if (!normalizado.equals("nuevo") && !normalizado.equals("usado")) {
        throw new IllegalArgumentException("El estado debe ser 'nuevo' o 'usado'");
    }
    this.estado = normalizado;
}

    @Override
    public double calcularPrecioFinal() {
        // precio + costo de envío
        return getPrecio() + getCostoEnvio();
    }

    @Override
    public String toString() {
    return super.toString() + String.format(" | %.1f kg | Envío: $%.2f | %s", pesoKg, costoEnvio, estado);
    }
}