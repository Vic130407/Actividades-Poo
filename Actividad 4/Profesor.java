public class Profesor{
    private String nombre;
    private String nomina;
    private double salario;
    private Materia materia;
    public Profesor(){
        this.nombre="Sin nombre";
        this.nomina="Sin informacion de nomina";
        this.salario = 0;
        this.materia = null;
    }
    public Profesor(String nombre, String nomina, double salario){
        this.nombre = nombre;
        this.nomina = nomina;
        this.salario = salario;
        }
    public Profesor (Profesor profesor){
        this.nombre= profesor.nombre;
        this.nomina = profesor.nomina;
        this.salario = profesor.salario;
        this.materia = profesor.materia;
    }
    public String getNombrep(){
        return nombre;
    }
    public String getNomina(){
        return nomina;
    }
    public double getSalario(){
        return salario;
    }
    public Materia getMateria(){
        return materia;
    }
    public void setMateria(Materia materia){
        this.materia = materia;
    }
    public double salariosemanal(Materia materia, double salario){
        double calculo;
        if (materia==null){
            calculo=0;
        } else{
            calculo = materia.getHoras()*salario;
        }
        return calculo;
    }
    public void mostrarinfo(){
        System.out.println("Nombre del docente: "+nombre);
        System.out.println("Nomina: "+nomina);
        if (materia==null) {
            System.out.println("El profesor no imparte ninguna materia");
        }else{
            System.out.println("Materia que imparte: "+materia.getNombrem());
        }
        System.out.println("Salario semanal: "+salariosemanal(materia, salario));   
    }
}
