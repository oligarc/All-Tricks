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
				bici.setFavorita(rs.getInt("FAV"));
				
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
	
	public ArrayList<Bicicleta> listadoBicicletasTrampa(){
		
		ArrayList<Bicicleta> listadoBicicletas = new ArrayList<Bicicleta>();
		
		Connection con = null;
		Conexion miconex = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT B.ID,B.FOTO,B.MARCA,B.DESCRIPCION,B.PRECIO,B.FAV,M.NOMBRE "
				+ "FROM BICI B JOIN MARCA M ON B.MARCA=M.ID";
		
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
				bici.setFavorita(rs.getInt("FAV"));
				bici.setNombreMarca(rs.getString("NOMBRE"));
				
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
	
	public ArrayList<Bicicleta> listadoBicicletaPorMarca(String marca){
		
		
		ArrayList<Bicicleta> listadoBicicletas = new ArrayList<Bicicleta>();
		
		Connection con = null;
		Conexion miconex = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "SELECT B.ID,B.FOTO,B.MARCA,B.DESCRIPCION,B.PRECIO,B.FAV,M.NOMBRE "
				+ "FROM BICI B JOIN MARCA M ON B.MARCA=M.ID "
				+ "WHERE LOWER(M.NOMBRE)=LOWER(?)";
		
		try {
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, marca);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Bicicleta bici = new Bicicleta();
				
				bici.setIdBicicleta(rs.getInt("ID"));
				bici.setFoto(rs.getString("FOTO"));
				bici.setIdMarca(rs.getInt("MARCA"));
				bici.setDescripcion(rs.getString("DESCRIPCION"));
				bici.setPrecio(rs.getDouble("PRECIO"));
				bici.setFavorita(rs.getInt("FAV"));
				bici.setNombreMarca(rs.getString("NOMBRE"));
				
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
	
	public ArrayList<Bicicleta> listadoBicicletasMarcaOrdenFavorito(String marca,String orden,int fav){
		
		
		ArrayList<Bicicleta> listadoBicicletas = new ArrayList<Bicicleta>();
		Connection con = null;
		Conexion miconex = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String query = "SELECT B.ID,B.FOTO,B.MARCA,B.DESCRIPCION,B.PRECIO,B.FAV,M.NOMBRE "
				+ "FROM BICI B JOIN MARCA M ON B.MARCA=M.ID "
				+ "WHERE LOWER(M.NOMBRE)=LOWER(?) "
				+ "AND B.FAV=?";
		
		if (orden.equalsIgnoreCase("ascendente")) {
	        query += "ORDER BY B.PRECIO ASC";
	    } else if (orden.equalsIgnoreCase("descendente")) {
	        query += "ORDER BY B.PRECIO DESC";
	    }else if(orden.equalsIgnoreCase("marca")) {
	    	query += "ORDER BY B.MARCA";
	    }
		
		
		try {
			con = miconex.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, marca);
			ps.setInt(2, fav);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Bicicleta bici = new Bicicleta();
	            bici.setIdBicicleta(rs.getInt("ID"));
	            bici.setFoto(rs.getString("FOTO"));
	            bici.setIdMarca(rs.getInt("MARCA"));
	            bici.setDescripcion(rs.getString("DESCRIPCION"));
	            bici.setPrecio(rs.getDouble("PRECIO"));
	            bici.setFavorita(rs.getInt("FAV"));
	            bici.setNombreMarca(rs.getString("NOMBRE"));
	            listadoBicicletas.add(bici);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listadoBicicletas;
	}
	
	public void cambiarFav (int idBici,int valorFav) {
		
		Connection con = null;
		Conexion miconex = new Conexion();
		PreparedStatement ps = null;
		
		String query = "UPDATE BICI SET FAV=? WHERE ID=?";
		
		try {
			con = miconex.getConexion();
			con.setAutoCommit(false);
			ps = con.prepareStatement(query);
			
			if(valorFav == 1) {
				ps.setInt(1, 0);
			}else {
				ps.setInt(1, 1);
			}
			
			ps.setInt(2, idBici);
			ps.executeUpdate();
			con.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

