public class Estudiante {
    private String nombre;
    private String matricula;
    private int edad;
    Curso curso;
    public Estudiante(){
    this.nombre="Sin nombre";
    this.matricula="Sin matricula";
    this.edad=0;
    this.curso=null;
    }
    public Estudiante(String nombre, String matricula, int edad, Curso curso){
    this.nombre=nombre;
    this.matricula=matricula;
    this.edad=edad;
    this.curso=curso;
    }
    public Estudiante(Estudiante estudiante){
    this.nombre=estudiante.nombre;
    this.matricula=estudiante.matricula;
    this.edad=estudiante.edad;
    this.curso=estudiante.curso;
    }
    public String getNombre(){
        return nombre;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getEdad(){
        return edad;
    }
    public Curso getCurso(){
        return curso;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setCurso(Curso curso){
        this.curso=curso;
    }
    public void resumenestudiante(){
        System.out.println("Nombre del esttudiante: "+nombre);
        System.out.println("Matricula: "+matricula);
        System.out.println("Edad: "+edad);
        System.out.println("\n Informacion del curso: ");
        curso.resumencurso();
    }
}
