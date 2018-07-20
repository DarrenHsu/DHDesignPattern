package tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor;

import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlElement;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlParentElement;

public interface Visitor {
     void visit(HtmlElement element);
     void visit(HtmlParentElement parentElement);
}
