package monticulo;

import java.util.ArrayList;
import java.util.List;

public class Monticulo {
	List<Integer> monticulo;

	public Monticulo() {
		monticulo = new ArrayList<Integer>();
		monticulo.add(0);
	}

	public void agregar(int nro) {

		int indicePadre = (monticulo.size()) / 2;
		int indiceHijo = monticulo.size();
		monticulo.add(nro);

		int aux;
		while (indicePadre > 0 && (aux = monticulo.get(indicePadre)) < nro) {
			monticulo.set(indiceHijo, aux);
			monticulo.set(indicePadre, nro);
			indiceHijo = indicePadre;
			indicePadre /= 2;
		}
	}

	public Integer quitar() {
		if(monticulo.size() == 1) return -1;
		int ultimo = monticulo.remove(monticulo.size() - 1);
		if(monticulo.size() == 1)
			return ultimo;
		
		int padre = 1, hIzq = padre * 2, hDer = padre * 2 + 1,resultado = monticulo.get(padre);
		monticulo.set(padre, ultimo);
		while(hIzq < monticulo.size()) {
			int hijoIzq = monticulo.get(hIzq);
			int hijoDer = hDer < monticulo.size() ? monticulo.get(hDer) : 0;
			int hijoMayor = Integer.max(hijoIzq, hijoDer);
			int hMayor = hijoMayor == hijoDer ? hDer : hIzq;
			
			if(hijoMayor > ultimo) {
				monticulo.set(padre, hijoMayor);
				monticulo.set(hMayor, ultimo);
				padre = hMayor;
				hIzq = padre*2;
				hDer = padre*2 +1;
			}
			else {
				return resultado;
			}
		}

		return resultado;
	}

	@Override
	public String toString() {
		return "Monticulo [monticulo=" + monticulo + "]";
	}

}
