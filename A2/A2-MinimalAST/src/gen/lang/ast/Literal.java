/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
 * @declaredat /h/d5/d/dat14kjo/Desktop/A2/A2-MinimalAST/src/jastadd/lang.ast:36
 * @astdecl Literal : Expr ::= <NUMERAL:String>;
 * @production Literal : {@link Expr} ::= <span class="component">&lt;NUMERAL:String&gt;</span>;

 */
public class Literal extends Expr implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Literal() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"NUMERAL"},
    type = {"String"},
    kind = {"Token"}
  )
  public Literal(String p0) {
    setNUMERAL(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public Literal(beaver.Symbol p0) {
    setNUMERAL(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public Literal clone() throws CloneNotSupportedException {
    Literal node = (Literal) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public Literal copy() {
    try {
      Literal node = (Literal) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:60
   */
  @Deprecated
  public Literal fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public Literal treeCopyNoTransform() {
    Literal tree = (Literal) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:90
   */
  public Literal treeCopy() {
    Literal tree = (Literal) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:104
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_NUMERAL == ((Literal) node).tokenString_NUMERAL);    
  }
  /**
   * Replaces the lexeme NUMERAL.
   * @param value The new value for the lexeme NUMERAL.
   * @apilevel high-level
   */
  public void setNUMERAL(String value) {
    tokenString_NUMERAL = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_NUMERAL;
  /**
   */
  public int NUMERALstart;
  /**
   */
  public int NUMERALend;
  /**
   * JastAdd-internal setter for lexeme NUMERAL using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme NUMERAL
   * @apilevel internal
   */
  public void setNUMERAL(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setNUMERAL is only valid for String lexemes");
    tokenString_NUMERAL = (String)symbol.value;
    NUMERALstart = symbol.getStart();
    NUMERALend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme NUMERAL.
   * @return The value for the lexeme NUMERAL.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="NUMERAL")
  public String getNUMERAL() {
    return tokenString_NUMERAL != null ? tokenString_NUMERAL : "";
  }
}
