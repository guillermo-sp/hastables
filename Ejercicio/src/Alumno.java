
public class Alumno {
    private Asignatura asig1,asig2,asig3;
    public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3){
        this.asig1 = asig1;
        this.asig2 = asig2;
        this.asig3 = asig3;
    }
    // con este constructor establecemos un valor al identificador de cada asignatura.
    public Alumno (int a1, int a2, int a3){
        this.asig1 = new Asignatura(a1);
        this.asig2 = new Asignatura(a2);
        this.asig3 = new Asignatura(a3);
    }
    public Asignatura getAsig1(){
        return asig1;
    }public Asignatura getAsig2(){
        return asig2;
    }public Asignatura getAsig3(){
        return asig3;
    }

}

