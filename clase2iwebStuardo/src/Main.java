import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Persona ppp = new Persona();
        ppp.comer();

        Persona.dormir(5,6);
        Persona.texto = "chauuuu";

        Persona personapp = null;

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int j = 0;
        do{
            j++;
        }while(j <= 10);

        for(int w = 0; w <= 100;) {
            System.out.println(w);
            //otras cosas
        }

        iteracion: while (true) {
            System.out.println("Bienvenido a mi plataforma");
            System.out.println("----- Seleccione la opción ----");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Borrar");
            System.out.println("4. Salir");
            System.out.print("-----> Opción: ");

            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine();

            int opcionNum = Integer.parseInt(opcion);


            switch (opcion) {
                case "1" -> {
                    personapp = new Persona();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    personapp.setNombre(nombre);

                    System.out.print("Ingrese dni: ");
                    String dni = scanner.nextLine();
                    personapp.setDni(dni);

                }
                case "2" -> {
                    if (personapp == null) {
                        System.out.println("no se ha creado la persona :/");
                    } else {
                        System.out.println(personapp.getNombre() + "| " + personapp.getDni());
                    }
                }
                case "4" -> {
                    break iteracion;
                }
            }
        }

        //ejemplo tipo de dato por referencia /////
        Curso curso = new Curso();
        int x = 5;
        curso.suma1(x);
        System.out.println(x);
// todo
        Estudiante ee = new Estudiante();
        ee.edad = 20;
        curso.sumaEdad(ee);
        System.out.println(ee.edad);

        System.out.println(curso);
        ////////////////////////////////

        Curso c2 = new Curso();
        c2.setCodigo("tel111");
        Estudiante e2 = new Estudiante();
        e2.setCurso2(c2);

        c2.setCodigo("tel000");

        e2.setCurso1(new Curso("iee111"));
        System.out.println(e2.getCurso1().getCodigo());
        e2.getCurso1().setCodigo("iee000");
        System.out.println(e2.getCurso1().getCodigo());
        Curso cursoTemp = e2.getCurso1();
        cursoTemp.setCodigo("iee222");
        System.out.println(e2.getCurso1().getCodigo());

        Persona p = new Persona();
        p.comer();

        Estudiante e1 = new Estudiante();
        e1.setNombre("Carlos");

        Curso curso1 = new Curso();
        curso1.setCodigo("tel131");

        e1.setCurso1(curso1);
        e1.setCurso2(new Curso("tel137"));


    }
}