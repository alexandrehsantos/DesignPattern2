package br.com.ale.cap1;

import org.jfugue.player.Player;

public class Teste {
	public static void main(String[] args) {
		Player player = new Player();
		player.play("C");
		player.play("C#");
		player.play("D");
		player.play("D#");
		player.play("E");
		player.play("F");
		player.play("F#");
		player.play("G");
		player.play("G#");
		player.play("A");
		player.play("A#");
		player.play("B");
		player.play("C");
		player.play("C");
		System.out.println("Já tocou");
	}
	
	
}
