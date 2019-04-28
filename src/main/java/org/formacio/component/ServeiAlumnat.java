package org.formacio.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Map;

@Component
public class ServeiAlumnat {

	@Autowired
	RepositoriAlumnesMemoria repositoriAlumnes;

	@PostConstruct
	private void init() {
		repositoriAlumnes.altaAlumne(1, "Antonia");
		repositoriAlumnes.altaAlumne(2, "Joan");
	}

	public Collection<String> getListaAlumnes() {
		return repositoriAlumnes.llistaAlumnes();
	}

	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula (int id, String alumne) {
		if (alumne != null && repositoriAlumnes.obteAlumne(id) == null) {
			repositoriAlumnes.altaAlumne(id, alumne);
			return true;
		} else {
			return false;
		}
	}
	
}
