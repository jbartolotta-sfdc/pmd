/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.lang.ast.xpath.internal.DeprecatedAttribute;

/**
 * @deprecated This node will be removed with 7.0.0. You
 *     can directly use {@link ASTMethodDeclaration#getName()},
 *     {@link ASTMethodDeclaration#getFormalParameters()}, {@link ASTMethodDeclaration#getArity()} instead.
 */
@Deprecated
public class ASTMethodDeclarator extends AbstractJavaNode {

    ASTMethodDeclarator(int id) {
        super(id);
    }

    /**
     * @deprecated Use {@link ASTMethodDeclaration#getArity()}
     */
    @DeprecatedAttribute(replaceWith = "MethodDeclaration/@Arity")
    @Deprecated
    public int getParameterCount() {
        return getFirstChildOfType(ASTFormalParameters.class).size();
    }

    /**
     * @deprecated Use {@link ASTMethodDeclaration#getName()}
     */
    @Deprecated
    @DeprecatedAttribute(replaceWith = "MethodDeclaration/@Name")
    @Override
    public String getImage() {
        return super.getImage();
    }

    @Override
    public ASTMethodDeclaration getParent() {
        return (ASTMethodDeclaration) super.getParent();
    }

    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public <T> void jjtAccept(SideEffectingVisitor<T> visitor, T data) {
        visitor.visit(this, data);
    }
}
