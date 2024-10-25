package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexiones.Conexion;
import entidades.Bicicleta;

public class DaoBicicleta {
	
	public DaoBicicleta() {
		
	}
	
	public ArrayList<Bicicleta> listadoBicicletas(){
		
		ArrayList<Bicicleta> listadoBicicletas = new ArrayList<Bicicleta>();
		
		Connection con = null;
		Conexion miconex = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT * FROM BICI";
		
		try {
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Bicicleta bici = new Bicicleta();
				bici.setIdBicicleta(rs.getInt("ID"));
				bici.setFoto(rs.getString("FOTO"));
				bici.setIdMarca(rs.getInt("MARCA"));
				bici.setDescripcion(rs.getString("DESCRIPCION"));
				bici.setPrecio(rs.getDouble("PRECIO"));
				bici.setFavorita(rs.getBoolean("FAV"));
				
				listadoBicicletas.add(bici);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listadoBicicletas;
	}

}
