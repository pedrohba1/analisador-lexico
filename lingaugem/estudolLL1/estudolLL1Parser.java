// Generated from .\estudolLL1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class estudolLL1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DIGIT=2, FLOAT=3, DOT=4, ID=5, CHAR=6, AbreChave=7, FechaChave=8, 
		AbreParentese=9, FechaParentese=10, PROGRAMA=11, VARS=12, Doispontos=13, 
		TipoInt=14, TipoReal=15, TipoChar=16, PVirg=17, OPAtrib=18, SE=19, SENAO=20, 
		ENQUANTO=21, FACA=22, VIRG=23, OPAnd=24, OPOr=25, OPMaior=26, OPMenor=27, 
		OPIgual=28, OPMais=29, OPDiv=30, OPMenos=31, OPMult=32, WS=33;
	public static final int
		RULE_inicio = 0, RULE_corpo = 1, RULE_secaoVariaveis = 2, RULE_listDecVariavel = 3, 
		RULE_listDecVariavel1 = 4, RULE_bloco = 5, RULE_listaComandos = 6, RULE_listaComandos1 = 7, 
		RULE_command = 8, RULE_singleCmd = 9, RULE_stmt = 10, RULE_parametroSe = 11, 
		RULE_cexpr = 12, RULE_cexpr1 = 13, RULE_expr = 14, RULE_expr1 = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "listDecVariavel1", 
			"bloco", "listaComandos", "listaComandos1", "command", "singleCmd", "stmt", 
			"parametroSe", "cexpr", "cexpr1", "expr", "expr1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", null, null, "'{'", "'}'", "'('", "')'", 
			"'PROGRAMA'", "'VARS'", "':'", "'INT'", "'REAL'", "'CHAR'", "';'", "':='", 
			"'SE'", "'SENAO'", "'ENQUANTO'", "'FACA'", "','", "'AND'", "'OR'", "'>'", 
			"'<'", "'=='", "'+'", "'/'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DIGIT", "FLOAT", "DOT", "ID", "CHAR", "AbreChave", "FechaChave", 
			"AbreParentese", "FechaParentese", "PROGRAMA", "VARS", "Doispontos", 
			"TipoInt", "TipoReal", "TipoChar", "PVirg", "OPAtrib", "SE", "SENAO", 
			"ENQUANTO", "FACA", "VIRG", "OPAnd", "OPOr", "OPMaior", "OPMenor", "OPIgual", 
			"OPMais", "OPDiv", "OPMenos", "OPMult", "WS"
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
	public String getGrammarFileName() { return "estudolLL1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public estudolLL1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(estudolLL1Parser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(estudolLL1Parser.ID, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitInicio(this);
		}
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
		public TerminalNode AbreChave() { return getToken(estudolLL1Parser.AbreChave, 0); }
		public SecaoVariaveisContext secaoVariaveis() {
			return getRuleContext(SecaoVariaveisContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(estudolLL1Parser.FechaChave, 0); }
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitCorpo(this);
		}
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
		public TerminalNode VARS() { return getToken(estudolLL1Parser.VARS, 0); }
		public TerminalNode Doispontos() { return getToken(estudolLL1Parser.Doispontos, 0); }
		public ListDecVariavelContext listDecVariavel() {
			return getRuleContext(ListDecVariavelContext.class,0);
		}
		public TerminalNode PVirg() { return getToken(estudolLL1Parser.PVirg, 0); }
		public SecaoVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterSecaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitSecaoVariaveis(this);
		}
	}

	public final SecaoVariaveisContext secaoVariaveis() throws RecognitionException {
		SecaoVariaveisContext _localctx = new SecaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_secaoVariaveis);
		try {
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
		public TerminalNode TipoInt() { return getToken(estudolLL1Parser.TipoInt, 0); }
		public TerminalNode ID() { return getToken(estudolLL1Parser.ID, 0); }
		public ListDecVariavel1Context listDecVariavel1() {
			return getRuleContext(ListDecVariavel1Context.class,0);
		}
		public TerminalNode TipoReal() { return getToken(estudolLL1Parser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolLL1Parser.TipoChar, 0); }
		public ListDecVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterListDecVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitListDecVariavel(this);
		}
	}

	public final ListDecVariavelContext listDecVariavel() throws RecognitionException {
		ListDecVariavelContext _localctx = new ListDecVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listDecVariavel);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(TipoInt);
				setState(47);
				match(ID);
				setState(48);
				listDecVariavel1();
				}
				break;
			case TipoReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(TipoReal);
				setState(50);
				match(ID);
				setState(51);
				listDecVariavel1();
				}
				break;
			case TipoChar:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(TipoChar);
				setState(53);
				match(ID);
				setState(54);
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
		public TerminalNode VIRG() { return getToken(estudolLL1Parser.VIRG, 0); }
		public TerminalNode TipoInt() { return getToken(estudolLL1Parser.TipoInt, 0); }
		public TerminalNode ID() { return getToken(estudolLL1Parser.ID, 0); }
		public ListDecVariavel1Context listDecVariavel1() {
			return getRuleContext(ListDecVariavel1Context.class,0);
		}
		public TerminalNode TipoReal() { return getToken(estudolLL1Parser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolLL1Parser.TipoChar, 0); }
		public ListDecVariavel1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterListDecVariavel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitListDecVariavel1(this);
		}
	}

	public final ListDecVariavel1Context listDecVariavel1() throws RecognitionException {
		ListDecVariavel1Context _localctx = new ListDecVariavel1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_listDecVariavel1);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(VIRG);
				setState(58);
				match(TipoInt);
				setState(59);
				match(ID);
				setState(60);
				listDecVariavel1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(VIRG);
				setState(62);
				match(TipoReal);
				setState(63);
				match(ID);
				setState(64);
				listDecVariavel1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(VIRG);
				setState(66);
				match(TipoChar);
				setState(67);
				match(ID);
				setState(68);
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode AbreChave() { return getToken(estudolLL1Parser.AbreChave, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(estudolLL1Parser.FechaChave, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(AbreChave);
			setState(73);
			listaComandos();
			setState(74);
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

	public static class ListaComandosContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ListaComandos1Context listaComandos1() {
			return getRuleContext(ListaComandos1Context.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaComandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			command();
			setState(77);
			listaComandos1();
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

	public static class ListaComandos1Context extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ListaComandos1Context listaComandos1() {
			return getRuleContext(ListaComandos1Context.class,0);
		}
		public ListaComandos1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterListaComandos1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitListaComandos1(this);
		}
	}

	public final ListaComandos1Context listaComandos1() throws RecognitionException {
		ListaComandos1Context _localctx = new ListaComandos1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaComandos1);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				command();
				setState(80);
				listaComandos1();
				}
				break;
			case FechaChave:
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

	public static class CommandContext extends ParserRuleContext {
		public SingleCmdContext singleCmd() {
			return getRuleContext(SingleCmdContext.class,0);
		}
		public TerminalNode PVirg() { return getToken(estudolLL1Parser.PVirg, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				singleCmd();
				setState(86);
				match(PVirg);
				}
				break;
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				stmt();
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

	public static class SingleCmdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(estudolLL1Parser.ID, 0); }
		public TerminalNode OPAtrib() { return getToken(estudolLL1Parser.OPAtrib, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public SingleCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterSingleCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitSingleCmd(this);
		}
	}

	public final SingleCmdContext singleCmd() throws RecognitionException {
		SingleCmdContext _localctx = new SingleCmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(92);
			match(OPAtrib);
			setState(93);
			cexpr();
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
		public TerminalNode SE() { return getToken(estudolLL1Parser.SE, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolLL1Parser.AbreParentese, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolLL1Parser.FechaParentese, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametroSeContext parametroSe() {
			return getRuleContext(ParametroSeContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(estudolLL1Parser.ENQUANTO, 0); }
		public TerminalNode FACA() { return getToken(estudolLL1Parser.FACA, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(SE);
				setState(96);
				match(AbreParentese);
				setState(97);
				cexpr();
				setState(98);
				match(FechaParentese);
				setState(99);
				bloco();
				setState(100);
				parametroSe();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(ENQUANTO);
				setState(103);
				match(AbreParentese);
				setState(104);
				cexpr();
				setState(105);
				match(FechaParentese);
				setState(106);
				bloco();
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(FACA);
				setState(109);
				bloco();
				setState(110);
				match(ENQUANTO);
				setState(111);
				cexpr();
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

	public static class ParametroSeContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(estudolLL1Parser.SENAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametroSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterParametroSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitParametroSe(this);
		}
	}

	public final ParametroSeContext parametroSe() throws RecognitionException {
		ParametroSeContext _localctx = new ParametroSeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametroSe);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SENAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(SENAO);
				setState(116);
				bloco();
				}
				break;
			case ID:
			case FechaChave:
			case SE:
			case ENQUANTO:
			case FACA:
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

	public static class CexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Cexpr1Context cexpr1() {
			return getRuleContext(Cexpr1Context.class,0);
		}
		public TerminalNode OPIgual() { return getToken(estudolLL1Parser.OPIgual, 0); }
		public TerminalNode OPMaior() { return getToken(estudolLL1Parser.OPMaior, 0); }
		public TerminalNode OPMenor() { return getToken(estudolLL1Parser.OPMenor, 0); }
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterCexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitCexpr(this);
		}
	}

	public final CexprContext cexpr() throws RecognitionException {
		CexprContext _localctx = new CexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cexpr);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				expr();
				setState(121);
				cexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				expr();
				setState(124);
				match(OPIgual);
				setState(125);
				expr();
				setState(126);
				cexpr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				expr();
				setState(129);
				match(OPMaior);
				setState(130);
				expr();
				setState(131);
				cexpr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				expr();
				setState(134);
				match(OPMenor);
				setState(135);
				expr();
				setState(136);
				cexpr1();
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

	public static class Cexpr1Context extends ParserRuleContext {
		public TerminalNode OPAnd() { return getToken(estudolLL1Parser.OPAnd, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public Cexpr1Context cexpr1() {
			return getRuleContext(Cexpr1Context.class,0);
		}
		public TerminalNode OPOr() { return getToken(estudolLL1Parser.OPOr, 0); }
		public Cexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterCexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitCexpr1(this);
		}
	}

	public final Cexpr1Context cexpr1() throws RecognitionException {
		Cexpr1Context _localctx = new Cexpr1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_cexpr1);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(OPAnd);
				setState(141);
				cexpr();
				setState(142);
				cexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(OPOr);
				setState(145);
				cexpr();
				setState(146);
				cexpr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode AbreParentese() { return getToken(estudolLL1Parser.AbreParentese, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolLL1Parser.FechaParentese, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode ID() { return getToken(estudolLL1Parser.ID, 0); }
		public TerminalNode INT() { return getToken(estudolLL1Parser.INT, 0); }
		public TerminalNode CHAR() { return getToken(estudolLL1Parser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(estudolLL1Parser.FLOAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreParentese:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(AbreParentese);
				setState(152);
				cexpr();
				setState(153);
				match(FechaParentese);
				setState(154);
				expr1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(ID);
				setState(157);
				expr1();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(INT);
				setState(159);
				expr1();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(CHAR);
				setState(161);
				expr1();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(FLOAT);
				setState(163);
				expr1();
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

	public static class Expr1Context extends ParserRuleContext {
		public TerminalNode OPMais() { return getToken(estudolLL1Parser.OPMais, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode OPMenos() { return getToken(estudolLL1Parser.OPMenos, 0); }
		public TerminalNode OPDiv() { return getToken(estudolLL1Parser.OPDiv, 0); }
		public TerminalNode OPMult() { return getToken(estudolLL1Parser.OPMult, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolLL1Listener ) ((estudolLL1Listener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr1);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(OPMais);
				setState(167);
				expr();
				setState(168);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(OPMenos);
				setState(171);
				expr();
				setState(172);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(OPDiv);
				setState(175);
				expr();
				setState(176);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(OPMult);
				setState(179);
				expr();
				setState(180);
				expr1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tV\n\t\3\n"+
		"\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\ft\n\f\3\r\3\r\3\r\5\r"+
		"y\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0098\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00a7\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ba\n\21"+
		"\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00c2\2\"\3"+
		"\2\2\2\4&\3\2\2\2\6+\3\2\2\2\b9\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16N\3\2"+
		"\2\2\20U\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26s\3\2\2\2\30x\3\2\2\2\32\u008c"+
		"\3\2\2\2\34\u0097\3\2\2\2\36\u00a6\3\2\2\2 \u00b9\3\2\2\2\"#\7\r\2\2#"+
		"$\7\7\2\2$%\5\4\3\2%\3\3\2\2\2&\'\7\t\2\2\'(\5\6\4\2()\5\16\b\2)*\7\n"+
		"\2\2*\5\3\2\2\2+,\7\16\2\2,-\7\17\2\2-.\5\b\5\2./\7\23\2\2/\7\3\2\2\2"+
		"\60\61\7\20\2\2\61\62\7\7\2\2\62:\5\n\6\2\63\64\7\21\2\2\64\65\7\7\2\2"+
		"\65:\5\n\6\2\66\67\7\22\2\2\678\7\7\2\28:\5\n\6\29\60\3\2\2\29\63\3\2"+
		"\2\29\66\3\2\2\2:\t\3\2\2\2;<\7\31\2\2<=\7\20\2\2=>\7\7\2\2>I\5\n\6\2"+
		"?@\7\31\2\2@A\7\21\2\2AB\7\7\2\2BI\5\n\6\2CD\7\31\2\2DE\7\22\2\2EF\7\7"+
		"\2\2FI\5\n\6\2GI\3\2\2\2H;\3\2\2\2H?\3\2\2\2HC\3\2\2\2HG\3\2\2\2I\13\3"+
		"\2\2\2JK\7\t\2\2KL\5\16\b\2LM\7\n\2\2M\r\3\2\2\2NO\5\22\n\2OP\5\20\t\2"+
		"P\17\3\2\2\2QR\5\22\n\2RS\5\20\t\2SV\3\2\2\2TV\3\2\2\2UQ\3\2\2\2UT\3\2"+
		"\2\2V\21\3\2\2\2WX\5\24\13\2XY\7\23\2\2Y\\\3\2\2\2Z\\\5\26\f\2[W\3\2\2"+
		"\2[Z\3\2\2\2\\\23\3\2\2\2]^\7\7\2\2^_\7\24\2\2_`\5\32\16\2`\25\3\2\2\2"+
		"ab\7\25\2\2bc\7\13\2\2cd\5\32\16\2de\7\f\2\2ef\5\f\7\2fg\5\30\r\2gt\3"+
		"\2\2\2hi\7\27\2\2ij\7\13\2\2jk\5\32\16\2kl\7\f\2\2lm\5\f\7\2mt\3\2\2\2"+
		"no\7\30\2\2op\5\f\7\2pq\7\27\2\2qr\5\32\16\2rt\3\2\2\2sa\3\2\2\2sh\3\2"+
		"\2\2sn\3\2\2\2t\27\3\2\2\2uv\7\26\2\2vy\5\f\7\2wy\3\2\2\2xu\3\2\2\2xw"+
		"\3\2\2\2y\31\3\2\2\2z{\5\36\20\2{|\5\34\17\2|\u008d\3\2\2\2}~\5\36\20"+
		"\2~\177\7\36\2\2\177\u0080\5\36\20\2\u0080\u0081\5\34\17\2\u0081\u008d"+
		"\3\2\2\2\u0082\u0083\5\36\20\2\u0083\u0084\7\34\2\2\u0084\u0085\5\36\20"+
		"\2\u0085\u0086\5\34\17\2\u0086\u008d\3\2\2\2\u0087\u0088\5\36\20\2\u0088"+
		"\u0089\7\35\2\2\u0089\u008a\5\36\20\2\u008a\u008b\5\34\17\2\u008b\u008d"+
		"\3\2\2\2\u008cz\3\2\2\2\u008c}\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0087"+
		"\3\2\2\2\u008d\33\3\2\2\2\u008e\u008f\7\32\2\2\u008f\u0090\5\32\16\2\u0090"+
		"\u0091\5\34\17\2\u0091\u0098\3\2\2\2\u0092\u0093\7\33\2\2\u0093\u0094"+
		"\5\32\16\2\u0094\u0095\5\34\17\2\u0095\u0098\3\2\2\2\u0096\u0098\3\2\2"+
		"\2\u0097\u008e\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0096\3\2\2\2\u0098\35"+
		"\3\2\2\2\u0099\u009a\7\13\2\2\u009a\u009b\5\32\16\2\u009b\u009c\7\f\2"+
		"\2\u009c\u009d\5 \21\2\u009d\u00a7\3\2\2\2\u009e\u009f\7\7\2\2\u009f\u00a7"+
		"\5 \21\2\u00a0\u00a1\7\3\2\2\u00a1\u00a7\5 \21\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00a7\5 \21\2\u00a4\u00a5\7\5\2\2\u00a5\u00a7\5 \21\2\u00a6\u0099\3\2"+
		"\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\5\36"+
		"\20\2\u00aa\u00ab\5 \21\2\u00ab\u00ba\3\2\2\2\u00ac\u00ad\7!\2\2\u00ad"+
		"\u00ae\5\36\20\2\u00ae\u00af\5 \21\2\u00af\u00ba\3\2\2\2\u00b0\u00b1\7"+
		" \2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\5 \21\2\u00b3\u00ba\3\2\2\2\u00b4"+
		"\u00b5\7\"\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\5 \21\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00a8\3\2\2\2\u00b9\u00ac\3\2\2\2\u00b9"+
		"\u00b0\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2"+
		"\f9HU[sx\u008c\u0097\u00a6\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}