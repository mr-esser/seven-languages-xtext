/*
 * generated by Xtext 2.19.0
 */
package org.xtext.tortoiseshell.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TortoiseShellAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.tokens");
	}
}
