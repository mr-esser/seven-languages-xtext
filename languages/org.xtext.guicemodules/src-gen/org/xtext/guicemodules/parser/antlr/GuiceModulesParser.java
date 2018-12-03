/*
 * generated by Xtext 2.16.0
 */
package org.xtext.guicemodules.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.guicemodules.parser.antlr.internal.InternalGuiceModulesParser;
import org.xtext.guicemodules.services.GuiceModulesGrammarAccess;

public class GuiceModulesParser extends AbstractAntlrParser {

	@Inject
	private GuiceModulesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGuiceModulesParser createParser(XtextTokenStream stream) {
		return new InternalGuiceModulesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ModulesAST";
	}

	public GuiceModulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GuiceModulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
