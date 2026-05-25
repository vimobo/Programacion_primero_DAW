package ej3;

import ej3.mes.EnumMes;

public class Fecha {
    private int dia;
    private EnumMes mes;
    private int anio;

    public Fecha(int dia, EnumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public static void main(String[] args) {
        Fecha f = new Fecha(12, EnumMes.Enero, 2000);
        System.out.println(f.mes);
    }
}