package org.sameer.singh.messenger.resources;


import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.sameer.singh.messenger.model.Message;
import org.sameer.singh.messenger.resources.bean.MessageFilterBean;
import org.sameer.singh.messenger.service.MessageService;


@Path("/messages")
public class ResourceMessages {

	MessageService ms = new MessageService();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
    public List<Message> getMessages(/*@BeanParam MessageFilterBean filterBean*/) {
    	
//    	for (int i=0; i<100; i++) {
//    	System.out.println("Reached??");
//    	}
    	
//    	if(filterBean.getYear() > 0)
//    	{
//    		return ms.getAllMessagesForYear(filterBean.getYear());
//    	}
//    	
//    	else if(filterBean.getStart() >= 0 && filterBean.getSize() >= 0)
//    	{
//    		return ms.getAllMessagesPaginated(filterBean.getStart(),filterBean.getSize());
//    	}
    	return ms.getAllMessages();
    }
    
    @POST
    public Message addMessage(Message message) {
    	return ms.addMessage(message);
    }
    
    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") long id,Message message )
    {
    	message.setId(id);
    	return ms.updateMessage(message);
    }
    
    @DELETE
    @Path("/{messageId}")
    public void removeMessage(@PathParam("messageId") long id) {
    	ms.removeMessage(id);
    }
    
    
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long id)
    {
    	return ms.getMessage(id);
    }
    
//    @GET
//    @Path("/{messageId/comments}")
//    public String test() {
//    return "test!!";
//    
//    }
}
