package com.nst.iptvsmarterstvbox.model.pojo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes.dex */
@Root(name = "icon", strict = false)
public class XMLTVIconPojo {

    @Attribute(name = "src", required = false)
    private String src;

    public String getSrc() {
        return this.src;
    }

    public void setSrc(String str) {
        this.src = str;
    }

    public String toString() {
        return "ClassPojo [src = " + this.src + "]";
    }
}
