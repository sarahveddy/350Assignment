/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class MessageService {
        
       
        public List<Message> messageList;
        
        public MessageService(){
                this.messageList = new ArrayList<>();
        }
        
        public List<Message> getMessageList(){
             return this.messageList;   
        }
        
        public void addMessage(String user, String text){
                Message message = new Message(user, text);
                this.messageList.add(message);
        }
        
        public String testMethod(){
                return "test success";
        }

        
        
}
