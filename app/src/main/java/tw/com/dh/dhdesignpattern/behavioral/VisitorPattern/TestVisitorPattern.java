package tw.com.dh.dhdesignpattern.behavioral.VisitorPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlElement;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlParentElement;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element.HtmlTag;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor.CssClassVisitor;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor.StyleVisitor;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor.Visitor;

public class TestVisitorPattern {
    public static void test() {
        Log.d(AppConstant.APP_TAG,"Before visitor.........");

        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChildTag(p1);

        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);

        parentTag.generateHtml();

        Log.d(AppConstant.APP_TAG,"After visitor.......");

        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();

        parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        parentTag.accept(style);
        parentTag.accept(cssClass);

        p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        p1.accept(style);
        p1.accept(cssClass);
        parentTag.addChildTag(p1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        child1.accept(style);
        child1.accept(cssClass);
        p1.addChildTag(child1);

        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        child1.accept(style);
        child1.accept(cssClass);

        parentTag.generateHtml();
    }
}
