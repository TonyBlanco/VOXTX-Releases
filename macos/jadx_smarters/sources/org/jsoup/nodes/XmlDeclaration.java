package org.jsoup.nodes;

import com.amplifyframework.core.model.ModelIdentifier;
import org.apache.http.cookie.ClientCookie;
import org.jsoup.nodes.Document;

/* JADX INFO: loaded from: classes4.dex */
public class XmlDeclaration extends Node {
    static final String DECL_KEY = "declaration";
    private final boolean isProcessingInstruction;

    public XmlDeclaration(String str, String str2, boolean z9) {
        super(str2);
        this.attributes.put(DECL_KEY, str);
        this.isProcessingInstruction = z9;
    }

    public String getWholeDeclaration() {
        String str = this.attributes.get(DECL_KEY);
        if (!str.equals("xml") || this.attributes.size() <= 1) {
            return this.attributes.get(DECL_KEY);
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = this.attributes.get(ClientCookie.VERSION_ATTR);
        if (str2 != null) {
            sb.append(" version=\"");
            sb.append(str2);
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        String str3 = this.attributes.get("encoding");
        if (str3 != null) {
            sb.append(" encoding=\"");
            sb.append(str3);
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        return sb.toString();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb, int i9, Document.OutputSettings outputSettings) {
        sb.append("<");
        sb.append(this.isProcessingInstruction ? "!" : "?");
        sb.append(getWholeDeclaration());
        sb.append(">");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb, int i9, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }
}
