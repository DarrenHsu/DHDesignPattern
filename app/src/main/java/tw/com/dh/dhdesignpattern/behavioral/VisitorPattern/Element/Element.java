package tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element;

import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
