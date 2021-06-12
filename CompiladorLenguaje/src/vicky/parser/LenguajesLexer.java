// Generated from Lenguajes.g4 by ANTLR 4.8
package vicky.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajesLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASE", "ENTERO", "PRINT", "IF", "ELSE", "WHILE", "LIBRERIA", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "INCREMENTO", "DECREMENTO", "ID", "STRING", 
			"ESC", "LINE_COMMENT", "COMMENT", "MAYOR_QUE", "MENOR_QUE", "MAYOR_IGUAL_QUE", 
			"MENOR_IGUAL_QUE", "IGUAL_QUE", "DIFERENTE_QUE", "IGUAL", "POR", "DIV", 
			"MAS", "MENOS", "INT", "FLOAT", "LL_A", "LL_C", "PAR_A", "PAR_C", "PYC", 
			"ESPACIOS"
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


	public LenguajesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lenguajes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\6\20\u009a\n\20\r\20\16\20\u009b\3\21\3\21\3\21\7\21\u00a1\n\21\f\21"+
		"\16\21\u00a4\13\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00af"+
		"\n\23\f\23\16\23\u00b2\13\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7"+
		"\24\u00bc\n\24\f\24\16\24\u00bf\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00e1\n \r"+
		" \16 \u00e2\3!\6!\u00e6\n!\r!\16!\u00e7\3!\3!\7!\u00ec\n!\f!\16!\u00ef"+
		"\13!\3!\3!\6!\u00f3\n!\r!\16!\u00f4\5!\u00f7\n!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3\'\5\u00a2\u00b0\u00bd\2(\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\23\'\24"+
		")\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"\3\2\6\4\2C\\c|\b\2$$^^ddppttvv\3\2\62;\5\2\13\f\17\17\"\"\2\u010e\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5U\3\2\2\2\7\\\3\2\2\2\tb\3\2\2\2\13e"+
		"\3\2\2\2\rj\3\2\2\2\17p\3\2\2\2\21\177\3\2\2\2\23\u0082\3\2\2\2\25\u0085"+
		"\3\2\2\2\27\u0087\3\2\2\2\31\u008c\3\2\2\2\33\u0092\3\2\2\2\35\u0095\3"+
		"\2\2\2\37\u0099\3\2\2\2!\u009d\3\2\2\2#\u00a7\3\2\2\2%\u00aa\3\2\2\2\'"+
		"\u00b7\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cc\3\2"+
		"\2\2\61\u00cf\3\2\2\2\63\u00d2\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2"+
		"\29\u00d9\3\2\2\2;\u00db\3\2\2\2=\u00dd\3\2\2\2?\u00e0\3\2\2\2A\u00f6"+
		"\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K"+
		"\u0100\3\2\2\2M\u0102\3\2\2\2OP\7M\2\2PQ\7w\2\2QR\7m\2\2RS\7k\2\2ST\7"+
		"p\2\2T\4\3\2\2\2UV\7d\2\2VW\7k\2\2WX\7i\2\2XY\7q\2\2YZ\7v\2\2Z[\7g\2\2"+
		"[\6\3\2\2\2\\]\7e\2\2]^\7q\2\2^_\7t\2\2_`\7t\2\2`a\7g\2\2a\b\3\2\2\2b"+
		"c\7k\2\2cd\7h\2\2d\n\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\f\3"+
		"\2\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no\7g\2\2o\16\3\2\2\2pq\7n\2"+
		"\2qr\7k\2\2rs\7d\2\2st\7t\2\2tu\7g\2\2uv\7t\2\2vw\7k\2\2wx\7c\2\2xy\7"+
		"\"\2\2yz\7c\2\2z{\7u\2\2{|\7k\2\2|}\7g\2\2}~\7u\2\2~\20\3\2\2\2\177\u0080"+
		"\7(\2\2\u0080\u0081\7(\2\2\u0081\22\3\2\2\2\u0082\u0083\7~\2\2\u0083\u0084"+
		"\7~\2\2\u0084\24\3\2\2\2\u0085\u0086\7#\2\2\u0086\26\3\2\2\2\u0087\u0088"+
		"\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2\u008b"+
		"\30\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\32\3\2\2\2\u0092\u0093\7-\2\2\u0093"+
		"\u0094\7-\2\2\u0094\34\3\2\2\2\u0095\u0096\7/\2\2\u0096\u0097\7/\2\2\u0097"+
		"\36\3\2\2\2\u0098\u009a\t\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c \3\2\2\2\u009d\u00a2"+
		"\7$\2\2\u009e\u00a1\5#\22\2\u009f\u00a1\13\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6"+
		"\"\3\2\2\2\u00a7\u00a8\7^\2\2\u00a8\u00a9\t\3\2\2\u00a9$\3\2\2\2\u00aa"+
		"\u00ab\7\61\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\13"+
		"\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\f"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\23\2\2\u00b6&\3\2\2\2\u00b7\u00b8"+
		"\7\61\2\2\u00b8\u00b9\7,\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\13\2\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1"+
		"\u00c2\7\61\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\24\2\2\u00c4(\3\2\2"+
		"\2\u00c5\u00c6\7@\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8,\3\2\2\2"+
		"\u00c9\u00ca\7@\2\2\u00ca\u00cb\7?\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7>\2"+
		"\2\u00cd\u00ce\7?\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d4\7?\2\2\u00d4\64"+
		"\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8"+
		"8\3\2\2\2\u00d9\u00da\7\61\2\2\u00da:\3\2\2\2\u00db\u00dc\7-\2\2\u00dc"+
		"<\3\2\2\2\u00dd\u00de\7/\2\2\u00de>\3\2\2\2\u00df\u00e1\t\4\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3@\3\2\2\2\u00e4\u00e6\t\4\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ed\7\60\2\2\u00ea\u00ec\t\4\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f2\7\60\2\2\u00f1\u00f3\t\4\2\2\u00f2\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00e5\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7B\3\2\2\2"+
		"\u00f8\u00f9\7}\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7\177\2\2\u00fbF\3\2\2"+
		"\2\u00fc\u00fd\7*\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7+\2\2\u00ffJ\3\2\2\2"+
		"\u0100\u0101\7=\2\2\u0101L\3\2\2\2\u0102\u0103\t\5\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\b\'\2\2\u0105N\3\2\2\2\r\2\u009b\u00a0\u00a2\u00b0\u00bd"+
		"\u00e2\u00e7\u00ed\u00f4\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}