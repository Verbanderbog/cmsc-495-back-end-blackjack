/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc495backendblackjack;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
/**
 *
 * @author Dylan Veraart
 */
@ServerEndpoint("/ws")
public class BlackjackWebSocket {
  @OnOpen
  public void handleOpen() {
    
  }
  @OnMessage
  public String handleMessage(String message) {
    String replyMessage = "Message received: " + message;
    return replyMessage;
  }
  @OnClose
  public void handleClose() {
    
  }
  @OnError
  public void handleError(Throwable t) {
    
  }
}
