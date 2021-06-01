package monticulo;

import java.util.ArrayList;
import java.util.List;

public class MonticuloGenerico {
	List<Monticulable> monticulo;

	public MonticuloGenerico() {
		monticulo = new ArrayList<Monticulable>();
		monticulo.add(null);
	}

	public void agregar(Monticulable monticulable) throws Exception {

		int indicePadre = (monticulo.size()) / 2;
		int indiceHijo = monticulo.size();
		monticulo.add(monticulable);

		Monticulable aux;
		while (indicePadre > 0 && (aux = monticulo.get(indicePadre)).compareTo(monticulable) < 0) {
			monticulo.set(indiceHijo, aux);
			monticulo.set(indicePadre, monticulable);
			indiceHijo = indicePadre;
			indicePadre /= 2;
		}
	}

	public Monticulable quitar() throws Exception {
		if (monticulo.size() == 1)
			return null;
		Monticulable ultimo = monticulo.remove(monticulo.size() - 1);
		if (monticulo.size() == 1)
			return ultimo;

		int padre = 1, hIzq = padre * 2, hDer = padre * 2 + 1;
		Monticulable resultado = monticulo.get(padre);
		monticulo.set(padre, ultimo);
		while (hIzq < monticulo.size()) {
			Monticulable hijoIzq = monticulo.get(hIzq);
			Monticulable hijoDer = hDer < monticulo.size() ? monticulo.get(hDer) : null;
			Monticulable hijoMayor = hijoIzq.compareTo(hijoDer) > 0 ? hijoIzq : hijoDer;
			int hMayor = hijoMayor == hijoDer ? hDer : hIzq;

			if (hijoMayor.compareTo(ultimo) > 0) {
				monticulo.set(padre, hijoMayor);
				monticulo.set(hMayor, ultimo);
				padre = hMayor;
				hIzq = padre * 2;
				hDer = padre * 2 + 1;
			} else {
				return resultado;
			}
		}

		return resultado;
	}

	@Override
	public String toString() {
		return "Monticulo Generico [monticulo=" + monticulo + "]";
	}

}
