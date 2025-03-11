package herencia;


public class alumno extends persona{
    private String codigoAlumno;

    public alumno() {
        super();
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
}
