/*
 * package com.br.springboot.webflux;
 * 
 * import java.util.UUID;
 * 
 * import org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.br.springboot.webflux.document.Playlist; import
 * com.br.springboot.webflux.repository.PlaylistRepository;
 * 
 * import reactor.core.publisher.Flux;
 * 
 * @Component public class DummyData implements CommandLineRunner{
 * 
 * private final PlaylistRepository playlistRepository;
 * 
 * 
 * 
 * public DummyData(PlaylistRepository playlistRepository) { super();
 * this.playlistRepository = playlistRepository; }
 * 
 * 
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * playlistRepository.deleteAll() .thenMany( Flux.just("API REST Spring Boot",
 * "Deploy de uma aplicação java no IBM Clould", "Java 11",
 * "Web Service RESTFull", "Bean no Spring Framework") .map(name -> new
 * Playlist(UUID.randomUUID().toString(), name))
 * .flatMap(playlistRepository::save)).subscribe(System.out::println);
 * 
 * 
 * }
 * 
 * }
 */