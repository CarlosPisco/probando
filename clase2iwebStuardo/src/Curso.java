public class Curso {
    private String codigo;
    private String nombre;

    public void suma1(int x) {
        x++;
    }

    public void sumaEdad(Estudiante e){
       e.edad++;
    }


    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Curso(String codigo) {
        this.codigo = codigo;
    }

    public Curso() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
