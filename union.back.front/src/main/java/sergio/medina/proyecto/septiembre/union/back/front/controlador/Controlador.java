package sergio.medina.proyecto.septiembre.union.back.front.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sergio.medina.proyecto.septiembre.union.back.front.modelo.Modelo;
import sergio.medina.proyecto.septiembre.union.back.front.servicios.Servicios;

import java.util.List;

@RestController
@RequestMapping("/listado")
public class Controlador {

    @Autowired
    private Servicios servicio;

//    @GetMapping
//    public List<Modelo> muestralo(){
//        return servicio.mostrar();
//    }

    @GetMapping
    public String muestralo(){
        return servicio.mostrar();
    }

    @PostMapping
    public Modelo insertarCriatura (@RequestBody Modelo kami){
        return servicio.insertar(kami);
    }

    @PutMapping
    public Modelo actualizarCriatura(@RequestBody Modelo kami){ //Entra un modelo de Kami
        return servicio.actualizar(kami); //Retorna la función ejecutada en Servicios tomando kami como parámetro
    }

    @GetMapping("/{id}")
    public String compruebaId(@PathVariable int id){
        return servicio.comprobarSiId(id);
    }

    @DeleteMapping("/{id}")
    public List<Modelo> borrar(@PathVariable int id){
        return servicio.borrar(id);
    }
}
