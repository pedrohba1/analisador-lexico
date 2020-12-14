// Generated from g:\Documentos\analisador-lexico\lingaugem\estudolFinal\estudol.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class estudolParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_corpo = 1, RULE_secaoVariaveis = 2, RULE_listDecVariavel = 3, 
		RULE_listDecVariavel1 = 4, RULE_listaComandos = 5, RULE_stmt = 6, RULE_assign_stmt = 7, 
		RULE_if_then_stmt = 8, RULE_do_while_stmt = 9, RULE_while_stmt = 10, RULE_expr = 11, 
		RULE_term = 12, RULE_fator = 13, RULE_logicalExp = 14, RULE_logicalStmt = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "listDecVariavel1", 
			"listaComandos", "stmt", "assign_stmt", "if_then_stmt", "do_while_stmt", 
			"while_stmt", "expr", "term", "fator", "logicalExp", "logicalStmt"
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

	@Override
	public String getGrammarFileName() { return "estudol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public estudolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(estudolParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(PROGRAMA);
			setState(33);
			match(ID);
			setState(34);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public TerminalNode AbreChave() { return getToken(estudolParser.AbreChave, 0); }
		public SecaoVariaveisContext secaoVariaveis() {
			return getRuleContext(SecaoVariaveisContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(estudolParser.FechaChave, 0); }
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(AbreChave);
			setState(37);
			secaoVariaveis();
			setState(38);
			listaComandos();
			setState(39);
			match(FechaChave);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecaoVariaveisContext extends ParserRuleContext {
		public TerminalNode VARS() { return getToken(estudolParser.VARS, 0); }
		public TerminalNode Doispontos() { return getToken(estudolParser.Doispontos, 0); }
		public ListDecVariavelContext listDecVariavel() {
			return getRuleContext(ListDecVariavelContext.class,0);
		}
		public TerminalNode PVirg() { return getToken(estudolParser.PVirg, 0); }
		public SecaoVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoVariaveis; }
	}

	public final SecaoVariaveisContext secaoVariaveis() throws RecognitionException {
		SecaoVariaveisContext _localctx = new SecaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_secaoVariaveis);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(VARS);
				setState(42);
				match(Doispontos);
				setState(43);
				listDecVariavel();
				setState(44);
				match(PVirg);
				}
				break;
			case SE:
			case ENQUANTO:
			case FACA:
			case ID:
			case FechaChave:
			case PVirg:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDecVariavelContext extends ParserRuleContext {
		public TerminalNode TipoInt() { return getToken(estudolParser.TipoInt, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public ListDecVariavel1Context listDecVariavel1() {
			return getRuleContext(ListDecVariavel1Context.class,0);
		}
		public TerminalNode TipoReal() { return getToken(estudolParser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolParser.TipoChar, 0); }
		public ListDecVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel; }
	}

	public final ListDecVariavelContext listDecVariavel() throws RecognitionException {
		ListDecVariavelContext _localctx = new ListDecVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listDecVariavel);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(TipoInt);
				setState(50);
				match(ID);
				setState(51);
				listDecVariavel1();
				}
				break;
			case TipoReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(TipoReal);
				setState(53);
				match(ID);
				setState(54);
				listDecVariavel1();
				}
				break;
			case TipoChar:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(TipoChar);
				setState(56);
				match(ID);
				setState(57);
				listDecVariavel1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDecVariavel1Context extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(estudolParser.VIRG, 0); }
		public TerminalNode TipoInt() { return getToken(estudolParser.TipoInt, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public ListDecVariavel1Context listDecVariavel1() {
			return getRuleContext(ListDecVariavel1Context.class,0);
		}
		public TerminalNode TipoReal() { return getToken(estudolParser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolParser.TipoChar, 0); }
		public ListDecVariavel1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel1; }
	}

	public final ListDecVariavel1Context listDecVariavel1() throws RecognitionException {
		ListDecVariavel1Context _localctx = new ListDecVariavel1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_listDecVariavel1);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(VIRG);
				setState(61);
				match(TipoInt);
				setState(62);
				match(ID);
				setState(63);
				listDecVariavel1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(VIRG);
				setState(65);
				match(TipoReal);
				setState(66);
				match(ID);
				setState(67);
				listDecVariavel1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(VIRG);
				setState(69);
				match(TipoChar);
				setState(70);
				match(ID);
				setState(71);
				listDecVariavel1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaComandosContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode PVirg() { return getToken(estudolParser.PVirg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaComandos);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				stmt();
				setState(77);
				match(PVirg);
				setState(78);
				listaComandos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_then_stmtContext if_then_stmt() {
			return getRuleContext(If_then_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				assign_stmt();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				if_then_stmt();
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				do_while_stmt();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				while_stmt();
				}
				break;
			case FechaChave:
			case PVirg:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public TerminalNode OPAtrib() { return getToken(estudolParser.OPAtrib, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(OPAtrib);
			setState(91);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_then_stmtContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(estudolParser.SE, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public LogicalExpContext logicalExp() {
			return getRuleContext(LogicalExpContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public TerminalNode ENTAO() { return getToken(estudolParser.ENTAO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public If_then_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_stmt; }
	}

	public final If_then_stmtContext if_then_stmt() throws RecognitionException {
		If_then_stmtContext _localctx = new If_then_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_then_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(SE);
			setState(94);
			match(AbreParentese);
			setState(95);
			logicalExp();
			setState(96);
			match(FechaParentese);
			setState(97);
			match(ENTAO);
			setState(98);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_stmtContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(estudolParser.FACA, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(estudolParser.ENQUANTO, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public LogicalExpContext logicalExp() {
			return getRuleContext(LogicalExpContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FACA);
			setState(101);
			corpo();
			setState(102);
			match(ENQUANTO);
			setState(103);
			match(AbreParentese);
			setState(104);
			logicalExp();
			setState(105);
			match(FechaParentese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(estudolParser.ENQUANTO, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public LogicalExpContext logicalExp() {
			return getRuleContext(LogicalExpContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ENQUANTO);
			setState(108);
			match(AbreParentese);
			setState(109);
			logicalExp();
			setState(110);
			match(FechaParentese);
			setState(111);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode OPMais() { return getToken(estudolParser.OPMais, 0); }
		public TerminalNode OPMenos() { return getToken(estudolParser.OPMenos, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				term();
				setState(114);
				match(OPMais);
				setState(115);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				term();
				setState(118);
				match(OPMenos);
				setState(119);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TerminalNode OPMult() { return getToken(estudolParser.OPMult, 0); }
		public TerminalNode OPDiv() { return getToken(estudolParser.OPDiv, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				fator(0);
				setState(125);
				match(OPMult);
				setState(126);
				fator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				fator(0);
				setState(129);
				match(OPDiv);
				setState(130);
				fator(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				fator(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(estudolParser.INT, 0); }
		public TerminalNode REAL() { return getToken(estudolParser.REAL, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TerminalNode OPMais() { return getToken(estudolParser.OPMais, 0); }
		public TerminalNode OPMenos() { return getToken(estudolParser.OPMenos, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		return fator(0);
	}

	private FatorContext fator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FatorContext _localctx = new FatorContext(_ctx, _parentState);
		FatorContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_fator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(136);
				match(INT);
				}
				break;
			case REAL:
				{
				setState(137);
				match(REAL);
				}
				break;
			case AbreParentese:
				{
				setState(138);
				match(AbreParentese);
				setState(139);
				expr();
				setState(140);
				match(FechaParentese);
				}
				break;
			case ID:
				{
				setState(142);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new FatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fator);
						setState(145);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(146);
						match(OPMais);
						setState(147);
						fator(7);
						}
						break;
					case 2:
						{
						_localctx = new FatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fator);
						setState(148);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(149);
						match(OPMenos);
						setState(150);
						fator(6);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalExpContext extends ParserRuleContext {
		public List<LogicalStmtContext> logicalStmt() {
			return getRuleContexts(LogicalStmtContext.class);
		}
		public LogicalStmtContext logicalStmt(int i) {
			return getRuleContext(LogicalStmtContext.class,i);
		}
		public TerminalNode OPAnd() { return getToken(estudolParser.OPAnd, 0); }
		public TerminalNode OPOr() { return getToken(estudolParser.OPOr, 0); }
		public LogicalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExp; }
	}

	public final LogicalExpContext logicalExp() throws RecognitionException {
		LogicalExpContext _localctx = new LogicalExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalExp);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				logicalStmt();
				setState(157);
				match(OPAnd);
				setState(158);
				logicalStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				logicalStmt();
				setState(161);
				match(OPOr);
				setState(162);
				logicalStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				logicalStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalStmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPMaior() { return getToken(estudolParser.OPMaior, 0); }
		public TerminalNode OPMenor() { return getToken(estudolParser.OPMenor, 0); }
		public TerminalNode OPIgual() { return getToken(estudolParser.OPIgual, 0); }
		public TerminalNode OPMaiorIgual() { return getToken(estudolParser.OPMaiorIgual, 0); }
		public TerminalNode OPDiferente() { return getToken(estudolParser.OPDiferente, 0); }
		public TerminalNode OPMenorIgual() { return getToken(estudolParser.OPMenorIgual, 0); }
		public LogicalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStmt; }
	}

	public final LogicalStmtContext logicalStmt() throws RecognitionException {
		LogicalStmtContext _localctx = new LogicalStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalStmt);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				expr();
				setState(168);
				match(OPMaior);
				setState(169);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				expr();
				setState(172);
				match(OPMenor);
				setState(173);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				expr();
				setState(176);
				match(OPIgual);
				setState(177);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				expr();
				setState(180);
				match(OPMaiorIgual);
				setState(181);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				expr();
				setState(184);
				match(OPDiferente);
				setState(185);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				expr();
				setState(188);
				match(OPMenorIgual);
				setState(189);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return fator_sempred((FatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fator_sempred(FatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0088\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0092\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a8\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c3\n\21\3\21"+
		"\2\3\34\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00d0\2\"\3\2"+
		"\2\2\4&\3\2\2\2\6\61\3\2\2\2\b<\3\2\2\2\nK\3\2\2\2\fR\3\2\2\2\16Y\3\2"+
		"\2\2\20[\3\2\2\2\22_\3\2\2\2\24f\3\2\2\2\26m\3\2\2\2\30|\3\2\2\2\32\u0087"+
		"\3\2\2\2\34\u0091\3\2\2\2\36\u00a7\3\2\2\2 \u00c2\3\2\2\2\"#\7\21\2\2"+
		"#$\7\13\2\2$%\5\4\3\2%\3\3\2\2\2&\'\7\r\2\2\'(\5\6\4\2()\5\f\7\2)*\7\16"+
		"\2\2*\5\3\2\2\2+,\7\22\2\2,-\7\24\2\2-.\5\b\5\2./\7\30\2\2/\62\3\2\2\2"+
		"\60\62\3\2\2\2\61+\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\7\25\2\2\64"+
		"\65\7\13\2\2\65=\5\n\6\2\66\67\7\26\2\2\678\7\13\2\28=\5\n\6\29:\7\27"+
		"\2\2:;\7\13\2\2;=\5\n\6\2<\63\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=\t\3\2\2\2"+
		">?\7\32\2\2?@\7\25\2\2@A\7\13\2\2AL\5\n\6\2BC\7\32\2\2CD\7\26\2\2DE\7"+
		"\13\2\2EL\5\n\6\2FG\7\32\2\2GH\7\27\2\2HI\7\13\2\2IL\5\n\6\2JL\3\2\2\2"+
		"K>\3\2\2\2KB\3\2\2\2KF\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2MS\5\16\b\2NO\5\16"+
		"\b\2OP\7\30\2\2PQ\5\f\7\2QS\3\2\2\2RM\3\2\2\2RN\3\2\2\2S\r\3\2\2\2TZ\5"+
		"\20\t\2UZ\5\22\n\2VZ\5\24\13\2WZ\5\26\f\2XZ\3\2\2\2YT\3\2\2\2YU\3\2\2"+
		"\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\7\13\2\2\\]\7\31\2\2]"+
		"^\5\30\r\2^\21\3\2\2\2_`\7\7\2\2`a\7\17\2\2ab\5\36\20\2bc\7\20\2\2cd\7"+
		"\23\2\2de\5\4\3\2e\23\3\2\2\2fg\7\n\2\2gh\5\4\3\2hi\7\t\2\2ij\7\17\2\2"+
		"jk\5\36\20\2kl\7\20\2\2l\25\3\2\2\2mn\7\t\2\2no\7\17\2\2op\5\36\20\2p"+
		"q\7\20\2\2qr\5\4\3\2r\27\3\2\2\2st\5\32\16\2tu\7#\2\2uv\5\32\16\2v}\3"+
		"\2\2\2wx\5\32\16\2xy\7%\2\2yz\5\32\16\2z}\3\2\2\2{}\5\32\16\2|s\3\2\2"+
		"\2|w\3\2\2\2|{\3\2\2\2}\31\3\2\2\2~\177\5\34\17\2\177\u0080\7&\2\2\u0080"+
		"\u0081\5\34\17\2\u0081\u0088\3\2\2\2\u0082\u0083\5\34\17\2\u0083\u0084"+
		"\7$\2\2\u0084\u0085\5\34\17\2\u0085\u0088\3\2\2\2\u0086\u0088\5\34\17"+
		"\2\u0087~\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088\33\3\2"+
		"\2\2\u0089\u008a\b\17\1\2\u008a\u0092\7\3\2\2\u008b\u0092\7\5\2\2\u008c"+
		"\u008d\7\17\2\2\u008d\u008e\5\30\r\2\u008e\u008f\7\20\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u0092\7\13\2\2\u0091\u0089\3\2\2\2\u0091\u008b\3\2\2\2"+
		"\u0091\u008c\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u009b\3\2\2\2\u0093\u0094"+
		"\f\b\2\2\u0094\u0095\7#\2\2\u0095\u009a\5\34\17\t\u0096\u0097\f\7\2\2"+
		"\u0097\u0098\7%\2\2\u0098\u009a\5\34\17\b\u0099\u0093\3\2\2\2\u0099\u0096"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\35\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\33\2"+
		"\2\u00a0\u00a1\5 \21\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4"+
		"\7\34\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\5 \21\2"+
		"\u00a7\u009e\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\37"+
		"\3\2\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\5\30\r"+
		"\2\u00ac\u00c3\3\2\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\7\36\2\2\u00af"+
		"\u00b0\5\30\r\2\u00b0\u00c3\3\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\7"+
		"\37\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00c3\3\2\2\2\u00b5\u00b6\5\30\r\2"+
		"\u00b6\u00b7\7 \2\2\u00b7\u00b8\5\30\r\2\u00b8\u00c3\3\2\2\2\u00b9\u00ba"+
		"\5\30\r\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00c3\3\2\2\2"+
		"\u00bd\u00be\5\30\r\2\u00be\u00bf\7!\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00a9\3\2\2\2\u00c2\u00ad\3\2\2\2"+
		"\u00c2\u00b1\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bd"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3!\3\2\2\2\16\61<KRY|\u0087\u0091\u0099"+
		"\u009b\u00a7\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}