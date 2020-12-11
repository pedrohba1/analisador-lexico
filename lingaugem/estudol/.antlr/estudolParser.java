// Generated from g:\Documentos\CC\estudol\estudol.g4 by ANTLR 4.8
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
		INT=1, DIGIT=2, FLOAT=3, DOT=4, ID=5, CHAR=6, AbreChave=7, FechaChave=8, 
		AbreParentese=9, FechaParentese=10, PROGRAMA=11, VARS=12, Doispontos=13, 
		TipotInt=14, TipoReal=15, TipoChar=16, PVirg=17, OPAtrib=18, SE=19, SENAO=20, 
		ENQUANTO=21, FACA=22, VIRG=23, OPAnd=24, OPOr=25, OPMaior=26, OPMenor=27, 
		OPIgual=28, OPMais=29, OPDiv=30, OPMenos=31, OPMult=32, WS=33;
	public static final int
		RULE_inicio = 0, RULE_corpo = 1, RULE_secaoVariaveis = 2, RULE_listDecVariavel = 3, 
		RULE_varDec = 4, RULE_tipos = 5, RULE_bloco = 6, RULE_listaComandos = 7, 
		RULE_command = 8, RULE_singleCmd = 9, RULE_stmt = 10, RULE_cexpr = 11, 
		RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "varDec", "tipos", 
			"bloco", "listaComandos", "command", "singleCmd", "stmt", "cexpr", "expr"
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
			setState(26);
			match(PROGRAMA);
			setState(27);
			match(ID);
			setState(28);
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
			setState(30);
			match(AbreChave);
			setState(31);
			secaoVariaveis();
			setState(32);
			listaComandos(0);
			setState(33);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VARS);
			setState(36);
			match(Doispontos);
			setState(37);
			listDecVariavel(0);
			setState(38);
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
		public ListDecVariavelContext listDecVariavel() {
			return getRuleContext(ListDecVariavelContext.class,0);
		}
		public TerminalNode VIRG() { return getToken(estudolParser.VIRG, 0); }
		public ListDecVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecVariavel; }
	}

	public final ListDecVariavelContext listDecVariavel() throws RecognitionException {
		return listDecVariavel(0);
	}

	private ListDecVariavelContext listDecVariavel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListDecVariavelContext _localctx = new ListDecVariavelContext(_ctx, _parentState);
		ListDecVariavelContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_listDecVariavel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(41);
			varDec();
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListDecVariavelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listDecVariavel);
					setState(43);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(44);
					match(VIRG);
					setState(45);
					varDec();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class VarDecContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			tipos();
			setState(52);
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
		public TerminalNode TipotInt() { return getToken(estudolParser.TipotInt, 0); }
		public TerminalNode TipoReal() { return getToken(estudolParser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolParser.TipoChar, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
		public TerminalNode AbreChave() { return getToken(estudolParser.AbreChave, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(estudolParser.FechaChave, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(AbreChave);
			setState(57);
			listaComandos(0);
			setState(58);
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
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		return listaComandos(0);
	}

	private ListaComandosContext listaComandos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, _parentState);
		ListaComandosContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_listaComandos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			command();
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaComandosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listaComandos);
					setState(63);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(64);
					command();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class CommandContext extends ParserRuleContext {
		public SingleCmdContext singleCmd() {
			return getRuleContext(SingleCmdContext.class,0);
		}
		public TerminalNode PVirg() { return getToken(estudolParser.PVirg, 0); }
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
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				singleCmd();
				setState(71);
				match(PVirg);
				}
				break;
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public TerminalNode OPAtrib() { return getToken(estudolParser.OPAtrib, 0); }
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
		enterRule(_localctx, 18, RULE_singleCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(OPAtrib);
			setState(78);
			cexpr(0);
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
		public TerminalNode SE() { return getToken(estudolParser.SE, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(estudolParser.SENAO, 0); }
		public TerminalNode ENQUANTO() { return getToken(estudolParser.ENQUANTO, 0); }
		public TerminalNode FACA() { return getToken(estudolParser.FACA, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(SE);
				setState(81);
				match(AbreParentese);
				setState(82);
				cexpr(0);
				setState(83);
				match(FechaParentese);
				setState(84);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(SE);
				setState(87);
				match(AbreParentese);
				setState(88);
				cexpr(0);
				setState(89);
				match(FechaParentese);
				setState(90);
				bloco();
				setState(91);
				match(SENAO);
				setState(92);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(ENQUANTO);
				setState(95);
				match(AbreParentese);
				setState(96);
				cexpr(0);
				setState(97);
				match(FechaParentese);
				setState(98);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(FACA);
				setState(101);
				bloco();
				setState(102);
				match(ENQUANTO);
				setState(103);
				cexpr(0);
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
		public TerminalNode OPIgual() { return getToken(estudolParser.OPIgual, 0); }
		public TerminalNode OPMaior() { return getToken(estudolParser.OPMaior, 0); }
		public TerminalNode OPMenor() { return getToken(estudolParser.OPMenor, 0); }
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public TerminalNode OPAnd() { return getToken(estudolParser.OPAnd, 0); }
		public TerminalNode OPOr() { return getToken(estudolParser.OPOr, 0); }
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_cexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(108);
				expr(0);
				setState(109);
				match(OPIgual);
				setState(110);
				expr(0);
				}
				break;
			case 2:
				{
				setState(112);
				expr(0);
				setState(113);
				match(OPMaior);
				setState(114);
				expr(0);
				}
				break;
			case 3:
				{
				setState(116);
				expr(0);
				setState(117);
				match(OPMenor);
				setState(118);
				expr(0);
				}
				break;
			case 4:
				{
				setState(120);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(124);
						match(OPAnd);
						setState(125);
						cexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(126);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(127);
						match(OPOr);
						setState(128);
						cexpr(6);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public TerminalNode INT() { return getToken(estudolParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(estudolParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(estudolParser.FLOAT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPMais() { return getToken(estudolParser.OPMais, 0); }
		public TerminalNode OPMenos() { return getToken(estudolParser.OPMenos, 0); }
		public TerminalNode OPDiv() { return getToken(estudolParser.OPDiv, 0); }
		public TerminalNode OPMult() { return getToken(estudolParser.OPMult, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreParentese:
				{
				setState(135);
				match(AbreParentese);
				setState(136);
				cexpr(0);
				setState(137);
				match(FechaParentese);
				}
				break;
			case ID:
				{
				setState(139);
				match(ID);
				}
				break;
			case INT:
				{
				setState(140);
				match(INT);
				}
				break;
			case CHAR:
				{
				setState(141);
				match(CHAR);
				}
				break;
			case FLOAT:
				{
				setState(142);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						match(OPMais);
						setState(147);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						match(OPMenos);
						setState(150);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(152);
						match(OPDiv);
						setState(153);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						match(OPMult);
						setState(156);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(161);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return listDecVariavel_sempred((ListDecVariavelContext)_localctx, predIndex);
		case 7:
			return listaComandos_sempred((ListaComandosContext)_localctx, predIndex);
		case 11:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listDecVariavel_sempred(ListDecVariavelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaComandos_sempred(ListaComandosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64\13\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tD\n\t\f\t\16"+
		"\tG\13\t\3\n\3\n\3\n\3\n\5\nM\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0084\n\r\f\r\16\r\u0087"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0092\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a0\n\16"+
		"\f\16\16\16\u00a3\13\16\3\16\2\6\b\20\30\32\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\3\3\2\20\22\2\u00aa\2\34\3\2\2\2\4 \3\2\2\2\6%\3\2\2\2\b*"+
		"\3\2\2\2\n\65\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20>\3\2\2\2\22L\3\2\2\2\24"+
		"N\3\2\2\2\26k\3\2\2\2\30{\3\2\2\2\32\u0091\3\2\2\2\34\35\7\r\2\2\35\36"+
		"\7\7\2\2\36\37\5\4\3\2\37\3\3\2\2\2 !\7\t\2\2!\"\5\6\4\2\"#\5\20\t\2#"+
		"$\7\n\2\2$\5\3\2\2\2%&\7\16\2\2&\'\7\17\2\2\'(\5\b\5\2()\7\23\2\2)\7\3"+
		"\2\2\2*+\b\5\1\2+,\5\n\6\2,\62\3\2\2\2-.\f\4\2\2./\7\31\2\2/\61\5\n\6"+
		"\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\t\3\2\2\2"+
		"\64\62\3\2\2\2\65\66\5\f\7\2\66\67\7\7\2\2\67\13\3\2\2\289\t\2\2\29\r"+
		"\3\2\2\2:;\7\t\2\2;<\5\20\t\2<=\7\n\2\2=\17\3\2\2\2>?\b\t\1\2?@\5\22\n"+
		"\2@E\3\2\2\2AB\f\4\2\2BD\5\22\n\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\21\3\2\2\2GE\3\2\2\2HI\5\24\13\2IJ\7\23\2\2JM\3\2\2\2KM\5\26\f\2"+
		"LH\3\2\2\2LK\3\2\2\2M\23\3\2\2\2NO\7\7\2\2OP\7\24\2\2PQ\5\30\r\2Q\25\3"+
		"\2\2\2RS\7\25\2\2ST\7\13\2\2TU\5\30\r\2UV\7\f\2\2VW\5\16\b\2Wl\3\2\2\2"+
		"XY\7\25\2\2YZ\7\13\2\2Z[\5\30\r\2[\\\7\f\2\2\\]\5\16\b\2]^\7\26\2\2^_"+
		"\5\16\b\2_l\3\2\2\2`a\7\27\2\2ab\7\13\2\2bc\5\30\r\2cd\7\f\2\2de\5\16"+
		"\b\2el\3\2\2\2fg\7\30\2\2gh\5\16\b\2hi\7\27\2\2ij\5\30\r\2jl\3\2\2\2k"+
		"R\3\2\2\2kX\3\2\2\2k`\3\2\2\2kf\3\2\2\2l\27\3\2\2\2mn\b\r\1\2no\5\32\16"+
		"\2op\7\36\2\2pq\5\32\16\2q|\3\2\2\2rs\5\32\16\2st\7\34\2\2tu\5\32\16\2"+
		"u|\3\2\2\2vw\5\32\16\2wx\7\35\2\2xy\5\32\16\2y|\3\2\2\2z|\5\32\16\2{m"+
		"\3\2\2\2{r\3\2\2\2{v\3\2\2\2{z\3\2\2\2|\u0085\3\2\2\2}~\f\b\2\2~\177\7"+
		"\32\2\2\177\u0084\5\30\r\t\u0080\u0081\f\7\2\2\u0081\u0082\7\33\2\2\u0082"+
		"\u0084\5\30\r\b\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\31\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\b\16\1\2\u0089\u008a\7\13\2\2\u008a\u008b\5\30\r"+
		"\2\u008b\u008c\7\f\2\2\u008c\u0092\3\2\2\2\u008d\u0092\7\7\2\2\u008e\u0092"+
		"\7\3\2\2\u008f\u0092\7\b\2\2\u0090\u0092\7\5\2\2\u0091\u0088\3\2\2\2\u0091"+
		"\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2"+
		"\2\2\u0092\u00a1\3\2\2\2\u0093\u0094\f\13\2\2\u0094\u0095\7\37\2\2\u0095"+
		"\u00a0\5\32\16\f\u0096\u0097\f\n\2\2\u0097\u0098\7!\2\2\u0098\u00a0\5"+
		"\32\16\13\u0099\u009a\f\t\2\2\u009a\u009b\7 \2\2\u009b\u00a0\5\32\16\n"+
		"\u009c\u009d\f\b\2\2\u009d\u009e\7\"\2\2\u009e\u00a0\5\32\16\t\u009f\u0093"+
		"\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\33\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\f\62ELk{\u0083\u0085\u0091\u009f\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}