package tw.com.dh.dhdesignpattern.structural.CompositePattern;

import tw.com.dh.dhdesignpattern.structural.CompositePattern.Component.HtmlTag;
import tw.com.dh.dhdesignpattern.structural.CompositePattern.Composite.HtmlParentElement;
import tw.com.dh.dhdesignpattern.structural.CompositePattern.Leaf.HtmlElement;

public class TestCompositePattern {
    public static void test() {
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChildTag(p1);

        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setTagBody("Testing html tag library");
        child1.setEndTag("</P>");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setTagBody("Paragraph 2");
        child1.setEndTag("</P>");
        p1.addChildTag(child1);

        parentTag.generateHtml();
    }
}
