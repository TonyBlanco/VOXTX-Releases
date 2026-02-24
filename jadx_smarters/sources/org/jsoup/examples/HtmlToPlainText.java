package org.jsoup.examples;

import java.io.IOException;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* JADX INFO: loaded from: classes4.dex */
public class HtmlToPlainText {
    private static final int timeout = 5000;
    private static final String userAgent = "Mozilla/5.0 (jsoup)";

    public class FormattingVisitor implements NodeVisitor {
        private static final int maxWidth = 80;
        private StringBuilder accum;
        private int width;

        private FormattingVisitor() {
            this.width = 0;
            this.accum = new StringBuilder();
        }

        private void append(String str) {
            if (str.startsWith("\n")) {
                this.width = 0;
            }
            if (str.equals(" ")) {
                if (this.accum.length() == 0) {
                    return;
                }
                if (StringUtil.in(this.accum.substring(r3.length() - 1), " ", "\n")) {
                    return;
                }
            }
            if (str.length() + this.width <= maxWidth) {
                this.accum.append(str);
                this.width += str.length();
                return;
            }
            String[] strArrSplit = str.split("\\s+");
            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                String str2 = strArrSplit[i9];
                if (i9 != strArrSplit.length - 1) {
                    str2 = str2 + " ";
                }
                if (str2.length() + this.width > maxWidth) {
                    StringBuilder sb = this.accum;
                    sb.append("\n");
                    sb.append(str2);
                    this.width = str2.length();
                } else {
                    this.accum.append(str2);
                    this.width += str2.length();
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i9) {
            String strText;
            String strNodeName = node.nodeName();
            if (node instanceof TextNode) {
                strText = ((TextNode) node).text();
            } else if (strNodeName.equals("li")) {
                strText = "\n * ";
            } else if (strNodeName.equals("dt")) {
                strText = "  ";
            } else if (!StringUtil.in(strNodeName, "p", "h1", "h2", "h3", "h4", "h5", "tr")) {
                return;
            } else {
                strText = "\n";
            }
            append(strText);
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i9) {
            String str;
            String strNodeName = node.nodeName();
            if (StringUtil.in(strNodeName, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5")) {
                str = "\n";
            } else if (!strNodeName.equals("a")) {
                return;
            } else {
                str = String.format(" <%s>", node.absUrl("href"));
            }
            append(str);
        }

        public String toString() {
            return this.accum.toString();
        }
    }

    public static void main(String... strArr) throws IOException {
        Validate.isTrue(strArr.length == 1 || strArr.length == 2, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        String str = strArr[0];
        String str2 = strArr.length == 2 ? strArr[1] : null;
        Document document = Jsoup.connect(str).userAgent(userAgent).timeout(timeout).get();
        HtmlToPlainText htmlToPlainText = new HtmlToPlainText();
        if (str2 == null) {
            System.out.println(htmlToPlainText.getPlainText(document));
            return;
        }
        Iterator<Element> it = document.select(str2).iterator();
        while (it.hasNext()) {
            System.out.println(htmlToPlainText.getPlainText(it.next()));
        }
    }

    public String getPlainText(Element element) {
        FormattingVisitor formattingVisitor = new FormattingVisitor();
        new NodeTraversor(formattingVisitor).traverse(element);
        return formattingVisitor.toString();
    }
}
