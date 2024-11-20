package Taller4.Ejercicio1;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120.");
        }
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0.0 || notaPromedio > 5.0) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0.0 y 5.0.");
        }
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return "Estudiante----" +
                "nombre: " + nombre +
                ", edad: " + edad +
                " ,notaPromedio=" + notaPromedio 
                ;
    }
}
