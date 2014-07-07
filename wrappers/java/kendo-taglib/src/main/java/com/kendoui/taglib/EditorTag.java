
package com.kendoui.taglib;

import com.kendoui.taglib.editor.*;
import com.kendoui.taglib.html.Div;
import com.kendoui.taglib.html.Element;
import com.kendoui.taglib.html.Textarea;
import com.kendoui.taglib.json.Function;


import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class EditorTag extends WidgetTag /* interfaces *//* interfaces */ {

    public EditorTag() {
        super("Editor");
    }

    @Override
    public Element<?> createElement() {
        if(getProperty("tag") == "div") {
            return new Div().html(body());
        } else {
            return new Textarea().attr("name", getName()).html(body());
        }
    }
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag
//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "editor";
    }

    public void setFileBrowser(com.kendoui.taglib.editor.FileBrowserTag value) {
        setProperty("fileBrowser", value);
    }

    public void setImageBrowser(com.kendoui.taglib.editor.ImageBrowserTag value) {
        setProperty("imageBrowser", value);
    }

    public void setSerialization(com.kendoui.taglib.editor.SerializationTag value) {
        setProperty("serialization", value);
    }

    public void setTools(ToolsTag value) {

        setProperty("tools", value.tools());

    }

    public void setChange(ChangeFunctionTag value) {
        setEvent("change", value.getBody());
    }

    public void setExecute(ExecuteFunctionTag value) {
        setEvent("execute", value.getBody());
    }

    public void setKeydown(KeydownFunctionTag value) {
        setEvent("keydown", value.getBody());
    }

    public void setKeyup(KeyupFunctionTag value) {
        setEvent("keyup", value.getBody());
    }

    public void setPaste(PasteFunctionTag value) {
        setEvent("paste", value.getBody());
    }

    public void setSelect(SelectFunctionTag value) {
        setEvent("select", value.getBody());
    }

    public java.lang.Object getContent() {
        return (java.lang.Object)getProperty("content");
    }

    public void setContent(java.lang.Object value) {
        setProperty("content", value);
    }

    public java.lang.String getDomain() {
        return (java.lang.String)getProperty("domain");
    }

    public void setDomain(java.lang.String value) {
        setProperty("domain", value);
    }

    public boolean getEncoded() {
        return (boolean)getProperty("encoded");
    }

    public void setEncoded(boolean value) {
        setProperty("encoded", value);
    }

    public java.lang.Object getMessages() {
        return (java.lang.Object)getProperty("messages");
    }

    public void setMessages(java.lang.Object value) {
        setProperty("messages", value);
    }

    public java.lang.Object getStylesheets() {
        return (java.lang.Object)getProperty("stylesheets");
    }

    public void setStylesheets(java.lang.Object value) {
        setProperty("stylesheets", value);
    }

    public java.lang.String getTag() {
        return (java.lang.String)getProperty("tag");
    }

    public void setTag(java.lang.String value) {
        setProperty("tag", value);
    }

    public String getChange() {
        Function property = ((Function)getProperty("change"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setChange(String value) {
        setProperty("change", new Function(value));
    }

    public String getExecute() {
        Function property = ((Function)getProperty("execute"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setExecute(String value) {
        setProperty("execute", new Function(value));
    }

    public String getKeydown() {
        Function property = ((Function)getProperty("keydown"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setKeydown(String value) {
        setProperty("keydown", new Function(value));
    }

    public String getKeyup() {
        Function property = ((Function)getProperty("keyup"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setKeyup(String value) {
        setProperty("keyup", new Function(value));
    }

    public String getPaste() {
        Function property = ((Function)getProperty("paste"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setPaste(String value) {
        setProperty("paste", new Function(value));
    }

    public String getSelect() {
        Function property = ((Function)getProperty("select"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setSelect(String value) {
        setProperty("select", new Function(value));
    }

//<< Attributes

}
