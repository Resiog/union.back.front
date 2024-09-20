package sergio.medina.proyecto.septiembre.union.back.front.interfaz;


import org.springframework.data.jpa.repository.JpaRepository;
import sergio.medina.proyecto.septiembre.union.back.front.modelo.Modelo;

public interface Interfaz extends JpaRepository<Modelo, Integer> {
}
//↑ La interfaz en bruto de la que extiende es JpaRepository<T,ID>, debiendo ser ID del mismo tipo
// que la clave principal de la entidad T. La entidad T es "Modelo", cuyo ID es de tipo int.
