package br.com.alura.LiterAltura;

import br.com.alura.LiterAltura.principal.Principal;
import br.com.alura.LiterAltura.repositorio.AutorRepository;
import br.com.alura.LiterAltura.repositorio.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAlturaApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository repositorio;

	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {

		SpringApplication.run(LiterAlturaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio, autorRepository);
		principal.exibeMenu();
	}
}
