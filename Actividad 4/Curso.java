public class Curso {
    private String nombre;
    private Materia m1;
    private Materia m2;
    private Materia m3;
    public Curso(){
        this.nombre="Sin nombre";
        this.m1 = null;
        this.m2 = null;
        this.m3 = null;
    }
    public Curso(String nombre, Materia m1, Materia m2, Materia m3){
        this.nombre=nombre;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public Curso(Curso curso){
        this.nombre= curso.nombre;
        this.m1 = curso.m1;
        this.m2 = curso.m2;
        this.m3 = curso.m3;
    }
    public String getNombrec(){
        return nombre;
    }
    public Materia getM1(){
        return m1;
    }
    public Materia getM2(){
        return m2;
    }
    public Materia getM3(){
        return m3;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setM1(Materia m1){
        this.m1 = m1;
    }
    public void calcularcreditos(Materia m1, Materia m2, Materia m3){
        int calculo = m1.getCreditos() + m2.getCreditos() + m3.getCreditos();
        System.out.println("Creditos totales del curso: "+calculo);
    }
    public void resumencurso(){
        System.out.println("Nombre del curso: "+nombre);
        System.out.println("Materias: \n 1.-"+m1.getNombrem()+"\n 2.-"+m2.getNombrem()+"\n 3.-"+m3.getNombrem());
        calcularcreditos(m1,m2,m3);
    }
}
