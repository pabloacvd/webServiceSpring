package ar.com.xeven.webservicespring;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class ClienteEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombre;
    private String cargo;
    private String empresa;
    private String telefono;
    private String mail;

    public ClienteEntity() {
    }

    public ClienteEntity(Integer idCliente, String nombre, String cargo, String empresa, String telefono, String mail) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cargo = cargo;
        this.empresa = empresa;
        this.telefono = telefono;
        this.mail = mail;
    }

    public ClienteEntity(String nombre, String cargo, String empresa, String telefono, String mail) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.empresa = empresa;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
