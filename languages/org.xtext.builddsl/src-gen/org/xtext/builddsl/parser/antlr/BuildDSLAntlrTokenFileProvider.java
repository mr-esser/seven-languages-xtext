/*
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.builddsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BuildDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.tokens");
	}
}
