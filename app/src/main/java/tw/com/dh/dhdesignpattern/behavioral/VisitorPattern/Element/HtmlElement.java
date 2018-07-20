package tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Element;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.VisitorPattern.Visitor.Visitor;

public class HtmlElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName){
        this.tagName = tagName;
        this.tagBody = "";
        this.startTag = "";
        this.endTag = "";
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public String getStartTag() {
        return startTag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public String getEndTag() {
        return endTag;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    public void generateHtml() {
        Log.d(AppConstant.APP_TAG,"" + startTag + tagBody + endTag);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
