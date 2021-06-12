// Generated from Lenguajes.g4 by ANTLR 4.8
package vicky.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASE=1, ENTERO=2, PRINT=3, IF=4, ELSE=5, WHILE=6, LIBRERIA=7, AND=8, 
		OR=9, NOT=10, TRUE=11, FALSE=12, INCREMENTO=13, DECREMENTO=14, ID=15, 
		STRING=16, LINE_COMMENT=17, COMMENT=18, MAYOR_QUE=19, MENOR_QUE=20, MAYOR_IGUAL_QUE=21, 
		MENOR_IGUAL_QUE=22, IGUAL_QUE=23, DIFERENTE_QUE=24, IGUAL=25, POR=26, 
		DIV=27, MAS=28, MENOS=29, INT=30, FLOAT=31, LL_A=32, LL_C=33, PAR_A=34, 
		PAR_C=35, PYC=36, ESPACIOS=37;
	public static final int
		RULE_inicio = 0, RULE_bloque = 1, RULE_llave_abierta = 2, RULE_llave_cerrada = 3, 
		RULE_instrucciones = 4, RULE_condicion_if = 5, RULE_condicion = 6, RULE_bloque_condicion = 7, 
		RULE_declarar = 8, RULE_asignar = 9, RULE_declarar_asignar = 10, RULE_condicion_while = 11, 
		RULE_imprimir = 12, RULE_string = 13, RULE_operacion = 14, RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "bloque", "llave_abierta", "llave_cerrada", "instrucciones", 
			"condicion_if", "condicion", "bloque_condicion", "declarar", "asignar", 
			"declarar_asignar", "condicion_while", "imprimir", "string", "operacion", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Kukin'", "'bigote'", "'corre'", "'if'", "'else'", "'while'", 
			"'libreria asies'", "'&&'", "'||'", "'!'", "'true'", "'false'", "'++'", 
			"'--'", null, null, null, null, "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'*'", "'/'", "'+'", "'-'", null, null, "'{'", "'}'", 
			"'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASE", "ENTERO", "PRINT", "IF", "ELSE", "WHILE", "LIBRERIA", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "INCREMENTO", "DECREMENTO", "ID", 
			"STRING", "LINE_COMMENT", "COMMENT", "MAYOR_QUE", "MENOR_QUE", "MAYOR_IGUAL_QUE", 
			"MENOR_IGUAL_QUE", "IGUAL_QUE", "DIFERENTE_QUE", "IGUAL", "POR", "DIV", 
			"MAS", "MENOS", "INT", "FLOAT", "LL_A", "LL_C", "PAR_A", "PAR_C", "PYC", 
			"ESPACIOS"
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
	public String getGrammarFileName() { return "Lenguajes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(LenguajesParser.CLASE, 0); }
		public TerminalNode ID() { return getToken(LenguajesParser.ID, 0); }
		public TerminalNode PAR_A() { return getToken(LenguajesParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(LenguajesParser.PAR_C, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LIBRERIA() { return getToken(LenguajesParser.LIBRERIA, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIBRERIA) {
				{
				setState(32);
				match(LIBRERIA);
				}
			}

			setState(35);
			match(CLASE);
			setState(36);
			match(ID);
			setState(37);
			match(PAR_A);
			setState(38);
			match(PAR_C);
			setState(39);
			bloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public Llave_abiertaContext llave_abierta() {
			return getRuleContext(Llave_abiertaContext.class,0);
		}
		public Llave_cerradaContext llave_cerrada() {
			return getRuleContext(Llave_cerradaContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			llave_abierta();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << ID) | (1L << LL_A))) != 0)) {
				{
				{
				setState(42);
				instrucciones();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			llave_cerrada();
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

	public static class Llave_abiertaContext extends ParserRuleContext {
		public TerminalNode LL_A() { return getToken(LenguajesParser.LL_A, 0); }
		public Llave_abiertaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llave_abierta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitLlave_abierta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llave_abiertaContext llave_abierta() throws RecognitionException {
		Llave_abiertaContext _localctx = new Llave_abiertaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_llave_abierta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LL_A);
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

	public static class Llave_cerradaContext extends ParserRuleContext {
		public TerminalNode LL_C() { return getToken(LenguajesParser.LL_C, 0); }
		public Llave_cerradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llave_cerrada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitLlave_cerrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llave_cerradaContext llave_cerrada() throws RecognitionException {
		Llave_cerradaContext _localctx = new Llave_cerradaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_llave_cerrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LL_C);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public AsignarContext asignar() {
			return getRuleContext(AsignarContext.class,0);
		}
		public Declarar_asignarContext declarar_asignar() {
			return getRuleContext(Declarar_asignarContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public Condicion_ifContext condicion_if() {
			return getRuleContext(Condicion_ifContext.class,0);
		}
		public Condicion_whileContext condicion_while() {
			return getRuleContext(Condicion_whileContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucciones);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				asignar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				declarar_asignar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				imprimir();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				condicion_if();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				condicion_while();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				bloque();
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

	public static class Condicion_ifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(LenguajesParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(LenguajesParser.IF, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LenguajesParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LenguajesParser.ELSE, i);
		}
		public Bloque_condicionContext bloque_condicion() {
			return getRuleContext(Bloque_condicionContext.class,0);
		}
		public Condicion_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitCondicion_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_ifContext condicion_if() throws RecognitionException {
		Condicion_ifContext _localctx = new Condicion_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IF);
			setState(64);
			condicion();
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(ELSE);
					setState(66);
					match(IF);
					setState(67);
					condicion();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(73);
				match(ELSE);
				setState(74);
				bloque_condicion();
				}
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PAR_A() { return getToken(LenguajesParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajesParser.PAR_C, 0); }
		public Bloque_condicionContext bloque_condicion() {
			return getRuleContext(Bloque_condicionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PAR_A);
			setState(78);
			expr(0);
			setState(79);
			match(PAR_C);
			setState(80);
			bloque_condicion();
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

	public static class Bloque_condicionContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bloque_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitBloque_condicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionContext bloque_condicion() throws RecognitionException {
		Bloque_condicionContext _localctx = new Bloque_condicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			bloque();
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

	public static class DeclararContext extends ParserRuleContext {
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
	 
		public DeclararContext() { }
		public void copyFrom(DeclararContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracionContext extends DeclararContext {
		public TerminalNode ENTERO() { return getToken(LenguajesParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(LenguajesParser.ID, 0); }
		public TerminalNode PYC() { return getToken(LenguajesParser.PYC, 0); }
		public DeclaracionContext(DeclararContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarar);
		try {
			_localctx = new DeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ENTERO);
			setState(85);
			match(ID);
			setState(86);
			match(PYC);
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

	public static class AsignarContext extends ParserRuleContext {
		public AsignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignar; }
	 
		public AsignarContext() { }
		public void copyFrom(AsignarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends AsignarContext {
		public TerminalNode ID() { return getToken(LenguajesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(LenguajesParser.PYC, 0); }
		public AsignacionContext(AsignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarContext asignar() throws RecognitionException {
		AsignarContext _localctx = new AsignarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignar);
		try {
			_localctx = new AsignacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(IGUAL);
			setState(90);
			expr(0);
			setState(91);
			match(PYC);
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

	public static class Declarar_asignarContext extends ParserRuleContext {
		public Declarar_asignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_asignar; }
	 
		public Declarar_asignarContext() { }
		public void copyFrom(Declarar_asignarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Asignacion2Context extends Declarar_asignarContext {
		public TerminalNode ENTERO() { return getToken(LenguajesParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(LenguajesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(LenguajesParser.PYC, 0); }
		public Asignacion2Context(Declarar_asignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitAsignacion2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_asignarContext declarar_asignar() throws RecognitionException {
		Declarar_asignarContext _localctx = new Declarar_asignarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarar_asignar);
		try {
			_localctx = new Asignacion2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ENTERO);
			setState(94);
			match(ID);
			setState(95);
			match(IGUAL);
			setState(96);
			expr(0);
			setState(97);
			match(PYC);
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

	public static class Condicion_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LenguajesParser.WHILE, 0); }
		public TerminalNode PAR_A() { return getToken(LenguajesParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajesParser.PAR_C, 0); }
		public Bloque_condicionContext bloque_condicion() {
			return getRuleContext(Bloque_condicionContext.class,0);
		}
		public Condicion_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitCondicion_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_whileContext condicion_while() throws RecognitionException {
		Condicion_whileContext _localctx = new Condicion_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(WHILE);
			setState(100);
			match(PAR_A);
			setState(101);
			expr(0);
			setState(102);
			match(PAR_C);
			setState(103);
			bloque_condicion();
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LenguajesParser.PRINT, 0); }
		public TerminalNode PYC() { return getToken(LenguajesParser.PYC, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(PRINT);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				string();
				}
				break;
			case 2:
				{
				setState(107);
				operacion();
				}
				break;
			}
			setState(110);
			match(PYC);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CorreContext extends StringContext {
		public TerminalNode PAR_A() { return getToken(LenguajesParser.PAR_A, 0); }
		public TerminalNode STRING() { return getToken(LenguajesParser.STRING, 0); }
		public TerminalNode PAR_C() { return getToken(LenguajesParser.PAR_C, 0); }
		public CorreContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitCorre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			_localctx = new CorreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PAR_A);
			setState(113);
			match(STRING);
			setState(114);
			match(PAR_C);
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

	public static class OperacionContext extends ParserRuleContext {
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	 
		public OperacionContext() { }
		public void copyFrom(OperacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Corre2Context extends OperacionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Corre2Context(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitCorre2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operacion);
		try {
			_localctx = new Corre2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expr(0);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(LenguajesParser.POR, 0); }
		public TerminalNode DIV() { return getToken(LenguajesParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(LenguajesParser.FALSE, 0); }
		public FalsoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitFalso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LenguajesParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(LenguajesParser.TRUE, 0); }
		public VerdaderoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitVerdadero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LenguajesParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelacionalesContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR_QUE() { return getToken(LenguajesParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(LenguajesParser.MENOR_QUE, 0); }
		public TerminalNode MAYOR_IGUAL_QUE() { return getToken(LenguajesParser.MAYOR_IGUAL_QUE, 0); }
		public TerminalNode MENOR_IGUAL_QUE() { return getToken(LenguajesParser.MENOR_IGUAL_QUE, 0); }
		public RelacionalesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Relacionales2Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL_QUE() { return getToken(LenguajesParser.IGUAL_QUE, 0); }
		public TerminalNode DIFERENTE_QUE() { return getToken(LenguajesParser.DIFERENTE_QUE, 0); }
		public Relacionales2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitRelacionales2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PAR_A() { return getToken(LenguajesParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajesParser.PAR_C, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(LenguajesParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(LenguajesParser.MENOS, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicoAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LenguajesParser.AND, 0); }
		public LogicoAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitLogicoAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicoNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(LenguajesParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicoNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitLogicoNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicoOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LenguajesParser.OR, 0); }
		public LogicoOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitLogicoOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajesParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajesVisitor ) return ((LenguajesVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new LogicoNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(NOT);
				setState(120);
				expr(13);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(FLOAT);
				}
				break;
			case TRUE:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(FALSE);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(PAR_A);
				setState(127);
				expr(0);
				setState(128);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(133);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(136);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new RelacionalesContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(139);
						((RelacionalesContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR_QUE) | (1L << MENOR_QUE) | (1L << MAYOR_IGUAL_QUE) | (1L << MENOR_IGUAL_QUE))) != 0)) ) {
							((RelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Relacionales2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(142);
						((Relacionales2Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL_QUE || _la==DIFERENTE_QUE) ) {
							((Relacionales2Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new LogicoAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(145);
						match(AND);
						setState(146);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new LogicoOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(148);
						match(OR);
						setState(149);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u009e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7G\n\7\f\7\16\7J\13\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16o\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0085\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0099\n\21\f\21\16"+
		"\21\u009c\13\21\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2"+
		"\6\3\2\34\35\3\2\36\37\3\2\25\30\3\2\31\32\2\u00a4\2#\3\2\2\2\4+\3\2\2"+
		"\2\6\64\3\2\2\2\b\66\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16O\3\2\2\2\20T\3\2"+
		"\2\2\22V\3\2\2\2\24Z\3\2\2\2\26_\3\2\2\2\30e\3\2\2\2\32k\3\2\2\2\34r\3"+
		"\2\2\2\36v\3\2\2\2 \u0084\3\2\2\2\"$\7\t\2\2#\"\3\2\2\2#$\3\2\2\2$%\3"+
		"\2\2\2%&\7\3\2\2&\'\7\21\2\2\'(\7$\2\2()\7%\2\2)*\5\4\3\2*\3\3\2\2\2+"+
		"/\5\6\4\2,.\5\n\6\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62"+
		"\3\2\2\2\61/\3\2\2\2\62\63\5\b\5\2\63\5\3\2\2\2\64\65\7\"\2\2\65\7\3\2"+
		"\2\2\66\67\7#\2\2\67\t\3\2\2\28@\5\22\n\29@\5\24\13\2:@\5\26\f\2;@\5\32"+
		"\16\2<@\5\f\7\2=@\5\30\r\2>@\5\4\3\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3"+
		"\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\13\3\2\2\2AB\7\6\2\2BH\5\16\b\2"+
		"CD\7\7\2\2DE\7\6\2\2EG\5\16\b\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2IM\3\2\2\2JH\3\2\2\2KL\7\7\2\2LN\5\20\t\2MK\3\2\2\2MN\3\2\2\2N\r\3\2"+
		"\2\2OP\7$\2\2PQ\5 \21\2QR\7%\2\2RS\5\20\t\2S\17\3\2\2\2TU\5\4\3\2U\21"+
		"\3\2\2\2VW\7\4\2\2WX\7\21\2\2XY\7&\2\2Y\23\3\2\2\2Z[\7\21\2\2[\\\7\33"+
		"\2\2\\]\5 \21\2]^\7&\2\2^\25\3\2\2\2_`\7\4\2\2`a\7\21\2\2ab\7\33\2\2b"+
		"c\5 \21\2cd\7&\2\2d\27\3\2\2\2ef\7\b\2\2fg\7$\2\2gh\5 \21\2hi\7%\2\2i"+
		"j\5\20\t\2j\31\3\2\2\2kn\7\5\2\2lo\5\34\17\2mo\5\36\20\2nl\3\2\2\2nm\3"+
		"\2\2\2op\3\2\2\2pq\7&\2\2q\33\3\2\2\2rs\7$\2\2st\7\22\2\2tu\7%\2\2u\35"+
		"\3\2\2\2vw\5 \21\2w\37\3\2\2\2xy\b\21\1\2yz\7\f\2\2z\u0085\5 \21\17{\u0085"+
		"\7 \2\2|\u0085\7!\2\2}\u0085\7\r\2\2~\u0085\7\16\2\2\177\u0085\7\21\2"+
		"\2\u0080\u0081\7$\2\2\u0081\u0082\5 \21\2\u0082\u0083\7%\2\2\u0083\u0085"+
		"\3\2\2\2\u0084x\3\2\2\2\u0084{\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084"+
		"~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u009a\3\2\2\2\u0086"+
		"\u0087\f\16\2\2\u0087\u0088\t\2\2\2\u0088\u0099\5 \21\17\u0089\u008a\f"+
		"\r\2\2\u008a\u008b\t\3\2\2\u008b\u0099\5 \21\16\u008c\u008d\f\f\2\2\u008d"+
		"\u008e\t\4\2\2\u008e\u0099\5 \21\r\u008f\u0090\f\13\2\2\u0090\u0091\t"+
		"\5\2\2\u0091\u0099\5 \21\f\u0092\u0093\f\n\2\2\u0093\u0094\7\n\2\2\u0094"+
		"\u0099\5 \21\13\u0095\u0096\f\t\2\2\u0096\u0097\7\13\2\2\u0097\u0099\5"+
		" \21\n\u0098\u0086\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008c\3\2\2\2\u0098"+
		"\u008f\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b!\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\13#/?HMn\u0084\u0098\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}