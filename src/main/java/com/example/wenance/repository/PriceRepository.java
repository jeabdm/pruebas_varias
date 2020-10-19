package com.example.wenance.repository;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.wenance.dto.PriceModelDTO;

import reactor.core.publisher.Mono;

@Service
public class PriceRepository {
	
	private final WebClient webClient;
	
    public PriceRepository() {
        this.webClient = WebClient.builder().baseUrl("https://cex.io")
        		.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        		.build();
    }

    public Mono<PriceModelDTO> getPrice(){
        	return webClient.get().uri("/api/last_price/BTC/USD").
                    retrieve().bodyToMono(PriceModelDTO.class);
    }

}
