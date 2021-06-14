package com.example.h2zoo;

import com.example.h2zoo.model.Cat;
import com.example.h2zoo.model.Dog;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.CatRepository;
import com.example.h2zoo.repository.DogRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
			SpringApplication.run(H2ZooApplication.class, args);
		
		ReptileRepository reptileRepository = configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

		DogRepository dogRepository = configurableApplicationContext.getBean(DogRepository.class);
		Dog miniSchnauzer = new Dog("Neville", "Miniature Schnauzer", "Grey", "Marshmallows");
		Dog havanese = new Dog("Nox", "Havanese", "Black", "Cookies");
		Dog maltipoo = new Dog("Jupiter", "Maltipoo", "White", "Stars");
		dogRepository.saveAll(List.of(miniSchnauzer, havanese, maltipoo));

		CatRepository catRepository = configurableApplicationContext.getBean(CatRepository.class);
		Cat persian = new Cat("Hannah", "Persian", "White & Grey", "Poptarts");
		Cat cartoon = new Cat("Figaro", "Unknown", "Black & White", "Goldfish");
		Cat aristocat = new Cat("Thomas O'Malley", "Alley", "Orange", "Anything");
		catRepository.saveAll(List.of(persian, cartoon, aristocat));
	}

}
