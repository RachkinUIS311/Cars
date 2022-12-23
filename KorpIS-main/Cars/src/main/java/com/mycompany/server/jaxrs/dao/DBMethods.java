package com.mycompany.server.jaxrs.dao;
import java.sql.*;
import com.mycompany.server.jaxrs.model.*;
import java.text.SimpleDateFormat;

public class DBMethods {
    public static CarsList getList() throws Exception, SQLException
    {
        Class.forName("org.postgresql.Driver");
            
        String url = "jdbc:postgresql://localhost:5432/db";
        String user = "Admin";
        String pass = "omivas14";
        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        StringBuilder query = new StringBuilder();
        
        query.append(" SELECT * FROM cars ");
        ResultSet rs = stmt.executeQuery(query.toString());
        
        CarsList list = new CarsList();
        while (rs.next()) {
            CarsModel model = new CarsModel();
            model.setId(rs.getInt("id"));
            model.setBrand(rs.getString("brand"));
            model.setModel(rs.getString("model"));
            model.setSeller(rs.getString("seller"));
            //list.addEl(model);
        }
        rs.close();
        stmt.close();
        conn.close();
        return list;
    }
    
    public static CarsModel getDoc(int id) throws Exception, SQLException
    {
        Class.forName("org.postgresql.Driver");
            
        String url = "jdbc:postgresql://localhost:5432/db";
        String user = "Admin";
        String pass = "omivas14";
        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement stmt = conn.createStatement();
        StringBuilder query = new StringBuilder();

        query.append(" SELECT * FROM cars ");
        query.append(id);
        ResultSet rs = stmt.executeQuery(query.toString());
        
        CarsModel doc = new CarsModel();
        if (rs.next()) {
            doc.setId(rs.getInt("id"));
            doc.setBrand(rs.getString("brand"));
            doc.setModel(rs.getString("model"));
            doc.setSeller(rs.getString("seller"));
        }

        rs.close();
        stmt.close();
        conn.close();
        return doc;
    }
    
}
