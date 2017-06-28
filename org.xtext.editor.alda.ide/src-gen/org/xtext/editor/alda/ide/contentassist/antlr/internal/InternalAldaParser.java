package org.xtext.editor.alda.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.editor.alda.services.AldaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAldaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NOTES", "RULE_INT", "RULE_ML_COMMENT", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'piano'", "'violin'", "'flute'", "'('", "'comment'", "')'", "':'", "'\\n'", "'/'", "'tempo'", "'!'", "'quant'", "'volume'", "'key-signature'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NOTES=5;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAldaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAldaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAldaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlda.g"; }


    	private AldaGrammarAccess grammarAccess;

    	public void setGrammarAccess(AldaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalAlda.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAlda.g:54:1: ( ruleModel EOF )
            // InternalAlda.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAlda.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAlda.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAlda.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAlda.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAlda.g:69:3: ( rule__Model__Group__0 )
            // InternalAlda.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDECLRATIONS"
    // InternalAlda.g:78:1: entryRuleDECLRATIONS : ruleDECLRATIONS EOF ;
    public final void entryRuleDECLRATIONS() throws RecognitionException {
        try {
            // InternalAlda.g:79:1: ( ruleDECLRATIONS EOF )
            // InternalAlda.g:80:1: ruleDECLRATIONS EOF
            {
             before(grammarAccess.getDECLRATIONSRule()); 
            pushFollow(FOLLOW_1);
            ruleDECLRATIONS();

            state._fsp--;

             after(grammarAccess.getDECLRATIONSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDECLRATIONS"


    // $ANTLR start "ruleDECLRATIONS"
    // InternalAlda.g:87:1: ruleDECLRATIONS : ( ( rule__DECLRATIONS__Alternatives ) ) ;
    public final void ruleDECLRATIONS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:91:2: ( ( ( rule__DECLRATIONS__Alternatives ) ) )
            // InternalAlda.g:92:2: ( ( rule__DECLRATIONS__Alternatives ) )
            {
            // InternalAlda.g:92:2: ( ( rule__DECLRATIONS__Alternatives ) )
            // InternalAlda.g:93:3: ( rule__DECLRATIONS__Alternatives )
            {
             before(grammarAccess.getDECLRATIONSAccess().getAlternatives()); 
            // InternalAlda.g:94:3: ( rule__DECLRATIONS__Alternatives )
            // InternalAlda.g:94:4: rule__DECLRATIONS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DECLRATIONS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDECLRATIONSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECLRATIONS"


    // $ANTLR start "entryRuleCOMMENT"
    // InternalAlda.g:103:1: entryRuleCOMMENT : ruleCOMMENT EOF ;
    public final void entryRuleCOMMENT() throws RecognitionException {
        try {
            // InternalAlda.g:104:1: ( ruleCOMMENT EOF )
            // InternalAlda.g:105:1: ruleCOMMENT EOF
            {
             before(grammarAccess.getCOMMENTRule()); 
            pushFollow(FOLLOW_1);
            ruleCOMMENT();

            state._fsp--;

             after(grammarAccess.getCOMMENTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOMMENT"


    // $ANTLR start "ruleCOMMENT"
    // InternalAlda.g:112:1: ruleCOMMENT : ( ( rule__COMMENT__Group__0 ) ) ;
    public final void ruleCOMMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:116:2: ( ( ( rule__COMMENT__Group__0 ) ) )
            // InternalAlda.g:117:2: ( ( rule__COMMENT__Group__0 ) )
            {
            // InternalAlda.g:117:2: ( ( rule__COMMENT__Group__0 ) )
            // InternalAlda.g:118:3: ( rule__COMMENT__Group__0 )
            {
             before(grammarAccess.getCOMMENTAccess().getGroup()); 
            // InternalAlda.g:119:3: ( rule__COMMENT__Group__0 )
            // InternalAlda.g:119:4: rule__COMMENT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__COMMENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOMMENTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOMMENT"


    // $ANTLR start "entryRuleINSTRUMENTS"
    // InternalAlda.g:128:1: entryRuleINSTRUMENTS : ruleINSTRUMENTS EOF ;
    public final void entryRuleINSTRUMENTS() throws RecognitionException {
        try {
            // InternalAlda.g:129:1: ( ruleINSTRUMENTS EOF )
            // InternalAlda.g:130:1: ruleINSTRUMENTS EOF
            {
             before(grammarAccess.getINSTRUMENTSRule()); 
            pushFollow(FOLLOW_1);
            ruleINSTRUMENTS();

            state._fsp--;

             after(grammarAccess.getINSTRUMENTSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINSTRUMENTS"


    // $ANTLR start "ruleINSTRUMENTS"
    // InternalAlda.g:137:1: ruleINSTRUMENTS : ( ( rule__INSTRUMENTS__Group__0 ) ) ;
    public final void ruleINSTRUMENTS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:141:2: ( ( ( rule__INSTRUMENTS__Group__0 ) ) )
            // InternalAlda.g:142:2: ( ( rule__INSTRUMENTS__Group__0 ) )
            {
            // InternalAlda.g:142:2: ( ( rule__INSTRUMENTS__Group__0 ) )
            // InternalAlda.g:143:3: ( rule__INSTRUMENTS__Group__0 )
            {
             before(grammarAccess.getINSTRUMENTSAccess().getGroup()); 
            // InternalAlda.g:144:3: ( rule__INSTRUMENTS__Group__0 )
            // InternalAlda.g:144:4: rule__INSTRUMENTS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINSTRUMENTSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINSTRUMENTS"


    // $ANTLR start "entryRuleINSTRUMENT"
    // InternalAlda.g:153:1: entryRuleINSTRUMENT : ruleINSTRUMENT EOF ;
    public final void entryRuleINSTRUMENT() throws RecognitionException {
        try {
            // InternalAlda.g:154:1: ( ruleINSTRUMENT EOF )
            // InternalAlda.g:155:1: ruleINSTRUMENT EOF
            {
             before(grammarAccess.getINSTRUMENTRule()); 
            pushFollow(FOLLOW_1);
            ruleINSTRUMENT();

            state._fsp--;

             after(grammarAccess.getINSTRUMENTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINSTRUMENT"


    // $ANTLR start "ruleINSTRUMENT"
    // InternalAlda.g:162:1: ruleINSTRUMENT : ( ( rule__INSTRUMENT__Alternatives ) ) ;
    public final void ruleINSTRUMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:166:2: ( ( ( rule__INSTRUMENT__Alternatives ) ) )
            // InternalAlda.g:167:2: ( ( rule__INSTRUMENT__Alternatives ) )
            {
            // InternalAlda.g:167:2: ( ( rule__INSTRUMENT__Alternatives ) )
            // InternalAlda.g:168:3: ( rule__INSTRUMENT__Alternatives )
            {
             before(grammarAccess.getINSTRUMENTAccess().getAlternatives()); 
            // InternalAlda.g:169:3: ( rule__INSTRUMENT__Alternatives )
            // InternalAlda.g:169:4: rule__INSTRUMENT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUMENT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getINSTRUMENTAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINSTRUMENT"


    // $ANTLR start "entryRuleTempo"
    // InternalAlda.g:178:1: entryRuleTempo : ruleTempo EOF ;
    public final void entryRuleTempo() throws RecognitionException {
        try {
            // InternalAlda.g:179:1: ( ruleTempo EOF )
            // InternalAlda.g:180:1: ruleTempo EOF
            {
             before(grammarAccess.getTempoRule()); 
            pushFollow(FOLLOW_1);
            ruleTempo();

            state._fsp--;

             after(grammarAccess.getTempoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTempo"


    // $ANTLR start "ruleTempo"
    // InternalAlda.g:187:1: ruleTempo : ( ( rule__Tempo__Group__0 ) ) ;
    public final void ruleTempo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:191:2: ( ( ( rule__Tempo__Group__0 ) ) )
            // InternalAlda.g:192:2: ( ( rule__Tempo__Group__0 ) )
            {
            // InternalAlda.g:192:2: ( ( rule__Tempo__Group__0 ) )
            // InternalAlda.g:193:3: ( rule__Tempo__Group__0 )
            {
             before(grammarAccess.getTempoAccess().getGroup()); 
            // InternalAlda.g:194:3: ( rule__Tempo__Group__0 )
            // InternalAlda.g:194:4: rule__Tempo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tempo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTempoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempo"


    // $ANTLR start "entryRuleQuant"
    // InternalAlda.g:203:1: entryRuleQuant : ruleQuant EOF ;
    public final void entryRuleQuant() throws RecognitionException {
        try {
            // InternalAlda.g:204:1: ( ruleQuant EOF )
            // InternalAlda.g:205:1: ruleQuant EOF
            {
             before(grammarAccess.getQuantRule()); 
            pushFollow(FOLLOW_1);
            ruleQuant();

            state._fsp--;

             after(grammarAccess.getQuantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuant"


    // $ANTLR start "ruleQuant"
    // InternalAlda.g:212:1: ruleQuant : ( ( rule__Quant__Group__0 ) ) ;
    public final void ruleQuant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:216:2: ( ( ( rule__Quant__Group__0 ) ) )
            // InternalAlda.g:217:2: ( ( rule__Quant__Group__0 ) )
            {
            // InternalAlda.g:217:2: ( ( rule__Quant__Group__0 ) )
            // InternalAlda.g:218:3: ( rule__Quant__Group__0 )
            {
             before(grammarAccess.getQuantAccess().getGroup()); 
            // InternalAlda.g:219:3: ( rule__Quant__Group__0 )
            // InternalAlda.g:219:4: rule__Quant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuant"


    // $ANTLR start "entryRuleVolume"
    // InternalAlda.g:228:1: entryRuleVolume : ruleVolume EOF ;
    public final void entryRuleVolume() throws RecognitionException {
        try {
            // InternalAlda.g:229:1: ( ruleVolume EOF )
            // InternalAlda.g:230:1: ruleVolume EOF
            {
             before(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getVolumeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalAlda.g:237:1: ruleVolume : ( ( rule__Volume__Group__0 ) ) ;
    public final void ruleVolume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:241:2: ( ( ( rule__Volume__Group__0 ) ) )
            // InternalAlda.g:242:2: ( ( rule__Volume__Group__0 ) )
            {
            // InternalAlda.g:242:2: ( ( rule__Volume__Group__0 ) )
            // InternalAlda.g:243:3: ( rule__Volume__Group__0 )
            {
             before(grammarAccess.getVolumeAccess().getGroup()); 
            // InternalAlda.g:244:3: ( rule__Volume__Group__0 )
            // InternalAlda.g:244:4: rule__Volume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleKeySignature"
    // InternalAlda.g:253:1: entryRuleKeySignature : ruleKeySignature EOF ;
    public final void entryRuleKeySignature() throws RecognitionException {
        try {
            // InternalAlda.g:254:1: ( ruleKeySignature EOF )
            // InternalAlda.g:255:1: ruleKeySignature EOF
            {
             before(grammarAccess.getKeySignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleKeySignature();

            state._fsp--;

             after(grammarAccess.getKeySignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeySignature"


    // $ANTLR start "ruleKeySignature"
    // InternalAlda.g:262:1: ruleKeySignature : ( ( rule__KeySignature__Group__0 ) ) ;
    public final void ruleKeySignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:266:2: ( ( ( rule__KeySignature__Group__0 ) ) )
            // InternalAlda.g:267:2: ( ( rule__KeySignature__Group__0 ) )
            {
            // InternalAlda.g:267:2: ( ( rule__KeySignature__Group__0 ) )
            // InternalAlda.g:268:3: ( rule__KeySignature__Group__0 )
            {
             before(grammarAccess.getKeySignatureAccess().getGroup()); 
            // InternalAlda.g:269:3: ( rule__KeySignature__Group__0 )
            // InternalAlda.g:269:4: rule__KeySignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeySignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeySignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeySignature"


    // $ANTLR start "rule__DECLRATIONS__Alternatives"
    // InternalAlda.g:277:1: rule__DECLRATIONS__Alternatives : ( ( ruleTempo ) | ( ruleQuant ) | ( ruleVolume ) | ( ruleKeySignature ) | ( ruleCOMMENT ) );
    public final void rule__DECLRATIONS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:281:1: ( ( ruleTempo ) | ( ruleQuant ) | ( ruleVolume ) | ( ruleKeySignature ) | ( ruleCOMMENT ) )
            int alt1=5;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt1=5;
                    }
                    break;
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                case 23:
                    {
                    alt1=2;
                    }
                    break;
                case 24:
                    {
                    alt1=3;
                    }
                    break;
                case 25:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlda.g:282:2: ( ruleTempo )
                    {
                    // InternalAlda.g:282:2: ( ruleTempo )
                    // InternalAlda.g:283:3: ruleTempo
                    {
                     before(grammarAccess.getDECLRATIONSAccess().getTempoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTempo();

                    state._fsp--;

                     after(grammarAccess.getDECLRATIONSAccess().getTempoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlda.g:288:2: ( ruleQuant )
                    {
                    // InternalAlda.g:288:2: ( ruleQuant )
                    // InternalAlda.g:289:3: ruleQuant
                    {
                     before(grammarAccess.getDECLRATIONSAccess().getQuantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuant();

                    state._fsp--;

                     after(grammarAccess.getDECLRATIONSAccess().getQuantParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlda.g:294:2: ( ruleVolume )
                    {
                    // InternalAlda.g:294:2: ( ruleVolume )
                    // InternalAlda.g:295:3: ruleVolume
                    {
                     before(grammarAccess.getDECLRATIONSAccess().getVolumeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVolume();

                    state._fsp--;

                     after(grammarAccess.getDECLRATIONSAccess().getVolumeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlda.g:300:2: ( ruleKeySignature )
                    {
                    // InternalAlda.g:300:2: ( ruleKeySignature )
                    // InternalAlda.g:301:3: ruleKeySignature
                    {
                     before(grammarAccess.getDECLRATIONSAccess().getKeySignatureParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleKeySignature();

                    state._fsp--;

                     after(grammarAccess.getDECLRATIONSAccess().getKeySignatureParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAlda.g:306:2: ( ruleCOMMENT )
                    {
                    // InternalAlda.g:306:2: ( ruleCOMMENT )
                    // InternalAlda.g:307:3: ruleCOMMENT
                    {
                     before(grammarAccess.getDECLRATIONSAccess().getCOMMENTParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCOMMENT();

                    state._fsp--;

                     after(grammarAccess.getDECLRATIONSAccess().getCOMMENTParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECLRATIONS__Alternatives"


    // $ANTLR start "rule__INSTRUMENT__Alternatives"
    // InternalAlda.g:316:1: rule__INSTRUMENT__Alternatives : ( ( 'piano' ) | ( 'violin' ) | ( 'flute' ) );
    public final void rule__INSTRUMENT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:320:1: ( ( 'piano' ) | ( 'violin' ) | ( 'flute' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAlda.g:321:2: ( 'piano' )
                    {
                    // InternalAlda.g:321:2: ( 'piano' )
                    // InternalAlda.g:322:3: 'piano'
                    {
                     before(grammarAccess.getINSTRUMENTAccess().getPianoKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getINSTRUMENTAccess().getPianoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlda.g:327:2: ( 'violin' )
                    {
                    // InternalAlda.g:327:2: ( 'violin' )
                    // InternalAlda.g:328:3: 'violin'
                    {
                     before(grammarAccess.getINSTRUMENTAccess().getViolinKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getINSTRUMENTAccess().getViolinKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlda.g:333:2: ( 'flute' )
                    {
                    // InternalAlda.g:333:2: ( 'flute' )
                    // InternalAlda.g:334:3: 'flute'
                    {
                     before(grammarAccess.getINSTRUMENTAccess().getFluteKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getINSTRUMENTAccess().getFluteKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENT__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAlda.g:343:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:347:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAlda.g:348:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAlda.g:355:1: rule__Model__Group__0__Impl : ( ( rule__Model__DeclarationsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:359:1: ( ( ( rule__Model__DeclarationsAssignment_0 )* ) )
            // InternalAlda.g:360:1: ( ( rule__Model__DeclarationsAssignment_0 )* )
            {
            // InternalAlda.g:360:1: ( ( rule__Model__DeclarationsAssignment_0 )* )
            // InternalAlda.g:361:2: ( rule__Model__DeclarationsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_0()); 
            // InternalAlda.g:362:2: ( rule__Model__DeclarationsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlda.g:362:3: rule__Model__DeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DeclarationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAlda.g:370:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:374:1: ( rule__Model__Group__1__Impl )
            // InternalAlda.g:375:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAlda.g:381:1: rule__Model__Group__1__Impl : ( ( rule__Model__InstrumentsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:385:1: ( ( ( rule__Model__InstrumentsAssignment_1 )* ) )
            // InternalAlda.g:386:1: ( ( rule__Model__InstrumentsAssignment_1 )* )
            {
            // InternalAlda.g:386:1: ( ( rule__Model__InstrumentsAssignment_1 )* )
            // InternalAlda.g:387:2: ( rule__Model__InstrumentsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getInstrumentsAssignment_1()); 
            // InternalAlda.g:388:2: ( rule__Model__InstrumentsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlda.g:388:3: rule__Model__InstrumentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__InstrumentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getInstrumentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__COMMENT__Group__0"
    // InternalAlda.g:397:1: rule__COMMENT__Group__0 : rule__COMMENT__Group__0__Impl rule__COMMENT__Group__1 ;
    public final void rule__COMMENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:401:1: ( rule__COMMENT__Group__0__Impl rule__COMMENT__Group__1 )
            // InternalAlda.g:402:2: rule__COMMENT__Group__0__Impl rule__COMMENT__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__COMMENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMMENT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__0"


    // $ANTLR start "rule__COMMENT__Group__0__Impl"
    // InternalAlda.g:409:1: rule__COMMENT__Group__0__Impl : ( '(' ) ;
    public final void rule__COMMENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:413:1: ( ( '(' ) )
            // InternalAlda.g:414:1: ( '(' )
            {
            // InternalAlda.g:414:1: ( '(' )
            // InternalAlda.g:415:2: '('
            {
             before(grammarAccess.getCOMMENTAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCOMMENTAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__0__Impl"


    // $ANTLR start "rule__COMMENT__Group__1"
    // InternalAlda.g:424:1: rule__COMMENT__Group__1 : rule__COMMENT__Group__1__Impl rule__COMMENT__Group__2 ;
    public final void rule__COMMENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:428:1: ( rule__COMMENT__Group__1__Impl rule__COMMENT__Group__2 )
            // InternalAlda.g:429:2: rule__COMMENT__Group__1__Impl rule__COMMENT__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__COMMENT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMMENT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__1"


    // $ANTLR start "rule__COMMENT__Group__1__Impl"
    // InternalAlda.g:436:1: rule__COMMENT__Group__1__Impl : ( 'comment' ) ;
    public final void rule__COMMENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:440:1: ( ( 'comment' ) )
            // InternalAlda.g:441:1: ( 'comment' )
            {
            // InternalAlda.g:441:1: ( 'comment' )
            // InternalAlda.g:442:2: 'comment'
            {
             before(grammarAccess.getCOMMENTAccess().getCommentKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCOMMENTAccess().getCommentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__1__Impl"


    // $ANTLR start "rule__COMMENT__Group__2"
    // InternalAlda.g:451:1: rule__COMMENT__Group__2 : rule__COMMENT__Group__2__Impl rule__COMMENT__Group__3 ;
    public final void rule__COMMENT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:455:1: ( rule__COMMENT__Group__2__Impl rule__COMMENT__Group__3 )
            // InternalAlda.g:456:2: rule__COMMENT__Group__2__Impl rule__COMMENT__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__COMMENT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMMENT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__2"


    // $ANTLR start "rule__COMMENT__Group__2__Impl"
    // InternalAlda.g:463:1: rule__COMMENT__Group__2__Impl : ( ( rule__COMMENT__NameAssignment_2 ) ) ;
    public final void rule__COMMENT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:467:1: ( ( ( rule__COMMENT__NameAssignment_2 ) ) )
            // InternalAlda.g:468:1: ( ( rule__COMMENT__NameAssignment_2 ) )
            {
            // InternalAlda.g:468:1: ( ( rule__COMMENT__NameAssignment_2 ) )
            // InternalAlda.g:469:2: ( rule__COMMENT__NameAssignment_2 )
            {
             before(grammarAccess.getCOMMENTAccess().getNameAssignment_2()); 
            // InternalAlda.g:470:2: ( rule__COMMENT__NameAssignment_2 )
            // InternalAlda.g:470:3: rule__COMMENT__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__COMMENT__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCOMMENTAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__2__Impl"


    // $ANTLR start "rule__COMMENT__Group__3"
    // InternalAlda.g:478:1: rule__COMMENT__Group__3 : rule__COMMENT__Group__3__Impl ;
    public final void rule__COMMENT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:482:1: ( rule__COMMENT__Group__3__Impl )
            // InternalAlda.g:483:2: rule__COMMENT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COMMENT__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__3"


    // $ANTLR start "rule__COMMENT__Group__3__Impl"
    // InternalAlda.g:489:1: rule__COMMENT__Group__3__Impl : ( ')' ) ;
    public final void rule__COMMENT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:493:1: ( ( ')' ) )
            // InternalAlda.g:494:1: ( ')' )
            {
            // InternalAlda.g:494:1: ( ')' )
            // InternalAlda.g:495:2: ')'
            {
             before(grammarAccess.getCOMMENTAccess().getRightParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCOMMENTAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__Group__3__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group__0"
    // InternalAlda.g:505:1: rule__INSTRUMENTS__Group__0 : rule__INSTRUMENTS__Group__0__Impl rule__INSTRUMENTS__Group__1 ;
    public final void rule__INSTRUMENTS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:509:1: ( rule__INSTRUMENTS__Group__0__Impl rule__INSTRUMENTS__Group__1 )
            // InternalAlda.g:510:2: rule__INSTRUMENTS__Group__0__Impl rule__INSTRUMENTS__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__INSTRUMENTS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__0"


    // $ANTLR start "rule__INSTRUMENTS__Group__0__Impl"
    // InternalAlda.g:517:1: rule__INSTRUMENTS__Group__0__Impl : ( ruleINSTRUMENT ) ;
    public final void rule__INSTRUMENTS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:521:1: ( ( ruleINSTRUMENT ) )
            // InternalAlda.g:522:1: ( ruleINSTRUMENT )
            {
            // InternalAlda.g:522:1: ( ruleINSTRUMENT )
            // InternalAlda.g:523:2: ruleINSTRUMENT
            {
             before(grammarAccess.getINSTRUMENTSAccess().getINSTRUMENTParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleINSTRUMENT();

            state._fsp--;

             after(grammarAccess.getINSTRUMENTSAccess().getINSTRUMENTParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__0__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group__1"
    // InternalAlda.g:532:1: rule__INSTRUMENTS__Group__1 : rule__INSTRUMENTS__Group__1__Impl rule__INSTRUMENTS__Group__2 ;
    public final void rule__INSTRUMENTS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:536:1: ( rule__INSTRUMENTS__Group__1__Impl rule__INSTRUMENTS__Group__2 )
            // InternalAlda.g:537:2: rule__INSTRUMENTS__Group__1__Impl rule__INSTRUMENTS__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__INSTRUMENTS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__1"


    // $ANTLR start "rule__INSTRUMENTS__Group__1__Impl"
    // InternalAlda.g:544:1: rule__INSTRUMENTS__Group__1__Impl : ( ( rule__INSTRUMENTS__Group_1__0 )* ) ;
    public final void rule__INSTRUMENTS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:548:1: ( ( ( rule__INSTRUMENTS__Group_1__0 )* ) )
            // InternalAlda.g:549:1: ( ( rule__INSTRUMENTS__Group_1__0 )* )
            {
            // InternalAlda.g:549:1: ( ( rule__INSTRUMENTS__Group_1__0 )* )
            // InternalAlda.g:550:2: ( rule__INSTRUMENTS__Group_1__0 )*
            {
             before(grammarAccess.getINSTRUMENTSAccess().getGroup_1()); 
            // InternalAlda.g:551:2: ( rule__INSTRUMENTS__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlda.g:551:3: rule__INSTRUMENTS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__INSTRUMENTS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getINSTRUMENTSAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__1__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group__2"
    // InternalAlda.g:559:1: rule__INSTRUMENTS__Group__2 : rule__INSTRUMENTS__Group__2__Impl rule__INSTRUMENTS__Group__3 ;
    public final void rule__INSTRUMENTS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:563:1: ( rule__INSTRUMENTS__Group__2__Impl rule__INSTRUMENTS__Group__3 )
            // InternalAlda.g:564:2: rule__INSTRUMENTS__Group__2__Impl rule__INSTRUMENTS__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__INSTRUMENTS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__2"


    // $ANTLR start "rule__INSTRUMENTS__Group__2__Impl"
    // InternalAlda.g:571:1: rule__INSTRUMENTS__Group__2__Impl : ( ':' ) ;
    public final void rule__INSTRUMENTS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:575:1: ( ( ':' ) )
            // InternalAlda.g:576:1: ( ':' )
            {
            // InternalAlda.g:576:1: ( ':' )
            // InternalAlda.g:577:2: ':'
            {
             before(grammarAccess.getINSTRUMENTSAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getINSTRUMENTSAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__2__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group__3"
    // InternalAlda.g:586:1: rule__INSTRUMENTS__Group__3 : rule__INSTRUMENTS__Group__3__Impl rule__INSTRUMENTS__Group__4 ;
    public final void rule__INSTRUMENTS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:590:1: ( rule__INSTRUMENTS__Group__3__Impl rule__INSTRUMENTS__Group__4 )
            // InternalAlda.g:591:2: rule__INSTRUMENTS__Group__3__Impl rule__INSTRUMENTS__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__INSTRUMENTS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__3"


    // $ANTLR start "rule__INSTRUMENTS__Group__3__Impl"
    // InternalAlda.g:598:1: rule__INSTRUMENTS__Group__3__Impl : ( ( '\\n' )* ) ;
    public final void rule__INSTRUMENTS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:602:1: ( ( ( '\\n' )* ) )
            // InternalAlda.g:603:1: ( ( '\\n' )* )
            {
            // InternalAlda.g:603:1: ( ( '\\n' )* )
            // InternalAlda.g:604:2: ( '\\n' )*
            {
             before(grammarAccess.getINSTRUMENTSAccess().getLineFeedKeyword_3()); 
            // InternalAlda.g:605:2: ( '\\n' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAlda.g:605:3: '\\n'
            	    {
            	    match(input,19,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getINSTRUMENTSAccess().getLineFeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__3__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group__4"
    // InternalAlda.g:613:1: rule__INSTRUMENTS__Group__4 : rule__INSTRUMENTS__Group__4__Impl ;
    public final void rule__INSTRUMENTS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:617:1: ( rule__INSTRUMENTS__Group__4__Impl )
            // InternalAlda.g:618:2: rule__INSTRUMENTS__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__4"


    // $ANTLR start "rule__INSTRUMENTS__Group__4__Impl"
    // InternalAlda.g:624:1: rule__INSTRUMENTS__Group__4__Impl : ( ( rule__INSTRUMENTS__NameAssignment_4 ) ) ;
    public final void rule__INSTRUMENTS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:628:1: ( ( ( rule__INSTRUMENTS__NameAssignment_4 ) ) )
            // InternalAlda.g:629:1: ( ( rule__INSTRUMENTS__NameAssignment_4 ) )
            {
            // InternalAlda.g:629:1: ( ( rule__INSTRUMENTS__NameAssignment_4 ) )
            // InternalAlda.g:630:2: ( rule__INSTRUMENTS__NameAssignment_4 )
            {
             before(grammarAccess.getINSTRUMENTSAccess().getNameAssignment_4()); 
            // InternalAlda.g:631:2: ( rule__INSTRUMENTS__NameAssignment_4 )
            // InternalAlda.g:631:3: rule__INSTRUMENTS__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getINSTRUMENTSAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group__4__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group_1__0"
    // InternalAlda.g:640:1: rule__INSTRUMENTS__Group_1__0 : rule__INSTRUMENTS__Group_1__0__Impl rule__INSTRUMENTS__Group_1__1 ;
    public final void rule__INSTRUMENTS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:644:1: ( rule__INSTRUMENTS__Group_1__0__Impl rule__INSTRUMENTS__Group_1__1 )
            // InternalAlda.g:645:2: rule__INSTRUMENTS__Group_1__0__Impl rule__INSTRUMENTS__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__INSTRUMENTS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group_1__0"


    // $ANTLR start "rule__INSTRUMENTS__Group_1__0__Impl"
    // InternalAlda.g:652:1: rule__INSTRUMENTS__Group_1__0__Impl : ( '/' ) ;
    public final void rule__INSTRUMENTS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:656:1: ( ( '/' ) )
            // InternalAlda.g:657:1: ( '/' )
            {
            // InternalAlda.g:657:1: ( '/' )
            // InternalAlda.g:658:2: '/'
            {
             before(grammarAccess.getINSTRUMENTSAccess().getSolidusKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getINSTRUMENTSAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group_1__0__Impl"


    // $ANTLR start "rule__INSTRUMENTS__Group_1__1"
    // InternalAlda.g:667:1: rule__INSTRUMENTS__Group_1__1 : rule__INSTRUMENTS__Group_1__1__Impl ;
    public final void rule__INSTRUMENTS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:671:1: ( rule__INSTRUMENTS__Group_1__1__Impl )
            // InternalAlda.g:672:2: rule__INSTRUMENTS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUMENTS__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group_1__1"


    // $ANTLR start "rule__INSTRUMENTS__Group_1__1__Impl"
    // InternalAlda.g:678:1: rule__INSTRUMENTS__Group_1__1__Impl : ( ruleINSTRUMENT ) ;
    public final void rule__INSTRUMENTS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:682:1: ( ( ruleINSTRUMENT ) )
            // InternalAlda.g:683:1: ( ruleINSTRUMENT )
            {
            // InternalAlda.g:683:1: ( ruleINSTRUMENT )
            // InternalAlda.g:684:2: ruleINSTRUMENT
            {
             before(grammarAccess.getINSTRUMENTSAccess().getINSTRUMENTParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleINSTRUMENT();

            state._fsp--;

             after(grammarAccess.getINSTRUMENTSAccess().getINSTRUMENTParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__Group_1__1__Impl"


    // $ANTLR start "rule__Tempo__Group__0"
    // InternalAlda.g:694:1: rule__Tempo__Group__0 : rule__Tempo__Group__0__Impl rule__Tempo__Group__1 ;
    public final void rule__Tempo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:698:1: ( rule__Tempo__Group__0__Impl rule__Tempo__Group__1 )
            // InternalAlda.g:699:2: rule__Tempo__Group__0__Impl rule__Tempo__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Tempo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tempo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__0"


    // $ANTLR start "rule__Tempo__Group__0__Impl"
    // InternalAlda.g:706:1: rule__Tempo__Group__0__Impl : ( '(' ) ;
    public final void rule__Tempo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:710:1: ( ( '(' ) )
            // InternalAlda.g:711:1: ( '(' )
            {
            // InternalAlda.g:711:1: ( '(' )
            // InternalAlda.g:712:2: '('
            {
             before(grammarAccess.getTempoAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTempoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__0__Impl"


    // $ANTLR start "rule__Tempo__Group__1"
    // InternalAlda.g:721:1: rule__Tempo__Group__1 : rule__Tempo__Group__1__Impl rule__Tempo__Group__2 ;
    public final void rule__Tempo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:725:1: ( rule__Tempo__Group__1__Impl rule__Tempo__Group__2 )
            // InternalAlda.g:726:2: rule__Tempo__Group__1__Impl rule__Tempo__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tempo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tempo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__1"


    // $ANTLR start "rule__Tempo__Group__1__Impl"
    // InternalAlda.g:733:1: rule__Tempo__Group__1__Impl : ( 'tempo' ) ;
    public final void rule__Tempo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:737:1: ( ( 'tempo' ) )
            // InternalAlda.g:738:1: ( 'tempo' )
            {
            // InternalAlda.g:738:1: ( 'tempo' )
            // InternalAlda.g:739:2: 'tempo'
            {
             before(grammarAccess.getTempoAccess().getTempoKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTempoAccess().getTempoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__1__Impl"


    // $ANTLR start "rule__Tempo__Group__2"
    // InternalAlda.g:748:1: rule__Tempo__Group__2 : rule__Tempo__Group__2__Impl rule__Tempo__Group__3 ;
    public final void rule__Tempo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:752:1: ( rule__Tempo__Group__2__Impl rule__Tempo__Group__3 )
            // InternalAlda.g:753:2: rule__Tempo__Group__2__Impl rule__Tempo__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Tempo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tempo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__2"


    // $ANTLR start "rule__Tempo__Group__2__Impl"
    // InternalAlda.g:760:1: rule__Tempo__Group__2__Impl : ( ( '!' )? ) ;
    public final void rule__Tempo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:764:1: ( ( ( '!' )? ) )
            // InternalAlda.g:765:1: ( ( '!' )? )
            {
            // InternalAlda.g:765:1: ( ( '!' )? )
            // InternalAlda.g:766:2: ( '!' )?
            {
             before(grammarAccess.getTempoAccess().getExclamationMarkKeyword_2()); 
            // InternalAlda.g:767:2: ( '!' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlda.g:767:3: '!'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTempoAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__2__Impl"


    // $ANTLR start "rule__Tempo__Group__3"
    // InternalAlda.g:775:1: rule__Tempo__Group__3 : rule__Tempo__Group__3__Impl rule__Tempo__Group__4 ;
    public final void rule__Tempo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:779:1: ( rule__Tempo__Group__3__Impl rule__Tempo__Group__4 )
            // InternalAlda.g:780:2: rule__Tempo__Group__3__Impl rule__Tempo__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Tempo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tempo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__3"


    // $ANTLR start "rule__Tempo__Group__3__Impl"
    // InternalAlda.g:787:1: rule__Tempo__Group__3__Impl : ( ( rule__Tempo__NameAssignment_3 ) ) ;
    public final void rule__Tempo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:791:1: ( ( ( rule__Tempo__NameAssignment_3 ) ) )
            // InternalAlda.g:792:1: ( ( rule__Tempo__NameAssignment_3 ) )
            {
            // InternalAlda.g:792:1: ( ( rule__Tempo__NameAssignment_3 ) )
            // InternalAlda.g:793:2: ( rule__Tempo__NameAssignment_3 )
            {
             before(grammarAccess.getTempoAccess().getNameAssignment_3()); 
            // InternalAlda.g:794:2: ( rule__Tempo__NameAssignment_3 )
            // InternalAlda.g:794:3: rule__Tempo__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tempo__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTempoAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__3__Impl"


    // $ANTLR start "rule__Tempo__Group__4"
    // InternalAlda.g:802:1: rule__Tempo__Group__4 : rule__Tempo__Group__4__Impl ;
    public final void rule__Tempo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:806:1: ( rule__Tempo__Group__4__Impl )
            // InternalAlda.g:807:2: rule__Tempo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tempo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__4"


    // $ANTLR start "rule__Tempo__Group__4__Impl"
    // InternalAlda.g:813:1: rule__Tempo__Group__4__Impl : ( ')' ) ;
    public final void rule__Tempo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:817:1: ( ( ')' ) )
            // InternalAlda.g:818:1: ( ')' )
            {
            // InternalAlda.g:818:1: ( ')' )
            // InternalAlda.g:819:2: ')'
            {
             before(grammarAccess.getTempoAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTempoAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__Group__4__Impl"


    // $ANTLR start "rule__Quant__Group__0"
    // InternalAlda.g:829:1: rule__Quant__Group__0 : rule__Quant__Group__0__Impl rule__Quant__Group__1 ;
    public final void rule__Quant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:833:1: ( rule__Quant__Group__0__Impl rule__Quant__Group__1 )
            // InternalAlda.g:834:2: rule__Quant__Group__0__Impl rule__Quant__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Quant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__0"


    // $ANTLR start "rule__Quant__Group__0__Impl"
    // InternalAlda.g:841:1: rule__Quant__Group__0__Impl : ( '(' ) ;
    public final void rule__Quant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:845:1: ( ( '(' ) )
            // InternalAlda.g:846:1: ( '(' )
            {
            // InternalAlda.g:846:1: ( '(' )
            // InternalAlda.g:847:2: '('
            {
             before(grammarAccess.getQuantAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuantAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__0__Impl"


    // $ANTLR start "rule__Quant__Group__1"
    // InternalAlda.g:856:1: rule__Quant__Group__1 : rule__Quant__Group__1__Impl rule__Quant__Group__2 ;
    public final void rule__Quant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:860:1: ( rule__Quant__Group__1__Impl rule__Quant__Group__2 )
            // InternalAlda.g:861:2: rule__Quant__Group__1__Impl rule__Quant__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Quant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__1"


    // $ANTLR start "rule__Quant__Group__1__Impl"
    // InternalAlda.g:868:1: rule__Quant__Group__1__Impl : ( 'quant' ) ;
    public final void rule__Quant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:872:1: ( ( 'quant' ) )
            // InternalAlda.g:873:1: ( 'quant' )
            {
            // InternalAlda.g:873:1: ( 'quant' )
            // InternalAlda.g:874:2: 'quant'
            {
             before(grammarAccess.getQuantAccess().getQuantKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuantAccess().getQuantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__1__Impl"


    // $ANTLR start "rule__Quant__Group__2"
    // InternalAlda.g:883:1: rule__Quant__Group__2 : rule__Quant__Group__2__Impl rule__Quant__Group__3 ;
    public final void rule__Quant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:887:1: ( rule__Quant__Group__2__Impl rule__Quant__Group__3 )
            // InternalAlda.g:888:2: rule__Quant__Group__2__Impl rule__Quant__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Quant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__2"


    // $ANTLR start "rule__Quant__Group__2__Impl"
    // InternalAlda.g:895:1: rule__Quant__Group__2__Impl : ( ( '!' )? ) ;
    public final void rule__Quant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:899:1: ( ( ( '!' )? ) )
            // InternalAlda.g:900:1: ( ( '!' )? )
            {
            // InternalAlda.g:900:1: ( ( '!' )? )
            // InternalAlda.g:901:2: ( '!' )?
            {
             before(grammarAccess.getQuantAccess().getExclamationMarkKeyword_2()); 
            // InternalAlda.g:902:2: ( '!' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlda.g:902:3: '!'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuantAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__2__Impl"


    // $ANTLR start "rule__Quant__Group__3"
    // InternalAlda.g:910:1: rule__Quant__Group__3 : rule__Quant__Group__3__Impl rule__Quant__Group__4 ;
    public final void rule__Quant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:914:1: ( rule__Quant__Group__3__Impl rule__Quant__Group__4 )
            // InternalAlda.g:915:2: rule__Quant__Group__3__Impl rule__Quant__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Quant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__3"


    // $ANTLR start "rule__Quant__Group__3__Impl"
    // InternalAlda.g:922:1: rule__Quant__Group__3__Impl : ( ( rule__Quant__NameAssignment_3 ) ) ;
    public final void rule__Quant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:926:1: ( ( ( rule__Quant__NameAssignment_3 ) ) )
            // InternalAlda.g:927:1: ( ( rule__Quant__NameAssignment_3 ) )
            {
            // InternalAlda.g:927:1: ( ( rule__Quant__NameAssignment_3 ) )
            // InternalAlda.g:928:2: ( rule__Quant__NameAssignment_3 )
            {
             before(grammarAccess.getQuantAccess().getNameAssignment_3()); 
            // InternalAlda.g:929:2: ( rule__Quant__NameAssignment_3 )
            // InternalAlda.g:929:3: rule__Quant__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Quant__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuantAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__3__Impl"


    // $ANTLR start "rule__Quant__Group__4"
    // InternalAlda.g:937:1: rule__Quant__Group__4 : rule__Quant__Group__4__Impl ;
    public final void rule__Quant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:941:1: ( rule__Quant__Group__4__Impl )
            // InternalAlda.g:942:2: rule__Quant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__4"


    // $ANTLR start "rule__Quant__Group__4__Impl"
    // InternalAlda.g:948:1: rule__Quant__Group__4__Impl : ( ')' ) ;
    public final void rule__Quant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:952:1: ( ( ')' ) )
            // InternalAlda.g:953:1: ( ')' )
            {
            // InternalAlda.g:953:1: ( ')' )
            // InternalAlda.g:954:2: ')'
            {
             before(grammarAccess.getQuantAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuantAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__Group__4__Impl"


    // $ANTLR start "rule__Volume__Group__0"
    // InternalAlda.g:964:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:968:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalAlda.g:969:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Volume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0"


    // $ANTLR start "rule__Volume__Group__0__Impl"
    // InternalAlda.g:976:1: rule__Volume__Group__0__Impl : ( '(' ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:980:1: ( ( '(' ) )
            // InternalAlda.g:981:1: ( '(' )
            {
            // InternalAlda.g:981:1: ( '(' )
            // InternalAlda.g:982:2: '('
            {
             before(grammarAccess.getVolumeAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0__Impl"


    // $ANTLR start "rule__Volume__Group__1"
    // InternalAlda.g:991:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl rule__Volume__Group__2 ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:995:1: ( rule__Volume__Group__1__Impl rule__Volume__Group__2 )
            // InternalAlda.g:996:2: rule__Volume__Group__1__Impl rule__Volume__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Volume__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__1"


    // $ANTLR start "rule__Volume__Group__1__Impl"
    // InternalAlda.g:1003:1: rule__Volume__Group__1__Impl : ( 'volume' ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1007:1: ( ( 'volume' ) )
            // InternalAlda.g:1008:1: ( 'volume' )
            {
            // InternalAlda.g:1008:1: ( 'volume' )
            // InternalAlda.g:1009:2: 'volume'
            {
             before(grammarAccess.getVolumeAccess().getVolumeKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getVolumeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__1__Impl"


    // $ANTLR start "rule__Volume__Group__2"
    // InternalAlda.g:1018:1: rule__Volume__Group__2 : rule__Volume__Group__2__Impl rule__Volume__Group__3 ;
    public final void rule__Volume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1022:1: ( rule__Volume__Group__2__Impl rule__Volume__Group__3 )
            // InternalAlda.g:1023:2: rule__Volume__Group__2__Impl rule__Volume__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Volume__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__2"


    // $ANTLR start "rule__Volume__Group__2__Impl"
    // InternalAlda.g:1030:1: rule__Volume__Group__2__Impl : ( ( '!' )? ) ;
    public final void rule__Volume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1034:1: ( ( ( '!' )? ) )
            // InternalAlda.g:1035:1: ( ( '!' )? )
            {
            // InternalAlda.g:1035:1: ( ( '!' )? )
            // InternalAlda.g:1036:2: ( '!' )?
            {
             before(grammarAccess.getVolumeAccess().getExclamationMarkKeyword_2()); 
            // InternalAlda.g:1037:2: ( '!' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlda.g:1037:3: '!'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVolumeAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__2__Impl"


    // $ANTLR start "rule__Volume__Group__3"
    // InternalAlda.g:1045:1: rule__Volume__Group__3 : rule__Volume__Group__3__Impl rule__Volume__Group__4 ;
    public final void rule__Volume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1049:1: ( rule__Volume__Group__3__Impl rule__Volume__Group__4 )
            // InternalAlda.g:1050:2: rule__Volume__Group__3__Impl rule__Volume__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Volume__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__3"


    // $ANTLR start "rule__Volume__Group__3__Impl"
    // InternalAlda.g:1057:1: rule__Volume__Group__3__Impl : ( ( rule__Volume__NameAssignment_3 ) ) ;
    public final void rule__Volume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1061:1: ( ( ( rule__Volume__NameAssignment_3 ) ) )
            // InternalAlda.g:1062:1: ( ( rule__Volume__NameAssignment_3 ) )
            {
            // InternalAlda.g:1062:1: ( ( rule__Volume__NameAssignment_3 ) )
            // InternalAlda.g:1063:2: ( rule__Volume__NameAssignment_3 )
            {
             before(grammarAccess.getVolumeAccess().getNameAssignment_3()); 
            // InternalAlda.g:1064:2: ( rule__Volume__NameAssignment_3 )
            // InternalAlda.g:1064:3: rule__Volume__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Volume__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__3__Impl"


    // $ANTLR start "rule__Volume__Group__4"
    // InternalAlda.g:1072:1: rule__Volume__Group__4 : rule__Volume__Group__4__Impl ;
    public final void rule__Volume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1076:1: ( rule__Volume__Group__4__Impl )
            // InternalAlda.g:1077:2: rule__Volume__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__4"


    // $ANTLR start "rule__Volume__Group__4__Impl"
    // InternalAlda.g:1083:1: rule__Volume__Group__4__Impl : ( ')' ) ;
    public final void rule__Volume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1087:1: ( ( ')' ) )
            // InternalAlda.g:1088:1: ( ')' )
            {
            // InternalAlda.g:1088:1: ( ')' )
            // InternalAlda.g:1089:2: ')'
            {
             before(grammarAccess.getVolumeAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__4__Impl"


    // $ANTLR start "rule__KeySignature__Group__0"
    // InternalAlda.g:1099:1: rule__KeySignature__Group__0 : rule__KeySignature__Group__0__Impl rule__KeySignature__Group__1 ;
    public final void rule__KeySignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1103:1: ( rule__KeySignature__Group__0__Impl rule__KeySignature__Group__1 )
            // InternalAlda.g:1104:2: rule__KeySignature__Group__0__Impl rule__KeySignature__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__KeySignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeySignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__0"


    // $ANTLR start "rule__KeySignature__Group__0__Impl"
    // InternalAlda.g:1111:1: rule__KeySignature__Group__0__Impl : ( '(' ) ;
    public final void rule__KeySignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1115:1: ( ( '(' ) )
            // InternalAlda.g:1116:1: ( '(' )
            {
            // InternalAlda.g:1116:1: ( '(' )
            // InternalAlda.g:1117:2: '('
            {
             before(grammarAccess.getKeySignatureAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getKeySignatureAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__0__Impl"


    // $ANTLR start "rule__KeySignature__Group__1"
    // InternalAlda.g:1126:1: rule__KeySignature__Group__1 : rule__KeySignature__Group__1__Impl rule__KeySignature__Group__2 ;
    public final void rule__KeySignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1130:1: ( rule__KeySignature__Group__1__Impl rule__KeySignature__Group__2 )
            // InternalAlda.g:1131:2: rule__KeySignature__Group__1__Impl rule__KeySignature__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__KeySignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeySignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__1"


    // $ANTLR start "rule__KeySignature__Group__1__Impl"
    // InternalAlda.g:1138:1: rule__KeySignature__Group__1__Impl : ( 'key-signature' ) ;
    public final void rule__KeySignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1142:1: ( ( 'key-signature' ) )
            // InternalAlda.g:1143:1: ( 'key-signature' )
            {
            // InternalAlda.g:1143:1: ( 'key-signature' )
            // InternalAlda.g:1144:2: 'key-signature'
            {
             before(grammarAccess.getKeySignatureAccess().getKeySignatureKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getKeySignatureAccess().getKeySignatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__1__Impl"


    // $ANTLR start "rule__KeySignature__Group__2"
    // InternalAlda.g:1153:1: rule__KeySignature__Group__2 : rule__KeySignature__Group__2__Impl rule__KeySignature__Group__3 ;
    public final void rule__KeySignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1157:1: ( rule__KeySignature__Group__2__Impl rule__KeySignature__Group__3 )
            // InternalAlda.g:1158:2: rule__KeySignature__Group__2__Impl rule__KeySignature__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__KeySignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeySignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__2"


    // $ANTLR start "rule__KeySignature__Group__2__Impl"
    // InternalAlda.g:1165:1: rule__KeySignature__Group__2__Impl : ( ( '!' )? ) ;
    public final void rule__KeySignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1169:1: ( ( ( '!' )? ) )
            // InternalAlda.g:1170:1: ( ( '!' )? )
            {
            // InternalAlda.g:1170:1: ( ( '!' )? )
            // InternalAlda.g:1171:2: ( '!' )?
            {
             before(grammarAccess.getKeySignatureAccess().getExclamationMarkKeyword_2()); 
            // InternalAlda.g:1172:2: ( '!' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlda.g:1172:3: '!'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getKeySignatureAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__2__Impl"


    // $ANTLR start "rule__KeySignature__Group__3"
    // InternalAlda.g:1180:1: rule__KeySignature__Group__3 : rule__KeySignature__Group__3__Impl rule__KeySignature__Group__4 ;
    public final void rule__KeySignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1184:1: ( rule__KeySignature__Group__3__Impl rule__KeySignature__Group__4 )
            // InternalAlda.g:1185:2: rule__KeySignature__Group__3__Impl rule__KeySignature__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__KeySignature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeySignature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__3"


    // $ANTLR start "rule__KeySignature__Group__3__Impl"
    // InternalAlda.g:1192:1: rule__KeySignature__Group__3__Impl : ( ( rule__KeySignature__NameAssignment_3 ) ) ;
    public final void rule__KeySignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1196:1: ( ( ( rule__KeySignature__NameAssignment_3 ) ) )
            // InternalAlda.g:1197:1: ( ( rule__KeySignature__NameAssignment_3 ) )
            {
            // InternalAlda.g:1197:1: ( ( rule__KeySignature__NameAssignment_3 ) )
            // InternalAlda.g:1198:2: ( rule__KeySignature__NameAssignment_3 )
            {
             before(grammarAccess.getKeySignatureAccess().getNameAssignment_3()); 
            // InternalAlda.g:1199:2: ( rule__KeySignature__NameAssignment_3 )
            // InternalAlda.g:1199:3: rule__KeySignature__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__KeySignature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKeySignatureAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__3__Impl"


    // $ANTLR start "rule__KeySignature__Group__4"
    // InternalAlda.g:1207:1: rule__KeySignature__Group__4 : rule__KeySignature__Group__4__Impl ;
    public final void rule__KeySignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1211:1: ( rule__KeySignature__Group__4__Impl )
            // InternalAlda.g:1212:2: rule__KeySignature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeySignature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__4"


    // $ANTLR start "rule__KeySignature__Group__4__Impl"
    // InternalAlda.g:1218:1: rule__KeySignature__Group__4__Impl : ( ')' ) ;
    public final void rule__KeySignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1222:1: ( ( ')' ) )
            // InternalAlda.g:1223:1: ( ')' )
            {
            // InternalAlda.g:1223:1: ( ')' )
            // InternalAlda.g:1224:2: ')'
            {
             before(grammarAccess.getKeySignatureAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getKeySignatureAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__Group__4__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment_0"
    // InternalAlda.g:1234:1: rule__Model__DeclarationsAssignment_0 : ( ruleDECLRATIONS ) ;
    public final void rule__Model__DeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1238:1: ( ( ruleDECLRATIONS ) )
            // InternalAlda.g:1239:2: ( ruleDECLRATIONS )
            {
            // InternalAlda.g:1239:2: ( ruleDECLRATIONS )
            // InternalAlda.g:1240:3: ruleDECLRATIONS
            {
             before(grammarAccess.getModelAccess().getDeclarationsDECLRATIONSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDECLRATIONS();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDECLRATIONSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment_0"


    // $ANTLR start "rule__Model__InstrumentsAssignment_1"
    // InternalAlda.g:1249:1: rule__Model__InstrumentsAssignment_1 : ( ruleINSTRUMENTS ) ;
    public final void rule__Model__InstrumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1253:1: ( ( ruleINSTRUMENTS ) )
            // InternalAlda.g:1254:2: ( ruleINSTRUMENTS )
            {
            // InternalAlda.g:1254:2: ( ruleINSTRUMENTS )
            // InternalAlda.g:1255:3: ruleINSTRUMENTS
            {
             before(grammarAccess.getModelAccess().getInstrumentsINSTRUMENTSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleINSTRUMENTS();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInstrumentsINSTRUMENTSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InstrumentsAssignment_1"


    // $ANTLR start "rule__COMMENT__NameAssignment_2"
    // InternalAlda.g:1264:1: rule__COMMENT__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__COMMENT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1268:1: ( ( RULE_STRING ) )
            // InternalAlda.g:1269:2: ( RULE_STRING )
            {
            // InternalAlda.g:1269:2: ( RULE_STRING )
            // InternalAlda.g:1270:3: RULE_STRING
            {
             before(grammarAccess.getCOMMENTAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCOMMENTAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMMENT__NameAssignment_2"


    // $ANTLR start "rule__INSTRUMENTS__NameAssignment_4"
    // InternalAlda.g:1279:1: rule__INSTRUMENTS__NameAssignment_4 : ( RULE_NOTES ) ;
    public final void rule__INSTRUMENTS__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1283:1: ( ( RULE_NOTES ) )
            // InternalAlda.g:1284:2: ( RULE_NOTES )
            {
            // InternalAlda.g:1284:2: ( RULE_NOTES )
            // InternalAlda.g:1285:3: RULE_NOTES
            {
             before(grammarAccess.getINSTRUMENTSAccess().getNameNOTESTerminalRuleCall_4_0()); 
            match(input,RULE_NOTES,FOLLOW_2); 
             after(grammarAccess.getINSTRUMENTSAccess().getNameNOTESTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUMENTS__NameAssignment_4"


    // $ANTLR start "rule__Tempo__NameAssignment_3"
    // InternalAlda.g:1294:1: rule__Tempo__NameAssignment_3 : ( RULE_INT ) ;
    public final void rule__Tempo__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1298:1: ( ( RULE_INT ) )
            // InternalAlda.g:1299:2: ( RULE_INT )
            {
            // InternalAlda.g:1299:2: ( RULE_INT )
            // InternalAlda.g:1300:3: RULE_INT
            {
             before(grammarAccess.getTempoAccess().getNameINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTempoAccess().getNameINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tempo__NameAssignment_3"


    // $ANTLR start "rule__Quant__NameAssignment_3"
    // InternalAlda.g:1309:1: rule__Quant__NameAssignment_3 : ( RULE_INT ) ;
    public final void rule__Quant__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1313:1: ( ( RULE_INT ) )
            // InternalAlda.g:1314:2: ( RULE_INT )
            {
            // InternalAlda.g:1314:2: ( RULE_INT )
            // InternalAlda.g:1315:3: RULE_INT
            {
             before(grammarAccess.getQuantAccess().getNameINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantAccess().getNameINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quant__NameAssignment_3"


    // $ANTLR start "rule__Volume__NameAssignment_3"
    // InternalAlda.g:1324:1: rule__Volume__NameAssignment_3 : ( RULE_INT ) ;
    public final void rule__Volume__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1328:1: ( ( RULE_INT ) )
            // InternalAlda.g:1329:2: ( RULE_INT )
            {
            // InternalAlda.g:1329:2: ( RULE_INT )
            // InternalAlda.g:1330:3: RULE_INT
            {
             before(grammarAccess.getVolumeAccess().getNameINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getNameINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__NameAssignment_3"


    // $ANTLR start "rule__KeySignature__NameAssignment_3"
    // InternalAlda.g:1339:1: rule__KeySignature__NameAssignment_3 : ( RULE_NOTES ) ;
    public final void rule__KeySignature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlda.g:1343:1: ( ( RULE_NOTES ) )
            // InternalAlda.g:1344:2: ( RULE_NOTES )
            {
            // InternalAlda.g:1344:2: ( RULE_NOTES )
            // InternalAlda.g:1345:3: RULE_NOTES
            {
             before(grammarAccess.getKeySignatureAccess().getNameNOTESTerminalRuleCall_3_0()); 
            match(input,RULE_NOTES,FOLLOW_2); 
             after(grammarAccess.getKeySignatureAccess().getNameNOTESTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeySignature__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400020L});

}