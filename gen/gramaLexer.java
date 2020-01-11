// Generated from C:/Users/kotyn/Desktop/jarInvader/src/main/antlr4\grama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DECL=18, WS=19, WSO=20, STH=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"DECL", "WS", "WSO", "STH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'--i '", "'--list-packages'", "'--list-classes'", "'--list-methods '", 
			"'--list-fields '", "'--list-ctors '", "'add-package '", "'add-class '", 
			"'add-interface '", "'add-method '", "'add-field '", "'add-ctor '", "'set-method-body '", 
			"'add-before-method'", "'add-after-method'", "'set-ctor-body'", "'--o '", 
			null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "DECL", "WS", "WSO", "STH"
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


	public gramaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grama.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0110\n\23"+
		"\f\23\16\23\u0113\13\23\3\23\3\23\3\24\6\24\u0118\n\24\r\24\16\24\u0119"+
		"\3\24\3\24\3\25\3\25\3\26\6\26\u0121\n\26\r\26\16\26\u0122\2\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27\3\2\4\4\2\13\f\17\17\b\2*+/\60\62;C\\aac|\2"+
		"\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5"+
		"\62\3\2\2\2\7B\3\2\2\2\tQ\3\2\2\2\13a\3\2\2\2\rp\3\2\2\2\17~\3\2\2\2\21"+
		"\u008b\3\2\2\2\23\u0096\3\2\2\2\25\u00a5\3\2\2\2\27\u00b1\3\2\2\2\31\u00bc"+
		"\3\2\2\2\33\u00c6\3\2\2\2\35\u00d7\3\2\2\2\37\u00e9\3\2\2\2!\u00fa\3\2"+
		"\2\2#\u0108\3\2\2\2%\u010d\3\2\2\2\'\u0117\3\2\2\2)\u011d\3\2\2\2+\u0120"+
		"\3\2\2\2-.\7/\2\2./\7/\2\2/\60\7k\2\2\60\61\7\"\2\2\61\4\3\2\2\2\62\63"+
		"\7/\2\2\63\64\7/\2\2\64\65\7n\2\2\65\66\7k\2\2\66\67\7u\2\2\678\7v\2\2"+
		"89\7/\2\29:\7r\2\2:;\7c\2\2;<\7e\2\2<=\7m\2\2=>\7c\2\2>?\7i\2\2?@\7g\2"+
		"\2@A\7u\2\2A\6\3\2\2\2BC\7/\2\2CD\7/\2\2DE\7n\2\2EF\7k\2\2FG\7u\2\2GH"+
		"\7v\2\2HI\7/\2\2IJ\7e\2\2JK\7n\2\2KL\7c\2\2LM\7u\2\2MN\7u\2\2NO\7g\2\2"+
		"OP\7u\2\2P\b\3\2\2\2QR\7/\2\2RS\7/\2\2ST\7n\2\2TU\7k\2\2UV\7u\2\2VW\7"+
		"v\2\2WX\7/\2\2XY\7o\2\2YZ\7g\2\2Z[\7v\2\2[\\\7j\2\2\\]\7q\2\2]^\7f\2\2"+
		"^_\7u\2\2_`\7\"\2\2`\n\3\2\2\2ab\7/\2\2bc\7/\2\2cd\7n\2\2de\7k\2\2ef\7"+
		"u\2\2fg\7v\2\2gh\7/\2\2hi\7h\2\2ij\7k\2\2jk\7g\2\2kl\7n\2\2lm\7f\2\2m"+
		"n\7u\2\2no\7\"\2\2o\f\3\2\2\2pq\7/\2\2qr\7/\2\2rs\7n\2\2st\7k\2\2tu\7"+
		"u\2\2uv\7v\2\2vw\7/\2\2wx\7e\2\2xy\7v\2\2yz\7q\2\2z{\7t\2\2{|\7u\2\2|"+
		"}\7\"\2\2}\16\3\2\2\2~\177\7c\2\2\177\u0080\7f\2\2\u0080\u0081\7f\2\2"+
		"\u0081\u0082\7/\2\2\u0082\u0083\7r\2\2\u0083\u0084\7c\2\2\u0084\u0085"+
		"\7e\2\2\u0085\u0086\7m\2\2\u0086\u0087\7c\2\2\u0087\u0088\7i\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7\"\2\2\u008a\20\3\2\2\2\u008b\u008c\7c\2\2"+
		"\u008c\u008d\7f\2\2\u008d\u008e\7f\2\2\u008e\u008f\7/\2\2\u008f\u0090"+
		"\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7\"\2\2\u0095\22\3\2\2\2\u0096\u0097\7c\2\2"+
		"\u0097\u0098\7f\2\2\u0098\u0099\7f\2\2\u0099\u009a\7/\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7t\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7e\2\2"+
		"\u00a2\u00a3\7g\2\2\u00a3\u00a4\7\"\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7"+
		"c\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa"+
		"\7o\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7\"\2\2\u00b0\26\3\2\2\2"+
		"\u00b1\u00b2\7c\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5"+
		"\7/\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7\"\2\2\u00bb\30\3\2\2\2"+
		"\u00bc\u00bd\7c\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7t\2\2\u00c4\u00c5\7\"\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7u\2\2"+
		"\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb"+
		"\7o\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7j\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\7d\2\2"+
		"\u00d2\u00d3\7q\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6"+
		"\7\"\2\2\u00d6\34\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7f\2\2\u00d9"+
		"\u00da\7f\2\2\u00da\u00db\7/\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7h\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7/\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7f\2\2"+
		"\u00e8\36\3\2\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7"+
		"f\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7/\2\2\u00f3"+
		"\u00f4\7o\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7j\2\2"+
		"\u00f7\u00f8\7q\2\2\u00f8\u00f9\7f\2\2\u00f9 \3\2\2\2\u00fa\u00fb\7u\2"+
		"\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7/\2\2\u00fe\u00ff"+
		"\7e\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102"+
		"\u0103\7/\2\2\u0103\u0104\7d\2\2\u0104\u0105\7q\2\2\u0105\u0106\7f\2\2"+
		"\u0106\u0107\7{\2\2\u0107\"\3\2\2\2\u0108\u0109\7/\2\2\u0109\u010a\7/"+
		"\2\2\u010a\u010b\7q\2\2\u010b\u010c\7\"\2\2\u010c$\3\2\2\2\u010d\u0111"+
		"\7]\2\2\u010e\u0110\13\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0115\7_\2\2\u0115&\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\b\24\2\2\u011c(\3\2\2\2\u011d\u011e\7\"\2\2"+
		"\u011e*\3\2\2\2\u011f\u0121\t\3\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123,\3\2\2\2\6\2\u0111"+
		"\u0119\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}