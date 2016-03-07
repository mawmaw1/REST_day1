/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.ml;

import dk.cphbusiness.ml.entity.Book;
import dk.cphbusiness.ml.facade.BookFacade;
import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Magnus
 */
@Path("book")
public class BookEndpoint {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BookEndpoint
     */
    public BookEndpoint() {
    }

    /**
     * Retrieves representation of an instance of dk.cphbusiness.ml.BookEndpoint
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public Collection<Book> getJson() {
        return BookFacade.getAllBooks();
        
    }

    /**
     * PUT method for updating or creating an instance of BookEndpoint
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
