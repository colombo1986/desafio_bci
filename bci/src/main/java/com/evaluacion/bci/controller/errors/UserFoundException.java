package com.evaluacion.bci.controller.errors;

import org.springframework.util.MultiValueMap;

public class UserFoundException extends RuntimeException {
    private String mensaje;
    private String param;

    public UserFoundException(String mensaje, String param) {
        super("No encontrado : " + mensaje);
        this.mensaje = mensaje;
        this.param = param;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
