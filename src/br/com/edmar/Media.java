package br.com.edmar;

import java.util.Scanner;

public class Media {
	public static void main(String args[]) {
		result();
	}
	
	public static Double mediaNotes() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nota de Matemática: ");
		Double noteMath = s.nextDouble();
		System.out.println("Nota de Geografia: ");
		Double noteGeo = s.nextDouble();
		System.out.println("Nota de Português: ");
		Double notePortu = s.nextDouble();
		System.out.println("Nota de inglês: ");
		Double noteEngl = s.nextDouble();
		
		Double media = (noteMath + noteGeo + notePortu + noteEngl) / 4;
		
		return (media);
	}
	
	public static void result() {
		Double mediaNotes = mediaNotes();
		
		if(mediaNotes >= 7) {
			System.out.println("A media dele é " + mediaNotes  + ", então ele está aprovado!!");
		}else if(mediaNotes >= 5) {
			System.out.println("A media dele é " + mediaNotes + ", então ele está de recuperação.");
		}else {
			System.out.println("A media dele é " + mediaNotes + ", então ele está reprovado ;-;");
		}
			
	}
}
