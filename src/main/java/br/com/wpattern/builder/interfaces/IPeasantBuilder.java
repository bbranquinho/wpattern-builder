package br.com.wpattern.builder.interfaces;

import br.com.wpattern.builder.enumerations.TechnologyLevelEnum;

/**
 * Builder usada para criar peasants.
 * 
 * @author Branquinho
 */
public interface IPeasantBuilder {

	/**
	 * Cria a instância de um peasant.
	 * 
	 * @param technologyLevel
	 * 			Nível de desenvolvimento tecnológico.
	 * 
	 * @return
	 * 		Instância de peasant criado.
	 */
	IPeasant buildPeasant(TechnologyLevelEnum technologyLevel);

}