package br.com.userapi;


import br.com.userapi.domain.User;
import br.com.userapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	userRepository.saveAll(List.of(new User(null, "Jose Mario", "mario@email.com", "123", 20.0),
		new User(null, "Alice Marciel", "alice_marciel@email.com", "345", 70.0)));
	}
}
