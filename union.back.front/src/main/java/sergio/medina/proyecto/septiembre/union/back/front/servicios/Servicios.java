package sergio.medina.proyecto.septiembre.union.back.front.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergio.medina.proyecto.septiembre.union.back.front.interfaz.Interfaz;
import sergio.medina.proyecto.septiembre.union.back.front.modelo.Modelo;
import java.util.List;

@Service
public class Servicios {

    @Autowired
    private Interfaz interfaz;

//    public List<Modelo> mostrar(){
//        return interfaz.findAll();
//    }
//    ↑ Método para retornar un List<Modelo> en vez de un String

    public String mostrar(){
        return interfaz.findAll().toString();
    }
    //↑ Muestra listado, relacionado con GET de C.

    public Modelo insertar(Modelo insertarKami){
        return interfaz.save(insertarKami);
    }
    //↑ Permite insertar nuevos Kamis (seres sobrenaturales de la mitología japonesa), relacionado con POST de C.

    public String comprobarSiId(int id){
        Modelo kamiBuscado = interfaz.findById(id).orElse(null);
        return kamiBuscado.getNombre();
    }
    //↑ Permite obtener el nombre de un Kami mediante búsqueda por ID.

    public Modelo actualizar(Modelo actualizarKami){ //Entra un modelo de Kami y retorna un Modelo
        int id = actualizarKami.getId(); //Se obtiene el id del modelo que entra
        Modelo aCambiar = interfaz.findById(id).orElse(null); //Busca por ID el modelo
        if(aCambiar != null){ //Si los valores del modelo que entran no son nulos
            aCambiar.setNombre(actualizarKami.getNombre()); //Cambia nombre
            aCambiar.setOjos(actualizarKami.getOjos());  //Cambia ojos
        }
        return interfaz.save(aCambiar); //Retorna guardando el modelo encontrado por ID y que fue cambiado
    }
    //↑ Permite actualizar cualquier Kami mediante introducción id + datos. Se relaciona con UPDATE de C.

    public List<Modelo> borrar(int id){
        if (interfaz.existsById(id) == true){
            interfaz.deleteById(id);
        }else{
            return interfaz.findAll();
        }
        return interfaz.findAll();
    }
    //↑ Permite eliminar cualquier kami mediante introducción de su id. Se relaciona con DELETE de C.
}
