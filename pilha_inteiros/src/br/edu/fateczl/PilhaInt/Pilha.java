package br.edu.fateczl.PilhaInt;

import br.edu.fateczl.PilhaInt.No;

public class Pilha {
		
		No topo;
		
		public boolean isEmpty() {
			
			if(topo == null) {
				return true;
			}
			return false;
		}
		
		public void push(int e) {
			No elemento = new No();
			elemento.dado = e;
			elemento.proximo = topo;
			topo = elemento;
		}
		
		public int pop() throws Exception {
			if(isEmpty()) {
				throw new Exception("Pilha está vazia.");
			}
			
			int valor = topo.dado;
			topo = topo.proximo;
			return valor;
		}
		
		public int top() throws Exception {
			if(isEmpty()) {
				throw new Exception("Pilha está vaiza");
			}
			
			int valor = topo.dado;
			return valor;
		}
		
		public int tamanho() {
			int cont = 0;
			if(!isEmpty()) {
				No aux = topo;
				cont = 1;
				while(aux.proximo != null) {
					cont++;
					aux = aux.proximo;
				}
			}
			
			return cont;
		}
		
	
}
