package com.br.springboot.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.br.springboot.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist,String>{

}
