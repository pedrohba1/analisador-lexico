// Generated from /home/pedro/Documents/compilador-front-end/lingaugem/estudolLL1/estudolLL1.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_listDecVariavel1 = 4, RULE_listaComandos = 5, RULE_listaComandos1 = 6, 
		RULE_command = 7, RULE_singleCmd = 8, RULE_stmt = 9, RULE_bloco = 10, 
		RULE_parametroSe = 11, RULE_cexpr = 12, RULE_cexpr0 = 13, RULE_cexpr1 = 14, 
		RULE_expr = 15, RULE_expr1 = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "listDecVariavel1", 
			"listaComandos", "listaComandos1", "command", "singleCmd", "stmt", "bloco", 
			"parametroSe", "cexpr", "cexpr0", "cexpr1", "expr", "expr1"
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
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PROGRAMA);
			setState(35);
			match(ID);
			setState(36);
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
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(AbreChave);
			setState(39);
			secaoVariaveis();
			setState(40);
			listaComandos();
			setState(41);
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
	}

	public final SecaoVariaveisContext secaoVariaveis() throws RecognitionException {
		SecaoVariaveisContext _localctx = new SecaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_secaoVariaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(VARS);
			setState(44);
			match(Doispontos);
			setState(45);
			listDecVariavel();
			setState(46);
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
	}

	public final ListDecVariavelContext listDecVariavel() throws RecognitionException {
		ListDecVariavelContext _localctx = new ListDecVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listDecVariavel);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(TipoInt);
				setState(49);
				match(ID);
				setState(50);
				listDecVariavel1();
				}
				break;
			case TipoReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(TipoReal);
				setState(52);
				match(ID);
				setState(53);
				listDecVariavel1();
				}
				break;
			case TipoChar:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(TipoChar);
				setState(55);
				match(ID);
				setState(56);
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
	}

	public final ListDecVariavel1Context listDecVariavel1() throws RecognitionException {
		ListDecVariavel1Context _localctx = new ListDecVariavel1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_listDecVariavel1);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(VIRG);
				setState(60);
				match(TipoInt);
				setState(61);
				match(ID);
				setState(62);
				listDecVariavel1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(VIRG);
				setState(64);
				match(TipoReal);
				setState(65);
				match(ID);
				setState(66);
				listDecVariavel1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(VIRG);
				setState(68);
				match(TipoChar);
				setState(69);
				match(ID);
				setState(70);
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
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaComandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			command();
			setState(75);
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
	}

	public final ListaComandos1Context listaComandos1() throws RecognitionException {
		ListaComandos1Context _localctx = new ListaComandos1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaComandos1);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				command();
				setState(78);
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
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				singleCmd();
				setState(84);
				match(PVirg);
				}
				break;
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
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
	}

	public final SingleCmdContext singleCmd() throws RecognitionException {
		SingleCmdContext _localctx = new SingleCmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(OPAtrib);
			setState(91);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(SE);
				setState(94);
				match(AbreParentese);
				setState(95);
				cexpr();
				setState(96);
				match(FechaParentese);
				setState(97);
				bloco();
				setState(98);
				parametroSe();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ENQUANTO);
				setState(101);
				match(AbreParentese);
				setState(102);
				cexpr();
				setState(103);
				match(FechaParentese);
				setState(104);
				bloco();
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(FACA);
				setState(107);
				bloco();
				setState(108);
				match(ENQUANTO);
				setState(109);
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(AbreChave);
			setState(114);
			listaComandos();
			setState(115);
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

	public static class ParametroSeContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(estudolLL1Parser.SENAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametroSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroSe; }
	}

	public final ParametroSeContext parametroSe() throws RecognitionException {
		ParametroSeContext _localctx = new ParametroSeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametroSe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SENAO);
			setState(118);
			bloco();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cexpr0Context cexpr0() {
			return getRuleContext(Cexpr0Context.class,0);
		}
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
	}

	public final CexprContext cexpr() throws RecognitionException {
		CexprContext _localctx = new CexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			expr();
			setState(121);
			cexpr0();
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

	public static class Cexpr0Context extends ParserRuleContext {
		public Cexpr1Context cexpr1() {
			return getRuleContext(Cexpr1Context.class,0);
		}
		public TerminalNode OPIgual() { return getToken(estudolLL1Parser.OPIgual, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPMaior() { return getToken(estudolLL1Parser.OPMaior, 0); }
		public TerminalNode OPMenor() { return getToken(estudolLL1Parser.OPMenor, 0); }
		public Cexpr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr0; }
	}

	public final Cexpr0Context cexpr0() throws RecognitionException {
		Cexpr0Context _localctx = new Cexpr0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_cexpr0);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case FechaChave:
			case FechaParentese:
			case PVirg:
			case SE:
			case ENQUANTO:
			case FACA:
			case OPAnd:
			case OPOr:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				cexpr1();
				}
				break;
			case OPIgual:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(OPIgual);
				setState(125);
				expr();
				setState(126);
				cexpr1();
				}
				break;
			case OPMaior:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(OPMaior);
				setState(129);
				expr();
				setState(130);
				cexpr1();
				}
				break;
			case OPMenor:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(OPMenor);
				setState(133);
				expr();
				setState(134);
				cexpr1();
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

	public static class Cexpr1Context extends ParserRuleContext {
		public TerminalNode OPAnd() { return getToken(estudolLL1Parser.OPAnd, 0); }
		public Cexpr0Context cexpr0() {
			return getRuleContext(Cexpr0Context.class,0);
		}
		public Cexpr1Context cexpr1() {
			return getRuleContext(Cexpr1Context.class,0);
		}
		public TerminalNode OPOr() { return getToken(estudolLL1Parser.OPOr, 0); }
		public Cexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr1; }
	}

	public final Cexpr1Context cexpr1() throws RecognitionException {
		Cexpr1Context _localctx = new Cexpr1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_cexpr1);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(OPAnd);
				setState(139);
				cexpr0();
				setState(140);
				cexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(OPOr);
				setState(143);
				cexpr0();
				setState(144);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreParentese:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(AbreParentese);
				setState(150);
				cexpr();
				setState(151);
				match(FechaParentese);
				setState(152);
				expr1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(ID);
				setState(155);
				expr1();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(INT);
				setState(157);
				expr1();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(CHAR);
				setState(159);
				expr1();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(FLOAT);
				setState(161);
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
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr1);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(OPMais);
				setState(165);
				expr();
				setState(166);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(OPMenos);
				setState(169);
				expr();
				setState(170);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(OPDiv);
				setState(173);
				expr();
				setState(174);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(OPMult);
				setState(177);
				expr();
				setState(178);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bT\n\b\3\t\3\t\3"+
		"\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a5\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b8"+
		"\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00be"+
		"\2$\3\2\2\2\4(\3\2\2\2\6-\3\2\2\2\b;\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16"+
		"S\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30w\3\2\2\2"+
		"\32z\3\2\2\2\34\u008a\3\2\2\2\36\u0095\3\2\2\2 \u00a4\3\2\2\2\"\u00b7"+
		"\3\2\2\2$%\7\r\2\2%&\7\7\2\2&\'\5\4\3\2\'\3\3\2\2\2()\7\t\2\2)*\5\6\4"+
		"\2*+\5\f\7\2+,\7\n\2\2,\5\3\2\2\2-.\7\16\2\2./\7\17\2\2/\60\5\b\5\2\60"+
		"\61\7\23\2\2\61\7\3\2\2\2\62\63\7\20\2\2\63\64\7\7\2\2\64<\5\n\6\2\65"+
		"\66\7\21\2\2\66\67\7\7\2\2\67<\5\n\6\289\7\22\2\29:\7\7\2\2:<\5\n\6\2"+
		";\62\3\2\2\2;\65\3\2\2\2;8\3\2\2\2<\t\3\2\2\2=>\7\31\2\2>?\7\20\2\2?@"+
		"\7\7\2\2@K\5\n\6\2AB\7\31\2\2BC\7\21\2\2CD\7\7\2\2DK\5\n\6\2EF\7\31\2"+
		"\2FG\7\22\2\2GH\7\7\2\2HK\5\n\6\2IK\3\2\2\2J=\3\2\2\2JA\3\2\2\2JE\3\2"+
		"\2\2JI\3\2\2\2K\13\3\2\2\2LM\5\20\t\2MN\5\16\b\2N\r\3\2\2\2OP\5\20\t\2"+
		"PQ\5\16\b\2QT\3\2\2\2RT\3\2\2\2SO\3\2\2\2SR\3\2\2\2T\17\3\2\2\2UV\5\22"+
		"\n\2VW\7\23\2\2WZ\3\2\2\2XZ\5\24\13\2YU\3\2\2\2YX\3\2\2\2Z\21\3\2\2\2"+
		"[\\\7\7\2\2\\]\7\24\2\2]^\5\32\16\2^\23\3\2\2\2_`\7\25\2\2`a\7\13\2\2"+
		"ab\5\32\16\2bc\7\f\2\2cd\5\26\f\2de\5\30\r\2er\3\2\2\2fg\7\27\2\2gh\7"+
		"\13\2\2hi\5\32\16\2ij\7\f\2\2jk\5\26\f\2kr\3\2\2\2lm\7\30\2\2mn\5\26\f"+
		"\2no\7\27\2\2op\5\32\16\2pr\3\2\2\2q_\3\2\2\2qf\3\2\2\2ql\3\2\2\2r\25"+
		"\3\2\2\2st\7\t\2\2tu\5\f\7\2uv\7\n\2\2v\27\3\2\2\2wx\7\26\2\2xy\5\26\f"+
		"\2y\31\3\2\2\2z{\5 \21\2{|\5\34\17\2|\33\3\2\2\2}\u008b\5\36\20\2~\177"+
		"\7\36\2\2\177\u0080\5 \21\2\u0080\u0081\5\36\20\2\u0081\u008b\3\2\2\2"+
		"\u0082\u0083\7\34\2\2\u0083\u0084\5 \21\2\u0084\u0085\5\36\20\2\u0085"+
		"\u008b\3\2\2\2\u0086\u0087\7\35\2\2\u0087\u0088\5 \21\2\u0088\u0089\5"+
		"\36\20\2\u0089\u008b\3\2\2\2\u008a}\3\2\2\2\u008a~\3\2\2\2\u008a\u0082"+
		"\3\2\2\2\u008a\u0086\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d\7\32\2\2\u008d"+
		"\u008e\5\34\17\2\u008e\u008f\5\36\20\2\u008f\u0096\3\2\2\2\u0090\u0091"+
		"\7\33\2\2\u0091\u0092\5\34\17\2\u0092\u0093\5\36\20\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\37\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\5\32"+
		"\16\2\u0099\u009a\7\f\2\2\u009a\u009b\5\"\22\2\u009b\u00a5\3\2\2\2\u009c"+
		"\u009d\7\7\2\2\u009d\u00a5\5\"\22\2\u009e\u009f\7\3\2\2\u009f\u00a5\5"+
		"\"\22\2\u00a0\u00a1\7\b\2\2\u00a1\u00a5\5\"\22\2\u00a2\u00a3\7\5\2\2\u00a3"+
		"\u00a5\5\"\22\2\u00a4\u0097\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u009e\3"+
		"\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5!\3\2\2\2\u00a6\u00a7"+
		"\7\37\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\5\"\22\2\u00a9\u00b8\3\2\2\2"+
		"\u00aa\u00ab\7!\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\5\"\22\2\u00ad\u00b8"+
		"\3\2\2\2\u00ae\u00af\7 \2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\5\"\22\2\u00b1"+
		"\u00b8\3\2\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5\""+
		"\22\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a6\3\2\2\2\u00b7"+
		"\u00aa\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8#\3\2\2\2\13;JSYq\u008a\u0095\u00a4\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}