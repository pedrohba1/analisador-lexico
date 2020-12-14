// Generated from estudol.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		RULE_listDecVariavel1 = 4, RULE_varDec = 5, RULE_listaComandos = 6, RULE_stmt_aux = 7, 
		RULE_stmt = 8, RULE_assign_stmt = 9, RULE_if_then_stmt = 10, RULE_stmtSENAO = 11, 
		RULE_do_while_stmt = 12, RULE_while_stmt = 13, RULE_expr = 14, RULE_term = 15, 
		RULE_fator = 16, RULE_opArith1 = 17, RULE_opArith2 = 18, RULE_logicalExp = 19, 
		RULE_opLogic = 20, RULE_logicalStmt = 21, RULE_opRelac = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "corpo", "secaoVariaveis", "listDecVariavel", "listDecVariavel1", 
			"varDec", "listaComandos", "stmt_aux", "stmt", "assign_stmt", "if_then_stmt", 
			"stmtSENAO", "do_while_stmt", "while_stmt", "expr", "term", "fator", 
			"opArith1", "opArith2", "logicalExp", "opLogic", "logicalStmt", "opRelac"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitInicio(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitCorpo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterSecaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitSecaoVariaveis(this);
		}
	}

	public final SecaoVariaveisContext secaoVariaveis() throws RecognitionException {
		SecaoVariaveisContext _localctx = new SecaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_secaoVariaveis);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARS:
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
				break;
			case SE:
			case ENQUANTO:
			case FACA:
			case ID:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterListDecVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitListDecVariavel(this);
		}
	}

	public final ListDecVariavelContext listDecVariavel() throws RecognitionException {
		ListDecVariavelContext _localctx = new ListDecVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listDecVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			varDec();
			setState(64);
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
		public TerminalNode VIRG() { return getToken(estudolParser.VIRG, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterListDecVariavel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitListDecVariavel1(this);
		}
	}

	public final ListDecVariavel1Context listDecVariavel1() throws RecognitionException {
		ListDecVariavel1Context _localctx = new ListDecVariavel1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_listDecVariavel1);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(VIRG);
				setState(67);
				varDec();
				setState(68);
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
		public TerminalNode TipoInt() { return getToken(estudolParser.TipoInt, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public TerminalNode TipoReal() { return getToken(estudolParser.TipoReal, 0); }
		public TerminalNode TipoChar() { return getToken(estudolParser.TipoChar, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitVarDec(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDec);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(TipoInt);
				setState(74);
				match(ID);
				}
				break;
			case TipoReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(TipoReal);
				setState(76);
				match(ID);
				}
				break;
			case TipoChar:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(TipoChar);
				setState(78);
				match(ID);
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

	public static class ListaComandosContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaComandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			stmt();
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

	public static class Stmt_auxContext extends ParserRuleContext {
		public TerminalNode PVirg() { return getToken(estudolParser.PVirg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public Stmt_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterStmt_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitStmt_aux(this);
		}
	}

	public final Stmt_auxContext stmt_aux() throws RecognitionException {
		Stmt_auxContext _localctx = new Stmt_auxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt_aux);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PVirg:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(PVirg);
				setState(84);
				listaComandos();
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

	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Stmt_auxContext stmt_aux() {
			return getRuleContext(Stmt_auxContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				assign_stmt();
				setState(89);
				stmt_aux();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				if_then_stmt();
				setState(92);
				stmt_aux();
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				do_while_stmt();
				setState(95);
				stmt_aux();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				while_stmt();
				setState(98);
				stmt_aux();
				}
				break;
			case FechaChave:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(OPAtrib);
			setState(105);
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
		public StmtSENAOContext stmtSENAO() {
			return getRuleContext(StmtSENAOContext.class,0);
		}
		public If_then_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterIf_then_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitIf_then_stmt(this);
		}
	}

	public final If_then_stmtContext if_then_stmt() throws RecognitionException {
		If_then_stmtContext _localctx = new If_then_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_then_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(SE);
			setState(108);
			match(AbreParentese);
			setState(109);
			logicalExp();
			setState(110);
			match(FechaParentese);
			setState(111);
			match(ENTAO);
			setState(112);
			corpo();
			setState(113);
			stmtSENAO();
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

	public static class StmtSENAOContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(estudolParser.SENAO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public StmtSENAOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtSENAO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterStmtSENAO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitStmtSENAO(this);
		}
	}

	public final StmtSENAOContext stmtSENAO() throws RecognitionException {
		StmtSENAOContext _localctx = new StmtSENAOContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmtSENAO);
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
				corpo();
				}
				break;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitDo_while_stmt(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FACA);
			setState(121);
			corpo();
			setState(122);
			match(ENQUANTO);
			setState(123);
			match(AbreParentese);
			setState(124);
			logicalExp();
			setState(125);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ENQUANTO);
			setState(128);
			match(AbreParentese);
			setState(129);
			logicalExp();
			setState(130);
			match(FechaParentese);
			setState(131);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OpArith1Context opArith1() {
			return getRuleContext(OpArith1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			term();
			setState(134);
			opArith1();
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
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public OpArith2Context opArith2() {
			return getRuleContext(OpArith2Context.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			fator();
			setState(137);
			opArith2();
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
		public OpArith1Context opArith1() {
			return getRuleContext(OpArith1Context.class,0);
		}
		public TerminalNode INT() { return getToken(estudolParser.INT, 0); }
		public TerminalNode REAL() { return getToken(estudolParser.REAL, 0); }
		public TerminalNode AbreParentese() { return getToken(estudolParser.AbreParentese, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FechaParentese() { return getToken(estudolParser.FechaParentese, 0); }
		public TerminalNode ID() { return getToken(estudolParser.ID, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FechaChave:
			case FechaParentese:
			case PVirg:
			case OPAnd:
			case OPOr:
			case OPMaior:
			case OPMenor:
			case OPIgual:
			case OPMaiorIgual:
			case OPMenorIgual:
			case OPDiferente:
			case OPMais:
			case OPDiv:
			case OPMenos:
			case OPMult:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				opArith1();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(REAL);
				}
				break;
			case AbreParentese:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(AbreParentese);
				setState(143);
				expr();
				setState(144);
				match(FechaParentese);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(ID);
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

	public static class OpArith1Context extends ParserRuleContext {
		public TerminalNode OPMais() { return getToken(estudolParser.OPMais, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OPMenos() { return getToken(estudolParser.OPMenos, 0); }
		public OpArith1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opArith1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterOpArith1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitOpArith1(this);
		}
	}

	public final OpArith1Context opArith1() throws RecognitionException {
		OpArith1Context _localctx = new OpArith1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_opArith1);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(OPMais);
				setState(150);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(OPMenos);
				setState(152);
				term();
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

	public static class OpArith2Context extends ParserRuleContext {
		public TerminalNode OPMult() { return getToken(estudolParser.OPMult, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode OPDiv() { return getToken(estudolParser.OPDiv, 0); }
		public OpArith2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opArith2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterOpArith2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitOpArith2(this);
		}
	}

	public final OpArith2Context opArith2() throws RecognitionException {
		OpArith2Context _localctx = new OpArith2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_opArith2);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(OPMult);
				setState(157);
				fator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(OPDiv);
				setState(159);
				fator();
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

	public static class LogicalExpContext extends ParserRuleContext {
		public LogicalStmtContext logicalStmt() {
			return getRuleContext(LogicalStmtContext.class,0);
		}
		public OpLogicContext opLogic() {
			return getRuleContext(OpLogicContext.class,0);
		}
		public LogicalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterLogicalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitLogicalExp(this);
		}
	}

	public final LogicalExpContext logicalExp() throws RecognitionException {
		LogicalExpContext _localctx = new LogicalExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			logicalStmt();
			setState(164);
			opLogic();
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

	public static class OpLogicContext extends ParserRuleContext {
		public TerminalNode OPAnd() { return getToken(estudolParser.OPAnd, 0); }
		public LogicalStmtContext logicalStmt() {
			return getRuleContext(LogicalStmtContext.class,0);
		}
		public TerminalNode OPOr() { return getToken(estudolParser.OPOr, 0); }
		public OpLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterOpLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitOpLogic(this);
		}
	}

	public final OpLogicContext opLogic() throws RecognitionException {
		OpLogicContext _localctx = new OpLogicContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_opLogic);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(OPAnd);
				setState(167);
				logicalStmt();
				}
				break;
			case OPOr:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(OPOr);
				setState(169);
				logicalStmt();
				}
				break;
			case FechaParentese:
				enterOuterAlt(_localctx, 3);
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

	public static class LogicalStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpRelacContext opRelac() {
			return getRuleContext(OpRelacContext.class,0);
		}
		public LogicalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterLogicalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitLogicalStmt(this);
		}
	}

	public final LogicalStmtContext logicalStmt() throws RecognitionException {
		LogicalStmtContext _localctx = new LogicalStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expr();
			setState(174);
			opRelac();
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

	public static class OpRelacContext extends ParserRuleContext {
		public TerminalNode OPMaior() { return getToken(estudolParser.OPMaior, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPMenor() { return getToken(estudolParser.OPMenor, 0); }
		public TerminalNode OPIgual() { return getToken(estudolParser.OPIgual, 0); }
		public TerminalNode OPMaiorIgual() { return getToken(estudolParser.OPMaiorIgual, 0); }
		public TerminalNode OPMenorIgual() { return getToken(estudolParser.OPMenorIgual, 0); }
		public TerminalNode OPDiferente() { return getToken(estudolParser.OPDiferente, 0); }
		public OpRelacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRelac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).enterOpRelac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof estudolListener ) ((estudolListener)listener).exitOpRelac(this);
		}
	}

	public final OpRelacContext opRelac() throws RecognitionException {
		OpRelacContext _localctx = new OpRelacContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opRelac);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMaior:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(OPMaior);
				setState(177);
				expr();
				}
				break;
			case OPMenor:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(OPMenor);
				setState(179);
				expr();
				}
				break;
			case OPIgual:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(OPIgual);
				setState(181);
				expr();
				}
				break;
			case OPMaiorIgual:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(OPMaiorIgual);
				setState(183);
				expr();
				}
				break;
			case OPMenorIgual:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(OPMenorIgual);
				setState(185);
				expr();
				}
				break;
			case OPDiferente:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(OPDiferente);
				setState(187);
				expr();
				}
				break;
			case FechaParentese:
			case OPAnd:
			case OPOr:
				enterOuterAlt(_localctx, 7);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nh\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\5\ry\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0096\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u009d\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a4\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00ae\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c0\n\30\3\30\2\2\31\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u00c4\2\60\3\2\2"+
		"\2\4\64\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nI\3\2\2\2\fQ\3\2\2\2\16S\3\2\2"+
		"\2\20X\3\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26m\3\2\2\2\30x\3\2\2\2\32z\3\2"+
		"\2\2\34\u0081\3\2\2\2\36\u0087\3\2\2\2 \u008a\3\2\2\2\"\u0095\3\2\2\2"+
		"$\u009c\3\2\2\2&\u00a3\3\2\2\2(\u00a5\3\2\2\2*\u00ad\3\2\2\2,\u00af\3"+
		"\2\2\2.\u00bf\3\2\2\2\60\61\7\21\2\2\61\62\7\13\2\2\62\63\5\4\3\2\63\3"+
		"\3\2\2\2\64\65\7\r\2\2\65\66\5\6\4\2\66\67\5\16\b\2\678\7\16\2\28\5\3"+
		"\2\2\29:\7\22\2\2:;\7\24\2\2;<\5\b\5\2<=\7\30\2\2=@\3\2\2\2>@\3\2\2\2"+
		"?9\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AB\5\f\7\2BC\5\n\6\2C\t\3\2\2\2DE\7\32"+
		"\2\2EF\5\f\7\2FG\5\n\6\2GJ\3\2\2\2HJ\3\2\2\2ID\3\2\2\2IH\3\2\2\2J\13\3"+
		"\2\2\2KL\7\25\2\2LR\7\13\2\2MN\7\26\2\2NR\7\13\2\2OP\7\27\2\2PR\7\13\2"+
		"\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\r\3\2\2\2ST\5\22\n\2T\17\3\2\2\2UV\7"+
		"\30\2\2VY\5\16\b\2WY\3\2\2\2XU\3\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\5\24\13"+
		"\2[\\\5\20\t\2\\h\3\2\2\2]^\5\26\f\2^_\5\20\t\2_h\3\2\2\2`a\5\32\16\2"+
		"ab\5\20\t\2bh\3\2\2\2cd\5\34\17\2de\5\20\t\2eh\3\2\2\2fh\3\2\2\2gZ\3\2"+
		"\2\2g]\3\2\2\2g`\3\2\2\2gc\3\2\2\2gf\3\2\2\2h\23\3\2\2\2ij\7\13\2\2jk"+
		"\7\31\2\2kl\5\36\20\2l\25\3\2\2\2mn\7\7\2\2no\7\17\2\2op\5(\25\2pq\7\20"+
		"\2\2qr\7\23\2\2rs\5\4\3\2st\5\30\r\2t\27\3\2\2\2uv\7\b\2\2vy\5\4\3\2w"+
		"y\3\2\2\2xu\3\2\2\2xw\3\2\2\2y\31\3\2\2\2z{\7\n\2\2{|\5\4\3\2|}\7\t\2"+
		"\2}~\7\17\2\2~\177\5(\25\2\177\u0080\7\20\2\2\u0080\33\3\2\2\2\u0081\u0082"+
		"\7\t\2\2\u0082\u0083\7\17\2\2\u0083\u0084\5(\25\2\u0084\u0085\7\20\2\2"+
		"\u0085\u0086\5\4\3\2\u0086\35\3\2\2\2\u0087\u0088\5 \21\2\u0088\u0089"+
		"\5$\23\2\u0089\37\3\2\2\2\u008a\u008b\5\"\22\2\u008b\u008c\5&\24\2\u008c"+
		"!\3\2\2\2\u008d\u0096\5$\23\2\u008e\u0096\7\3\2\2\u008f\u0096\7\5\2\2"+
		"\u0090\u0091\7\17\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\20\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0096\7\13\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3"+
		"\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"#\3\2\2\2\u0097\u0098\7#\2\2\u0098\u009d\5 \21\2\u0099\u009a\7%\2\2\u009a"+
		"\u009d\5 \21\2\u009b\u009d\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d%\3\2\2\2\u009e\u009f\7&\2\2\u009f\u00a4"+
		"\5\"\22\2\u00a0\u00a1\7$\2\2\u00a1\u00a4\5\"\22\2\u00a2\u00a4\3\2\2\2"+
		"\u00a3\u009e\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\'\3"+
		"\2\2\2\u00a5\u00a6\5,\27\2\u00a6\u00a7\5*\26\2\u00a7)\3\2\2\2\u00a8\u00a9"+
		"\7\33\2\2\u00a9\u00ae\5,\27\2\u00aa\u00ab\7\34\2\2\u00ab\u00ae\5,\27\2"+
		"\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae+\3\2\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\5.\30\2\u00b1"+
		"-\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00c0\5\36\20\2\u00b4\u00b5\7\36"+
		"\2\2\u00b5\u00c0\5\36\20\2\u00b6\u00b7\7\37\2\2\u00b7\u00c0\5\36\20\2"+
		"\u00b8\u00b9\7 \2\2\u00b9\u00c0\5\36\20\2\u00ba\u00bb\7!\2\2\u00bb\u00c0"+
		"\5\36\20\2\u00bc\u00bd\7\"\2\2\u00bd\u00c0\5\36\20\2\u00be\u00c0\3\2\2"+
		"\2\u00bf\u00b2\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b8"+
		"\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"/\3\2\2\2\r?IQXgx\u0095\u009c\u00a3\u00ad\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}