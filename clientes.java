public class Clientes {

    private String nombre;
    private String apellido;
    private int numeroDocumento;
    private int numeroContacto;
    private String direccioResidencia;

//metodo constructor,VACIO    
    public Clientes() {
    }
    
//metodo constructor, con Parametros
    public Clientes(String nombre, String apellido, int numeroDocumento, int numeroContacto, String direccioResidencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.numeroContacto = numeroContacto;
        this.direccioResidencia = direccioResidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccioResidencia() {
        return direccioResidencia;
    }

    public void setDireccioResidencia(String direccioResidencia) {
        this.direccioResidencia = direccioResidencia;
    }
    
    

}