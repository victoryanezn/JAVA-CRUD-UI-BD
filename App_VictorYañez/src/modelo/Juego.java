/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author CETECOM
 */
public class Juego {

    private String id_juego;
    private String nombre_juego;
    private int precio_juego;
    private String descripcion;
    private boolean es_multijugador;
    private boolean oferta;
    private String tipoJuego;

    public Juego() {
    }
//-----------------------------------------------------------------

    public String getId_juego() {
        return id_juego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public int getPrecio_juego() {
        return precio_juego;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEs_multijugador() {
        return es_multijugador;
    }

    public boolean isOferta() {
        return oferta;
    }

    public String getTipoJuego() {
        return tipoJuego;
    }

//--------------------------------------------------------------
    public void setId_juego(String id_juego) {
        this.id_juego = id_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public void setPrecio_juego(int precio_juego) {
        this.precio_juego = precio_juego;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEs_multijugador(boolean es_multijugador) {
        this.es_multijugador = es_multijugador;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    @Override
    public String toString() {
        return "Juego{" + "id_juego=" + id_juego + ", nombre_juego=" + nombre_juego + ", precio_juego=" + precio_juego + ", descripcion=" + descripcion + ", es_multijugador=" + es_multijugador + ", oferta=" + oferta + ", tipoJuego=" + tipoJuego + '}';
    }

}
