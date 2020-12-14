// Generated from g:\Documentos\analisador-lexico\lingaugem\estudolLL1\estudolLL1.g4 by ANTLR 4.8
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
		AbreParentese=9, FechaParentese=10, PROGRAMA=11, VARS=12, ENTAO=13, Doispontos=14, 
		TipoInt=15, TipoReal=16, TipoChar=17, PVirg=18, OPAtrib=19, SE=20, SENAO=21, 
		ENQUANTO=22, FACA=23, VIRG=24, OPAnd=25, OPOr=26, OPMaior=27, OPMenor=28, 
		OPIgual=29, OPMaiorIgual=30, OPMenorIgual=31, OPDiferente=32, OPMais=33, 
		OPDiv=34, OPMenos=35, OPMult=36, WS=37;
	public static final int
		RULE_inicio = 0, RULE_corpo = 1, RULE_secaoVariaveis = 2, RULE_listDecVariavel = 3, 
		RULE_listDecVariavel1 = 4, RULE_listaComandos = 5, RULE_listaComandos1 = 6, 
		RULE_command = 7, RULE_singleCmd = 8, RULE_stmt = 9, RULE_bloco = 10, 
		RULE_parametroSe = 11, RULE_cexpr = 12, RULE_cexpr0 = 13, RULE_cexpr1 = 14, 
		RULE_expr = 15, RULE_expr1 = 16, RULE_assign_stmt = 17, RULE_if_then_stmt = 18, 
		RULE_do_while_stmt = 19, RULE_while_stmt = 20, RULE_logicalExp = 21, RULE_logicalStmt = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "listDecVariavel1", 
			"listaComandos", "listaComandos1", "command", "singleCmd", "stmt", "bloco", 
			"parametroSe", "cexpr", "cexpr0", "cexpr1", "expr", "expr1", "assign_stmt", 
			"if_then_stmt", "do_while_stmt", "while_stmt", "logicalExp", "logicalStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", null, null, "'{'", "'}'", "'('", "')'", 
			"'PROGRAMA'", "'VARS'", "'ENTAO'", "':'", "'INT'", "'REAL'", "'CHAR'", 
			"';'", "':='", "'SE'", "'SENAO'", "'ENQUANTO'", "'FACA'", "','", "'AND'", 
			"'OR'", "'>'", "'<'", "'=='", "'>='", "'<='", "'<>'", "'+'", "'/'", "'-'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "DIGIT", "FLOAT", "DOT", "ID", "CHAR", "AbreChave", "FechaChave", 
			"AbreParentese", "FechaParentese", "PROGRAMA", "VARS", "ENTAO", "Doispontos", 
			"TipoInt", "TipoReal", "TipoChar", "PVirg", "OPAtrib", "SE", "SENAO", 
			"ENQUANTO", "FACA", "VIRG", "OPAnd", "OPOr", "OPMaior", "OPMenor", "OPIgual", 
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
			setState(46);
			match(PROGRAMA);
			setState(47);
			match(ID);
			setState(48);
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
			setState(50);
			match(AbreChave);
			setState(51);
			secaoVariaveis();
			setState(52);
			listaComandos();
			setState(53);
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
			setState(55);
			match(VARS);
			setState(56);
			match(Doispontos);
			setState(57);
			listDecVariavel();
			setState(58);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(TipoInt);
				setState(61);
				match(ID);
				setState(62);
				listDecVariavel1();
				}
				break;
			case TipoReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(TipoReal);
				setState(64);
				match(ID);
				setState(65);
				listDecVariavel1();
				}
				break;
			case TipoChar:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(TipoChar);
				setState(67);
				match(ID);
				setState(68);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(VIRG);
				setState(72);
				match(TipoInt);
				setState(73);
				match(ID);
				setState(74);
				listDecVariavel1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(VIRG);
				setState(76);
				match(TipoReal);
				setState(77);
				match(ID);
				setState(78);
				listDecVariavel1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(VIRG);
				setState(80);
				match(TipoChar);
				setState(81);
				match(ID);
				setState(82);
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
			setState(86);
			command();
			setState(87);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				command();
				setState(90);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				singleCmd();
				setState(96);
				match(PVirg);
				}
				break;
			case SE:
			case ENQUANTO:
			case FACA:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
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
			setState(101);
			match(ID);
			setState(102);
			match(OPAtrib);
			setState(103);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(SE);
				setState(106);
				match(AbreParentese);
				setState(107);
				cexpr();
				setState(108);
				match(FechaParentese);
				setState(109);
				bloco();
				setState(110);
				parametroSe();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(ENQUANTO);
				setState(113);
				match(AbreParentese);
				setState(114);
				cexpr();
				setState(115);
				match(FechaParentese);
				setState(116);
				bloco();
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(FACA);
				setState(119);
				bloco();
				setState(120);
				match(ENQUANTO);
				setState(121);
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
			setState(125);
			match(AbreChave);
			setState(126);
			listaComandos();
			setState(127);
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
			setState(129);
			match(SENAO);
			setState(130);
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
			setState(132);
			expr();
			setState(133);
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
			setState(148);
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
				setState(135);
				cexpr1();
				}
				break;
			case OPIgual:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(OPIgual);
				setState(137);
				expr();
				setState(138);
				cexpr1();
				}
				break;
			case OPMaior:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(OPMaior);
				setState(141);
				expr();
				setState(142);
				cexpr1();
				}
				break;
			case OPMenor:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(OPMenor);
				setState(145);
				expr();
				setState(146);
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(OPAnd);
				setState(151);
				cexpr0();
				setState(152);
				cexpr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(OPOr);
				setState(155);
				cexpr0();
				setState(156);
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AbreParentese:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(AbreParentese);
				setState(162);
				cexpr();
				setState(163);
				match(FechaParentese);
				setState(164);
				expr1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(ID);
				setState(167);
				expr1();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(INT);
				setState(169);
				expr1();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(CHAR);
				setState(171);
				expr1();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(FLOAT);
				setState(173);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(OPMais);
				setState(177);
				expr();
				setState(178);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(OPMenos);
				setState(181);
				expr();
				setState(182);
				expr1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(OPDiv);
				setState(185);
				expr();
				setState(186);
				expr1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(OPMult);
				setState(189);
				expr();
				setState(190);
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(estudolLL1Parser.ID, 0); }
		public TerminalNode OPAtrib() { return getToken(estudolLL1Parser.OPAtrib, 0); }
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
		enterRule(_localctx, 34, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(OPAtrib);
			setState(197);
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
		public TerminalNode SE() { return getToken(estudolLL1Parser.SE, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolLL1Parser.AbreParentese, 0); }
		public LogicalExpContext logicalExp() {
			return getRuleContext(LogicalExpContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolLL1Parser.FechaParentese, 0); }
		public TerminalNode ENTAO() { return getToken(estudolLL1Parser.ENTAO, 0); }
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
		enterRule(_localctx, 36, RULE_if_then_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SE);
			setState(200);
			match(AbreParentese);
			setState(201);
			logicalExp();
			setState(202);
			match(FechaParentese);
			setState(203);
			match(ENTAO);
			setState(204);
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
		public TerminalNode FACA() { return getToken(estudolLL1Parser.FACA, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(estudolLL1Parser.ENQUANTO, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolLL1Parser.AbreParentese, 0); }
		public LogicalExpContext logicalExp() {
			return getRuleContext(LogicalExpContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolLL1Parser.FechaParentese, 0); }
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(FACA);
			setState(207);
			corpo();
			setState(208);
			match(ENQUANTO);
			setState(209);
			match(AbreParentese);
			setState(210);
			logicalExp();
			setState(211);
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
		public TerminalNode ENQUANTO() { return getToken(estudolLL1Parser.ENQUANTO, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolLL1Parser.AbreParentese, 0); }
		public LogicalExpContext logicalExp() {
			return getRuleContext(LogicalExpContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolLL1Parser.FechaParentese, 0); }
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
		enterRule(_localctx, 40, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ENQUANTO);
			setState(214);
			match(AbreParentese);
			setState(215);
			logicalExp();
			setState(216);
			match(FechaParentese);
			setState(217);
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

	public static class LogicalExpContext extends ParserRuleContext {
		public List<LogicalStmtContext> logicalStmt() {
			return getRuleContexts(LogicalStmtContext.class);
		}
		public LogicalStmtContext logicalStmt(int i) {
			return getRuleContext(LogicalStmtContext.class,i);
		}
		public TerminalNode OPAnd() { return getToken(estudolLL1Parser.OPAnd, 0); }
		public TerminalNode OPOr() { return getToken(estudolLL1Parser.OPOr, 0); }
		public LogicalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExp; }
	}

	public final LogicalExpContext logicalExp() throws RecognitionException {
		LogicalExpContext _localctx = new LogicalExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalExp);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				logicalStmt();
				setState(220);
				match(OPAnd);
				setState(221);
				logicalStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				logicalStmt();
				setState(224);
				match(OPOr);
				setState(225);
				logicalStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
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
		public TerminalNode OPMaior() { return getToken(estudolLL1Parser.OPMaior, 0); }
		public TerminalNode OPMenor() { return getToken(estudolLL1Parser.OPMenor, 0); }
		public TerminalNode OPIgual() { return getToken(estudolLL1Parser.OPIgual, 0); }
		public TerminalNode OPMaiorIgual() { return getToken(estudolLL1Parser.OPMaiorIgual, 0); }
		public TerminalNode OPDiferente() { return getToken(estudolLL1Parser.OPDiferente, 0); }
		public TerminalNode OPMenorIgual() { return getToken(estudolLL1Parser.OPMenorIgual, 0); }
		public LogicalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStmt; }
	}

	public final LogicalStmtContext logicalStmt() throws RecognitionException {
		LogicalStmtContext _localctx = new LogicalStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicalStmt);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				expr();
				setState(231);
				match(OPMaior);
				setState(232);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				expr();
				setState(235);
				match(OPMenor);
				setState(236);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				expr();
				setState(239);
				match(OPIgual);
				setState(240);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				expr();
				setState(243);
				match(OPMaiorIgual);
				setState(244);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				expr();
				setState(247);
				match(OPDiferente);
				setState(248);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				expr();
				setState(251);
				match(OPMenorIgual);
				setState(252);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6W\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\5\t"+
		"f\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0097\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00a2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00e7\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0102\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\2\2\2\u010a\2\60\3\2\2\2\4\64\3\2\2\2\69\3"+
		"\2\2\2\bG\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16_\3\2\2\2\20e\3\2\2\2\22g\3"+
		"\2\2\2\24}\3\2\2\2\26\177\3\2\2\2\30\u0083\3\2\2\2\32\u0086\3\2\2\2\34"+
		"\u0096\3\2\2\2\36\u00a1\3\2\2\2 \u00b0\3\2\2\2\"\u00c3\3\2\2\2$\u00c5"+
		"\3\2\2\2&\u00c9\3\2\2\2(\u00d0\3\2\2\2*\u00d7\3\2\2\2,\u00e6\3\2\2\2."+
		"\u0101\3\2\2\2\60\61\7\r\2\2\61\62\7\7\2\2\62\63\5\4\3\2\63\3\3\2\2\2"+
		"\64\65\7\t\2\2\65\66\5\6\4\2\66\67\5\f\7\2\678\7\n\2\28\5\3\2\2\29:\7"+
		"\16\2\2:;\7\20\2\2;<\5\b\5\2<=\7\24\2\2=\7\3\2\2\2>?\7\21\2\2?@\7\7\2"+
		"\2@H\5\n\6\2AB\7\22\2\2BC\7\7\2\2CH\5\n\6\2DE\7\23\2\2EF\7\7\2\2FH\5\n"+
		"\6\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2\2H\t\3\2\2\2IJ\7\32\2\2JK\7\21\2\2KL"+
		"\7\7\2\2LW\5\n\6\2MN\7\32\2\2NO\7\22\2\2OP\7\7\2\2PW\5\n\6\2QR\7\32\2"+
		"\2RS\7\23\2\2ST\7\7\2\2TW\5\n\6\2UW\3\2\2\2VI\3\2\2\2VM\3\2\2\2VQ\3\2"+
		"\2\2VU\3\2\2\2W\13\3\2\2\2XY\5\20\t\2YZ\5\16\b\2Z\r\3\2\2\2[\\\5\20\t"+
		"\2\\]\5\16\b\2]`\3\2\2\2^`\3\2\2\2_[\3\2\2\2_^\3\2\2\2`\17\3\2\2\2ab\5"+
		"\22\n\2bc\7\24\2\2cf\3\2\2\2df\5\24\13\2ea\3\2\2\2ed\3\2\2\2f\21\3\2\2"+
		"\2gh\7\7\2\2hi\7\25\2\2ij\5\32\16\2j\23\3\2\2\2kl\7\26\2\2lm\7\13\2\2"+
		"mn\5\32\16\2no\7\f\2\2op\5\26\f\2pq\5\30\r\2q~\3\2\2\2rs\7\30\2\2st\7"+
		"\13\2\2tu\5\32\16\2uv\7\f\2\2vw\5\26\f\2w~\3\2\2\2xy\7\31\2\2yz\5\26\f"+
		"\2z{\7\30\2\2{|\5\32\16\2|~\3\2\2\2}k\3\2\2\2}r\3\2\2\2}x\3\2\2\2~\25"+
		"\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081\5\f\7\2\u0081\u0082\7\n\2\2\u0082"+
		"\27\3\2\2\2\u0083\u0084\7\27\2\2\u0084\u0085\5\26\f\2\u0085\31\3\2\2\2"+
		"\u0086\u0087\5 \21\2\u0087\u0088\5\34\17\2\u0088\33\3\2\2\2\u0089\u0097"+
		"\5\36\20\2\u008a\u008b\7\37\2\2\u008b\u008c\5 \21\2\u008c\u008d\5\36\20"+
		"\2\u008d\u0097\3\2\2\2\u008e\u008f\7\35\2\2\u008f\u0090\5 \21\2\u0090"+
		"\u0091\5\36\20\2\u0091\u0097\3\2\2\2\u0092\u0093\7\36\2\2\u0093\u0094"+
		"\5 \21\2\u0094\u0095\5\36\20\2\u0095\u0097\3\2\2\2\u0096\u0089\3\2\2\2"+
		"\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097\35"+
		"\3\2\2\2\u0098\u0099\7\33\2\2\u0099\u009a\5\34\17\2\u009a\u009b\5\36\20"+
		"\2\u009b\u00a2\3\2\2\2\u009c\u009d\7\34\2\2\u009d\u009e\5\34\17\2\u009e"+
		"\u009f\5\36\20\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0098\3"+
		"\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\37\3\2\2\2\u00a3"+
		"\u00a4\7\13\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7"+
		"\5\"\22\2\u00a7\u00b1\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00b1\5\"\22\2"+
		"\u00aa\u00ab\7\3\2\2\u00ab\u00b1\5\"\22\2\u00ac\u00ad\7\b\2\2\u00ad\u00b1"+
		"\5\"\22\2\u00ae\u00af\7\5\2\2\u00af\u00b1\5\"\22\2\u00b0\u00a3\3\2\2\2"+
		"\u00b0\u00a8\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5"+
		"\5\"\22\2\u00b5\u00c4\3\2\2\2\u00b6\u00b7\7%\2\2\u00b7\u00b8\5 \21\2\u00b8"+
		"\u00b9\5\"\22\2\u00b9\u00c4\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\5 "+
		"\21\2\u00bc\u00bd\5\"\22\2\u00bd\u00c4\3\2\2\2\u00be\u00bf\7&\2\2\u00bf"+
		"\u00c0\5 \21\2\u00c0\u00c1\5\"\22\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4\3"+
		"\2\2\2\u00c3\u00b2\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7\7\2\2"+
		"\u00c6\u00c7\7\25\2\2\u00c7\u00c8\5 \21\2\u00c8%\3\2\2\2\u00c9\u00ca\7"+
		"\26\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\5,\27\2\u00cc\u00cd\7\f\2\2\u00cd"+
		"\u00ce\7\17\2\2\u00ce\u00cf\5\4\3\2\u00cf\'\3\2\2\2\u00d0\u00d1\7\31\2"+
		"\2\u00d1\u00d2\5\4\3\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\7\13\2\2\u00d4"+
		"\u00d5\5,\27\2\u00d5\u00d6\7\f\2\2\u00d6)\3\2\2\2\u00d7\u00d8\7\30\2\2"+
		"\u00d8\u00d9\7\13\2\2\u00d9\u00da\5,\27\2\u00da\u00db\7\f\2\2\u00db\u00dc"+
		"\5\4\3\2\u00dc+\3\2\2\2\u00dd\u00de\5.\30\2\u00de\u00df\7\33\2\2\u00df"+
		"\u00e0\5.\30\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\5.\30\2\u00e2\u00e3\7\34"+
		"\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5.\30\2\u00e6"+
		"\u00dd\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7-\3\2\2\2"+
		"\u00e8\u00e9\5 \21\2\u00e9\u00ea\7\35\2\2\u00ea\u00eb\5 \21\2\u00eb\u0102"+
		"\3\2\2\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7\36\2\2\u00ee\u00ef\5 \21\2"+
		"\u00ef\u0102\3\2\2\2\u00f0\u00f1\5 \21\2\u00f1\u00f2\7\37\2\2\u00f2\u00f3"+
		"\5 \21\2\u00f3\u0102\3\2\2\2\u00f4\u00f5\5 \21\2\u00f5\u00f6\7 \2\2\u00f6"+
		"\u00f7\5 \21\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\7\""+
		"\2\2\u00fa\u00fb\5 \21\2\u00fb\u0102\3\2\2\2\u00fc\u00fd\5 \21\2\u00fd"+
		"\u00fe\7!\2\2\u00fe\u00ff\5 \21\2\u00ff\u0102\3\2\2\2\u0100\u0102\5 \21"+
		"\2\u0101\u00e8\3\2\2\2\u0101\u00ec\3\2\2\2\u0101\u00f0\3\2\2\2\u0101\u00f4"+
		"\3\2\2\2\u0101\u00f8\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"/\3\2\2\2\rGV_e}\u0096\u00a1\u00b0\u00c3\u00e6\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}