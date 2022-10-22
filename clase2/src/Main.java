import java.util.Scanner;
//todo: cuando hay un new estoy creando un objeto nuevo
//todo al crear un objeto darle null para verificar en los labs
//todo IDE > JAVA (smarter)


/**  modificador final:
 *   ya no se puede cambiar el valor de un atributo, exclusivo en atributos so far...
 *
 *   metodos - sobreescribir
 *   clases - herencia
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("hola mundo");

        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        int numero = Integer.parseInt(palabra);

        Estudiante e1 = new Estudiante();
        Curso curso1 = new Curso();
        e1.setCurso1(curso1);

        curso1.setCodigo("tel131");


        /*Estudiante[] listaEstudiantes = new Estudiante[10];
        listaEstudiantes[0] = new Estudiante();

        System.out.println(listaEstudiantes.length);*/











    }
}