package org.jsoup.nodes;

import org.apache.http.message.TokenParser;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;

/* JADX INFO: loaded from: classes4.dex */
public class DocumentType extends Node {
    private static final String NAME = "name";
    private static final String PUBLIC_ID = "publicId";
    private static final String SYSTEM_ID = "systemId";

    public DocumentType(String str, String str2, String str3, String str4) {
        super(str4);
        attr(NAME, str);
        attr(PUBLIC_ID, str2);
        attr(SYSTEM_ID, str3);
    }

    private boolean has(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#doctype";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb, int i9, Document.OutputSettings outputSettings) {
        sb.append((outputSettings.syntax() != Document.OutputSettings.Syntax.html || has(PUBLIC_ID) || has(SYSTEM_ID)) ? "<!DOCTYPE" : "<!doctype");
        if (has(NAME)) {
            sb.append(" ");
            sb.append(attr(NAME));
        }
        if (has(PUBLIC_ID)) {
            sb.append(" PUBLIC \"");
            sb.append(attr(PUBLIC_ID));
            sb.append(TokenParser.DQUOTE);
        }
        if (has(SYSTEM_ID)) {
            sb.append(" \"");
            sb.append(attr(SYSTEM_ID));
            sb.append(TokenParser.DQUOTE);
        }
        sb.append('>');
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb, int i9, Document.OutputSettings outputSettings) {
    }
}
