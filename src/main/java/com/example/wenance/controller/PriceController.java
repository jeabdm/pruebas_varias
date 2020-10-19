package com.example.wenance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wenance.dto.PriceModelDTO;
import com.example.wenance.repository.PriceRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class PriceController {

	@Autowired
	private PriceRepository priceRepository;
	
	@GetMapping("/people")
    public ResponseEntity<PriceModelDTO> getPeople() {
//		this.priceRepository.getPrice().flatMap(pepe -> {});
        return new ResponseEntity(this.priceRepository.getPrice(), HttpStatus.OK);
//        return new ResponseEntity(new PriceModelDTO(), HttpStatus.OK);
    }
	
	@GetMapping("/people2")
    public Mono<PriceModelDTO>  getPeople2() {
//		this.priceRepository.getPrice().flatMap(pepe -> {});
		Mono<PriceModelDTO> aaa = this.priceRepository.getPrice();
		return aaa;
//        return new ResponseEntity(new PriceModelDTO(), HttpStatus.OK);
    }
}
