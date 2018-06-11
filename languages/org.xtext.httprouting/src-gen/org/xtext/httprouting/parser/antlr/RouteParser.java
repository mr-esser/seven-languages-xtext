/*
 * generated by Xtext 2.14.0
 */
package org.xtext.httprouting.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.httprouting.parser.antlr.internal.InternalRouteParser;
import org.xtext.httprouting.services.RouteGrammarAccess;

public class RouteParser extends AbstractAntlrParser {

	@Inject
	private RouteGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRouteParser createParser(XtextTokenStream stream) {
		return new InternalRouteParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public RouteGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RouteGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
