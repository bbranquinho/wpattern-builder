package br.com.wpattern.builder.test;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import br.com.wpattern.builder.PeasantBuilder;
import br.com.wpattern.builder.enumerations.TechnologyLevelEnum;
import br.com.wpattern.builder.interfaces.IPeasant;
import br.com.wpattern.builder.interfaces.IPeasantBuilder;

/**
 * Testa o builder de peasants.
 * 
 * @author Branquinho
 */
public class BuilderTest {

	private static Logger logger = Logger.getLogger(BuilderTest.class);

	private IPeasantBuilder peasantbuilder;

	@Before
	public void init() {
		this.peasantbuilder = new PeasantBuilder();
	}

	@Test
	public void testBuilder() {

		if (logger.isDebugEnabled()) {
			logger.debug("Starting method test factory.");
		}

		// Criando instâncias de peasants dos 3 tipos disponíveis.

		// Low peasants.
		IPeasant peasantLow01 = this.peasantbuilder.buildPeasant(TechnologyLevelEnum.LOW);
		IPeasant peasantLow02 = this.peasantbuilder.buildPeasant(TechnologyLevelEnum.LOW);

		// Middle peasants.
		IPeasant peasantMiddle01 = this.peasantbuilder.buildPeasant(TechnologyLevelEnum.MIDDLE);

		// High peasants.
		IPeasant peasantHigh01 = this.peasantbuilder.buildPeasant(TechnologyLevelEnum.HIGH);

		// Executando algumas ações.
		peasantLow01.collectResources();
		peasantLow02.collectResources();
		peasantMiddle01.collectResources();
		peasantHigh01.collectResources();

	}

}
