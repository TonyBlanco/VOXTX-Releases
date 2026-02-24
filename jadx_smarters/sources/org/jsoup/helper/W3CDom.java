package org.jsoup.helper;

import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes4.dex */
public class W3CDom {
    protected DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    public class W3CBuilder implements NodeVisitor {
        private Element dest;
        private final Document doc;

        public W3CBuilder(Document document) {
            this.doc = document;
        }

        private void copyAttributes(Node node, Element element) {
            for (Attribute attribute : node.attributes()) {
                element.setAttribute(attribute.getKey(), attribute.getValue());
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i9) {
            Document document;
            String wholeData;
            org.w3c.dom.Node nodeCreateComment;
            if (node instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element element = (org.jsoup.nodes.Element) node;
                Element elementCreateElement = this.doc.createElement(element.tagName());
                copyAttributes(element, elementCreateElement);
                org.w3c.dom.Node node2 = this.dest;
                if (node2 == null) {
                    node2 = this.doc;
                }
                node2.appendChild(elementCreateElement);
                this.dest = elementCreateElement;
                return;
            }
            if (node instanceof TextNode) {
                document = this.doc;
                wholeData = ((TextNode) node).getWholeText();
            } else if (node instanceof Comment) {
                nodeCreateComment = this.doc.createComment(((Comment) node).getData());
                this.dest.appendChild(nodeCreateComment);
            } else {
                if (!(node instanceof DataNode)) {
                    return;
                }
                document = this.doc;
                wholeData = ((DataNode) node).getWholeData();
            }
            nodeCreateComment = document.createTextNode(wholeData);
            this.dest.appendChild(nodeCreateComment);
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i9) {
            if ((node instanceof org.jsoup.nodes.Element) && (this.dest.getParentNode() instanceof Element)) {
                this.dest = (Element) this.dest.getParentNode();
            }
        }
    }

    public String asString(Document document) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (TransformerException e9) {
            throw new IllegalStateException(e9);
        }
    }

    public void convert(org.jsoup.nodes.Document document, Document document2) {
        if (!StringUtil.isBlank(document.location())) {
            document2.setDocumentURI(document.location());
        }
        new NodeTraversor(new W3CBuilder(document2)).traverse(document.child(0));
    }

    public Document fromJsoup(org.jsoup.nodes.Document document) {
        Validate.notNull(document);
        try {
            Document documentNewDocument = this.factory.newDocumentBuilder().newDocument();
            convert(document, documentNewDocument);
            return documentNewDocument;
        } catch (ParserConfigurationException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
