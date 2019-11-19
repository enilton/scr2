package com.enilton.scr2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enilton.scr2.models.Geradora;
import com.enilton.scr2.repository.GeradoraRepository;

@Service
public class GeradoraService {

	@Autowired
	private GeradoraRepository geradoraRepository;

	public List<Geradora> listarTodas() {
		return geradoraRepository.findAll();
	}

	public Optional<Geradora> obterPorId(final Long id) {
		return geradoraRepository.findById(id);
	}
	
	public Geradora salvar(Geradora geradora) {
		return geradoraRepository.save(geradora);
	}
	
	public void removerPorId(final Long id) {
		geradoraRepository.deleteById(id);
	}
}
