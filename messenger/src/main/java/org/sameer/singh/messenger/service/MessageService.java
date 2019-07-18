package org.sameer.singh.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
//import java.util.Date;
import java.util.List;
import java.util.Map;

//import javax.xml.bind.annotation.XmlRootElement;

import org.sameer.singh.messenger.database.DatabaseClass;
import org.sameer.singh.messenger.model.Message;
//@XmlRootElement
public class MessageService {
	
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hi bhai", "Kutte"));
		messages.put(2L, new Message(2, "Hi bhai", "Kutte-billi"));
	}
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
//		Message m1 = new Message(1L, "Hi Bhai", "Sameer");
//		Message m2 = new Message(2L, "Hi Bhai", "Sameer");
//		List<Message> list = new ArrayList<>();
//		list.add(m1);
//		list.add(m2);
//		return list;
		
	}
	public List<Message> getAllMessagesForYear(int year)
	{
		List<Message> messagesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR) == year)
			{
				messagesForYear.add(message);
			}
		}
		return messagesForYear;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size)
	{
		List<Message> list = new ArrayList<>(messages.values());
		return list.subList(start, start+size);
	}
	
	
	public Message getMessage(long id)
	{
		return (messages.get(id));
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return (message);
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
			return null;
		messages.put(message.getId(), message);
		return (message);
	}
	
	public Message removeMessage(long id)
	{
		return (messages.remove(id));
	}

}
