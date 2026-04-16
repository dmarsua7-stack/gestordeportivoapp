package com.informaticatelde.gestordeportivo.app.model;

public class Telefono {

    private String dniJug;
    private String telefono01;
    private String telefono02;
    private String telefono03;


    public Telefono (String dniJug, String telefono01, String telefono02, String telefono03){
        this.dniJug = dniJug;
        this.telefono01 = telefono01;
        this.telefono02 = telefono02;
        this.telefono03 = telefono03;

    }


    public String getDniJug() {
        return dniJug;
    }

    public void setDniJug(String dniJug) {
        this.dniJug = dniJug;
    }

    public String getTelefono01() {
        return telefono01;
    }

    public void setTelefono01(String telefono01) {
        this.telefono01 = telefono01;
    }

    public String getTelefono02() {
        return telefono02;
    }

    public void setTelefono02(String telefono02) {
        this.telefono02 = telefono02;
    }

    public String getTelefono03() {
        return telefono03;
    }

    public void setTelefono03(String telefono03) {
        this.telefono03 = telefono03;
    }

}
