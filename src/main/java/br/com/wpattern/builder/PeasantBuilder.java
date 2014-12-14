package br.com.wpattern.builder;

import org.apache.log4j.Logger;

import br.com.wpattern.builder.enumerations.TechnologyLevelEnum;
import br.com.wpattern.builder.interfaces.IPeasant;
import br.com.wpattern.builder.interfaces.IPeasantBuilder;
import br.com.wpattern.builder.peasants.PeasantHigh;
import br.com.wpattern.builder.peasants.PeasantLow;
import br.com.wpattern.builder.peasants.PeasantMiddle;

/**
 * Cria instâncias de peasants.
 * 
 * @author Branquinho
 */
public class PeasantBuilder implements IPeasantBuilder {

	private Logger logger = Logger.getLogger(getClass());

	/**
	 * Define um número do peasant.
	 */
	private int count = 0;

	@Override
	public IPeasant buildPeasant(TechnologyLevelEnum technologyLevel) {

		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Building a new peasant.");
		}

		switch (technologyLevel) {
		case LOW:
			// Cria a instância de um peasant do tipo Low.
			return new PeasantLow(String.format("Low peasant %s", ++this.count));

		case MIDDLE:
			// Cria a instância de um peasant do tipo Middle.
			return new PeasantMiddle(String.format("Middle peasant %s", ++this.count));

		case HIGH:
			// Cria a instância de um peasant do tipo High.
			return new PeasantHigh(String.format("High peasant %s", ++this.count));

		default:
			this.logger.error(String.format("Technology level [%s] not defined.", technologyLevel));
			return null;
		}

	}

}
