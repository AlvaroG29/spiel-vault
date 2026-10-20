public abstract class Producto {

    private final int id;
    private String nombre;
    private double precio;
    private String plataforma;
    private int stock;

    public Producto(int id, String nombre, double precio, String plataforma, int stock){
        this.id = id;
        setNombre(nombre);
        setPrecio(precio);
        setPlataforma(plataforma);
        setStock(stock);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getStock() {
        return stock;
    }


    public void setNombre(String nombre){
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("No puede existir producto sin nombre");
        }
        this.nombre = nombre.trim();
    }

    public void setPrecio(double precio){
         if(precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public void setPlataforma(String plataforma) {
          if(plataforma == null || plataforma.isBlank()){
            throw new IllegalArgumentException("No puede existir producto sin plataforma asignada");
        }
        this.plataforma = plataforma;
    }

    public void setStock(int stock) {
          if(stock < 0){
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        this.stock = stock;
    }

    public abstract double calcularPrecioFinal();

    @Override
    public String toString(){
        return String.format("[%d] %s | %s | $%.2f | Stock: %d", id, nombre, plataforma, precio, stock);
    }

}