package arraysnomes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNomes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> nomelista = new ArrayList<String>();
		ArrayList<String> nomelista2 = new ArrayList<String>();
		int cont = 0;
		nomelista.add("Jose");
		nomelista.add("Pedro");
		nomelista.add("Carlos");
		
		String nome;
		
		for(int x = 0; x>=0; x++) {
			
		System.out.print("-->");
			
		nome = entrada.nextLine();
		
			for(int i = 0; i<nomelista.size();i++) {
			
				if(nome.equals(nomelista.get(i))){
				
					nomelista2.add(nome);
			
				} else {
				
					cont++;
					
				}
			
			}
		
		if(cont == nomelista.size()) {
			
			System.out.println(nome+" Não Existe na lista");
			
		}else if(nomelista2.size() == nomelista.size()) {
			
			break;
			
		}
		
		cont = 0;
			
	}
		
	System.out.print(nomelista2);
		
		
		

		
		
		
		
		
		
		
		
	}
	
	
	

}
