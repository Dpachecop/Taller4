package Taller4.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Creación de un coche con valores válidos
        Coche coche = new Coche("Toyota", "Corolla", 180);
        System.out.println(coche);

        /*// Intentar acceder a las propiedades directamente
      genera errores de compilación porque las propiedades son privadas
     coche.marca = "Honda";
     coche.modelo = "Civic";
     coche.velocidadMaxima = 200; 

     Usando métodos de acceso*/
        coche.setMarca("Honda");
        coche.setModelo("Civic");
        coche.acelerar(20);

        System.out.println("Después de los cambios:");
        System.out.println(coche);

        
        try {
            coche.acelerar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al intentar acelerar: " + e.getMessage());
        }
    }
}
