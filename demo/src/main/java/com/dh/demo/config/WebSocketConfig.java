package com.dh.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by jhonny on 6/17/17.
 */
@Configuration
@EnableWebSocketMessageBroker  //habilita el manejo de mensajes WebSocket, respaldado por un intermediario de mensajes.
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //enable broadcast of mesages
        config.enableSimpleBroker("/topic","/error/");//intermediario de mensajes

        // call websocket call enpoints
        //websocket endpoint app endpoint
        //---post localhost:8080
        //---ws:localhhost:8080/app/     -- /app prefijo como tal
        //cors for   ws: .......... !=HTTP
        config.setApplicationDestinationPrefixes("/app");
       // config.setApplicationDestinationPrefixes("/app");

    }
    //webpoint de conexion
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // registry enpoint CORS websocket
        //mesaage endpoint
        //registry.addEndpoint("/chat-ws").setAllowedOrigins("*").withSockJS();//se puede cambair el end pint
        //registry.addEndpoint("/notifications").setAllowedOrigins("*").withSockJS();//se puede cambair el end pint
        System.out.println("sssss  ");
        registry.addEndpoint("/chat-ws").setAllowedOrigins("*").withSockJS();//se puede cambair el end pint
    }


}
