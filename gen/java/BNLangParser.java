// Generated from /Users/vl7sha/Projects/VibeCoding/build-my-compilator-osorgin/BNLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BNLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, IF=3, THEN=4, ELSE=5, FOR=6, TO=7, DO=8, WHILE=9, READ=10, 
		WRITE=11, TRUE=12, FALSE=13, NE=14, EQ=15, LT=16, LE=17, GT=18, GE=19, 
		PLUS=20, MIN=21, OR=22, MULT=23, DIV=24, AND=25, ASS=26, TILDE=27, LPAREN=28, 
		RPAREN=29, COMMA=30, SEMI=31, COLON=32, DOT=33, PERCENT=34, BANG=35, DOLLAR=36, 
		INT_BIN=37, INT_OCT=38, INT_DEC=39, INT_HEX=40, REAL=41, IDENT=42, COMMENT=43, 
		NEWLINE=44, WS=45;
	public static final int
		RULE_program = 0, RULE_sep = 1, RULE_item = 2, RULE_description = 3, RULE_idList = 4, 
		RULE_type = 5, RULE_statement = 6, RULE_stmtSep = 7, RULE_simpleStmt = 8, 
		RULE_assignment = 9, RULE_ifStmt = 10, RULE_forStmt = 11, RULE_whileStmt = 12, 
		RULE_readStmt = 13, RULE_writeStmt = 14, RULE_expr = 15, RULE_operand = 16, 
		RULE_term = 17, RULE_factor = 18, RULE_number = 19, RULE_boolConst = 20, 
		RULE_relOp = 21, RULE_addOp = 22, RULE_mulOp = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sep", "item", "description", "idList", "type", "statement", 
			"stmtSep", "simpleStmt", "assignment", "ifStmt", "forStmt", "whileStmt", 
			"readStmt", "writeStmt", "expr", "operand", "term", "factor", "number", 
			"boolConst", "relOp", "addOp", "mulOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'if'", "'then'", "'else'", "'for'", "'to'", 
			"'do'", "'while'", "'read'", "'write'", "'true'", "'false'", null, null, 
			null, null, null, null, "'plus'", "'min'", "'or'", "'mult'", "'div'", 
			"'and'", "'ass'", "'~'", "'('", "')'", "','", "';'", "':'", "'.'", "'%'", 
			"'!'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "END", "IF", "THEN", "ELSE", "FOR", "TO", "DO", "WHILE", 
			"READ", "WRITE", "TRUE", "FALSE", "NE", "EQ", "LT", "LE", "GT", "GE", 
			"PLUS", "MIN", "OR", "MULT", "DIV", "AND", "ASS", "TILDE", "LPAREN", 
			"RPAREN", "COMMA", "SEMI", "COLON", "DOT", "PERCENT", "BANG", "DOLLAR", 
			"INT_BIN", "INT_OCT", "INT_DEC", "INT_HEX", "REAL", "IDENT", "COMMENT", 
			"NEWLINE", "WS"
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
	public String getGrammarFileName() { return "BNLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BNLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(BNLangParser.BEGIN, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode END() { return getToken(BNLangParser.END, 0); }
		public TerminalNode EOF() { return getToken(BNLangParser.EOF, 0); }
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(BEGIN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NEWLINE) {
				{
				{
				setState(49);
				sep();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			item();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(56);
						sep();
						}
						}
						setState(59); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMI || _la==NEWLINE );
					setState(61);
					item();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NEWLINE) {
				{
				{
				setState(68);
				sep();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(END);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NEWLINE) {
				{
				{
				setState(75);
				sep();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SepContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(BNLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BNLangParser.SEMI, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BNLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BNLangParser.NEWLINE, i);
		}
		public SepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SepContext sep() throws RecognitionException {
		SepContext _localctx = new SepContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sep);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					_la = _input.LA(1);
					if ( !(_la==SEMI || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_item);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				description();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BNLangParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			idList();
			setState(93);
			match(COLON);
			setState(94);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(BNLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(BNLangParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BNLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BNLangParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENT);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				match(IDENT);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(BNLangParser.PERCENT, 0); }
		public TerminalNode BANG() { return getToken(BNLangParser.BANG, 0); }
		public TerminalNode DOLLAR() { return getToken(BNLangParser.DOLLAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public List<StmtSepContext> stmtSep() {
			return getRuleContexts(StmtSepContext.class);
		}
		public StmtSepContext stmtSep(int i) {
			return getRuleContext(StmtSepContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			simpleStmt();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					stmtSep();
					setState(108);
					simpleStmt();
					}
					} 
				}
				setState(114);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtSepContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(BNLangParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BNLangParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BNLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BNLangParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BNLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BNLangParser.SEMI, i);
		}
		public StmtSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtSep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitStmtSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtSepContext stmtSep() throws RecognitionException {
		StmtSepContext _localctx = new StmtSepContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmtSep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17598628495360L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17598628495360L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleStmt);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				ifStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				forStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				whileStmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				readStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				writeStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(BNLangParser.IDENT, 0); }
		public TerminalNode ASS() { return getToken(BNLangParser.ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IDENT);
			setState(129);
			match(ASS);
			setState(130);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BNLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BNLangParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BNLangParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IF);
			setState(133);
			expr();
			setState(134);
			match(THEN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NEWLINE) {
				{
				{
				setState(135);
				sep();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			statement();
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==NEWLINE) {
					{
					{
					setState(142);
					sep();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(ELSE);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==NEWLINE) {
					{
					{
					setState(149);
					sep();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				statement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BNLangParser.FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TO() { return getToken(BNLangParser.TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(BNLangParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FOR);
			setState(159);
			assignment();
			setState(160);
			match(TO);
			setState(161);
			expr();
			setState(162);
			match(DO);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NEWLINE) {
				{
				{
				setState(163);
				sep();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BNLangParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(BNLangParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<SepContext> sep() {
			return getRuleContexts(SepContext.class);
		}
		public SepContext sep(int i) {
			return getRuleContext(SepContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WHILE);
			setState(172);
			expr();
			setState(173);
			match(DO);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==NEWLINE) {
				{
				{
				setState(174);
				sep();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BNLangParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(BNLangParser.LPAREN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(BNLangParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(BNLangParser.IDENT, i);
		}
		public TerminalNode RPAREN() { return getToken(BNLangParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BNLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BNLangParser.COMMA, i);
		}
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(READ);
			setState(183);
			match(LPAREN);
			setState(184);
			match(IDENT);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				match(IDENT);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(BNLangParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(BNLangParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(BNLangParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BNLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BNLangParser.COMMA, i);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_writeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WRITE);
			setState(195);
			match(LPAREN);
			setState(196);
			expr();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				expr();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<RelOpContext> relOp() {
			return getRuleContexts(RelOpContext.class);
		}
		public RelOpContext relOp(int i) {
			return getRuleContext(RelOpContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			operand();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
				{
				{
				setState(207);
				relOp();
				setState(208);
				operand();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			term();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(216);
				addOp();
				setState(217);
				term();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			factor();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				{
				setState(225);
				mulOp();
				setState(226);
				factor();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(BNLangParser.IDENT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(BNLangParser.TILDE, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BNLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BNLangParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENT);
				}
				break;
			case INT_BIN:
			case INT_OCT:
			case INT_DEC:
			case INT_HEX:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				boolConst();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(TILDE);
				setState(237);
				factor();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(LPAREN);
				setState(239);
				expr();
				setState(240);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(BNLangParser.REAL, 0); }
		public TerminalNode INT_BIN() { return getToken(BNLangParser.INT_BIN, 0); }
		public TerminalNode INT_OCT() { return getToken(BNLangParser.INT_OCT, 0); }
		public TerminalNode INT_DEC() { return getToken(BNLangParser.INT_DEC, 0); }
		public TerminalNode INT_HEX() { return getToken(BNLangParser.INT_HEX, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260607557632L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolConstContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BNLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BNLangParser.FALSE, 0); }
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode NE() { return getToken(BNLangParser.NE, 0); }
		public TerminalNode EQ() { return getToken(BNLangParser.EQ, 0); }
		public TerminalNode LT() { return getToken(BNLangParser.LT, 0); }
		public TerminalNode LE() { return getToken(BNLangParser.LE, 0); }
		public TerminalNode GT() { return getToken(BNLangParser.GT, 0); }
		public TerminalNode GE() { return getToken(BNLangParser.GE, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BNLangParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(BNLangParser.MIN, 0); }
		public TerminalNode OR() { return getToken(BNLangParser.OR, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(BNLangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(BNLangParser.DIV, 0); }
		public TerminalNode AND() { return getToken(BNLangParser.AND, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BNLangVisitor ) return ((BNLangVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001-\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0000\u0001\u0000\u0005"+
		"\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000\u0005\u0000F\b\u0000"+
		"\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000M\b\u0000"+
		"\n\u0000\f\u0000P\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"U\b\u0001\u000b\u0001\f\u0001V\u0001\u0002\u0001\u0002\u0003\u0002[\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006o\b\u0006\n\u0006\f\u0006r\t\u0006\u0001\u0007\u0004\u0007u\b\u0007"+
		"\u000b\u0007\f\u0007v\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u007f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0089\b\n\n\n\f\n\u008c\t\n\u0001\n\u0001\n\u0005\n"+
		"\u0090\b\n\n\n\f\n\u0093\t\n\u0001\n\u0001\n\u0005\n\u0097\b\n\n\n\f\n"+
		"\u009a\t\n\u0001\n\u0003\n\u009d\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a5\b\u000b\n\u000b"+
		"\f\u000b\u00a8\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00b0\b\f\n\f\f\f\u00b3\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bc\b\r\n\r\f\r\u00bf\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00c8\b\u000e\n\u000e\f\u000e\u00cb\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d3\b\u000f"+
		"\n\u000f\f\u000f\u00d6\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00dc\b\u0010\n\u0010\f\u0010\u00df\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00e5\b\u0011\n\u0011"+
		"\f\u0011\u00e8\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00f3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\b\u0002\u0000\u001f\u001f"+
		",,\u0001\u0000\"$\u0002\u0000\u001f ,,\u0001\u0000%)\u0001\u0000\f\r\u0001"+
		"\u0000\u000e\u0013\u0001\u0000\u0014\u0016\u0001\u0000\u0017\u0019\u0104"+
		"\u00000\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004Z"+
		"\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\b`\u0001\u0000"+
		"\u0000\u0000\nh\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000e"+
		"t\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0080\u0001"+
		"\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u009e\u0001"+
		"\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a\u00b6\u0001"+
		"\u0000\u0000\u0000\u001c\u00c2\u0001\u0000\u0000\u0000\u001e\u00ce\u0001"+
		"\u0000\u0000\u0000 \u00d7\u0001\u0000\u0000\u0000\"\u00e0\u0001\u0000"+
		"\u0000\u0000$\u00f2\u0001\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000"+
		"(\u00f6\u0001\u0000\u0000\u0000*\u00f8\u0001\u0000\u0000\u0000,\u00fa"+
		"\u0001\u0000\u0000\u0000.\u00fc\u0001\u0000\u0000\u000004\u0005\u0001"+
		"\u0000\u000013\u0003\u0002\u0001\u000021\u0001\u0000\u0000\u000036\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"57\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007A\u0003\u0004\u0002"+
		"\u00008:\u0003\u0002\u0001\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=>\u0003\u0004\u0002\u0000>@\u0001\u0000\u0000\u0000"+
		"?9\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BG\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JN\u0005\u0002\u0000"+
		"\u0000KM\u0003\u0002\u0001\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0000\u0000\u0001"+
		"R\u0001\u0001\u0000\u0000\u0000SU\u0007\u0000\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\u0003\u0001\u0000\u0000\u0000X[\u0003\u0006\u0003"+
		"\u0000Y[\u0003\f\u0006\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\u0005\u0001\u0000\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0005 "+
		"\u0000\u0000^_\u0003\n\u0005\u0000_\u0007\u0001\u0000\u0000\u0000`e\u0005"+
		"*\u0000\u0000ab\u0005\u001e\u0000\u0000bd\u0005*\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hi\u0007\u0001\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jp\u0003\u0010"+
		"\b\u0000kl\u0003\u000e\u0007\u0000lm\u0003\u0010\b\u0000mo\u0001\u0000"+
		"\u0000\u0000nk\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000su\u0007\u0002\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000w\u000f\u0001\u0000\u0000\u0000x\u007f\u0003\u0012\t\u0000"+
		"y\u007f\u0003\u0014\n\u0000z\u007f\u0003\u0016\u000b\u0000{\u007f\u0003"+
		"\u0018\f\u0000|\u007f\u0003\u001a\r\u0000}\u007f\u0003\u001c\u000e\u0000"+
		"~x\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000"+
		"\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0005*\u0000"+
		"\u0000\u0081\u0082\u0005\u001a\u0000\u0000\u0082\u0083\u0003\u001e\u000f"+
		"\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0003\u0000"+
		"\u0000\u0085\u0086\u0003\u001e\u000f\u0000\u0086\u008a\u0005\u0004\u0000"+
		"\u0000\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u009c\u0003\f\u0006\u0000"+
		"\u008e\u0090\u0003\u0002\u0001\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0098\u0005\u0005\u0000\u0000"+
		"\u0095\u0097\u0003\u0002\u0001\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0003\f\u0006\u0000\u009c"+
		"\u0091\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u0015\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f"+
		"\u00a0\u0003\u0012\t\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a2"+
		"\u0003\u001e\u000f\u0000\u00a2\u00a6\u0005\b\u0000\u0000\u00a3\u00a5\u0003"+
		"\u0002\u0001\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0003\f\u0006\u0000\u00aa\u0017\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u00ad\u0003\u001e\u000f"+
		"\u0000\u00ad\u00b1\u0005\b\u0000\u0000\u00ae\u00b0\u0003\u0002\u0001\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0003\f\u0006\u0000\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005\n\u0000\u0000\u00b7\u00b8\u0005\u001c\u0000\u0000\u00b8\u00bd"+
		"\u0005*\u0000\u0000\u00b9\u00ba\u0005\u001e\u0000\u0000\u00ba\u00bc\u0005"+
		"*\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u001d\u0000\u0000\u00c1\u001b\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u000b\u0000\u0000\u00c3\u00c4\u0005\u001c"+
		"\u0000\u0000\u00c4\u00c9\u0003\u001e\u000f\u0000\u00c5\u00c6\u0005\u001e"+
		"\u0000\u0000\u00c6\u00c8\u0003\u001e\u000f\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001d"+
		"\u0000\u0000\u00cd\u001d\u0001\u0000\u0000\u0000\u00ce\u00d4\u0003 \u0010"+
		"\u0000\u00cf\u00d0\u0003*\u0015\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00dd\u0003\"\u0011\u0000\u00d8\u00d9"+
		"\u0003,\u0016\u0000\u00d9\u00da\u0003\"\u0011\u0000\u00da\u00dc\u0001"+
		"\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc\u00df\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de!\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e6\u0003$\u0012\u0000\u00e1\u00e2\u0003.\u0017\u0000"+
		"\u00e2\u00e3\u0003$\u0012\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"#\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00f3"+
		"\u0005*\u0000\u0000\u00ea\u00f3\u0003&\u0013\u0000\u00eb\u00f3\u0003("+
		"\u0014\u0000\u00ec\u00ed\u0005\u001b\u0000\u0000\u00ed\u00f3\u0003$\u0012"+
		"\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000\u00ef\u00f0\u0003\u001e\u000f"+
		"\u0000\u00f0\u00f1\u0005\u001d\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f2\u00eb\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f3%\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0007\u0003\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0007\u0004\u0000\u0000\u00f7)\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0007\u0005\u0000\u0000\u00f9+\u0001\u0000\u0000\u0000\u00fa\u00fb\u0007"+
		"\u0006\u0000\u0000\u00fb-\u0001\u0000\u0000\u0000\u00fc\u00fd\u0007\u0007"+
		"\u0000\u0000\u00fd/\u0001\u0000\u0000\u0000\u00174;AGNVZepv~\u008a\u0091"+
		"\u0098\u009c\u00a6\u00b1\u00bd\u00c9\u00d4\u00dd\u00e6\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}