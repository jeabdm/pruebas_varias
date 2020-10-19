package com.example.wenance.schedulers;

import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.wenance.dto.PriceModelDTO;
import com.example.wenance.repository.PriceRepository;

import reactor.core.publisher.Mono;

@Component
public class PriceScheduler {
	
	@Autowired
	private PriceRepository priceRepository;

//	@Scheduled(fixedDelay = 10000)
//	@Retryable(value = { TimeoutException.class }, maxAttempts = 3, backoff = @Backoff(delay = 2000))
	public void getCurrentPrice(){
		System.out.println("HOLA MUNDO");
//		Mono<PriceModelDTO> uno = priceRepository.getPrice();
//		uno.flatMap(pepe -> {System.out.println("peepepeeppe");return this.imprimir(pepe);});
	}
	
	public Mono<PriceModelDTO> imprimir(PriceModelDTO pepe) {
		System.out.println("HOLAAAAAAAAAA");
		System.out.println(pepe.getLprice());
		return null;
	}
}
