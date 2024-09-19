package sergio.medina.proyecto.septiembre.union.back.front.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergio.medina.proyecto.septiembre.union.back.front.interfaz.Interfaz;
import sergio.medina.proyecto.septiembre.union.back.front.modelo.Modelo;

import java.util.List;
import java.util.Optional;

@Service
public class Servicios {

    @Autowired
    private Interfaz interfaz;

//    public List<Modelo> mostrar(){
//        return interfaz.findAll();
//    }

    public String mostrar(){
        return interfaz.findAll().toString();
    }

    public Modelo insertar(Modelo insertarKami){
        return interfaz.save(insertarKami);
    }

    public String comprobarSiId(int id){
        Modelo kamiBuscado = interfaz.findById(id).orElse(null);
        return kamiBuscado.getNombre();
    }

    public Modelo actualizar(Modelo actualizarKami){ //Entra un modelo de Kami y retorna un Modelo
        int id = actualizarKami.getId(); //Se obtiene el id del modelo que entra
        Modelo aCambiar = interfaz.findById(id).orElse(null); //Busca por ID el modelo
        if(aCambiar != null){ //Si los valores del modelo que entran no son nulos
            aCambiar.setNombre(actualizarKami.getNombre()); //Cambia nombre
            aCambiar.setOjos(actualizarKami.getOjos());  //Cambia ojos
        }
        return interfaz.save(aCambiar); //Retorna guardando el modelo encontrado por ID y que fue cambiado
    }

    public List<Modelo> borrar(int id){
        if (interfaz.existsById(id) == true){
            interfaz.deleteById(id);
        }else{
            return interfaz.findAll();
        }
        return interfaz.findAll();
    }
}
