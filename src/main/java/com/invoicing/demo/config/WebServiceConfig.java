// package com.invoicing.demo.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.ws.config.annotation.EnableWs;
// import org.springframework.ws.config.annotation.WsConfigurerAdapter;
// import org.springframework.ws.transport.http.MessageDispatcherServlet;
// import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
// import org.springframework.xml.xsd.SimpleXsdSchema;
// import org.springframework.xml.xsd.XsdSchema;

// @EnableWs
// @Configuration
// public class WebServiceConfig extends WsConfigurerAdapter {
    
//     @Bean
//     public MessageDispatcherServlet messageDispatcherServlet() {
//         return new MessageDispatcherServlet();
//     }

//     @Bean(name = "invoices")
//     public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema invoicesSchema) {
//         DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//         wsdl11Definition.setPortTypeName("InvoicesPort");
//         wsdl11Definition.setLocationUri("/ws");
//         wsdl11Definition.setTargetNamespace("http://example.com/invoices");
//         wsdl11Definition.setSchema(invoicesSchema);
//         return wsdl11Definition;
//     }

//     @Bean
//     public XsdSchema invoicesSchema() {
//         return new SimpleXsdSchema(new ClassPathResource("xsd/schema.xsd"));
//     }

// }