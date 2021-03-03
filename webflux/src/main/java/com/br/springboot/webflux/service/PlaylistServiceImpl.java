package com.br.springboot.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.springboot.webflux.document.Playlist;
import com.br.springboot.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService{
	
	@Autowired
	PlaylistRepository repository;

	@Override
	public Flux<Playlist> findAll() {
		
		return repository.findAll();
	}

	@Override
	public Mono<Playlist> findById(String id) {
		
		return repository.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		
		return repository.save(playlist);
	}

}
