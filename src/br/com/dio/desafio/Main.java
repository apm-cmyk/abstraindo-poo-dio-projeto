package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria1);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setNome("Ana");
		dev1.inscreverBootcamp(bootcamp);
		dev1.progredir();
		
		Dev dev2 = new Dev();
		dev2.setNome("Camila");
		dev2.inscreverBootcamp(bootcamp);
		
		System.out.printf("Cursos Incritos " + dev1.getNome() + " :" + dev1.getConteudoInscrito() + "\n");
		System.out.printf("Cursos Incritos " + dev2.getNome() + " :" + dev2.getConteudoInscrito() + "\n");

		System.out.printf("Cursos Incritos " + dev1.getNome() + " :" + dev1.getConteudoConcluido() + "\n");
		System.out.printf("Cursos Incritos " + dev2.getNome() + " :" + dev2.getConteudoConcluido() + "\n");
		
		System.out.printf("XP de " + dev1.getNome() + " :" + dev1.calcularTotalXp() + "\n");
		System.out.printf("XP de " + dev2.getNome() + " :" + dev2.calcularTotalXp() + "\n");
		
		
	}

}
