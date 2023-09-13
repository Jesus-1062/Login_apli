package com.example.login_apli.Modelos;

import java.util.ArrayList;

public class Sedes {
    private ArrayList<Centro> sedes;
    private String _id;
    private String nombre;
    private String lugar_funcionamiento;
    private String departamento;
    private String municipio;
    private int __V;

    public ArrayList<Centro> getSedes() {
        return sedes;
    }

    public void setSedes(ArrayList<Centro> sedes) {
        this.sedes = sedes;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_funcionamiento() {
        return lugar_funcionamiento;
    }

    public void setLugar_funcionamiento(String lugar_funcionamiento) {
        this.lugar_funcionamiento = lugar_funcionamiento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int get__V() {
        return __V;
    }

    public void set__V(int __V) {
        this.__V = __V;
    }
}
