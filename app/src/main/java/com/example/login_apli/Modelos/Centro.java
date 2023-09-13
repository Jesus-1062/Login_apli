package com.example.login_apli.Modelos;

public class Centro {
    private String _id;
    private String codigo;
    private String nombre;
    private Regional regional;
    private String municipio;
    private int __V;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
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
