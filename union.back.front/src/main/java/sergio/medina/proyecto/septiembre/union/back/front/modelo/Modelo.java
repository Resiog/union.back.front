// Leyenda:
// BD = Base de datos
// M = Modelo.java
// I = Interfaz.java
// S = Servicios.java
// C = Controlador.java

package sergio.medina.proyecto.septiembre.union.back.front.modelo;
import jakarta.persistence.*;

//1º Creo el modelo (esta clase) que tomará datos de la BD por lo que debe indicarse datos correctamente.

@Entity
@Table (name="poderosos")
public class Modelo {
    //---Variables
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Investigar acerca de Identity y otras posibiidades
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="ojos")
    private int ojos;
    //---Variables

    //---Constructores
    public Modelo(){
    }
    //↑ Necesario constructor vacío para poder mostrar el GET de muestralo() en C.

    public Modelo(String nombre, int ojos){
        this.nombre = nombre;
        this.ojos = ojos;
    }
    //↑ Constructor con 2 parámetros (nombre, ojos)

    //---Constructores

    //---Métodos
    @Override
    public String toString(){
        return "\nMonstruo número: " + this.getId() +
                "\nNombre: " + this.getNombre() +
                "\nCantidad de ojos: " + this.getOjos();
    }
    //↑ Muestra este formato cuando se llama a mostrar() de S.

    //---Métodos

    //---Setter y Getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getOjos() {
        return ojos;
    }
    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    //---Setter y Getters
}
