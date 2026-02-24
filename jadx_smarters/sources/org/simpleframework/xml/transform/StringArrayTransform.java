package org.simpleframework.xml.transform;

import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
class StringArrayTransform implements Transform<String[]> {
    private final Pattern pattern;
    private final String token;

    public StringArrayTransform() {
        this(",");
    }

    public StringArrayTransform(String str) {
        this.pattern = Pattern.compile(str);
        this.token = str;
    }

    private String[] read(String str, String str2) {
        String[] strArrSplit = this.pattern.split(str);
        for (int i9 = 0; i9 < strArrSplit.length; i9++) {
            String str3 = strArrSplit[i9];
            if (str3 != null) {
                strArrSplit[i9] = str3.trim();
            }
        }
        return strArrSplit;
    }

    private String write(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(str);
                    sb.append(TokenParser.SP);
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String[] read(String str) {
        return read(str, this.token);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(String[] strArr) {
        return write(strArr, this.token);
    }
}
