//package com.rome.mavennewsapp.newsapi;
//
//import com.rome.mavennewsapp.newsapi.request.EverythingRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Flux;
//
//import java.util.List;
//
//@Component
//public class WebClientIntegration {
//
////   @Bean
////    public  WebClient.Builder webClientBuilder(){
////       return WebClient.builder();
////   };
//   @Autowired
//    private WebClient webClient;
//
//   public Flux<EverythingRequest> GetAll() {
//       webClient.get().uri(uriBuilder -> uriBuilder.path("/v2/everything"))
//   }
//}
