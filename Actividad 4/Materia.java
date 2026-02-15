public class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    public double horas;
    public Profesor profesor;
    public Materia(){
        this.nombre="Sin Nombre";
        this.clave="Sin clave";
        this.creditos=0;
        this.horas=0;
        this.profesor=null;
    }
    public Materia(String nombre, String clave, int creditos, double horas){
        this.nombre=nombre;
        this.clave=clave;
        this.creditos=creditos;
        this.horas=horas;
    }
    public Materia(Materia materia){
        this.nombre=materia.nombre;
        this.clave=materia.clave;
        this.creditos=materia.creditos;
        this.horas=materia.horas;
    }
    public String getNombrem(){
        return nombre;
    }
    public String getClave(){
        return clave;
    }
    public int getCreditos(){
        return creditos;
    }
    public double getHoras(){
        return horas;
    }
    public Profesor getProfesor(){
        return profesor;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    public void resumenmateria(){
        System.out.println("Nombre de la materia: "+nombre);
        System.out.println("Clave: "+clave);
        System.out.println("Creditos necesarios: "+creditos);
        System.out.println("Horas a la semana: "+horas);
        if (profesor==null){
            System.out.println("Sin profesor encargado");
        }else{
            System.out.println("Profesor encargado: "+profesor.getNombrep());
        }
    }
}
