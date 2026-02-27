package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* JADX INFO: loaded from: classes4.dex */
public class FormElement extends Element {
    private final Elements elements;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
        this.elements = new Elements();
    }

    public FormElement addElement(Element element) {
        this.elements.add(element);
        return this;
    }

    public Elements elements() {
        return this.elements;
    }

    public List<Connection.KeyVal> formData() {
        String strVal;
        ArrayList arrayList = new ArrayList();
        for (Element elementFirst : this.elements) {
            if (elementFirst.tag().isFormSubmittable() && !elementFirst.hasAttr("disabled")) {
                String strAttr = elementFirst.attr("name");
                if (strAttr.length() != 0) {
                    String strAttr2 = elementFirst.attr("type");
                    if ("select".equals(elementFirst.tagName())) {
                        Iterator<Element> it = elementFirst.select("option[selected]").iterator();
                        boolean z9 = false;
                        while (it.hasNext()) {
                            arrayList.add(HttpConnection.KeyVal.create(strAttr, it.next().val()));
                            z9 = true;
                        }
                        if (!z9 && (elementFirst = elementFirst.select("option").first()) != null) {
                            strVal = elementFirst.val();
                        }
                    } else {
                        if ("checkbox".equalsIgnoreCase(strAttr2) || "radio".equalsIgnoreCase(strAttr2)) {
                            if (elementFirst.hasAttr("checked")) {
                                if (elementFirst.val().length() <= 0) {
                                    strVal = "on";
                                }
                            }
                        }
                        strVal = elementFirst.val();
                    }
                    arrayList.add(HttpConnection.KeyVal.create(strAttr, strVal));
                }
            }
        }
        return arrayList;
    }

    public Connection submit() {
        String strAbsUrl = hasAttr("action") ? absUrl("action") : baseUri();
        Validate.notEmpty(strAbsUrl, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        return Jsoup.connect(strAbsUrl).data(formData()).method(attr("method").toUpperCase().equals("POST") ? Connection.Method.POST : Connection.Method.GET);
    }
}
