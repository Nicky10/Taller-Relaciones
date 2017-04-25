package TR4;

import java.util.GregorianCalendar;


public class Fecha {

    private int Day;
    private int Month;
    private int Year;
    private String diaSemana;
    private String Mes;

    public Fecha() {
    }

    public Fecha(long fecha) {
        java.util.Calendar date = new GregorianCalendar();
    }

    public Fecha(int dia, int mes, int año) {
        this.Day = dia;
        this.Month = mes;
        this.Year = año;
        this.diaSemana = this.SetNombreDia(dia, mes, año);
        this.Mes = this.getNombreMes(mes);
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    

    private String getNombreMes(int mes) {
        switch (mes % 12) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
                
        }
    }

    private String SetNombreDia(int dia, int mes, int año) {

        if (mes == 1) {
            mes = 13;
            año--;
        }
        
        if (mes == 2) {
            mes = 14;
            año--;
        }

        int day = (int) ((dia + Math.floor(2.6 * (mes + 1)) + (año % 100) + 
                Math.floor((año % 100) / 4) + 
                Math.floor(((año - (año % 100)) / 100) / 4) - 
                (2*((año - (año % 100)) / 100))) % 7);
        
        switch(day){
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miercoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 0:
                return "Sábado";
            default:
                return "Algo Salio Mal";
        }
        
    }
    
    @Override
    public String toString(){
        return diaSemana + " " + Day + " de " + Mes + " de " + Year;
    }

}
