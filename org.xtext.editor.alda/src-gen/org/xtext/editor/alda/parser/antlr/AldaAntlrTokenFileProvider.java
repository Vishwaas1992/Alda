/*
 * generated by Xtext 2.12.0
 */
package org.xtext.editor.alda.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AldaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/editor/alda/parser/antlr/internal/InternalAlda.tokens");
	}
}
