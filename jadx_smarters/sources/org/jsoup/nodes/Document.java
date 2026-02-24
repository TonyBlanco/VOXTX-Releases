package org.jsoup.nodes;

import com.amazonaws.mobileconnectors.appsync.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import org.achartengine.ChartFactory;
import org.apache.http.cookie.ClientCookie;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* JADX INFO: loaded from: classes4.dex */
public class Document extends Element {
    private String location;
    private OutputSettings outputSettings;
    private QuirksMode quirksMode;
    private boolean updateMetaCharset;

    public static class OutputSettings implements Cloneable {
        private Charset charset;
        private CharsetEncoder charsetEncoder;
        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private int indentAmount;
        private boolean outline;
        private boolean prettyPrint;
        private Syntax syntax;

        public enum Syntax {
            html,
            xml
        }

        public OutputSettings() {
            Charset charsetForName = Charset.forName("UTF-8");
            this.charset = charsetForName;
            this.charsetEncoder = charsetForName.newEncoder();
            this.prettyPrint = true;
            this.outline = false;
            this.indentAmount = 1;
            this.syntax = Syntax.html;
        }

        public Charset charset() {
            return this.charset;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }

        public OutputSettings charset(Charset charset) {
            this.charset = charset;
            this.charsetEncoder = charset.newEncoder();
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.charset.name());
                outputSettings.escapeMode = Entities.EscapeMode.valueOf(this.escapeMode.name());
                return outputSettings;
            } catch (CloneNotSupportedException e9) {
                throw new RuntimeException(e9);
            }
        }

        public CharsetEncoder encoder() {
            return this.charsetEncoder;
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.escapeMode = escapeMode;
            return this;
        }

        public Entities.EscapeMode escapeMode() {
            return this.escapeMode;
        }

        public int indentAmount() {
            return this.indentAmount;
        }

        public OutputSettings indentAmount(int i9) {
            Validate.isTrue(i9 >= 0);
            this.indentAmount = i9;
            return this;
        }

        public OutputSettings outline(boolean z9) {
            this.outline = z9;
            return this;
        }

        public boolean outline() {
            return this.outline;
        }

        public OutputSettings prettyPrint(boolean z9) {
            this.prettyPrint = z9;
            return this;
        }

        public boolean prettyPrint() {
            return this.prettyPrint;
        }

        public Syntax syntax() {
            return this.syntax;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.syntax = syntax;
            return this;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.valueOf("#root"), str);
        this.outputSettings = new OutputSettings();
        this.quirksMode = QuirksMode.noQuirks;
        this.updateMetaCharset = false;
        this.location = str;
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        Element elementAppendElement = document.appendElement("html");
        elementAppendElement.appendElement("head");
        elementAppendElement.appendElement("body");
        return document;
    }

    private void ensureMetaCharsetElement() {
        XmlDeclaration xmlDeclaration;
        if (this.updateMetaCharset) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element elementFirst = select("meta[charset]").first();
                if (elementFirst == null) {
                    Element elementHead = head();
                    if (elementHead != null) {
                        elementFirst = elementHead.appendElement("meta");
                        elementFirst.attr("charset", charset().displayName());
                    }
                } else {
                    elementFirst.attr("charset", charset().displayName());
                }
                select("meta[name=charset]").remove();
                return;
            }
            if (syntax == OutputSettings.Syntax.xml) {
                Node node = childNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration2 = (XmlDeclaration) node;
                    if (xmlDeclaration2.attr("declaration").equals("xml")) {
                        xmlDeclaration2.attr("encoding", charset().displayName());
                        if (xmlDeclaration2.attr(ClientCookie.VERSION_ATTR) != null) {
                            xmlDeclaration2.attr(ClientCookie.VERSION_ATTR, BuildConfig.VERSION_NAME);
                            return;
                        }
                        return;
                    }
                    xmlDeclaration = new XmlDeclaration("xml", this.baseUri, false);
                } else {
                    xmlDeclaration = new XmlDeclaration("xml", this.baseUri, false);
                }
                xmlDeclaration.attr(ClientCookie.VERSION_ATTR, BuildConfig.VERSION_NAME);
                xmlDeclaration.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration);
            }
        }
    }

    private Element findFirstElementByTagName(String str, Node node) {
        if (node.nodeName().equals(str)) {
            return (Element) node;
        }
        Iterator<Node> it = node.childNodes.iterator();
        while (it.hasNext()) {
            Element elementFindFirstElementByTagName = findFirstElementByTagName(str, it.next());
            if (elementFindFirstElementByTagName != null) {
                return elementFindFirstElementByTagName;
            }
        }
        return null;
    }

    private void normaliseStructure(String str, Element element) {
        Elements elementsByTag = getElementsByTag(str);
        Element elementFirst = elementsByTag.first();
        if (elementsByTag.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 1; i9 < elementsByTag.size(); i9++) {
                Element element2 = elementsByTag.get(i9);
                Iterator<Node> it = element2.childNodes.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                element2.remove();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                elementFirst.appendChild((Node) it2.next());
            }
        }
        if (elementFirst.parent().equals(element)) {
            return;
        }
        element.appendChild(elementFirst);
    }

    private void normaliseTextNodes(Element element) {
        ArrayList arrayList = new ArrayList();
        for (Node node : element.childNodes) {
            if (node instanceof TextNode) {
                TextNode textNode = (TextNode) node;
                if (!textNode.isBlank()) {
                    arrayList.add(textNode);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Node node2 = (Node) arrayList.get(size);
            element.removeChild(node2);
            body().prependChild(new TextNode(" ", ""));
            body().prependChild(node2);
        }
    }

    public Element body() {
        return findFirstElementByTagName("body", this);
    }

    public Charset charset() {
        return this.outputSettings.charset();
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.outputSettings.charset(charset);
        ensureMetaCharsetElement();
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Document mo189clone() {
        Document document = (Document) super.mo189clone();
        document.outputSettings = this.outputSettings.clone();
        return document;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str), baseUri());
    }

    public Element head() {
        return findFirstElementByTagName("head", this);
    }

    public String location() {
        return this.location;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String nodeName() {
        return "#document";
    }

    public Document normalise() {
        Element elementFindFirstElementByTagName = findFirstElementByTagName("html", this);
        if (elementFindFirstElementByTagName == null) {
            elementFindFirstElementByTagName = appendElement("html");
        }
        if (head() == null) {
            elementFindFirstElementByTagName.prependElement("head");
        }
        if (body() == null) {
            elementFindFirstElementByTagName.appendElement("body");
        }
        normaliseTextNodes(head());
        normaliseTextNodes(elementFindFirstElementByTagName);
        normaliseTextNodes(this);
        normaliseStructure("head", elementFindFirstElementByTagName);
        normaliseStructure("body", elementFindFirstElementByTagName);
        ensureMetaCharsetElement();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.outputSettings;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public QuirksMode quirksMode() {
        return this.quirksMode;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    @Override // org.jsoup.nodes.Element
    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element elementFirst = getElementsByTag(ChartFactory.TITLE).first();
        return elementFirst != null ? StringUtil.normaliseWhitespace(elementFirst.text()).trim() : "";
    }

    public void title(String str) {
        Validate.notNull(str);
        Element elementFirst = getElementsByTag(ChartFactory.TITLE).first();
        if (elementFirst == null) {
            head().appendElement(ChartFactory.TITLE).text(str);
        } else {
            elementFirst.text(str);
        }
    }

    public void updateMetaCharsetElement(boolean z9) {
        this.updateMetaCharset = z9;
    }

    public boolean updateMetaCharsetElement() {
        return this.updateMetaCharset;
    }
}
