package org.sameer.singh.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sameer.singh.messenger.database.DatabaseClass;
//import org.sameer.singh.messenger.model.Message;
import org.sameer.singh.messenger.model.Profile;

public class ProfileService {
private static Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("Sameer", new Profile(1L, "Sameer", "Singh", "Kutte"));
		profiles.put("Sash", new Profile(2L, "Sash", "Bangalore", "Kutte-billi"));
	}
	
	public List<Profile> getAllProfiles()
	{
		return new ArrayList<Profile>(profiles.values());
//		Message m1 = new Message(1L, "Hi Bhai", "Sameer");
//		Message m2 = new Message(2L, "Hi Bhai", "Sameer");
//		List<Message> list = new ArrayList<>();
//		list.add(m1);
//		list.add(m2);
//		return list;
		
	}
	
	public Profile getProfile(String profileName)
	{
		return (profiles.get(profileName));
	}
	
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return (profile);
	}
	
	public Profile updateProfile(Profile profile)
	{
		if(profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return (profile);
	}
	
	public Profile removeProfile(String profileName)
	{
		return (profiles.remove(profileName));
	}
}
