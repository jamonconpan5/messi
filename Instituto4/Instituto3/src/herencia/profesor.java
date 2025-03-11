package herencia;


public class profesor extends persona{
    private String codigoDocente;

    public profesor() {
        super();
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
}
