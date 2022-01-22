package br.com.luizmelin.bancavhs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancaVhsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancaVhsApplication.class, args);

		System.out.println(
			"\nProjeto Banca VHS iniciado com sucesso"
		);
	}

}
