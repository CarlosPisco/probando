public class Persona {
    private String nombre;
    private String dni;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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


    public void comer (){
        System.out.println("Estoy comiendo");
    }

    private int sumar (int x, int y){
        return x+y;
    }

    public void devolverSuma (){
        this.sumar(4,5);
    }


    public void modificarEdad(Persona p){
        //return this.edad++;
        int edadPersona = p.getEdad();
        int nuevaEdad = edadPersona + 5;
        p.setEdad(nuevaEdad);



    }



}
