package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setCargaHoraria(60);
		curso1.setDescricao("POO com Java");
		curso1.setTitulo("curso java");
		
		Curso curso2 = new Curso();
		curso2.setCargaHoraria(40);
		curso2.setDescricao("POO com JavaScrip");
		curso2.setTitulo("curso java-script");
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de CSS");
		mentoria1.setDescricao("Revisão de CSS");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
