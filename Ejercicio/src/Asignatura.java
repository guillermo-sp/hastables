// una clase crea el molde para despues crear el objeto con el nombre de la clase, el nombre de la clase representa un tipo de objeto.
public class Asignatura {
    private int identificador1 = 0 ;
    private double calificacion;

    {
        calificacion = 0;
    }
    // este es el constructor para crear una asignatura
    public  Asignatura( int identificador1) {
        this.identificador1 = identificador1;
        this.calificacion = 0.0;
    }

    public int getIdentificador(){
        return identificador1 ;
    }

    public double getCalificacion(){
        return calificacion ;
    }
    public void setCalificacion(double calificacion){
        this.calificacion = Math.random()*10)

    }

}
