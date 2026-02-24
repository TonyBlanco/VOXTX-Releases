package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public class XmlWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    List<String> tags = new ArrayList();
    StringBuilder sb = new StringBuilder();

    private void appendEscapedString(String str, StringBuilder sb) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            String str2 = cCharAt != '\t' ? cCharAt != '\n' ? cCharAt != '\r' ? cCharAt != '\"' ? cCharAt != '&' ? cCharAt != '<' ? cCharAt != '>' ? null : "&gt;" : "&lt;" : "&amp;" : "&quot;" : "&#13;" : "&#10;" : "&#9;";
            if (str2 != null) {
                if (i10 < i9) {
                    sb.append((CharSequence) str, i10, i9);
                }
                this.sb.append(str2);
                i10 = i9 + 1;
            }
            i9++;
        }
        if (i10 < i9) {
            this.sb.append((CharSequence) str, i10, i9);
        }
    }

    private void writeAttr(String str, String str2) {
        StringBuilder sb = this.sb;
        sb.append(TokenParser.SP);
        sb.append(str);
        sb.append("=\"");
        appendEscapedString(str2, this.sb);
        this.sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public XmlWriter end() {
        String strRemove = this.tags.remove(r0.size() - 1);
        StringBuilder sb = this.sb;
        sb.append("</");
        sb.append(strRemove);
        sb.append(">");
        return this;
    }

    public byte[] getBytes() {
        return toString().getBytes(StringUtils.UTF8);
    }

    public XmlWriter start(String str) {
        StringBuilder sb = this.sb;
        sb.append("<");
        sb.append(str);
        sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String str2, String str3) {
        StringBuilder sb = this.sb;
        sb.append("<");
        sb.append(str);
        writeAttr(str2, str3);
        this.sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb = this.sb;
        sb.append("<");
        sb.append(str);
        for (int i9 = 0; i9 < Math.min(strArr.length, strArr2.length); i9++) {
            writeAttr(strArr[i9], strArr2[i9]);
        }
        this.sb.append(">");
        this.tags.add(str);
        return this;
    }

    public String toString() {
        return this.sb.toString();
    }

    public XmlWriter value(String str) {
        appendEscapedString(str, this.sb);
        return this;
    }
}
