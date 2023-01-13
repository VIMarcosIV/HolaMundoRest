package org.iesch.ad.HolaMundo.services;

import org.iesch.ad.HolaMundo.service.Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludador {

    @Autowired
    Servicios servicios;

    @GetMapping("/saluda")
    public String saluda(@RequestParam String nombre) {
        System.out.println("Se conecto: " + nombre);
        return "¡Hola, " + nombre + "!";
    }

    @GetMapping("/dalelavuelta")
    public String vuelta(@RequestParam String palabra) {
        String textoAlReves = servicios.daleLaVuelta(palabra);
        return textoAlReves;
    }

    @GetMapping("/calculaLetraDNI")
    public String  dni (@RequestParam int dniNumero){
    String dni = servicios.calcularLetra(dniNumero);
    return dni;
    }

}
