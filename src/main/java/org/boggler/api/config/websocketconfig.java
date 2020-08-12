package org.boggler.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration

public class websocketconfig extends AbstractWebSocketMessageBrokerConfigurer {
    @Bean

    public ServerEndpointExporter serverEndpointExporter() {

        return new ServerEndpointExporter();

    }
}
