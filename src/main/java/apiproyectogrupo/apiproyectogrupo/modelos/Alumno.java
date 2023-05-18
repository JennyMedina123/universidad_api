package apiproyectogrupo.apiproyectogrupo.modelos;

import jakarta.persistence.*;

@Entity // se coloca en el foco para importar la libreria que lo identifica como una entidad
@Table(name = "Alumnos")
// Se colocan la clase con sus columnas
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Num_Matricula")
    private long numMatricula;
    
   @Column(name = "Nombre", length = 40)
   private String nombre;

   @Column(name = "Fecha_Nacimiento", length = 10)
   private String fechaNacimiento;

   @Column(name = "Telefono", length = 40)
   private String telefono;

    public long getIdAlumno() {
        return numMatricula;
    }

    public String getNombreAlumno() {
        return nombre;
    }

    public String getFecha_Nacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setIdAlumno(long IdAlumno) {
        this.numMatricula = IdAlumno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}