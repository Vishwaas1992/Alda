package org.xtext.editor.alda.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.editor.alda.services.AldaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAldaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NOTES", "RULE_INT", "RULE_ML_COMMENT", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'comment'", "')'", "'/'", "':'", "'\\n'", "'piano'", "'violin'", "'flute'", "'tempo'", "'!'", "'quant'", "'volume'", "'key-signature'"
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

        public InternalAldaParser(TokenStream input, AldaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AldaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAlda.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAlda.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAlda.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAlda.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDECLRATIONS ) )* ( (lv_instruments_1_0= ruleINSTRUMENTS ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;

        EObject lv_instruments_1_0 = null;



        	enterRule();

        try {
            // InternalAlda.g:77:2: ( ( ( (lv_declarations_0_0= ruleDECLRATIONS ) )* ( (lv_instruments_1_0= ruleINSTRUMENTS ) )* ) )
            // InternalAlda.g:78:2: ( ( (lv_declarations_0_0= ruleDECLRATIONS ) )* ( (lv_instruments_1_0= ruleINSTRUMENTS ) )* )
            {
            // InternalAlda.g:78:2: ( ( (lv_declarations_0_0= ruleDECLRATIONS ) )* ( (lv_instruments_1_0= ruleINSTRUMENTS ) )* )
            // InternalAlda.g:79:3: ( (lv_declarations_0_0= ruleDECLRATIONS ) )* ( (lv_instruments_1_0= ruleINSTRUMENTS ) )*
            {
            // InternalAlda.g:79:3: ( (lv_declarations_0_0= ruleDECLRATIONS ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlda.g:80:4: (lv_declarations_0_0= ruleDECLRATIONS )
            	    {
            	    // InternalAlda.g:80:4: (lv_declarations_0_0= ruleDECLRATIONS )
            	    // InternalAlda.g:81:5: lv_declarations_0_0= ruleDECLRATIONS
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDECLRATIONSParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDECLRATIONS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_0_0,
            	    						"org.xtext.editor.alda.Alda.DECLRATIONS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAlda.g:98:3: ( (lv_instruments_1_0= ruleINSTRUMENTS ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlda.g:99:4: (lv_instruments_1_0= ruleINSTRUMENTS )
            	    {
            	    // InternalAlda.g:99:4: (lv_instruments_1_0= ruleINSTRUMENTS )
            	    // InternalAlda.g:100:5: lv_instruments_1_0= ruleINSTRUMENTS
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getInstrumentsINSTRUMENTSParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_instruments_1_0=ruleINSTRUMENTS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instruments",
            	    						lv_instruments_1_0,
            	    						"org.xtext.editor.alda.Alda.INSTRUMENTS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDECLRATIONS"
    // InternalAlda.g:121:1: entryRuleDECLRATIONS returns [EObject current=null] : iv_ruleDECLRATIONS= ruleDECLRATIONS EOF ;
    public final EObject entryRuleDECLRATIONS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDECLRATIONS = null;


        try {
            // InternalAlda.g:121:52: (iv_ruleDECLRATIONS= ruleDECLRATIONS EOF )
            // InternalAlda.g:122:2: iv_ruleDECLRATIONS= ruleDECLRATIONS EOF
            {
             newCompositeNode(grammarAccess.getDECLRATIONSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECLRATIONS=ruleDECLRATIONS();

            state._fsp--;

             current =iv_ruleDECLRATIONS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECLRATIONS"


    // $ANTLR start "ruleDECLRATIONS"
    // InternalAlda.g:128:1: ruleDECLRATIONS returns [EObject current=null] : (this_Tempo_0= ruleTempo | this_Quant_1= ruleQuant | this_Volume_2= ruleVolume | this_KeySignature_3= ruleKeySignature | this_COMMENT_4= ruleCOMMENT ) ;
    public final EObject ruleDECLRATIONS() throws RecognitionException {
        EObject current = null;

        EObject this_Tempo_0 = null;

        EObject this_Quant_1 = null;

        EObject this_Volume_2 = null;

        EObject this_KeySignature_3 = null;

        EObject this_COMMENT_4 = null;



        	enterRule();

        try {
            // InternalAlda.g:134:2: ( (this_Tempo_0= ruleTempo | this_Quant_1= ruleQuant | this_Volume_2= ruleVolume | this_KeySignature_3= ruleKeySignature | this_COMMENT_4= ruleCOMMENT ) )
            // InternalAlda.g:135:2: (this_Tempo_0= ruleTempo | this_Quant_1= ruleQuant | this_Volume_2= ruleVolume | this_KeySignature_3= ruleKeySignature | this_COMMENT_4= ruleCOMMENT )
            {
            // InternalAlda.g:135:2: (this_Tempo_0= ruleTempo | this_Quant_1= ruleQuant | this_Volume_2= ruleVolume | this_KeySignature_3= ruleKeySignature | this_COMMENT_4= ruleCOMMENT )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt3=1;
                    }
                    break;
                case 25:
                    {
                    alt3=4;
                    }
                    break;
                case 24:
                    {
                    alt3=3;
                    }
                    break;
                case 13:
                    {
                    alt3=5;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlda.g:136:3: this_Tempo_0= ruleTempo
                    {

                    			newCompositeNode(grammarAccess.getDECLRATIONSAccess().getTempoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tempo_0=ruleTempo();

                    state._fsp--;


                    			current = this_Tempo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlda.g:145:3: this_Quant_1= ruleQuant
                    {

                    			newCompositeNode(grammarAccess.getDECLRATIONSAccess().getQuantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Quant_1=ruleQuant();

                    state._fsp--;


                    			current = this_Quant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlda.g:154:3: this_Volume_2= ruleVolume
                    {

                    			newCompositeNode(grammarAccess.getDECLRATIONSAccess().getVolumeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Volume_2=ruleVolume();

                    state._fsp--;


                    			current = this_Volume_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlda.g:163:3: this_KeySignature_3= ruleKeySignature
                    {

                    			newCompositeNode(grammarAccess.getDECLRATIONSAccess().getKeySignatureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeySignature_3=ruleKeySignature();

                    state._fsp--;


                    			current = this_KeySignature_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlda.g:172:3: this_COMMENT_4= ruleCOMMENT
                    {

                    			newCompositeNode(grammarAccess.getDECLRATIONSAccess().getCOMMENTParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_COMMENT_4=ruleCOMMENT();

                    state._fsp--;


                    			current = this_COMMENT_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECLRATIONS"


    // $ANTLR start "entryRuleCOMMENT"
    // InternalAlda.g:184:1: entryRuleCOMMENT returns [EObject current=null] : iv_ruleCOMMENT= ruleCOMMENT EOF ;
    public final EObject entryRuleCOMMENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMMENT = null;


        try {
            // InternalAlda.g:184:48: (iv_ruleCOMMENT= ruleCOMMENT EOF )
            // InternalAlda.g:185:2: iv_ruleCOMMENT= ruleCOMMENT EOF
            {
             newCompositeNode(grammarAccess.getCOMMENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMMENT=ruleCOMMENT();

            state._fsp--;

             current =iv_ruleCOMMENT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMMENT"


    // $ANTLR start "ruleCOMMENT"
    // InternalAlda.g:191:1: ruleCOMMENT returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'comment' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleCOMMENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlda.g:197:2: ( (otherlv_0= '(' otherlv_1= 'comment' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalAlda.g:198:2: (otherlv_0= '(' otherlv_1= 'comment' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalAlda.g:198:2: (otherlv_0= '(' otherlv_1= 'comment' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalAlda.g:199:3: otherlv_0= '(' otherlv_1= 'comment' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCOMMENTAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCOMMENTAccess().getCommentKeyword_1());
            		
            // InternalAlda.g:207:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAlda.g:208:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAlda.g:208:4: (lv_name_2_0= RULE_STRING )
            // InternalAlda.g:209:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCOMMENTAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCOMMENTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCOMMENTAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMMENT"


    // $ANTLR start "entryRuleINSTRUMENTS"
    // InternalAlda.g:233:1: entryRuleINSTRUMENTS returns [EObject current=null] : iv_ruleINSTRUMENTS= ruleINSTRUMENTS EOF ;
    public final EObject entryRuleINSTRUMENTS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSTRUMENTS = null;


        try {
            // InternalAlda.g:233:52: (iv_ruleINSTRUMENTS= ruleINSTRUMENTS EOF )
            // InternalAlda.g:234:2: iv_ruleINSTRUMENTS= ruleINSTRUMENTS EOF
            {
             newCompositeNode(grammarAccess.getINSTRUMENTSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSTRUMENTS=ruleINSTRUMENTS();

            state._fsp--;

             current =iv_ruleINSTRUMENTS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSTRUMENTS"


    // $ANTLR start "ruleINSTRUMENTS"
    // InternalAlda.g:240:1: ruleINSTRUMENTS returns [EObject current=null] : ( ruleINSTRUMENT (otherlv_1= '/' ruleINSTRUMENT )* otherlv_3= ':' (otherlv_4= '\\n' )* ( (lv_name_5_0= RULE_NOTES ) ) ) ;
    public final EObject ruleINSTRUMENTS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalAlda.g:246:2: ( ( ruleINSTRUMENT (otherlv_1= '/' ruleINSTRUMENT )* otherlv_3= ':' (otherlv_4= '\\n' )* ( (lv_name_5_0= RULE_NOTES ) ) ) )
            // InternalAlda.g:247:2: ( ruleINSTRUMENT (otherlv_1= '/' ruleINSTRUMENT )* otherlv_3= ':' (otherlv_4= '\\n' )* ( (lv_name_5_0= RULE_NOTES ) ) )
            {
            // InternalAlda.g:247:2: ( ruleINSTRUMENT (otherlv_1= '/' ruleINSTRUMENT )* otherlv_3= ':' (otherlv_4= '\\n' )* ( (lv_name_5_0= RULE_NOTES ) ) )
            // InternalAlda.g:248:3: ruleINSTRUMENT (otherlv_1= '/' ruleINSTRUMENT )* otherlv_3= ':' (otherlv_4= '\\n' )* ( (lv_name_5_0= RULE_NOTES ) )
            {

            			newCompositeNode(grammarAccess.getINSTRUMENTSAccess().getINSTRUMENTParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            ruleINSTRUMENT();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalAlda.g:255:3: (otherlv_1= '/' ruleINSTRUMENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlda.g:256:4: otherlv_1= '/' ruleINSTRUMENT
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getINSTRUMENTSAccess().getSolidusKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getINSTRUMENTSAccess().getINSTRUMENTParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleINSTRUMENT();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getINSTRUMENTSAccess().getColonKeyword_2());
            		
            // InternalAlda.g:272:3: (otherlv_4= '\\n' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlda.g:273:4: otherlv_4= '\\n'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getINSTRUMENTSAccess().getLineFeedKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalAlda.g:278:3: ( (lv_name_5_0= RULE_NOTES ) )
            // InternalAlda.g:279:4: (lv_name_5_0= RULE_NOTES )
            {
            // InternalAlda.g:279:4: (lv_name_5_0= RULE_NOTES )
            // InternalAlda.g:280:5: lv_name_5_0= RULE_NOTES
            {
            lv_name_5_0=(Token)match(input,RULE_NOTES,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getINSTRUMENTSAccess().getNameNOTESTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINSTRUMENTSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.editor.alda.Alda.NOTES");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSTRUMENTS"


    // $ANTLR start "entryRuleINSTRUMENT"
    // InternalAlda.g:300:1: entryRuleINSTRUMENT returns [String current=null] : iv_ruleINSTRUMENT= ruleINSTRUMENT EOF ;
    public final String entryRuleINSTRUMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINSTRUMENT = null;


        try {
            // InternalAlda.g:300:50: (iv_ruleINSTRUMENT= ruleINSTRUMENT EOF )
            // InternalAlda.g:301:2: iv_ruleINSTRUMENT= ruleINSTRUMENT EOF
            {
             newCompositeNode(grammarAccess.getINSTRUMENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSTRUMENT=ruleINSTRUMENT();

            state._fsp--;

             current =iv_ruleINSTRUMENT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINSTRUMENT"


    // $ANTLR start "ruleINSTRUMENT"
    // InternalAlda.g:307:1: ruleINSTRUMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'piano' | kw= 'violin' | kw= 'flute' ) ;
    public final AntlrDatatypeRuleToken ruleINSTRUMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlda.g:313:2: ( (kw= 'piano' | kw= 'violin' | kw= 'flute' ) )
            // InternalAlda.g:314:2: (kw= 'piano' | kw= 'violin' | kw= 'flute' )
            {
            // InternalAlda.g:314:2: (kw= 'piano' | kw= 'violin' | kw= 'flute' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAlda.g:315:3: kw= 'piano'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINSTRUMENTAccess().getPianoKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlda.g:321:3: kw= 'violin'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINSTRUMENTAccess().getViolinKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlda.g:327:3: kw= 'flute'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getINSTRUMENTAccess().getFluteKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSTRUMENT"


    // $ANTLR start "entryRuleTempo"
    // InternalAlda.g:336:1: entryRuleTempo returns [EObject current=null] : iv_ruleTempo= ruleTempo EOF ;
    public final EObject entryRuleTempo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempo = null;


        try {
            // InternalAlda.g:336:46: (iv_ruleTempo= ruleTempo EOF )
            // InternalAlda.g:337:2: iv_ruleTempo= ruleTempo EOF
            {
             newCompositeNode(grammarAccess.getTempoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempo=ruleTempo();

            state._fsp--;

             current =iv_ruleTempo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTempo"


    // $ANTLR start "ruleTempo"
    // InternalAlda.g:343:1: ruleTempo returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'tempo' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleTempo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlda.g:349:2: ( (otherlv_0= '(' otherlv_1= 'tempo' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalAlda.g:350:2: (otherlv_0= '(' otherlv_1= 'tempo' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalAlda.g:350:2: (otherlv_0= '(' otherlv_1= 'tempo' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalAlda.g:351:3: otherlv_0= '(' otherlv_1= 'tempo' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTempoAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTempoAccess().getTempoKeyword_1());
            		
            // InternalAlda.g:359:3: (otherlv_2= '!' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlda.g:360:4: otherlv_2= '!'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTempoAccess().getExclamationMarkKeyword_2());
                    			

                    }
                    break;

            }

            // InternalAlda.g:365:3: ( (lv_name_3_0= RULE_INT ) )
            // InternalAlda.g:366:4: (lv_name_3_0= RULE_INT )
            {
            // InternalAlda.g:366:4: (lv_name_3_0= RULE_INT )
            // InternalAlda.g:367:5: lv_name_3_0= RULE_INT
            {
            lv_name_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTempoAccess().getNameINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTempoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTempoAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTempo"


    // $ANTLR start "entryRuleQuant"
    // InternalAlda.g:391:1: entryRuleQuant returns [EObject current=null] : iv_ruleQuant= ruleQuant EOF ;
    public final EObject entryRuleQuant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuant = null;


        try {
            // InternalAlda.g:391:46: (iv_ruleQuant= ruleQuant EOF )
            // InternalAlda.g:392:2: iv_ruleQuant= ruleQuant EOF
            {
             newCompositeNode(grammarAccess.getQuantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuant=ruleQuant();

            state._fsp--;

             current =iv_ruleQuant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuant"


    // $ANTLR start "ruleQuant"
    // InternalAlda.g:398:1: ruleQuant returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'quant' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleQuant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlda.g:404:2: ( (otherlv_0= '(' otherlv_1= 'quant' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalAlda.g:405:2: (otherlv_0= '(' otherlv_1= 'quant' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalAlda.g:405:2: (otherlv_0= '(' otherlv_1= 'quant' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalAlda.g:406:3: otherlv_0= '(' otherlv_1= 'quant' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantAccess().getQuantKeyword_1());
            		
            // InternalAlda.g:414:3: (otherlv_2= '!' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlda.g:415:4: otherlv_2= '!'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuantAccess().getExclamationMarkKeyword_2());
                    			

                    }
                    break;

            }

            // InternalAlda.g:420:3: ( (lv_name_3_0= RULE_INT ) )
            // InternalAlda.g:421:4: (lv_name_3_0= RULE_INT )
            {
            // InternalAlda.g:421:4: (lv_name_3_0= RULE_INT )
            // InternalAlda.g:422:5: lv_name_3_0= RULE_INT
            {
            lv_name_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getQuantAccess().getNameINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getQuantAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuant"


    // $ANTLR start "entryRuleVolume"
    // InternalAlda.g:446:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalAlda.g:446:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalAlda.g:447:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalAlda.g:453:1: ruleVolume returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'volume' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlda.g:459:2: ( (otherlv_0= '(' otherlv_1= 'volume' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalAlda.g:460:2: (otherlv_0= '(' otherlv_1= 'volume' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalAlda.g:460:2: (otherlv_0= '(' otherlv_1= 'volume' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalAlda.g:461:3: otherlv_0= '(' otherlv_1= 'volume' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getVolumeAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVolumeAccess().getVolumeKeyword_1());
            		
            // InternalAlda.g:469:3: (otherlv_2= '!' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlda.g:470:4: otherlv_2= '!'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getExclamationMarkKeyword_2());
                    			

                    }
                    break;

            }

            // InternalAlda.g:475:3: ( (lv_name_3_0= RULE_INT ) )
            // InternalAlda.g:476:4: (lv_name_3_0= RULE_INT )
            {
            // InternalAlda.g:476:4: (lv_name_3_0= RULE_INT )
            // InternalAlda.g:477:5: lv_name_3_0= RULE_INT
            {
            lv_name_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getVolumeAccess().getNameINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVolumeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVolumeAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleKeySignature"
    // InternalAlda.g:501:1: entryRuleKeySignature returns [EObject current=null] : iv_ruleKeySignature= ruleKeySignature EOF ;
    public final EObject entryRuleKeySignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeySignature = null;


        try {
            // InternalAlda.g:501:53: (iv_ruleKeySignature= ruleKeySignature EOF )
            // InternalAlda.g:502:2: iv_ruleKeySignature= ruleKeySignature EOF
            {
             newCompositeNode(grammarAccess.getKeySignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeySignature=ruleKeySignature();

            state._fsp--;

             current =iv_ruleKeySignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeySignature"


    // $ANTLR start "ruleKeySignature"
    // InternalAlda.g:508:1: ruleKeySignature returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'key-signature' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_NOTES ) ) otherlv_4= ')' ) ;
    public final EObject ruleKeySignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAlda.g:514:2: ( (otherlv_0= '(' otherlv_1= 'key-signature' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_NOTES ) ) otherlv_4= ')' ) )
            // InternalAlda.g:515:2: (otherlv_0= '(' otherlv_1= 'key-signature' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_NOTES ) ) otherlv_4= ')' )
            {
            // InternalAlda.g:515:2: (otherlv_0= '(' otherlv_1= 'key-signature' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_NOTES ) ) otherlv_4= ')' )
            // InternalAlda.g:516:3: otherlv_0= '(' otherlv_1= 'key-signature' (otherlv_2= '!' )? ( (lv_name_3_0= RULE_NOTES ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getKeySignatureAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getKeySignatureAccess().getKeySignatureKeyword_1());
            		
            // InternalAlda.g:524:3: (otherlv_2= '!' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlda.g:525:4: otherlv_2= '!'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getKeySignatureAccess().getExclamationMarkKeyword_2());
                    			

                    }
                    break;

            }

            // InternalAlda.g:530:3: ( (lv_name_3_0= RULE_NOTES ) )
            // InternalAlda.g:531:4: (lv_name_3_0= RULE_NOTES )
            {
            // InternalAlda.g:531:4: (lv_name_3_0= RULE_NOTES )
            // InternalAlda.g:532:5: lv_name_3_0= RULE_NOTES
            {
            lv_name_3_0=(Token)match(input,RULE_NOTES,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getKeySignatureAccess().getNameNOTESTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeySignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.editor.alda.Alda.NOTES");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getKeySignatureAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeySignature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001C1002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}