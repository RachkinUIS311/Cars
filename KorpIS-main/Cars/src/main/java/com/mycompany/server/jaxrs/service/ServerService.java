package com.mycompany.server.jaxrs.service;
import com.mycompany.server.jaxrs.model.CarsModel;
import com.mycompany.server.jaxrs.model.CarsList;
import com.mycompany.server.jaxrs.dao.*;
import java.sql.SQLException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class ServerService {
    @GET
    @Path("/getlist")
    @Produces(MediaType.APPLICATION_JSON)
    public CarsList getListJSON () throws SQLException, Exception
    {
        DBMethods dbmethods = new DBMethods();
        CarsList list = new CarsList();
        list = dbmethods.getList();
        return list;
    }
    
    @GET
    @Path("/getdoc")
    @Produces(MediaType.APPLICATION_JSON)
    public CarsModel getDocJSON (@QueryParam("id") int id) throws SQLException, Exception
    {
        DBMethods dbmethods = new DBMethods();
        CarsModel doc = new CarsModel();
        doc = dbmethods.getDoc(id);
        return doc;
    }
}