package apiproyectogrupo.apiproyectogrupo.modelos;

import jakarta.persistence.*;
@Entity // se coloca en el foco para importar la PlantillaNota que lo identifica como una entidad
@Table(name = "Plantilla_Notas")
// Se colocan la clase con sus columnas
public class PlantillaNota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_plantilla")
    private long idPlantilla; 
/*El @ManyToOne en java esta diciendo que la relacion es de muchos a muchos 
y con el @JoinColumn se hace la relacion luego vamos a probar y a revisar en sql 
el diagrama*/
   @ManyToOne
   @JoinColumn(name = "Num_Matricula", referencedColumnName = "Num_Matricula")
   private Alumno numMatricula;

   @Column(name = "Fecha_inicio_semestre", length = 10)
   private String fechaInicioSemestre;

   @Column(name = "Fecha_terminacion_semestre", length = 10)
   private String fechaTerminacionSemestre;

    public long getIdPlantillaNota() {
        return idPlantilla;
    }

    public Alumno getNumMatricula() {
        return numMatricula;
    }

    public String getFechaInicioSemestre() {
        return fechaInicioSemestre;
    }

    public String getFechaTerminacionSemestre() {
        return fechaTerminacionSemestre;
    }
    public void setIdPlantillaNota(long IdPlantillaNota) {
        this.idPlantilla = IdPlantillaNota;
    }

    public void setNumMatricula(Alumno numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setFechaInicioSemestre(String fechaterminacionSemestre) {
        this.fechaTerminacionSemestre = fechaterminacionSemestre;
    }

    public void setFechaTerminacionSemestre(String fechaterminacionSemestre) {
        this.fechaTerminacionSemestre = fechaterminacionSemestre;
    }
    
}
