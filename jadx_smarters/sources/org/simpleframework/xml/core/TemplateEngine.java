package org.simpleframework.xml.core;

import org.simpleframework.xml.filter.Filter;

/* JADX INFO: loaded from: classes4.dex */
class TemplateEngine {
    private Filter filter;
    private int off;
    private Template source = new Template();
    private Template name = new Template();
    private Template text = new Template();

    public TemplateEngine(Filter filter) {
        this.filter = filter;
    }

    private void name() {
        while (true) {
            int i9 = this.off;
            Template template = this.source;
            if (i9 >= template.count) {
                break;
            }
            char[] cArr = template.buf;
            this.off = i9 + 1;
            char c9 = cArr[i9];
            if (c9 == '}') {
                replace();
                break;
            }
            this.name.append(c9);
        }
        if (this.name.length() > 0) {
            this.text.append("${");
            this.text.append(this.name);
        }
    }

    private void parse() {
        while (true) {
            int i9 = this.off;
            Template template = this.source;
            int i10 = template.count;
            if (i9 >= i10) {
                return;
            }
            char[] cArr = template.buf;
            int i11 = i9 + 1;
            this.off = i11;
            char c9 = cArr[i9];
            if (c9 == '$' && i11 < i10) {
                this.off = i9 + 2;
                if (cArr[i11] == '{') {
                    name();
                } else {
                    this.off = i9 + 1;
                }
            }
            this.text.append(c9);
        }
    }

    private void replace() {
        if (this.name.length() > 0) {
            replace(this.name);
        }
        this.name.clear();
    }

    private void replace(String str) {
        Template template;
        String strReplace = this.filter.replace(str);
        if (strReplace == null) {
            this.text.append("${");
            this.text.append(str);
            template = this.text;
            strReplace = "}";
        } else {
            template = this.text;
        }
        template.append(strReplace);
    }

    private void replace(Template template) {
        replace(template.toString());
    }

    public void clear() {
        this.name.clear();
        this.text.clear();
        this.source.clear();
        this.off = 0;
    }

    public String process(String str) {
        if (str.indexOf(36) < 0) {
            return str;
        }
        try {
            this.source.append(str);
            parse();
            return this.text.toString();
        } finally {
            clear();
        }
    }
}
