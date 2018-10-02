package lang.ast;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
/**
 * @ast class
 * @aspect NameAnalysis
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A3\\A3-CalcComp\\src\\jastadd\\NameAnalysis.jrag:5
 */
public class SymbolTable extends java.lang.Object {
  
		private static final SymbolTable BOTTOM = new SymbolTable() {
			@Override
			public boolean declare(String name) {
				throw new UnsupportedOperationException(
						"can not add name to bottom of name stack");
			}
			@Override
			public boolean lookup(String name) {
				return false;
			}
		};

  

		private final SymbolTable tail;

  
		private final Set<String> names = new HashSet<String>();

  

		public SymbolTable() {
			tail = BOTTOM;
		}

  

		public SymbolTable(SymbolTable tail) {
			this.tail = tail;
		}

  

		/**
		 * Attempt to add a new name to the symbol table.
		 * @return true if name was not already declared
		 */
		public boolean declare(String name) {
			return names.add(name);
		}

  

		/**
		 * @return true if name has been declared
		 */
		public boolean lookup(String name) {
			return names.contains(name) || tail.lookup(name);
		}

  

		/**
		 * Push a new table on the stack.
		 * @return the new top of the stack
		 */
		public SymbolTable push() {
			return new SymbolTable(this);
		}


}
