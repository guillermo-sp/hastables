public class Entrada {
    public static void main(String[] args) {
        //crear asignaturas dandolas un identificador
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1,asignatura2,asignatura3);
        //OTRA FORMA DE CREAR UN ALUMNO CON CADA ASIGNATRURA
        Alumno alumno1 = new Alumno(1,2,3);

        Profesor profesor = new Profesor();

        profesor.PonerNotas(alumno);
        System.out.println("Nota de de marzo");
        System.out.println(alumno.getAsig1().setCalificacion());

        profesor.PonerNotas(alumno1);
        System.out.println("Nota de de junio");
        System.out.println(alumno1.getAsig1().setCalificacion());


    }
}
