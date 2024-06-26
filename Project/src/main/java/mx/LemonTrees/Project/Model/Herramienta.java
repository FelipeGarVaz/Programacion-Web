package mx.LemonTrees.Project.Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Herramienta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id_Herramienta;

    @Column (nullable = false, length = 30)
    private String Modelo;

    @Column (nullable = false, length = 30)
    private String Marca;

    @Column (nullable = false)
    private int Cantidad;

    @Column (nullable = false, length = 10)
    private String Color;

    @Column (nullable = false)
    private float Costo;

    @Column (nullable = false)
    private Date Fecha_Adquisicion;

    @OneToMany(mappedBy = "herramienta", cascade = CascadeType.ALL)
    private List<Trabajador> trabajador;

    public Herramienta() {

    }

    public Herramienta(String modelo, String marca, int cantidad, String color, float costo, Date fecha_Adquisicion) {

        Modelo = modelo;
        Marca = marca;
        Cantidad = cantidad;
        Color = color;
        Costo = costo;
        Fecha_Adquisicion = fecha_Adquisicion;
    }


    public Integer getId_Herramienta() {
        return Id_Herramienta;
    }

    public void setId_Herramienta(Integer id_Herramienta) {
        Id_Herramienta = id_Herramienta;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        Costo = costo;
    }

    public Date getFecha_Adquisicion() {
        return Fecha_Adquisicion;
    }

    public void setFecha_Adquisicion(Date fecha_Adquisicion) {
        Fecha_Adquisicion = fecha_Adquisicion;
    }

    public List<Trabajador> getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(List<Trabajador> trabajador) {
        this.trabajador = trabajador;
    }
}
