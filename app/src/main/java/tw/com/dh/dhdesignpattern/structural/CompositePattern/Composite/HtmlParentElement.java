package tw.com.dh.dhdesignpattern.structural.CompositePattern.Composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.CompositePattern.Component.HtmlTag;

public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName){
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
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
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void generateHtml() {
        Log.d(AppConstant.APP_TAG, startTag);
        for(HtmlTag tag : childrenTag) {
            tag.generateHtml();
        }
        Log.d(AppConstant.APP_TAG, endTag);
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childrenTag;
    }
}
