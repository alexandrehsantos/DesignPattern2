package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
public class Produto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String titulo; 
private String descricao; 
private int paginas;

@ElementCollection
private List<Preco> precos;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Preco> getPrecos() {
	return precos;
}
public void setPrecos(List<Preco> precos) {
	this.precos = precos;
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
public int getPaginas() {
	return paginas;
}
public void setPaginas(int paginas) {
	this.paginas = paginas;
}
 
@Override
public String toString() {
	return "Produtos [titulo=" + titulo + ", descricao=" + descricao
			+ ", paginas=" + paginas + "]";
	} 
 
}
