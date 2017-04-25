package TR2;


public class Tipo {
    
    private String codigo;

    public Tipo(String codigo) {
        this.codigo = codigo;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int movimiento() {
        switch(this.codigo){
            case "Retiro":
                return 1;                
            case "Deposito":
                return 2;
            default:
                return 0;                           
        }
    }
    
    @Override
    public String toString() {
        return "Tipo de Movimiento: " + codigo;
    }
    
}
