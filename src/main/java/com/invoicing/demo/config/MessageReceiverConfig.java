// package com.invoicing.demo.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.ws.config.annotation.EnableWs;
// import org.springframework.ws.config.annotation.WsConfigurerAdapter;
// import org.springframework.ws.server.EndpointAdapter;
// import org.springframework.ws.server.EndpointMapping;
// import org.springframework.ws.server.endpoint.MessageEndpoint;
// import org.springframework.ws.server.endpoint.adapter.MessageEndpointAdapter;
// import org.springframework.ws.server.endpoint.mapping.PayloadRootQNameEndpointMapping;

// @EnableWs
// @Configuration
// public class MessageReceiverConfig extends WsConfigurerAdapter {

//     @Bean
//     public EndpointMapping endpointMapping() {
//         PayloadRootQNameEndpointMapping mapping = new PayloadRootQNameEndpointMapping();
//         mapping.setDefaultEndpoint(messageEndpoint());
//         return mapping;
//     }

//     @Bean
//     public EndpointAdapter endpointAdapter() {
//         return new MessageEndpointAdapter();
//     }

//     @Bean
//     public MessageEndpoint messageEndpoint() {
//         return new InvoiceService(); // Assuming InvoiceService is your service endpoint
//     }
// }
