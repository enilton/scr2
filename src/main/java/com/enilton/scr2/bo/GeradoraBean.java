package com.enilton.scr2.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.enilton.scr2.models.Geradora;
import com.enilton.scr2.service.GeradoraService;

@Component
@Scope("request")
public class GeradoraBean {
	
	@Autowired
	private Geradora geradora;

	private List<Geradora> geradoras;

	private String mensagem;
	
	public void listarTodas() {
		try {
			GeradoraService geradoraService = new GeradoraService();
			this.setGeradoras(geradoraService.listarTodas());			
			this.setMensagem("Geradoras Carregadas ");
		} catch (Exception e) {
			this.setMensagem("Falha ao carregar geradoras: " + e.getMessage());			
		}	
	}
	
	public void incluir() {	
		try {
			GeradoraService geradoraService = new GeradoraService();
			this.geradoras.add(geradoraService.salvar(this.geradora));
			geradora = new Geradora(); 
			this.setMensagem("Geradora Criada");
		} catch (Exception e) {
			this.setMensagem("Falha ao incluir geradora: " + e.getMessage());			
		}		
	}
	
	public void setNome(String nome) {
		this.geradora.setNome(nome);
	}
	
	public String getNome() {
		return this.geradora.getNome();
	}

	public Geradora getGeradora() {
		return geradora;
	}

	public void setGeradora(Geradora geradora) {
		this.geradora = geradora;
	}

	public List<Geradora> getGeradoras() {
		return geradoras;
	}

	public void setGeradoras(List<Geradora> geradoras) {
		this.geradoras = geradoras;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
