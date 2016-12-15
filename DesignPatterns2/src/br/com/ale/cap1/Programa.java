package br.com.ale.cap1;

import java.util.Arrays;
import java.util.List;

import org.jfugue.player.Player;

import cap2.Nota;
import cap2.NotasMusicais;


public class Programa {
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais(); 
		List<Nota> musica = Arrays.asList(
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("mi"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("re"),
				notas.pega("do"),
				notas.pega("sol"),
				notas.pega("fa"),
				notas.pega("mi"),
				notas.pega("mi"),
				notas.pega("mi"),
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("mi"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa")
				);
		Piano piano = new Piano();
		piano.toca(musica);
	}
}
