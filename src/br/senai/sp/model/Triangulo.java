package br.senai.sp.model;

public class Triangulo {
	
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	//Métodos da classe
	public void mostrarDimensoes() {
		
		System.out.println("___________________");
		System.out.println(nome);
		System.out.println("___________________");
		System.out.println("base -> " + base);
		System.out.println("Lado B -> "+ ladoB);
		System.out.println("Lado C -> "+ ladoC);
		System.out.println("Altura -> "+ altura);
		calcularArea();
		
	}
	
	
	public void calcularArea() {
		
		double area = (base * altura) / 2;
		System.out.println("Área = " + area);
		
	}

}
