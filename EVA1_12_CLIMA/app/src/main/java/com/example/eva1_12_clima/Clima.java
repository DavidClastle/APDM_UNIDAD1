package com.example.eva1_12_clima;

public class Clima {
    private int imagen;
    private String ciudad;
    private Double temp;
    private String desc;

    public Clima() {
        this.imagen= R.drawable.sunny;
        this.ciudad= "Camargo";
        this.temp= 27.3;
        this.desc ="Rojo atardecer con crepusculos arrebolados";

    }

    public Clima(int imagen, String ciudad, Double temp, String desc) {
        this.imagen = imagen;
        this.ciudad = ciudad;
        this.temp = temp;
        this.desc = desc;
    }

    public Clima(int tornado, String saucillo, int i, String aguas_que_te_vas) {
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
