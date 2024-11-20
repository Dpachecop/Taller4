package Taller4.Ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.setVelocidadMaxima(velocidadMaxima);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima < 0) {
            throw new IllegalArgumentException("La velocidad máxima no puede ser negativa.");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        } else {
            throw new IllegalArgumentException("El incremento debe ser positivo.");
        }
    }

    @Override
    public String toString() {
        return "Coche: " + 
                "marca: " + marca +
                ", modelo: " + modelo +
                ", velocidadMaxima: " + velocidadMaxima 
                ;
    }
}
