package Taller4.uso_incorrecto;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }


public static void main(String[] args) {
    Persona persona = new Persona("Juan");
/* 
 * Intento de acceder directamente al atributo privado
    Esto genera un error de compilación porque 'nombre' es private
    persona.nombre = "Ana"; // Error: 'nombre' tiene acceso privado en 'Persona'

    Se Intenta  imprimir el atributo directamente
    System.out.println(persona.nombre); //va a dar un rotundo error debido a que 'nombre' tiene acceso privado en 'Persona'
*/
    
}}