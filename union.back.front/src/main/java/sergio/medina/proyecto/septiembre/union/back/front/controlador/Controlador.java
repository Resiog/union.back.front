package sergio.medina.proyecto.septiembre.union.back.front.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sergio.medina.proyecto.septiembre.union.back.front.modelo.Modelo;
import sergio.medina.proyecto.septiembre.union.back.front.servicios.Servicios;
import java.util.List;

@RestController
@RequestMapping("/listado") //Debe ingresarse a localhost:8080/listado
public class Controlador {

    @Autowired
    private Servicios servicio;

//    @GetMapping
//    public List<Modelo> muestralo(){
//        return servicio.mostrar();
//    }
//    Método comentado para obtener listado en formato List<Modelo>

    @GetMapping
    public String muestralo(){
        return servicio.mostrar();
    }
    //↑ Método GET, accede a método mostrar() de Servicios.java y retorna resultado, mostrando un String en pantalla.

    @PostMapping
    public Modelo insertarCriatura (@RequestBody Modelo kami){
        return servicio.insertar(kami);
    }
    //↑ Método POST, accede a insertar(Modelo insertarKami) de Servicios.java. Retorna una clase Modelo
    // con método .save lo que hace guardar lo insertado en el listado de la BD.

    @PutMapping
    public Modelo actualizarCriatura(@RequestBody Modelo kami){ //Entra un modelo de Kami
        return servicio.actualizar(kami); //Retorna la función ejecutada en Servicios tomando kami como parámetro
    }
    //↑ Método PUT, accede a actualizar(Modelo actualizarKami) de Servicios.java. Retorna una clase Modelo
    // con método .save si encuentra registro a partir de ID, actualizando lo insertado en BD.

    @GetMapping("/{id}")
    public String compruebaId(@PathVariable int id){
        return servicio.comprobarSiId(id);
    }
    //↑ Método GET, accede a comprobarSiId(int id) de Servicios.java. Retorna una clase String informando del
    // nombre del kami relacionado con el id insertado.

    @DeleteMapping("/{id}")
    public List<Modelo> borrar(@PathVariable int id){
        return servicio.borrar(id);
    }
    //↑ Método DELETE, accede a borrar(int id) de Servicios.java. Retorna una lista con la actualización de
    // la BD a efectos de comprobar que se ha borrado el kami elegido mediante el ID.
}
