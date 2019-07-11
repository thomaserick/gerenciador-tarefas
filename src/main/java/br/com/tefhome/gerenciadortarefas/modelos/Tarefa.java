package br.com.tefhome.gerenciadortarefas.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "tar_tarefas")
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tar_id")
	private Long id;
	@Column(name ="tar_titulo",length = 50, nullable = false)
	private String titulo;
	@Column(name = "tar_descricao",length = 100, nullable = false)
	private String descricao;
	@Column(name = "tar_data_expiracao",nullable = false)
	private Date dataExpiracao;	
	@Column(name = "tar_concluida", nullable = false)
	private boolean concluida = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

}
