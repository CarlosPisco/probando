public class Persona {

    private final float pi = 3.1415f;
    private String nombre;
    private String dni;
    public static String texto = "hola";

    public static void dormir(int x, int y){
        System.out.println("durmiendo");
        texto = "chau";
    }
    
    public void comer() {
        this.sumar(6, 7);
        System.out.println(this.nombre + " esta sumando... esperar");
        sumar(8,9);
       
    }

    private int sumar(int x, int y) {
        return x + y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
