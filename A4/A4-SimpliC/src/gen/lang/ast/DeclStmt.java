/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast node
<<<<<<< HEAD
 * @declaredat C:\\Users\\Kevin Johansson\\Desktop\\HT2018\\EDAN65\\A4\\A4-SimpliC\\src\\jastadd\\lang.ast:16
 * @astdecl DeclStmt : Stmt ::= Type IdDecl [Expr];
 * @production DeclStmt : {@link Stmt} ::= <span class="component">{@link Type}</span> <span class="component">{@link IdDecl}</span> <span class="component">[{@link Expr}]</span>;
=======
 * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/lang.ast:16
 * @astdecl DeclStmt : Stmt ::= TypeDecl IdDecl [Expr];
 * @production DeclStmt : {@link Stmt} ::= <span class="component">{@link TypeDecl}</span> <span class="component">{@link IdDecl}</span> <span class="component">[{@link Expr}]</span>;
>>>>>>> fcd2405ceb385ac2168301b2ce70f79298edb2a2

 */
public class DeclStmt extends Stmt implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/Visitor.jrag:111
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/PrettyPrint.jrag:56
   */
  public void prettyPrint(PrintStream out, String ind) {
		getType().prettyPrint(out, ind);
		out.print(" ");
		getIdDecl().prettyPrint(out, ind);
		if(hasExpr()) {
			out.print(" = ");
			getExpr().prettyPrint(out, ind);
		}
		out.print(";\n");
	}
  /**
   * @declaredat ASTNode:1
   */
  public DeclStmt() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Type", "IdDecl", "Expr"},
    type = {"Type", "IdDecl", "Opt<Expr>"},
    kind = {"Child", "Child", "Opt"}
  )
  public DeclStmt(Type p0, IdDecl p1, Opt<Expr> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    compatibleTypes_reset();
    localLookup_String_reset();
    typeLookup_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public DeclStmt clone() throws CloneNotSupportedException {
    DeclStmt node = (DeclStmt) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public DeclStmt copy() {
    try {
      DeclStmt node = (DeclStmt) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public DeclStmt fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public DeclStmt treeCopyNoTransform() {
    DeclStmt tree = (DeclStmt) copy();
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
   * @declaredat ASTNode:94
   */
  public DeclStmt treeCopy() {
    DeclStmt tree = (DeclStmt) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Type child.
   * @param node The new node to replace the Type child.
   * @apilevel high-level
   */
  public void setType(Type node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Type child.
   * @return The current node used as the Type child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Type")
  public Type getType() {
    return (Type) getChild(0);
  }
  /**
   * Retrieves the Type child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Type child.
   * @apilevel low-level
   */
  public Type getTypeNoTransform() {
    return (Type) getChildNoTransform(0);
  }
  /**
   * Replaces the IdDecl child.
   * @param node The new node to replace the IdDecl child.
   * @apilevel high-level
   */
  public void setIdDecl(IdDecl node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the IdDecl child.
   * @return The current node used as the IdDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdDecl")
  public IdDecl getIdDecl() {
    return (IdDecl) getChild(1);
  }
  /**
   * Retrieves the IdDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdDecl child.
   * @apilevel low-level
   */
  public IdDecl getIdDeclNoTransform() {
    return (IdDecl) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Expr child. This is the <code>Opt</code>
   * node containing the child Expr, not the actual child!
   * @param opt The new node to be used as the optional node for the Expr child.
   * @apilevel low-level
   */
  public void setExprOpt(Opt<Expr> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Expr child.
   * @param node The new node to be used as the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    getExprOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Expr child exists.
   * @return {@code true} if the optional Expr child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Expr child.
   * @return The Expr child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getExpr() {
    return (Expr) getExprOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Expr child. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * @return The optional node for child the Expr child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Expr")
  public Opt<Expr> getExprOpt() {
    return (Opt<Expr>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Expr. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Expr.
   * @apilevel low-level
   */
  public Opt<Expr> getExprOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(2);
  }
/** @apilevel internal */
protected boolean compatibleTypes_visited = false;
  /** @apilevel internal */
  private void compatibleTypes_reset() {
    compatibleTypes_computed = false;
    compatibleTypes_visited = false;
  }
  /** @apilevel internal */
  protected boolean compatibleTypes_computed = false;

  /** @apilevel internal */
  protected boolean compatibleTypes_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:41
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:41")
  public boolean compatibleTypes() {
    ASTState state = state();
    if (compatibleTypes_computed) {
      return compatibleTypes_value;
    }
    if (compatibleTypes_visited) {
      throw new RuntimeException("Circular definition of attribute DeclStmt.compatibleTypes().");
    }
    compatibleTypes_visited = true;
    state().enterLazyAttribute();
    compatibleTypes_value = getIdDecl().type().isUnknownType()
    			|| getExpr().type().isUnknownType()
    			|| getIdDecl().type().getTypeDecl().equals(getExpr().type().getTypeDecl());
    compatibleTypes_computed = true;
    state().leaveLazyAttribute();
    compatibleTypes_visited = false;
    return compatibleTypes_value;
  }
/** @apilevel internal */
protected java.util.Set localLookup_String_visited;
  /** @apilevel internal */
  private void localLookup_String_reset() {
    localLookup_String_values = null;
    localLookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:23
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/NameAnalysis.jrag:23")
  public IdDecl localLookup(String name) {
    Object _parameters = name;
    if (localLookup_String_visited == null) localLookup_String_visited = new java.util.HashSet(4);
    if (localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_values.containsKey(_parameters)) {
      return (IdDecl) localLookup_String_values.get(_parameters);
    }
    if (localLookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute DeclStmt.localLookup(String).");
    }
    localLookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdDecl localLookup_String_value = localLookup_compute(name);
    localLookup_String_values.put(_parameters, localLookup_String_value);
    state().leaveLazyAttribute();
    localLookup_String_visited.remove(_parameters);
    return localLookup_String_value;
  }
  /** @apilevel internal */
  private IdDecl localLookup_compute(String name) {
  		return getIdDecl().getID().equals(name) ? getIdDecl() : unknownDecl();
  	}
  /**
   * @attribute inh
   * @aspect TypeAnalysis
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:21
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:21")
  public Type typeLookup() {
    ASTState state = state();
    if (typeLookup_computed) {
      return typeLookup_value;
    }
    if (typeLookup_visited) {
      throw new RuntimeException("Circular definition of attribute DeclStmt.typeLookup().");
    }
    typeLookup_visited = true;
    state().enterLazyAttribute();
    typeLookup_value = getParent().Define_typeLookup(this, null);
    typeLookup_computed = true;
    state().leaveLazyAttribute();
    typeLookup_visited = false;
    return typeLookup_value;
  }
/** @apilevel internal */
protected boolean typeLookup_visited = false;
  /** @apilevel internal */
  private void typeLookup_reset() {
    typeLookup_computed = false;
    
    typeLookup_value = null;
    typeLookup_visited = false;
  }
  /** @apilevel internal */
  protected boolean typeLookup_computed = false;

  /** @apilevel internal */
  protected Type typeLookup_value;

  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:28
   * @apilevel internal
   */
  public Type Define_typeLookup(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdDeclNoTransform()) {
      // @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:24
      return !getTypeDecl().isUnknownType() ? getTypeDecl() : typeLookup();
    }
    else {
      return getParent().Define_typeLookup(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/ludde/ht18/edan65/A4/A4-SimpliC/src/jastadd/TypeAnalysis.jrag:28
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute typeLookup
   */
  protected boolean canDefine_typeLookup(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
}
