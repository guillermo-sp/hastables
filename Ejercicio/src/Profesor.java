import java.lang.management.ClassLoadingMXBean;

public class Profesor {

    public void PonerNotas (Alumno alumno) {
        //Esto es para localizar la asignatura del alumno
        Asignatura asignatura1 = alumno.getAsig1() ;
        Asignatura asignatura2 = alumno.getAsig2() ;
        Asignatura asignatura3 = alumno.getAsig3() ;
        // esto es para poner la calificacion de la asignatura
        asignatura1.setCalificacion(Math.random()*10);
        asignatura2.setCalificacion(Math.random()*10);
        asignatura3.setCalificacion(Math.random()*10);
    }

    public double CalcularMedia(Alumno alumno){
        Asignatura asignatura1 = alumno.getAsig1();
        Asignatura asignatura2 = alumno.getAsig2();
        Asignatura asignatura3 = alumno.getAsig3() ;

        double media = (asignatura1.getCalificacion() + asignatura2.getCalificacion() + asignatura3.getCalificacion()/3);


        return media
                ;

    }
}
