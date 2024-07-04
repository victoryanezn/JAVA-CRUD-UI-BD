package controlador;

import modelo.Juego;
import bd.Conexion;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class RegistroJuego {

    public boolean agregarJuego(Juego juego) {
        try {
            // Vamos a establecer comunicación con la BD
            Connection conexion = Conexion.getConexion();
            // creamos la query a ejecutar
            String query = "INSERT INTO Juegos(id_juego, nombre_juego,"
                    + "descripcion, precio_juego,es_multijugador,oferta,tipoJuego) VALUES(?,?,?,?,?,?,?)";
            // Preparo el estamento a ejecutar
            PreparedStatement ins = conexion.prepareStatement(query);
            // reemplazamos los comodines (?) por su respectivo valor
            ins.setString(1, juego.getId_juego());
            ins.setString(2, juego.getNombre_juego());
            ins.setString(3, juego.getDescripcion());
            ins.setInt(4, juego.getPrecio_juego());
            ins.setBoolean(5, juego.isEs_multijugador());
            ins.setBoolean(6, juego.isOferta());
            ins.setString(7, juego.getTipoJuego());

            if (ins.executeUpdate() > 0) {
                return true;  //--> GRABO EXITOSAMENTE!!
            }
        } catch (Exception e) {
            System.out.println("Error al agregar " + e.getMessage());
        }
        return false; //--> NO GRABO!!!!
    }//--> fin del método agregar

    public boolean eliminarJuego(String id_juego) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "DELETE FROM juegos WHERE id_juego=?";
            PreparedStatement del = conexion.prepareStatement(query);
            del.setString(1, id_juego);
            if (del.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar " + e.getMessage());
        }
        return false;
    }

    public ArrayList<Juego> buscarPorNombre(String nombre) {
        ArrayList<Juego> lista = new ArrayList<>();
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM juegos WHERE nombre_juego=?";
            PreparedStatement bus = conexion.prepareStatement(query);
            bus.setString(1, nombre);
            ResultSet rs = bus.executeQuery();
            while (rs.next()) {
                Juego jue = new Juego();
                jue.setId_juego(rs.getString("id_juego"));
                jue.setNombre_juego(rs.getString("nombre_juego"));
                jue.setDescripcion(rs.getString("descripcion"));
                jue.setPrecio_juego(rs.getInt("precio_juego"));
                jue.setEs_multijugador(rs.getBoolean("es_multijugador"));
                jue.setOferta(rs.getBoolean("oferta"));
                jue.setTipoJuego(rs.getString("tipoJuego"));
                
                lista.add(jue);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar por nombre " + e.getMessage());
        }
        return lista;
    }

    public ArrayList<Juego> buscarPorTipoJuego(String tipoJuego) {
        ArrayList<Juego> lista = new ArrayList<>();
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM juegos WHERE tipoJuego=?";
            PreparedStatement bus = conexion.prepareStatement(query);
            bus.setString(1, tipoJuego);
            ResultSet rs = bus.executeQuery();
            while (rs.next()) {
                Juego jue = new Juego();
                jue.setId_juego(rs.getString("id_juego"));
                jue.setNombre_juego(rs.getString("nombre_juego"));
                jue.setDescripcion(rs.getString("descripcion"));
                jue.setPrecio_juego(rs.getInt("precio_juego"));
                jue.setEs_multijugador(rs.getBoolean("es_multijugador"));
                jue.setOferta(rs.getBoolean("oferta"));
                jue.setTipoJuego(rs.getString("tipoJuego"));
                lista.add(jue);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar por tipo " + e.getMessage());
        }
        return lista;
    }

    public boolean modificarJuego(Juego juego) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "update juegos set nombre_juego=?, precio_juego=?, descripcion=?, es_multijugador=?, oferta=?, tipoJuego=?, id_juego=?";
            PreparedStatement mod = conexion.prepareStatement(query);
            mod.setString(1, juego.getId_juego());
            mod.setString(2, juego.getNombre_juego());
            mod.setInt(3, juego.getPrecio_juego());
            mod.setString(4, juego.getDescripcion());
            mod.setBoolean(5, juego.isEs_multijugador());
            mod.setBoolean(6, juego.isOferta());
            mod.setString(7, juego.getTipoJuego());
            if (mod.executeUpdate() > 0) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error al modificar " + e.getMessage());
        }
        return false;
    }

    public ArrayList<Juego> buscarPorTipoJuego(JComboBox<String> tipoJuego) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
