/*
 * generated by Xtext 2.17.0
 */
package org.xtext.mongobeans.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MongoBeansAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/mongobeans/parser/antlr/internal/InternalMongoBeans.tokens");
	}
}
