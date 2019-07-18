package org.sameer.singh.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.sameer.singh.messenger.model.Message;
import org.sameer.singh.messenger.model.Profile;
//import org.sameer.singh.messenger.service.MessageService;
import org.sameer.singh.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class ProfileResource {
	
ProfileService ps = new ProfileService();
	
    @GET
    public List<Profile> getProfiles() {
        return ps.getAllProfiles();
    }
    
    @POST
    public Profile addProfile(Profile profile) {
    	return ps.addProfile(profile);
    }
    
    @PUT
    @Path("/{ProfileName}")
    public Profile updateProfile(@PathParam("ProfileName") String profileName,Profile profile )
    {
    	profile.setProfileName(profileName);
    	return ps.updateProfile(profile);
    }
    
    @DELETE
    @Path("/{ProfileName}")
    public void removeProfile(@PathParam("ProfileName") String profileName) {
    	ps.removeProfile(profileName);
    }
    
    
    @GET
    @Path("/{ProfileName}")
    public Profile getProfile(@PathParam("ProfileName") String profileName)
    {
    	return ps.getProfile(profileName);
    }

}
