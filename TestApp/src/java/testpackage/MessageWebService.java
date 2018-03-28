/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import businessPackage.Message;
import businessPackage.MessageService;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Sarah
 */
@WebService
public class MessageWebService {
        
        MessageService messageService = new MessageService();
        
       
        
        @WebMethod
        public List<Message> getMessageList(){
                return messageService.getMessageList();
        }
        
       @WebMethod
       public void addMessageList(String userName, String message){
               messageService.addMessage(userName, message);
       }
       
       @WebMethod
        public String testMethod(){
                return messageService.testMethod();
        }
}
