package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {

    WhatsappRepository whatsappRepository = new WhatsappRepository();


    // Create a user
    public String createUser(String name, String mobile) throws Exception{
        return whatsappRepository.createUser(name, mobile);
    }


    // Create a group
    public Group createGroup(List<User> users) {
        return whatsappRepository.createGroup(users);
    }



    // Create a message
    public int createMessage(String content) {
        return whatsappRepository.createMessage(content);
    }


    // Send a message
    public int sendMessage(Message message, User sender, Group group) throws Exception {
        return whatsappRepository.sendMessage(message, sender, group);
    }


    // Change the admin of a group
    public String changeAdmin(User approver, User user, Group group) throws Exception{
        return whatsappRepository.changeAdmin(approver, user, group);
    }


    // Remove a user from a group
    public int removeUser(User user) throws Exception{
        return whatsappRepository.removeUser(user);
    }


    // Find messages
    public String findMessage(Date start, Date end, int K) throws Exception{
        return whatsappRepository.findMessage(start, end, K);
    }
}
