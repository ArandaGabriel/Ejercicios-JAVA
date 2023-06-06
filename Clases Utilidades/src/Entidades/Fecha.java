package Entidades;

public class Fecha {
    
    private int anio;
    private int mes;
    private int dia;
    private long fec1, fec2, fec3;

    public Fecha(int anio, int mes, int dia, long fec1, long fec2, long fec3) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.fec1 = fec1;
        this.fec2 = fec2;
        this.fec3 = fec3;
    }

    public Fecha() {
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public long getFec1() {
        return fec1;
    }

    public long getFec2() {
        return fec2;
    }

    public long getFec3() {
        return fec3;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setFec1(long fec1) {
        this.fec1 = fec1;
    }

    public void setFec2(long fec2) {
        this.fec2 = fec2;
    }

    public void setFec3(long fec3) {
        this.fec3 = fec3;
    }
    
    


    
        
    
}
