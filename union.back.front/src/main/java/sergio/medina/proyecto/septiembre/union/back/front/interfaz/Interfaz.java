package sergio.medina.proyecto.septiembre.union.back.front.interfaz;


import org.springframework.data.jpa.repository.JpaRepository;
import sergio.medina.proyecto.septiembre.union.back.front.modelo.Modelo;

public interface Interfaz extends JpaRepository<Modelo, Integer> {
}
