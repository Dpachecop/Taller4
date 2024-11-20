package Taller4.uso_incorrecto;

public class Usuario {
    private String password;

    public Usuario(String password) {
        this.password = password;
    }
}


/*

Al no proporcionar métodos get ni set,
 no se puede acceder ni modificar el atributo password desde fuera de la clase.
 Entendiendo eso, se limita la funcionalidad de leer o acceder a ese valor
 haciendo el codigo incomodo para los demas programadores
 
 */


 // clase corregida


 /*public class Usuario {
    private String password;

    public Usuario(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía.");
        }
        this.password = password;
    }
}*/
