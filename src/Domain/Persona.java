package Domain;

public class Persona {

private String Nombre, Apellido1, Apellido2, fechaDeNacimiento,Pais;
private int cedula,cedulaPadre;

    public Persona(String Nombre, String Apellido1, String Apellido2, String fechaDeNacimiento, String Pais, int cedula, int cedulaPadre) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.Pais = Pais;
        this.cedula = cedula;
        this.cedulaPadre = cedulaPadre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedulaPadre() {
        return cedulaPadre;
    }

    public void setCedulaPadre(int cedulaPadre) {
        this.cedulaPadre = cedulaPadre;
    }
    
}
