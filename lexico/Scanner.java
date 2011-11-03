/* The following code was generated by JFlex 1.4.1 on 2/11/11 13:00 */

package lexico;

import sintactico.sym;

/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a>
 * 1.4.1 on 2/11/11 13:00 from the specification file
 * <tt>C:/Users/admin/Desktop/Interprete-basic/lexico/lexico.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

	/** This character denotes the end of file */
	public static final int YYEOF = -1;

	/** initial size of the lookahead buffer */
	private static final int ZZ_BUFFERSIZE = 16384;

	/** lexical states */
	public static final int YYINITIAL = 0;

	/**
	 * Translates characters to character classes
	 */
	private static final char[] ZZ_CMAP = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 4, 0,
			0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0,
			7, 0, 0, 57, 0, 15, 58, 59, 54, 52, 63, 53, 2, 55, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 0, 62, 49, 51, 50, 0, 0, 48, 3, 23, 24, 13, 32, 46,
			36, 31, 3, 3, 39, 14, 28, 22, 21, 3, 12, 40, 35, 25, 3, 42, 44, 3,
			3, 60, 0, 61, 56, 0, 0, 47, 3, 18, 19, 10, 30, 45, 34, 29, 3, 3,
			37, 11, 26, 17, 16, 3, 9, 38, 33, 20, 3, 41, 43, 3, 3, 0, 8, 0, 0,
			0 };

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 = "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\1"
			+ "\4\3\1\1\26\3\1\6\1\7\1\10\1\11\1\12"
			+ "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"
			+ "\1\23\1\24\1\0\1\4\1\0\1\25\6\3\1\0"
			+ "\1\3\1\26\1\27\6\3\1\30\5\3\1\31\12\3"
			+ "\1\32\1\33\1\34\1\35\1\36\1\0\1\3\1\37"
			+ "\1\3\1\37\1\3\1\40\1\0\5\3\1\41\3\3"
			+ "\1\42\16\3\1\43\1\0\2\3\1\44\1\0\2\3"
			+ "\1\40\4\3\1\45\6\3\1\46\2\3\1\47\4\3"
			+ "\1\0\1\50\1\3\1\0\2\3\1\51\1\3\1\52"
			+ "\1\3\1\53\1\3\1\0\1\3\1\0\1\3\1\54"
			+ "\1\0\1\3\1\0\5\3\1\0\1\55\2\0\1\3"
			+ "\1\0\3\3\1\56\3\0\1\57\1\0\2\3\4\0" + "\1\60\4\0\1\61\4\0\1\62";

	private static int[] zzUnpackAction() {
		int[] result = new int[209];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\100\0\200\0\300\0\u0100\0\u0140\0\u0180\0\u01c0"
			+ "\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\u0340\0\u0380\0\u03c0"
			+ "\0\u0400\0\u0440\0\u0480\0\u04c0\0\u0500\0\u0540\0\u0580\0\u05c0"
			+ "\0\u0600\0\u0640\0\u0680\0\u06c0\0\u0700\0\u0740\0\u0780\0\u07c0"
			+ "\0\u0800\0\u0840\0\u0880\0\u08c0\0\u0900\0\u0940\0\100\0\100"
			+ "\0\100\0\100\0\100\0\100\0\100\0\100\0\100\0\100"
			+ "\0\100\0\100\0\u0980\0\u09c0\0\u01c0\0\100\0\u0a00\0\u0a40"
			+ "\0\u0a80\0\u0ac0\0\u0b00\0\u0b40\0\u0b80\0\u0bc0\0\300\0\300"
			+ "\0\u0c00\0\u0c40\0\u0c80\0\u0cc0\0\u0d00\0\u0d40\0\300\0\u0d80"
			+ "\0\u0dc0\0\u0e00\0\u0e40\0\u0e80\0\300\0\u0ec0\0\u0f00\0\u0f40"
			+ "\0\u0f80\0\u0fc0\0\u1000\0\u1040\0\u1080\0\u10c0\0\u1100\0\100"
			+ "\0\100\0\100\0\100\0\u0980\0\u0140\0\u1140\0\u1180\0\u11c0"
			+ "\0\u1200\0\u1240\0\u1280\0\u12c0\0\u1300\0\u1340\0\u1380\0\u13c0"
			+ "\0\u1400\0\300\0\u1440\0\u1480\0\u14c0\0\300\0\u1500\0\u1540"
			+ "\0\u1580\0\u15c0\0\u1600\0\u1640\0\u1680\0\u16c0\0\u1700\0\u1740"
			+ "\0\u1780\0\u17c0\0\u1800\0\u1840\0\300\0\u1880\0\u18c0\0\u1900"
			+ "\0\300\0\u1940\0\u1980\0\u19c0\0\u1a00\0\u1a40\0\u1a80\0\u1ac0"
			+ "\0\u1b00\0\300\0\u1b40\0\u1b80\0\u1bc0\0\u1c00\0\u1c40\0\u1c80"
			+ "\0\300\0\u1cc0\0\u1d00\0\300\0\u1d40\0\u1d80\0\u1dc0\0\u1e00"
			+ "\0\u1e40\0\300\0\u1e80\0\u1ec0\0\u1f00\0\u1f40\0\300\0\u1f80"
			+ "\0\300\0\u1fc0\0\300\0\u2000\0\u2040\0\u2080\0\u20c0\0\u2100"
			+ "\0\300\0\u2140\0\u2180\0\u21c0\0\u2200\0\u2240\0\u2280\0\u22c0"
			+ "\0\u2300\0\u2340\0\300\0\u2380\0\u23c0\0\u2400\0\u2440\0\u2480"
			+ "\0\u24c0\0\u2500\0\300\0\u2540\0\u2580\0\u25c0\0\300\0\u2600"
			+ "\0\u2640\0\u2680\0\u26c0\0\u2700\0\u2740\0\u2780\0\300\0\u27c0"
			+ "\0\u2800\0\u2840\0\u2880\0\100\0\u28c0\0\u2900\0\u2940\0\u2980"
			+ "\0\100";

	private static int[] zzUnpackRowMap() {
		int[] result = new int[209];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 = "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"
			+ "\1\2\1\11\1\12\1\4\1\13\1\14\1\4\1\15"
			+ "\1\16\1\17\1\4\1\20\1\4\1\21\1\22\1\4"
			+ "\1\23\1\4\1\24\1\7\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\4\1\33\1\4\1\34\1\35\1\36"
			+ "\1\37\1\40\1\41\4\4\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"
			+ "\1\56\1\57\1\60\1\61\1\62\101\0\1\3\1\63"
			+ "\76\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\25\4\23\0\1\5\1\64\76\0\1\64\101\0"
			+ "\1\7\24\0\1\7\44\0\4\65\2\0\1\65\1\66"
			+ "\1\0\61\65\2\0\4\65\1\0\1\4\1\0\1\4"
			+ "\5\0\1\4\1\67\4\4\1\0\13\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\12\4"
			+ "\1\70\1\0\11\4\1\71\13\4\20\0\1\4\1\0"
			+ "\1\4\5\0\4\4\1\72\1\4\1\0\13\4\1\0"
			+ "\25\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\13\4\1\0\1\73\12\4\1\74\11\4\25\0\1\75"
			+ "\24\0\1\75\45\0\1\4\1\0\1\4\5\0\1\76"
			+ "\5\4\1\0\13\4\1\0\25\4\20\0\1\4\1\0"
			+ "\1\4\5\0\1\77\5\4\1\0\13\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\1\4"
			+ "\1\100\11\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\3\4\1\101\2\4\1\0\13\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\3\4\1\77\2\4"
			+ "\1\0\13\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\6\4\1\100\4\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\1\4\1\102\4\4"
			+ "\1\0\1\4\1\103\11\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\4\4\1\104\1\4\1\0\6\4"
			+ "\1\105\4\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\12\4\1\106\1\0\2\4\1\107"
			+ "\22\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\1\4\1\110\11\4\1\0\11\4\1\111\13\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\13\4\1\0"
			+ "\1\112\3\4\1\107\20\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\6\4\1\113\4\4\1\0\13\4"
			+ "\1\114\11\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\1\4\1\115\11\4\1\0\6\4\1\116\16\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\6\4"
			+ "\1\115\4\4\1\0\10\4\1\117\14\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\1\4\1\120\11\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\5\4\1\121\17\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\6\4\1\122\4\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\7\4\1\123\15\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\13\4\1\0\6\4"
			+ "\1\124\16\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\10\4\1\125\14\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\12\4\1\126\1\0"
			+ "\25\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\13\4\1\0\1\127\24\4\101\0\1\130\1\131\77\0"
			+ "\1\132\77\0\1\133\15\0\1\134\102\0\1\5\1\135"
			+ "\73\0\1\4\1\0\1\4\5\0\2\4\1\136\3\4"
			+ "\1\0\13\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\3\4\1\137\7\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\12\4\1\140\12\4\20\0\1\4\1\0\1\4"
			+ "\5\0\5\4\1\136\1\0\13\4\1\0\25\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\10\4\1\141"
			+ "\2\4\1\0\25\4\20\0\1\4\1\0\1\4\5\0"
			+ "\6\4\1\0\13\4\1\0\14\4\1\142\10\4\17\0"
			+ "\4\75\1\143\1\144\72\75\1\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\1\4\1\145\11\4\1\0\1\4"
			+ "\1\146\23\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\6\4\1\147\4\4\1\0\3\4\1\150\21\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\17\4\1\151\5\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\5\4\1\152\17\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\20\4\1\153\4\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\7\4\1\152\15\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\1\154"
			+ "\12\4\1\0\5\4\1\155\17\4\20\0\1\4\1\0"
			+ "\1\4\5\0\1\156\5\4\1\0\13\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\1\4"
			+ "\1\157\11\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\5\4\1\160\5\4\1\0\7\4"
			+ "\1\161\15\4\20\0\1\4\1\0\1\4\5\0\3\4"
			+ "\1\156\2\4\1\0\13\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\6\4\1\162\4\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\1\4"
			+ "\1\163\4\4\1\0\13\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\4\4\1\164\1\4\1\0\13\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\1\4\1\165\11\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\1\166\1\167\4\4\1\0\13\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\6\4\1\170\4\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\3\4\1\171\1\172\1\4\1\0"
			+ "\13\4\1\0\25\4\20\0\1\4\1\0\1\4\5\0"
			+ "\6\4\1\0\13\4\1\0\1\4\1\173\23\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\13\4\1\0"
			+ "\3\4\1\174\21\4\20\0\1\4\1\0\1\4\5\0"
			+ "\6\4\1\0\3\4\1\175\7\4\1\0\25\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\10\4\1\175"
			+ "\2\4\1\0\25\4\20\0\1\4\1\0\1\4\2\0"
			+ "\1\75\2\0\6\4\1\0\13\4\1\75\25\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\13\4\1\176"
			+ "\1\4\1\177\13\4\1\200\7\4\20\0\1\4\1\0"
			+ "\1\4\5\0\1\4\1\201\4\4\1\0\13\4\1\0"
			+ "\25\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\13\4\1\202\3\4\1\203\12\4\1\204\6\4\20\0"
			+ "\1\4\1\0\1\4\5\0\4\4\1\201\1\4\1\0"
			+ "\13\4\1\0\25\4\23\0\1\143\1\205\76\0\1\205"
			+ "\74\0\1\4\1\0\1\4\5\0\6\4\1\0\2\4"
			+ "\1\206\10\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\12\4\1\207\1\0\25\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\7\4\1\210"
			+ "\3\4\1\0\25\4\20\0\1\4\1\0\1\4\5\0"
			+ "\6\4\1\0\13\4\1\0\1\211\24\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\13\4\1\0\5\4"
			+ "\1\212\17\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\7\4\1\212\15\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\4\4\1\213\6\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\1\4"
			+ "\1\214\4\4\1\0\13\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\13\4\1\0\23\4"
			+ "\1\215\1\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\11\4\1\216\1\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\4\4\1\217\1\4\1\0\13\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\24\4\1\220\20\0\1\4\1\0"
			+ "\1\4\5\0\6\4\1\0\12\4\1\221\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\1\221\24\4\20\0\1\4\1\0\1\4\5\0"
			+ "\6\4\1\0\1\222\12\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\13\4\1\0\1\4"
			+ "\1\223\23\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\1\224\12\4\1\0\25\4\20\0\1\4\1\0"
			+ "\1\4\5\0\6\4\1\0\5\4\1\225\5\4\1\0"
			+ "\25\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\13\4\1\0\3\4\1\226\21\4\20\0\1\4\1\0"
			+ "\1\4\5\0\6\4\1\0\5\4\1\224\5\4\1\0"
			+ "\25\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\13\4\1\0\11\4\1\227\13\4\20\0\1\4\1\0"
			+ "\1\4\5\0\6\4\1\0\13\4\1\0\13\4\1\230"
			+ "\11\4\37\0\1\231\60\0\1\4\1\0\1\4\5\0"
			+ "\6\4\1\0\13\4\1\0\2\4\1\232\22\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\13\4\1\0"
			+ "\6\4\1\233\16\4\44\0\1\234\53\0\1\4\1\0"
			+ "\1\4\5\0\6\4\1\0\13\4\1\0\4\4\1\232"
			+ "\20\4\20\0\1\4\1\0\1\4\5\0\6\4\1\0"
			+ "\13\4\1\0\10\4\1\235\14\4\23\0\1\143\1\144"
			+ "\73\0\1\4\1\0\1\4\5\0\1\4\1\236\4\4"
			+ "\1\0\13\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\5\4\1\237\17\4"
			+ "\20\0\1\4\1\0\1\4\5\0\4\4\1\240\1\4"
			+ "\1\0\13\4\1\0\25\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\7\4\1\237\15\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\5\4\1\241\17\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\21\4\1\242\3\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\5\4\1\243\17\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\7\4\1\241\15\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\22\4\1\244\2\4\20\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\7\4\1\243\15\4"
			+ "\20\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\245\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\12\4\1\246\1\0\25\4\20\0\1\4\1\0"
			+ "\1\4\5\0\6\4\1\0\13\4\1\247\25\4\20\0"
			+ "\1\4\1\0\1\4\5\0\6\4\1\0\13\4\1\0"
			+ "\1\250\24\4\20\0\1\4\1\0\1\4\5\0\1\4"
			+ "\1\251\4\4\1\0\13\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\4\4\1\251\1\4\1\0\13\4"
			+ "\1\0\25\4\30\0\1\252\67\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\1\4\1\253\23\4"
			+ "\33\0\1\254\64\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\3\4\1\255\21\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\3\4\1\256\7\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\10\4\1\257\2\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\1\4\1\260\4\4\1\0\13\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\4\4"
			+ "\1\261\1\4\1\0\13\4\1\0\25\4\43\0\1\262"
			+ "\54\0\1\4\1\0\1\4\5\0\6\4\1\0\13\4"
			+ "\1\0\21\4\1\263\3\4\50\0\1\264\47\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\13\4\1\0\22\4"
			+ "\1\263\2\4\40\0\1\265\57\0\1\4\1\0\1\4"
			+ "\5\0\6\4\1\0\13\4\1\0\11\4\1\266\13\4"
			+ "\45\0\1\267\52\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\13\4\1\0\13\4\1\270\11\4\20\0\1\4"
			+ "\1\0\1\4\5\0\6\4\1\0\4\4\1\271\6\4"
			+ "\1\0\25\4\20\0\1\4\1\0\1\4\5\0\6\4"
			+ "\1\0\11\4\1\272\1\4\1\0\25\4\20\0\1\4"
			+ "\1\0\1\4\5\0\1\273\5\4\1\0\13\4\1\0"
			+ "\25\4\20\0\1\4\1\0\1\4\5\0\3\4\1\273"
			+ "\2\4\1\0\13\4\1\0\25\4\51\0\1\274\101\0"
			+ "\1\275\65\0\1\276\56\0\1\4\1\0\1\4\5\0"
			+ "\1\4\1\277\4\4\1\0\13\4\1\0\25\4\46\0"
			+ "\1\300\51\0\1\4\1\0\1\4\5\0\4\4\1\277"
			+ "\1\4\1\0\13\4\1\0\25\4\20\0\1\4\1\0"
			+ "\1\4\5\0\1\301\5\4\1\0\13\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\3\4\1\302\2\4"
			+ "\1\0\13\4\1\0\25\4\60\0\1\303\101\0\1\304"
			+ "\46\0\1\305\102\0\1\306\63\0\1\4\1\0\1\4"
			+ "\5\0\1\4\1\307\4\4\1\0\13\4\1\0\25\4"
			+ "\20\0\1\4\1\0\1\4\5\0\4\4\1\307\1\4"
			+ "\1\0\13\4\1\0\25\4\54\0\1\310\101\0\1\311"
			+ "\63\0\1\312\104\0\1\313\114\0\1\314\101\0\1\314"
			+ "\54\0\1\315\104\0\1\316\57\0\1\317\102\0\1\320"
			+ "\75\0\1\321\102\0\1\321\62\0";

	private static int[] zzUnpackTrans() {
		int[] result = new int[10688];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/* error codes */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;

	/* error messages for the codes above */
	private static final String ZZ_ERROR_MSG[] = {
			"Unkown internal scanner error", "Error: could not match input",
			"Error: pushback value was too large" };

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\1\0\1\11\44\1\14\11\1\0\1\1\1\0\1\11"
			+ "\6\1\1\0\32\1\4\11\1\1\1\0\6\1\1\0"
			+ "\31\1\1\0\3\1\1\0\26\1\1\0\2\1\1\0"
			+ "\10\1\1\0\1\1\1\0\2\1\1\0\1\1\1\0"
			+ "\5\1\1\0\1\1\2\0\1\1\1\0\4\1\3\0"
			+ "\1\1\1\0\2\1\4\0\1\1\4\0\1\11\4\0" + "\1\11";

	private static int[] zzUnpackAttribute() {
		int[] result = new int[209];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** the input device */
	private java.io.Reader zzReader;

	/** the current state of the DFA */
	private int zzState;

	/** the current lexical state */
	private int zzLexicalState = YYINITIAL;

	/**
	 * this buffer contains the current text to be matched and is the source of
	 * the yytext() string
	 */
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	/** the textposition at the last accepting state */
	private int zzMarkedPos;

	/** the textposition at the last state to be included in yytext */
	private int zzPushbackPos;

	/** the current text position in the buffer */
	private int zzCurrentPos;

	/** startRead marks the beginning of the yytext() string in the buffer */
	private int zzStartRead;

	/**
	 * endRead marks the last character in the buffer, that has been read from
	 * input
	 */
	private int zzEndRead;

	/** number of newlines encountered up to the start of the matched text */
	private int yyline;

	/** the number of characters up to the start of the matched text */
	private int yychar;

	/**
	 * the number of characters from the last newline up to the start of the
	 * matched text
	 */
	private int yycolumn;

	/**
	 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
	 */
	private boolean zzAtBOL = true;

	/** zzAtEOF == true <=> the scanner is at the EOF */
	private boolean zzAtEOF;

	/** denotes if the user-EOF-code has already been executed */
	private boolean zzEOFDone;

	/* user code: */
	private int numlinea = 1;

	/**
	 * Creates a new scanner There is also a java.io.InputStream version of this
	 * constructor.
	 * 
	 * @param in
	 *            the java.io.Reader to read input from.
	 */
	public Scanner(java.io.Reader in) {
		this.zzReader = in;
	}

	/**
	 * Creates a new scanner. There is also java.io.Reader version of this
	 * constructor.
	 * 
	 * @param in
	 *            the java.io.Inputstream to read input from.
	 */
	public Scanner(java.io.InputStream in) {
		this(new java.io.InputStreamReader(in));
	}

	/**
	 * Refills the input buffer.
	 * 
	 * @return <code>false</code>, iff there was new input.
	 * 
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException {

		/* first: make room (if you can) */
		if (zzStartRead > 0) {
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead
					- zzStartRead);

			/* translate stored positions */
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzPushbackPos -= zzStartRead;
			zzStartRead = 0;
		}

		/* is the buffer big enough? */
		if (zzCurrentPos >= zzBuffer.length) {
			/* if not: blow it up */
			char newBuffer[] = new char[zzCurrentPos * 2];
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
		}

		/* finally: fill the buffer with new input */
		int numRead = zzReader.read(zzBuffer, zzEndRead, zzBuffer.length
				- zzEndRead);

		if (numRead < 0) {
			return true;
		} else {
			zzEndRead += numRead;
			return false;
		}
	}

	/**
	 * Closes the input stream.
	 */
	public final void yyclose() throws java.io.IOException {
		zzAtEOF = true; /* indicate end of file */
		zzEndRead = zzStartRead; /* invalidate buffer */

		if (zzReader != null)
			zzReader.close();
	}

	/**
	 * Resets the scanner to read from a new input stream. Does not close the
	 * old reader.
	 * 
	 * All internal variables are reset, the old input stream <b>cannot</b> be
	 * reused (internal buffer is discarded and lost). Lexical state is set to
	 * <tt>ZZ_INITIAL</tt>.
	 * 
	 * @param reader
	 *            the new input stream
	 */
	public final void yyreset(java.io.Reader reader) {
		zzReader = reader;
		zzAtBOL = true;
		zzAtEOF = false;
		zzEndRead = zzStartRead = 0;
		zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
		yyline = yychar = yycolumn = 0;
		zzLexicalState = YYINITIAL;
	}

	/**
	 * Returns the current lexical state.
	 */
	public final int yystate() {
		return zzLexicalState;
	}

	/**
	 * Enters a new lexical state
	 * 
	 * @param newState
	 *            the new lexical state
	 */
	public final void yybegin(int newState) {
		zzLexicalState = newState;
	}

	/**
	 * Returns the text matched by the current regular expression.
	 */
	public final String yytext() {
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	/**
	 * Returns the character at position <tt>pos</tt> from the matched text.
	 * 
	 * It is equivalent to yytext().charAt(pos), but faster
	 * 
	 * @param pos
	 *            the position of the character to fetch. A value from 0 to
	 *            yylength()-1.
	 * 
	 * @return the character at position pos
	 */
	public final char yycharat(int pos) {
		return zzBuffer[zzStartRead + pos];
	}

	/**
	 * Returns the length of the matched text region.
	 */
	public final int yylength() {
		return zzMarkedPos - zzStartRead;
	}

	/**
	 * Reports an error that occured while scanning.
	 * 
	 * In a wellformed scanner (no or only correct usage of yypushback(int) and
	 * a match-all fallback rule) this method will only be called with things
	 * that "Can't Possibly Happen". If this method is called, something is
	 * seriously wrong (e.g. a JFlex bug producing a faulty scanner etc.).
	 * 
	 * Usual syntax/scanner level error handling should be done in error
	 * fallback rules.
	 * 
	 * @param errorCode
	 *            the code of the errormessage to display
	 */
	private void zzScanError(int errorCode) {
		String message;
		try {
			message = ZZ_ERROR_MSG[errorCode];
		} catch (ArrayIndexOutOfBoundsException e) {
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}

	/**
	 * Pushes the specified amount of characters back into the input stream.
	 * 
	 * They will be read again by then next call of the scanning method
	 * 
	 * @param number
	 *            the number of characters to be read again. This number must
	 *            not be greater than yylength()!
	 */
	public void yypushback(int number) {
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}

	/**
	 * Contains user EOF-code, which will be executed exactly once, when the end
	 * of file is reached
	 */
	private void zzDoEOF() throws java.io.IOException {
		if (!zzEOFDone) {
			zzEOFDone = true;
			yyclose();
		}
	}

	/**
	 * Resumes scanning until the next regular expression is matched, the end of
	 * input is encountered or an I/O-Error occurs.
	 * 
	 * @return the next token
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	public java_cup.runtime.Symbol next_token() throws java.io.IOException {
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;
		char[] zzCMapL = ZZ_CMAP;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true) {
			zzMarkedPosL = zzMarkedPos;

			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			zzState = zzLexicalState;

			zzForAction: {
				while (true) {

					if (zzCurrentPosL < zzEndReadL)
						zzInput = zzBufferL[zzCurrentPosL++];
					else if (zzAtEOF) {
						zzInput = YYEOF;
						break zzForAction;
					} else {
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof) {
							zzInput = YYEOF;
							break zzForAction;
						} else {
							zzInput = zzBufferL[zzCurrentPosL++];
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					if (zzNext == -1)
						break zzForAction;
					zzState = zzNext;

					int zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1) {
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8)
							break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
			case 1: {
				System.err.println("Error l�xico en la l�nea " + numlinea);
			}
			case 51:
				break;
			case 34: {
				return new java_cup.runtime.Symbol(sym.FOR);
			}
			case 52:
				break;
			case 15: {
				return new java_cup.runtime.Symbol(sym.LPAREN);
			}
			case 53:
				break;
			case 50: {
				return new java_cup.runtime.Symbol(sym.ENDPROCEDURE);
			}
			case 54:
				break;
			case 18: {
				return new java_cup.runtime.Symbol(sym.RPOPPER);
			}
			case 55:
				break;
			case 21: {
				return new java_cup.runtime.Symbol(sym.CADENA, yytext());
			}
			case 56:
				break;
			case 6: {
				return new java_cup.runtime.Symbol(sym.LESS_THAN);
			}
			case 57:
				break;
			case 32: { /* No tomo en cuenta los comentarios */
			}
			case 58:
				break;
			case 12: {
				return new java_cup.runtime.Symbol(sym.SLASH);
			}
			case 59:
				break;
			case 23: {
				return new java_cup.runtime.Symbol(sym.DO);
			}
			case 60:
				break;
			case 27: {
				return new java_cup.runtime.Symbol(sym.LESS_THAN_EQ);
			}
			case 61:
				break;
			case 24: {
				return new java_cup.runtime.Symbol(sym.IF);
			}
			case 62:
				break;
			case 26: {
				return new java_cup.runtime.Symbol(sym.DIFFERENT);
			}
			case 63:
				break;
			case 2: {
				return new java_cup.runtime.Symbol(sym.NUM_ENTERO, new Integer(
						yytext()));
			}
			case 64:
				break;
			case 11: {
				return new java_cup.runtime.Symbol(sym.ASTERISK);
			}
			case 65:
				break;
			case 45: {
				return new java_cup.runtime.Symbol(sym.STRING);
			}
			case 66:
				break;
			case 22: {
				return new java_cup.runtime.Symbol(sym.OR);
			}
			case 67:
				break;
			case 44: {
				return new java_cup.runtime.Symbol(sym.WHILE);
			}
			case 68:
				break;
			case 29: {
				return new java_cup.runtime.Symbol(sym.EQUAL);
			}
			case 69:
				break;
			case 3: {
				return new java_cup.runtime.Symbol(sym.ID, yytext());
			}
			case 70:
				break;
			case 40: {
				return new java_cup.runtime.Symbol(sym.ENDIF);
			}
			case 71:
				break;
			case 37: {
				return new java_cup.runtime.Symbol(sym.NEXT);
			}
			case 72:
				break;
			case 9: {
				return new java_cup.runtime.Symbol(sym.PLUS);
			}
			case 73:
				break;
			case 42: {
				return new java_cup.runtime.Symbol(sym.INPUT);
			}
			case 74:
				break;
			case 47: {
				return new java_cup.runtime.Symbol(sym.ENDWHILE);
			}
			case 75:
				break;
			case 16: {
				return new java_cup.runtime.Symbol(sym.RPAREN);
			}
			case 76:
				break;
			case 43: {
				return new java_cup.runtime.Symbol(sym.FLOAT);
			}
			case 77:
				break;
			case 31: {
				return new java_cup.runtime.Symbol(sym.END);
			}
			case 78:
				break;
			case 17: {
				return new java_cup.runtime.Symbol(sym.LPOPPER);
			}
			case 79:
				break;
			case 7: {
				return new java_cup.runtime.Symbol(sym.GREATER_THAN);
			}
			case 80:
				break;
			case 10: {
				return new java_cup.runtime.Symbol(sym.MINUS);
			}
			case 81:
				break;
			case 36: {
				return new java_cup.runtime.Symbol(sym.ELSE);
			}
			case 82:
				break;
			case 41: {
				return new java_cup.runtime.Symbol(sym.PRINT);
			}
			case 83:
				break;
			case 39: {
				return new java_cup.runtime.Symbol(sym.STEP);
			}
			case 84:
				break;
			case 33: {
				return new java_cup.runtime.Symbol(sym.NOT);
			}
			case 85:
				break;
			case 35: {
				return new java_cup.runtime.Symbol(sym.AND);
			}
			case 86:
				break;
			case 38: {
				return new java_cup.runtime.Symbol(sym.THEN);
			}
			case 87:
				break;
			case 13: {
				return new java_cup.runtime.Symbol(sym.CIRCUMFLEX);
			}
			case 88:
				break;
			case 20: {
				return new java_cup.runtime.Symbol(sym.COMMA);
			}
			case 89:
				break;
			case 25: {
				return new java_cup.runtime.Symbol(sym.TO);
			}
			case 90:
				break;
			case 48: {
				return new java_cup.runtime.Symbol(sym.PROCEDURE);
			}
			case 91:
				break;
			case 8: {
				return new java_cup.runtime.Symbol(sym.ASSIGN);
			}
			case 92:
				break;
			case 14: {
				return new java_cup.runtime.Symbol(sym.MODULE);
			}
			case 93:
				break;
			case 19: {
				return new java_cup.runtime.Symbol(sym.CONCAT);
			}
			case 94:
				break;
			case 49: {
				return new java_cup.runtime.Symbol(sym.LOOP_UNTIL);
			}
			case 95:
				break;
			case 5: { /* No tomo en cuenta espacios en blanco */
			}
			case 96:
				break;
			case 46: {
				return new java_cup.runtime.Symbol(sym.INTEGER);
			}
			case 97:
				break;
			case 4: {
				numlinea++;
				return new java_cup.runtime.Symbol(sym.NEW_LINE);
			}
			case 98:
				break;
			case 28: {
				return new java_cup.runtime.Symbol(sym.GREATER_THAN_EQ);
			}
			case 99:
				break;
			case 30: {
				return new java_cup.runtime.Symbol(sym.NUM_FLOTANTE, new Float(
						yytext()));
			}
			case 100:
				break;
			default:
				if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
					zzAtEOF = true;
					zzDoEOF();
					{
						return new java_cup.runtime.Symbol(sym.EOF);
					}
				} else {
					zzScanError(ZZ_NO_MATCH);
				}
			}
		}
	}

}
