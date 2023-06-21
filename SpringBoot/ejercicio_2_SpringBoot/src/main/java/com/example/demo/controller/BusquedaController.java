package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class BusquedaController {
    static List<String> nombresApellidos = new ArrayList<>(List.of("Juan Pérez", "María Gómez", "Carlos Rodríguez", "Laura Torres",
            "Pedro López", "Ana Martínez", "Luis Sánchez", "Sara Ramírez", "Andrés Fernández", "Mónica Herrera"));

    @GetMapping("/busqueda/{busqueda}")
    public List<String> obtenerNombre(@PathVariable String busqueda) {

        List<String> resultadoBusqueda = new ArrayList<>();

        for (String elemento : nombresApellidos) {
            if (elemento.contains(busqueda)) {
                resultadoBusqueda.add(elemento);
            }
        }
        return resultadoBusqueda;
    }


    @GetMapping("/eliminar/{nombre}")
    public String eliminarNombre(@PathVariable String nombre) {
        Iterator<String> iterator = nombresApellidos.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.contains(nombre)) {
                iterator.remove();
            }
        }
        return "Nombre " + "«" + nombre + "»" + " Eliminado Correctamente";
    }
}
