package com.mod.apresentacao;
import com.mod.dados.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner sc=new Scanner(System.in);
	private static Random aleatorio=new Random();
	private static CalculadoraInteiros c1= new CalculadoraInteiros();
	private static CalculadoraComplexos c2=new CalculadoraComplexos();
	
	public static void main(String[] args) {
		
		int opcao=0;
		do {
			
			if(aleatorio.nextInt(2)==1) {//para calculadora de inteiros
				Integer v1=aleatorio.nextInt(100);
				Integer v2=aleatorio.nextInt(100);
				
				if(aleatorio.nextInt(2)==1) {//para soma de inteiros
					System.out.println(v1+" + "+v2+" = "+c1.soma(v1,v2));
				}else {
					System.out.println(v1+" - "+v2+" = "+c1.subtracao(v1, v2));
				}
			}
			else {//para calculadora de complexos
				Complexo a=new Complexo();
				Complexo b=new Complexo();
				
				if(aleatorio.nextInt(2)==1) {//para soma de inteiros
					System.out.println(a+" + "+b+" = "+c2.soma(a,b));
				}else {
					System.out.println(a+" - "+b+" = "+c2.subtracao(a,b));
				}
				
			}
			System.out.println("\nDigite 0 para sair");
			opcao=sc.nextInt();
		}while(opcao!=0);
		

	}

}
