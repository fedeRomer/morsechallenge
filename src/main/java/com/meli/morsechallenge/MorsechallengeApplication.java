package com.meli.morsechallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MorsechallengeApplication {
/*
 * se tomara a una unidad como espacio (".") para separar las letras y 
 * dos o mas espacios para separar palabras.
 * una pausa prologada determina el fin del mensaje
 * 
 */
	public static void main(String[] args) {
		SpringApplication.run(MorsechallengeApplication.class, args);
	}

}
