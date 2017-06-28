package org.xtext.editor.alda.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAldaLexer extends Lexer {
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

    public InternalAldaLexer() {;} 
    public InternalAldaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAldaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAlda.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:11:7: ( '(' )
            // InternalAlda.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:12:7: ( 'comment' )
            // InternalAlda.g:12:9: 'comment'
            {
            match("comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:13:7: ( ')' )
            // InternalAlda.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:14:7: ( '/' )
            // InternalAlda.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:15:7: ( ':' )
            // InternalAlda.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:16:7: ( '\\n' )
            // InternalAlda.g:16:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:17:7: ( 'piano' )
            // InternalAlda.g:17:9: 'piano'
            {
            match("piano"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:18:7: ( 'violin' )
            // InternalAlda.g:18:9: 'violin'
            {
            match("violin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:19:7: ( 'flute' )
            // InternalAlda.g:19:9: 'flute'
            {
            match("flute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:20:7: ( 'tempo' )
            // InternalAlda.g:20:9: 'tempo'
            {
            match("tempo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:21:7: ( '!' )
            // InternalAlda.g:21:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:22:7: ( 'quant' )
            // InternalAlda.g:22:9: 'quant'
            {
            match("quant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:23:7: ( 'volume' )
            // InternalAlda.g:23:9: 'volume'
            {
            match("volume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:24:7: ( 'key-signature' )
            // InternalAlda.g:24:9: 'key-signature'
            {
            match("key-signature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:555:17: ( '#' ( options {greedy=false; } : . )* '\\n' )
            // InternalAlda.g:555:19: '#' ( options {greedy=false; } : . )* '\\n'
            {
            match('#'); 
            // InternalAlda.g:555:23: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlda.g:555:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_NOTES"
    public final void mRULE_NOTES() throws RecognitionException {
        try {
            int _type = RULE_NOTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:557:12: ( ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )? ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' ) ( '-' | '+' )? ( '1' .. '9' )* ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )* ( ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )? ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' ) ( '-' | '+' )? ( '1' .. '9' )* ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )* )* )
            // InternalAlda.g:557:14: ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )? ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' ) ( '-' | '+' )? ( '1' .. '9' )* ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )* ( ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )? ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' ) ( '-' | '+' )? ( '1' .. '9' )* ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )* )*
            {
            // InternalAlda.g:557:14: ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='o'||LA3_0=='r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlda.g:557:15: ( 'o' | 'r' ) ( '1' .. '9' )* ' '
                    {
                    if ( input.LA(1)=='o'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAlda.g:557:25: ( '1' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAlda.g:557:26: '1' .. '9'
                    	    {
                    	    matchRange('1','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(' '); 

                    }
                    break;

            }

            if ( (input.LA(1)>='a' && input.LA(1)<='g') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlda.g:557:73: ( '-' | '+' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlda.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalAlda.g:557:84: ( '1' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAlda.g:557:85: '1' .. '9'
            	    {
            	    matchRange('1','9'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalAlda.g:557:96: ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )*
            loop6:
            do {
                int alt6=11;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalAlda.g:557:97: '~'
            	    {
            	    match('~'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalAlda.g:557:101: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalAlda.g:557:105: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalAlda.g:557:109: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 5 :
            	    // InternalAlda.g:557:113: '|'
            	    {
            	    match('|'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalAlda.g:557:117: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 7 :
            	    // InternalAlda.g:557:121: '<'
            	    {
            	    match('<'); 

            	    }
            	    break;
            	case 8 :
            	    // InternalAlda.g:557:125: '>'
            	    {
            	    match('>'); 

            	    }
            	    break;
            	case 9 :
            	    // InternalAlda.g:557:129: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 10 :
            	    // InternalAlda.g:557:133: '.~' '1' .. '9'
            	    {
            	    match(".~"); 

            	    matchRange('1','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalAlda.g:557:149: ( ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )? ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' ) ( '-' | '+' )? ( '1' .. '9' )* ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )* )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='a' && LA12_0<='g')||LA12_0=='o'||LA12_0=='r') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlda.g:557:150: ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )? ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' ) ( '-' | '+' )? ( '1' .. '9' )* ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )*
            	    {
            	    // InternalAlda.g:557:150: ( ( 'o' | 'r' ) ( '1' .. '9' )* ' ' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='o'||LA8_0=='r') ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAlda.g:557:151: ( 'o' | 'r' ) ( '1' .. '9' )* ' '
            	            {
            	            if ( input.LA(1)=='o'||input.LA(1)=='r' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}

            	            // InternalAlda.g:557:161: ( '1' .. '9' )*
            	            loop7:
            	            do {
            	                int alt7=2;
            	                int LA7_0 = input.LA(1);

            	                if ( ((LA7_0>='1' && LA7_0<='9')) ) {
            	                    alt7=1;
            	                }


            	                switch (alt7) {
            	            	case 1 :
            	            	    // InternalAlda.g:557:162: '1' .. '9'
            	            	    {
            	            	    matchRange('1','9'); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop7;
            	                }
            	            } while (true);

            	            match(' '); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='a' && input.LA(1)<='g') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	    // InternalAlda.g:557:209: ( '-' | '+' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0=='+'||LA9_0=='-') ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalAlda.g:
            	            {
            	            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;

            	    }

            	    // InternalAlda.g:557:220: ( '1' .. '9' )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0>='1' && LA10_0<='9')) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalAlda.g:557:221: '1' .. '9'
            	    	    {
            	    	    matchRange('1','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    // InternalAlda.g:557:232: ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )*
            	    loop11:
            	    do {
            	        int alt11=11;
            	        alt11 = dfa11.predict(input);
            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalAlda.g:557:233: '~'
            	    	    {
            	    	    match('~'); 

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalAlda.g:557:237: '/'
            	    	    {
            	    	    match('/'); 

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalAlda.g:557:241: '.'
            	    	    {
            	    	    match('.'); 

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalAlda.g:557:245: ' '
            	    	    {
            	    	    match(' '); 

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalAlda.g:557:249: '|'
            	    	    {
            	    	    match('|'); 

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // InternalAlda.g:557:253: '*'
            	    	    {
            	    	    match('*'); 

            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // InternalAlda.g:557:257: '<'
            	    	    {
            	    	    match('<'); 

            	    	    }
            	    	    break;
            	    	case 8 :
            	    	    // InternalAlda.g:557:261: '>'
            	    	    {
            	    	    match('>'); 

            	    	    }
            	    	    break;
            	    	case 9 :
            	    	    // InternalAlda.g:557:265: '-'
            	    	    {
            	    	    match('-'); 

            	    	    }
            	    	    break;
            	    	case 10 :
            	    	    // InternalAlda.g:557:269: '.~' '1' .. '9'
            	    	    {
            	    	    match(".~"); 

            	    	    matchRange('1','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTES"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:559:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAlda.g:559:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAlda.g:559:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlda.g:559:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlda.g:559:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAlda.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:561:10: ( ( '0' .. '9' )+ )
            // InternalAlda.g:561:12: ( '0' .. '9' )+
            {
            // InternalAlda.g:561:12: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAlda.g:561:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:563:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAlda.g:563:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAlda.g:563:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlda.g:563:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAlda.g:563:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAlda.g:563:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlda.g:563:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAlda.g:563:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAlda.g:563:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAlda.g:563:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlda.g:563:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:565:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAlda.g:565:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAlda.g:565:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlda.g:565:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalAlda.g:565:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlda.g:565:41: ( '\\r' )? '\\n'
                    {
                    // InternalAlda.g:565:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAlda.g:565:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:567:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAlda.g:567:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAlda.g:567:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlda.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlda.g:569:16: ( . )
            // InternalAlda.g:569:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAlda.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ML_COMMENT | RULE_NOTES | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=22;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalAlda.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalAlda.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalAlda.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalAlda.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalAlda.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalAlda.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalAlda.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalAlda.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalAlda.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalAlda.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalAlda.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalAlda.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalAlda.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalAlda.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalAlda.g:1:94: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalAlda.g:1:110: RULE_NOTES
                {
                mRULE_NOTES(); 

                }
                break;
            case 17 :
                // InternalAlda.g:1:121: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalAlda.g:1:129: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalAlda.g:1:138: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalAlda.g:1:150: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalAlda.g:1:166: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalAlda.g:1:174: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA6_eotS =
        "\1\1\3\uffff\1\14\6\uffff\1\14\2\uffff";
    static final String DFA6_eofS =
        "\16\uffff";
    static final String DFA6_minS =
        "\1\40\3\uffff\1\176\6\uffff\1\61\2\uffff";
    static final String DFA6_maxS =
        "\1\176\3\uffff\1\176\6\uffff\1\71\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\3\1\12";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\5\11\uffff\1\7\2\uffff\1\12\1\4\1\3\14\uffff\1\10\1\uffff\1\11\75\uffff\1\6\1\uffff\1\2",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\15",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 557:96: ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )*";
        }
    }
    static final String DFA11_eotS =
        "\1\1\3\uffff\1\14\6\uffff\1\14\2\uffff";
    static final String DFA11_eofS =
        "\16\uffff";
    static final String DFA11_minS =
        "\1\40\3\uffff\1\176\6\uffff\1\61\2\uffff";
    static final String DFA11_maxS =
        "\1\176\3\uffff\1\176\6\uffff\1\71\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\3\1\12";
    static final String DFA11_specialS =
        "\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\11\uffff\1\7\2\uffff\1\12\1\4\1\3\14\uffff\1\10\1\uffff\1\11\75\uffff\1\6\1\uffff\1\2",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\11\15",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 557:232: ( '~' | '/' | '.' | ' ' | '|' | '*' | '<' | '>' | '-' | '.~' '1' .. '9' )*";
        }
    }
    static final String DFA23_eotS =
        "\2\uffff\1\32\1\uffff\1\41\1\uffff\1\43\2\36\1\32\1\36\1\uffff\2\36\1\27\1\36\1\32\1\27\2\uffff\2\27\3\uffff\1\36\1\uffff\1\32\1\36\1\32\7\uffff\5\36\1\uffff\2\36\1\uffff\1\36\2\uffff\2\36\1\32\16\36\1\uffff\1\36\1\113\2\36\1\116\1\117\1\120\1\36\1\uffff\1\122\1\123\3\uffff\1\124\3\uffff";
    static final String DFA23_eofS =
        "\125\uffff";
    static final String DFA23_minS =
        "\1\0\1\uffff\1\60\1\uffff\1\57\1\uffff\1\11\2\151\1\60\1\145\1\uffff\1\165\1\145\1\0\1\40\1\60\1\101\2\uffff\2\0\3\uffff\1\40\1\uffff\1\60\1\40\1\60\7\uffff\1\141\1\157\1\154\1\165\1\155\1\uffff\1\141\1\171\1\uffff\1\40\2\uffff\1\155\1\40\1\60\1\156\1\154\1\165\1\164\1\160\1\156\1\55\1\145\1\157\1\151\1\155\1\145\1\157\1\164\1\uffff\1\156\1\60\1\156\1\145\3\60\1\164\1\uffff\2\60\3\uffff\1\60\3\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\uffff\1\172\1\uffff\1\57\1\uffff\1\40\1\151\1\157\1\172\1\145\1\uffff\1\165\1\145\1\uffff\1\71\2\172\2\uffff\2\uffff\3\uffff\1\155\1\uffff\1\172\1\71\1\172\7\uffff\1\141\1\157\1\154\1\165\1\155\1\uffff\1\141\1\171\1\uffff\1\71\2\uffff\1\155\1\71\1\172\1\156\1\154\1\165\1\164\1\160\1\156\1\55\1\145\1\157\1\151\1\155\1\145\1\157\1\164\1\uffff\1\156\1\172\1\156\1\145\3\172\1\164\1\uffff\2\172\3\uffff\1\172\3\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\5\5\uffff\1\13\6\uffff\1\21\1\22\2\uffff\1\25\1\26\1\1\1\uffff\1\20\3\uffff\1\21\1\3\1\24\1\4\1\5\1\6\1\25\5\uffff\1\13\2\uffff\1\17\1\uffff\1\22\1\23\21\uffff\1\16\10\uffff\1\7\2\uffff\1\11\1\12\1\14\1\uffff\1\10\1\15\1\2";
    static final String DFA23_specialS =
        "\1\3\15\uffff\1\0\5\uffff\1\1\1\2\77\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\27\1\26\1\6\2\27\1\26\22\27\1\26\1\13\1\24\1\16\3\27\1\25\1\1\1\3\5\27\1\4\12\23\1\5\6\27\32\22\3\27\1\21\1\22\1\27\2\20\1\2\2\20\1\11\1\20\3\22\1\15\3\22\1\17\1\7\1\14\1\17\1\22\1\12\1\22\1\10\4\22\uff85\27",
            "",
            "\1\36\11\33\7\uffff\32\36\4\uffff\1\36\1\uffff\7\35\7\36\1\31\2\36\1\34\10\36",
            "",
            "\1\40",
            "",
            "\2\44\2\uffff\1\44\22\uffff\1\44",
            "\1\45",
            "\1\46\5\uffff\1\47",
            "\1\36\11\33\7\uffff\32\36\4\uffff\1\36\1\uffff\7\35\4\36\1\50\2\36\1\34\2\36\1\34\10\36",
            "\1\51",
            "",
            "\1\53",
            "\1\54",
            "\0\55",
            "\1\32\20\uffff\11\56",
            "\1\36\11\33\7\uffff\32\36\4\uffff\1\36\1\uffff\7\35\7\36\1\34\2\36\1\34\10\36",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\60",
            "\0\60",
            "",
            "",
            "",
            "\1\32\20\uffff\11\62\63\uffff\1\61",
            "",
            "\1\36\11\33\7\uffff\32\36\4\uffff\1\36\1\uffff\7\35\7\36\1\34\2\36\1\34\10\36",
            "\1\32\20\uffff\11\62",
            "\1\36\11\63\7\uffff\32\36\4\uffff\1\36\1\uffff\7\35\7\36\1\34\2\36\1\34\10\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "",
            "\1\32\20\uffff\11\56",
            "",
            "",
            "\1\73",
            "\1\32\20\uffff\11\62",
            "\1\36\11\63\7\uffff\32\36\4\uffff\1\36\1\uffff\7\35\7\36\1\34\2\36\1\34\10\36",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\114",
            "\1\115",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\121",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ML_COMMENT | RULE_NOTES | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_14 = input.LA(1);

                        s = -1;
                        if ( ((LA23_14>='\u0000' && LA23_14<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_20 = input.LA(1);

                        s = -1;
                        if ( ((LA23_20>='\u0000' && LA23_20<='\uFFFF')) ) {s = 48;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_21 = input.LA(1);

                        s = -1;
                        if ( ((LA23_21>='\u0000' && LA23_21<='\uFFFF')) ) {s = 48;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='(') ) {s = 1;}

                        else if ( (LA23_0=='c') ) {s = 2;}

                        else if ( (LA23_0==')') ) {s = 3;}

                        else if ( (LA23_0=='/') ) {s = 4;}

                        else if ( (LA23_0==':') ) {s = 5;}

                        else if ( (LA23_0=='\n') ) {s = 6;}

                        else if ( (LA23_0=='p') ) {s = 7;}

                        else if ( (LA23_0=='v') ) {s = 8;}

                        else if ( (LA23_0=='f') ) {s = 9;}

                        else if ( (LA23_0=='t') ) {s = 10;}

                        else if ( (LA23_0=='!') ) {s = 11;}

                        else if ( (LA23_0=='q') ) {s = 12;}

                        else if ( (LA23_0=='k') ) {s = 13;}

                        else if ( (LA23_0=='#') ) {s = 14;}

                        else if ( (LA23_0=='o'||LA23_0=='r') ) {s = 15;}

                        else if ( ((LA23_0>='a' && LA23_0<='b')||(LA23_0>='d' && LA23_0<='e')||LA23_0=='g') ) {s = 16;}

                        else if ( (LA23_0=='^') ) {s = 17;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='h' && LA23_0<='j')||(LA23_0>='l' && LA23_0<='n')||LA23_0=='s'||LA23_0=='u'||(LA23_0>='w' && LA23_0<='z')) ) {s = 18;}

                        else if ( ((LA23_0>='0' && LA23_0<='9')) ) {s = 19;}

                        else if ( (LA23_0=='\"') ) {s = 20;}

                        else if ( (LA23_0=='\'') ) {s = 21;}

                        else if ( (LA23_0=='\t'||LA23_0=='\r'||LA23_0==' ') ) {s = 22;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||(LA23_0>='$' && LA23_0<='&')||(LA23_0>='*' && LA23_0<='.')||(LA23_0>=';' && LA23_0<='@')||(LA23_0>='[' && LA23_0<=']')||LA23_0=='`'||(LA23_0>='{' && LA23_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}