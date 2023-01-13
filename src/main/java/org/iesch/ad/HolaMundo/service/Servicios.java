package org.iesch.ad.HolaMundo.service;

import org.springframework.stereotype.Service;

@Service
public class Servicios {

    public String daleLaVuelta(String texto) {
        String nstr = "";
        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
    public String  calcularLetra(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        char caracter = caracteres.charAt(resto);
        return String.valueOf(dni) + caracter;
    }
}
