package com.informaticatelde.gestordeportivo.app.model;

public class Email {

    private String idJugador;
    private String email01;
    private String email02;
    private String email03;

    public Email (String idJugador, String email01, String email02, String email03){
        this.idJugador = idJugador;
        this.email01 = email01;
        this.email02 = email02;
        this.email03 = email03;
    }


    public String getidJugador() {
        return idJugador;
    }

    public String getEmail01() {
        return email01;
    }

    public void setEmail01(String email01) {
        this.email01 = email01;
    }

    public String getEmail02() {
        return email02;
    }

    public void setEmail02(String email02) {
        this.email02 = email02;
    }

    public String getEmail03() {
        return email03;
    }

    public void setEmail03(String email03) {
        this.email03 = email03;
    }


}
