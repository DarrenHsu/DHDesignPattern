package tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor;

import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlElement;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlParentElement;

public class StyleVisitor implements Visitor {
    @Override
    public void visit(HtmlElement element) {
        element.setStartTag(element.getStartTag().replace(">", " style=’width:46px’>"));
    }

    @Override
    public void visit(HtmlParentElement parentElement) {
        parentElement.setStartTag(parentElement.getStartTag().replace(">", " style=’width:58px’>"));
    }
}
