package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class BillingAddOrderPojo {

    @SerializedName(Name.MARK)
    @Expose
    private String id;

    @SerializedName("is_purchased")
    @Expose
    private Boolean isPurchased;

    public String getId() {
        return this.id;
    }

    public Boolean getIsPurchased() {
        return this.isPurchased;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsPurchased(Boolean bool) {
        this.isPurchased = bool;
    }
}
