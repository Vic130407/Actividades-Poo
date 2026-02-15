public class Main {
    public static void main(String[]args){
    //Creamos las materias
    Materia m1 = new Materia("Biologia", "B1243", 4, 2.3);
    Materia m2 = new Materia(m1);
    m2.setNombre("Etica");
    Materia m3 = new Materia("Matematicas", "M1243", 5, 3.5);
    Materia m4 = new Materia (m3);
    m4.setNombre("Español");
    
    //Se crean los cursos en base a las materias
    Curso c1= new Curso("1er año", m1,m2,m3);
    Curso c2= new Curso(c1);
    c2.setM1(m4);
    
    //Se crean los estudiantes
    Estudiante e1= new Estudiante("Martin", "AL07139940", 18, c1);
    Estudiante e2 = new Estudiante(e1);
    e2.setCurso(c2);
    e2.setNombre("Marco");
    e2.setMatricula("AL0894523");
    
    //Se crean profesores
    Profesor p1= new Profesor("Ignacio","12329532",470);
    p1.setMateria(m1);
    m1.setProfesor(p1);
    Profesor p2 = new Profesor("Fiona", "123456789", 460);
    p2.setMateria(m4);
    m4.setProfesor(p2);
    Profesor p3 = new Profesor("Juan", "1241231",390); 
    
    System.out.println("Datos del sistema:");
    System.out.println("Materias: ");
    m1.resumenmateria();
    m2.resumenmateria();
    m3.resumenmateria();
    m4.resumenmateria();
    System.out.println("\nEstudaintes:");
    e1.resumenestudiante();
    e2.resumenestudiante();
    System.out.println("\nProfesores: ");
    p1.mostrarinfo();
    p2.mostrarinfo();
    p3.mostrarinfo();
    }
}
