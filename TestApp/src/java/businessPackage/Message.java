/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sarah
 */
public class Message {
         public String userName;
        public String messageText;
        public Date dateTime;
        
        public Message(String user, String text){
                this.userName = user;
                this.messageText = text;
                this.dateTime = new Date();
        }
        
        @Override
        public String toString(){
              String string =   this.userName + ", " + 
                                this.messageText + ", " +
                                this.dateTime.toString(); 
              return string;
        }
}
