// Generated from g:\Documentos\CC\estudolSemRec\estudolSemRec.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class estudolSemRecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DIGIT=2, FLOAT=3, DOT=4, ID=5, CHAR=6, AbreChave=7, FechaChave=8, 
		AbreParentese=9, FechaParentese=10, PROGRAMA=11, VARS=12, Doispontos=13, 
		TipotInt=14, TipoReal=15, TipoChar=16, PVirg=17, OPAtrib=18, SE=19, SENAO=20, 
		ENQUANTO=21, FACA=22, VIRG=23, OPAnd=24, OPOr=25, OPMaior=26, OPMenor=27, 
		OPIgual=28, OPMais=29, OPDiv=30, OPMenos=31, OPMult=32, WS=33;
	public static final int
		RULE_inicio = 0, RULE_corpo = 1, RULE_secaoVariaveis = 2, RULE_listDecVariavel = 3, 
		RULE_listDecVariavel1 = 4, RULE_varDec = 5, RULE_tipos = 6, RULE_bloco = 7, 
		RULE_listaComandos = 8, RULE_listaComandos1 = 9, RULE_command = 10, RULE_singleCmd = 11, 
		RULE_stmt = 12, RULE_cexpr = 13, RULE_cexpr1 = 14, RULE_expr = 15, RULE_expr1 = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "listDecVariavel1", 
			"varDec", "tipos", "bloco", "listaComandos", "listaComandos1", "command", 
			"singleCmd", "stmt", "cexpr", "cexpr1", "expr", "expr1"
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
			"TipotInt", "TipoReal", "TipoChar", "PVirg", "OPAtrib", "SE", "SENAO", 
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
	public String getGrammarFileName() { return "estudolSemRec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public estudolSemRecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(estudolSemRecParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(estudolSemRecParser.ID, 0); }
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
		public TerminalNode AbreChave() { return getToken(estudolSemRecParser.AbreChave, 0); }
		public SecaoVariaveisContext secaoVariaveis() {
			return getRuleContext(SecaoVariaveisContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(estudolSemRecParser.FechaChave, 0); }
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
		public TerminalNode VARS() { return getToken(estudolSemRecParser.VARS, 0); }
		public TerminalNode Doispontos() { return getToken(estudolSemRecParser.Doispontos, 0); }
		public ListDecVariavelContext listDecVariavel() {
			return getRuleContext(ListDecVariavelContext.class,0);
		}
		public TerminalNode PVirg() { return getToken(estudolSemRecParser.PVirg, 0); }
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
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ListDecVariavel1Context listDecVariavel1() {
			return getRuleContext(ListDecVariavel1Context.class,0);
		}
		public ListDecVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel; }
	}

	public final ListDecVariavelContext listDecVariavel() throws RecognitionException {
		ListDecVariavelContext _localctx = new ListDecVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listDecVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			varDec();
			setState(49);
			listDecVariavel1();
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
		public TerminalNode VIRG() { return getToken(estudolSemRecParser.VIRG, 0); }
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public ListDecVariavel1Context listDecVariavel1() {
			return getRuleContext(ListDecVariavel1Context.class,0);
		}
		public ListDecVariavel1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel1; }
	}

	public final ListDecVariavel1Context listDecVariavel1() throws RecognitionException {
		ListDecVariavel1Context _localctx = new ListDecVariavel1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_listDecVariavel1);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(VIRG);
				setState(52);
				varDec();
				setState(53);
				listDecVariavel1();
				}
				break;
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

	public static class VarDecContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(estudolSemRecParser.ID, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			tipos();
			setState(59);
			match(ID);
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode TipotInt() { return getToken(estudolSemRecParser.TipotInt, 0); }
		public TerminalNode TipoReal() { return getToken(estudolSemRecParser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolSemRecParser.TipoChar, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipotInt) | (1L << TipoReal) | (1L << TipoChar))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public TerminalNode AbreChave() { return getToken(estudolSemRecParser.AbreChave, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(estudolSemRecParser.FechaChave, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(AbreChave);
			setState(64);
			listaComandos();
			setState(65);
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
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaComandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			command();
			setState(68);
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
		enterRule(_localctx, 18, RULE_listaComandos1);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				command();
				setState(71);
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
		public TerminalNode PVirg() { return getToken(estudolSemRecParser.PVirg, 0); }
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
		enterRule(_localctx, 20, RULE_command);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				singleCmd();
				setState(77);
				match(PVirg);
				}
				break;
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
		public TerminalNode ID() { return getToken(estudolSemRecParser.ID, 0); }
		public TerminalNode OPAtrib() { return getToken(estudolSemRecParser.OPAtrib, 0); }
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
		enterRule(_localctx, 22, RULE_singleCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(OPAtrib);
			setState(84);
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
		public TerminalNode SE() { return getToken(estudolSemRecParser.SE, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolSemRecParser.AbreParentese, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolSemRecParser.FechaParentese, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(estudolSemRecParser.SENAO, 0); }
		public TerminalNode ENQUANTO() { return getToken(estudolSemRecParser.ENQUANTO, 0); }
		public TerminalNode FACA() { return getToken(estudolSemRecParser.FACA, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(SE);
				setState(87);
				match(AbreParentese);
				setState(88);
				cexpr();
				setState(89);
				match(FechaParentese);
				setState(90);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(SE);
				setState(93);
				match(AbreParentese);
				setState(94);
				cexpr();
				setState(95);
				match(FechaParentese);
				setState(96);
				bloco();
				setState(97);
				match(SENAO);
				setState(98);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
			case 4:
				enterOuterAlt(_localctx, 4);
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
		public TerminalNode OPIgual() { return getToken(estudolSemRecParser.OPIgual, 0); }
		public TerminalNode OPMaior() { return getToken(estudolSemRecParser.OPMaior, 0); }
		public TerminalNode OPMenor() { return getToken(estudolSemRecParser.OPMenor, 0); }
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
	}

	public final CexprContext cexpr() throws RecognitionException {
		CexprContext _localctx = new CexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cexpr);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				expr();
				setState(114);
				cexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expr();
				setState(117);
				match(OPIgual);
				setState(118);
				expr();
				setState(119);
				cexpr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				expr();
				setState(122);
				match(OPMaior);
				setState(123);
				expr();
				setState(124);
				cexpr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				expr();
				setState(127);
				match(OPMenor);
				setState(128);
				expr();
				setState(129);
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
		public TerminalNode OPAnd() { return getToken(estudolSemRecParser.OPAnd, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public Cexpr1Context cexpr1() {
			return getRuleContext(Cexpr1Context.class,0);
		}
		public TerminalNode OPOr() { return getToken(estudolSemRecParser.OPOr, 0); }
		public Cexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr1; }
	}

	public final Cexpr1Context cexpr1() throws RecognitionException {
		Cexpr1Context _localctx = new Cexpr1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_cexpr1);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(OPAnd);
				setState(134);
				cexpr();
				setState(135);
				cexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(OPOr);
				setState(138);
				cexpr();
				setState(139);
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
		public TerminalNode AbreParentese() { return getToken(estudolSemRecParser.AbreParentese, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolSemRecParser.FechaParentese, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode ID() { return getToken(estudolSemRecParser.ID, 0); }
		public TerminalNode INT() { return getToken(estudolSemRecParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(estudolSemRecParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(estudolSemRecParser.FLOAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreParentese:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(AbreParentese);
				setState(145);
				cexpr();
				setState(146);
				match(FechaParentese);
				setState(147);
				expr1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID);
				setState(150);
				expr1();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(INT);
				setState(152);
				expr1();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(CHAR);
				setState(154);
				expr1();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(FLOAT);
				setState(156);
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
		public TerminalNode OPMais() { return getToken(estudolSemRecParser.OPMais, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode OPMenos() { return getToken(estudolSemRecParser.OPMenos, 0); }
		public TerminalNode OPDiv() { return getToken(estudolSemRecParser.OPDiv, 0); }
		public TerminalNode OPMult() { return getToken(estudolSemRecParser.OPMult, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr1);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(OPMais);
				setState(160);
				expr();
				setState(161);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(OPMenos);
				setState(164);
				expr();
				setState(165);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(OPDiv);
				setState(168);
				expr();
				setState(169);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(OPMult);
				setState(172);
				expr();
				setState(173);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\5\13M\n\13\3\f\3\f\3\f\3\f\5\fS\n\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16r"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00a0\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b3\n\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\20\22\2"+
		"\u00b6\2$\3\2\2\2\4(\3\2\2\2\6-\3\2\2\2\b\62\3\2\2\2\n:\3\2\2\2\f<\3\2"+
		"\2\2\16?\3\2\2\2\20A\3\2\2\2\22E\3\2\2\2\24L\3\2\2\2\26R\3\2\2\2\30T\3"+
		"\2\2\2\32q\3\2\2\2\34\u0085\3\2\2\2\36\u0090\3\2\2\2 \u009f\3\2\2\2\""+
		"\u00b2\3\2\2\2$%\7\r\2\2%&\7\7\2\2&\'\5\4\3\2\'\3\3\2\2\2()\7\t\2\2)*"+
		"\5\6\4\2*+\5\22\n\2+,\7\n\2\2,\5\3\2\2\2-.\7\16\2\2./\7\17\2\2/\60\5\b"+
		"\5\2\60\61\7\23\2\2\61\7\3\2\2\2\62\63\5\f\7\2\63\64\5\n\6\2\64\t\3\2"+
		"\2\2\65\66\7\31\2\2\66\67\5\f\7\2\678\5\n\6\28;\3\2\2\29;\3\2\2\2:\65"+
		"\3\2\2\2:9\3\2\2\2;\13\3\2\2\2<=\5\16\b\2=>\7\7\2\2>\r\3\2\2\2?@\t\2\2"+
		"\2@\17\3\2\2\2AB\7\t\2\2BC\5\22\n\2CD\7\n\2\2D\21\3\2\2\2EF\5\26\f\2F"+
		"G\5\24\13\2G\23\3\2\2\2HI\5\26\f\2IJ\5\24\13\2JM\3\2\2\2KM\3\2\2\2LH\3"+
		"\2\2\2LK\3\2\2\2M\25\3\2\2\2NO\5\30\r\2OP\7\23\2\2PS\3\2\2\2QS\5\32\16"+
		"\2RN\3\2\2\2RQ\3\2\2\2S\27\3\2\2\2TU\7\7\2\2UV\7\24\2\2VW\5\34\17\2W\31"+
		"\3\2\2\2XY\7\25\2\2YZ\7\13\2\2Z[\5\34\17\2[\\\7\f\2\2\\]\5\20\t\2]r\3"+
		"\2\2\2^_\7\25\2\2_`\7\13\2\2`a\5\34\17\2ab\7\f\2\2bc\5\20\t\2cd\7\26\2"+
		"\2de\5\20\t\2er\3\2\2\2fg\7\27\2\2gh\7\13\2\2hi\5\34\17\2ij\7\f\2\2jk"+
		"\5\20\t\2kr\3\2\2\2lm\7\30\2\2mn\5\20\t\2no\7\27\2\2op\5\34\17\2pr\3\2"+
		"\2\2qX\3\2\2\2q^\3\2\2\2qf\3\2\2\2ql\3\2\2\2r\33\3\2\2\2st\5 \21\2tu\5"+
		"\36\20\2u\u0086\3\2\2\2vw\5 \21\2wx\7\36\2\2xy\5 \21\2yz\5\36\20\2z\u0086"+
		"\3\2\2\2{|\5 \21\2|}\7\34\2\2}~\5 \21\2~\177\5\36\20\2\177\u0086\3\2\2"+
		"\2\u0080\u0081\5 \21\2\u0081\u0082\7\35\2\2\u0082\u0083\5 \21\2\u0083"+
		"\u0084\5\36\20\2\u0084\u0086\3\2\2\2\u0085s\3\2\2\2\u0085v\3\2\2\2\u0085"+
		"{\3\2\2\2\u0085\u0080\3\2\2\2\u0086\35\3\2\2\2\u0087\u0088\7\32\2\2\u0088"+
		"\u0089\5\34\17\2\u0089\u008a\5\36\20\2\u008a\u0091\3\2\2\2\u008b\u008c"+
		"\7\33\2\2\u008c\u008d\5\34\17\2\u008d\u008e\5\36\20\2\u008e\u0091\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008b\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u0094\5\34"+
		"\17\2\u0094\u0095\7\f\2\2\u0095\u0096\5\"\22\2\u0096\u00a0\3\2\2\2\u0097"+
		"\u0098\7\7\2\2\u0098\u00a0\5\"\22\2\u0099\u009a\7\3\2\2\u009a\u00a0\5"+
		"\"\22\2\u009b\u009c\7\b\2\2\u009c\u00a0\5\"\22\2\u009d\u009e\7\5\2\2\u009e"+
		"\u00a0\5\"\22\2\u009f\u0092\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u0099\3"+
		"\2\2\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a2"+
		"\7\37\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\5\"\22\2\u00a4\u00b3\3\2\2\2"+
		"\u00a5\u00a6\7!\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\5\"\22\2\u00a8\u00b3"+
		"\3\2\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\5\"\22\2\u00ac"+
		"\u00b3\3\2\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\5\""+
		"\22\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2"+
		"\u00a5\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3#\3\2\2\2\n:LRq\u0085\u0090\u009f\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}