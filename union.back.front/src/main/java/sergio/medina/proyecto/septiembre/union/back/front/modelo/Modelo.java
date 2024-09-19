package sergio.medina.proyecto.septiembre.union.back.front.modelo;


import jakarta.persistence.*;

@Entity
@Table (name="poderosos")
public class Modelo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="ojos")
    private int ojos;

    public Modelo(){
//        Es necesario este constructor vacío para que
//        pueda mostrarse el GET de muestralo() en Controlador
    }

    @Override
    public String toString(){
        return "\nMonstruo número: " + this.getId() +
                "\nNombre: " + this.getNombre() +
                "\nCantidad de ojos: " + this.getOjos();
    }

    public Modelo(String nombre, int ojos){
        this.nombre = nombre;
        this.ojos = ojos;
    }

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
}
