
package TR3;


public class Segmento 
{
    private String Start;
    private String End;
    private String Name;
    private boolean bool = false;
    
    public Segmento(String i, String f)
    {
        this.Start = i;
        this.End = f;        
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getInicio() {
        return Start;
    }

    public String getFin() {
        return End;
    }

    public void setInicio(String inicio) {
        this.Start = inicio;
    }

    public void setNombre(String nombre) {
        this.Name = nombre;
    }

    public String getNombre() {
        return Name;
    }

    public void setFin(String fin) {
        this.End = fin;
    }
        
}
