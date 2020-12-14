// Generated from g:\Documentos\analisador-lexico\lingaugem\estudolFinal\estudol.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class estudolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DIGIT=2, REAL=3, DOT=4, SE=5, SENAO=6, ENQUANTO=7, FACA=8, ID=9, 
		CHAR=10, AbreChave=11, FechaChave=12, AbreParentese=13, FechaParentese=14, 
		PROGRAMA=15, VARS=16, ENTAO=17, Doispontos=18, TipoInt=19, TipoReal=20, 
		TipoChar=21, PVirg=22, OPAtrib=23, VIRG=24, OPAnd=25, OPOr=26, OPMaior=27, 
		OPMenor=28, OPIgual=29, OPMaiorIgual=30, OPMenorIgual=31, OPDiferente=32, 
		OPMais=33, OPDiv=34, OPMenos=35, OPMult=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "DIGIT", "REAL", "DOT", "SE", "SENAO", "ENQUANTO", "FACA", "ID", 
			"CHAR", "AbreChave", "FechaChave", "AbreParentese", "FechaParentese", 
			"PROGRAMA", "VARS", "ENTAO", "Doispontos", "TipoInt", "TipoReal", "TipoChar", 
			"PVirg", "OPAtrib", "VIRG", "OPAnd", "OPOr", "OPMaior", "OPMenor", "OPIgual", 
			"OPMaiorIgual", "OPMenorIgual", "OPDiferente", "OPMais", "OPDiv", "OPMenos", 
			"OPMult", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", "'SE'", "'SENAO'", "'ENQUANTO'", "'FACA'", 
			null, null, "'{'", "'}'", "'('", "')'", "'PROGRAMA'", "'VARS'", "'ENTAO'", 
			"':'", "'INT'", "'REAL'", "'CHAR'", "';'", "':='", "','", "'AND'", "'OR'", 
			"'>'", "'<'", "'=='", "'>='", "'<='", "'<>'", "'+'", "'/'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DIGIT", "REAL", "DOT", "SE", "SENAO", "ENQUANTO", "FACA", 
			"ID", "CHAR", "AbreChave", "FechaChave", "AbreParentese", "FechaParentese", 
			"PROGRAMA", "VARS", "ENTAO", "Doispontos", "TipoInt", "TipoReal", "TipoChar", 
			"PVirg", "OPAtrib", "VIRG", "OPAnd", "OPOr", "OPMaior", "OPMenor", "OPIgual", 
			"OPMaiorIgual", "OPMenorIgual", "OPDiferente", "OPMais", "OPDiv", "OPMenos", 
			"OPMult", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public estudolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "estudol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2O\n\2\r\2\16\2P\3\3\3\3\3\4"+
		"\6\4V\n\4\r\4\16\4W\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\5\13\u008c\n\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u00e3\n&\r&\16&\u00e4\3&\3&\2\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'\3\2\13\3\2\62;\3\2c|\4\2\62;c|\5\2\62;C\\c|\4\2\62;"+
		"ch\3\2\63;\3\2\62\64\3\2\629\5\2\13\f\17\17\"\"\2\u00ef\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\3N\3\2\2\2\5R\3\2\2\2\7U\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\re\3"+
		"\2\2\2\17k\3\2\2\2\21t\3\2\2\2\23y\3\2\2\2\25\u0080\3\2\2\2\27\u008f\3"+
		"\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u0097\3\2"+
		"\2\2!\u00a0\3\2\2\2#\u00a5\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b6\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00c0\3\2\2\2"+
		"\63\u00c2\3\2\2\2\65\u00c6\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d3\3\2\2\2A\u00d6\3\2\2\2C\u00d9\3\2\2\2E"+
		"\u00db\3\2\2\2G\u00dd\3\2\2\2I\u00df\3\2\2\2K\u00e2\3\2\2\2MO\t\2\2\2"+
		"NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\4\3\2\2\2RS\t\2\2\2S\6\3\2\2"+
		"\2TV\5\5\3\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y]\5\t\5"+
		"\2Z\\\5\5\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\b\3\2\2\2_]\3"+
		"\2\2\2`a\7\60\2\2a\n\3\2\2\2bc\7U\2\2cd\7G\2\2d\f\3\2\2\2ef\7U\2\2fg\7"+
		"G\2\2gh\7P\2\2hi\7C\2\2ij\7Q\2\2j\16\3\2\2\2kl\7G\2\2lm\7P\2\2mn\7S\2"+
		"\2no\7W\2\2op\7C\2\2pq\7P\2\2qr\7V\2\2rs\7Q\2\2s\20\3\2\2\2tu\7H\2\2u"+
		"v\7C\2\2vw\7E\2\2wx\7C\2\2x\22\3\2\2\2y}\t\3\2\2z|\t\4\2\2{z\3\2\2\2|"+
		"\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\24\3\2\2\2\177}\3\2\2\2\u0080\u008b"+
		"\7)\2\2\u0081\u008c\t\5\2\2\u0082\u0089\7^\2\2\u0083\u008a\t\6\2\2\u0084"+
		"\u0085\t\7\2\2\u0085\u008a\t\2\2\2\u0086\u0087\7\63\2\2\u0087\u0088\t"+
		"\b\2\2\u0088\u008a\t\t\2\2\u0089\u0083\3\2\2\2\u0089\u0084\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0082\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7)\2\2\u008e\26\3\2\2\2\u008f\u0090"+
		"\7}\2\2\u0090\30\3\2\2\2\u0091\u0092\7\177\2\2\u0092\32\3\2\2\2\u0093"+
		"\u0094\7*\2\2\u0094\34\3\2\2\2\u0095\u0096\7+\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0098\7R\2\2\u0098\u0099\7T\2\2\u0099\u009a\7Q\2\2\u009a\u009b\7I\2\2"+
		"\u009b\u009c\7T\2\2\u009c\u009d\7C\2\2\u009d\u009e\7O\2\2\u009e\u009f"+
		"\7C\2\2\u009f \3\2\2\2\u00a0\u00a1\7X\2\2\u00a1\u00a2\7C\2\2\u00a2\u00a3"+
		"\7T\2\2\u00a3\u00a4\7U\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7"+
		"\7P\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7Q\2\2\u00aa"+
		"$\3\2\2\2\u00ab\u00ac\7<\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af"+
		"\7P\2\2\u00af\u00b0\7V\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7T\2\2\u00b2\u00b3"+
		"\7G\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7N\2\2\u00b5*\3\2\2\2\u00b6\u00b7"+
		"\7E\2\2\u00b7\u00b8\7J\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba\7T\2\2\u00ba"+
		",\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc.\3\2\2\2\u00bd\u00be\7<\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1\62\3\2\2\2\u00c2\u00c3"+
		"\7C\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7F\2\2\u00c5\64\3\2\2\2\u00c6\u00c7"+
		"\7Q\2\2\u00c7\u00c8\7T\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca8"+
		"\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2\7?\2\2\u00d2>\3"+
		"\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7?\2\2\u00d5@\3\2\2\2\u00d6\u00d7"+
		"\7>\2\2\u00d7\u00d8\7@\2\2\u00d8B\3\2\2\2\u00d9\u00da\7-\2\2\u00daD\3"+
		"\2\2\2\u00db\u00dc\7\61\2\2\u00dcF\3\2\2\2\u00dd\u00de\7/\2\2\u00deH\3"+
		"\2\2\2\u00df\u00e0\7,\2\2\u00e0J\3\2\2\2\u00e1\u00e3\t\n\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b&\2\2\u00e7L\3\2\2\2\n\2PW]}\u0089\u008b\u00e4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}