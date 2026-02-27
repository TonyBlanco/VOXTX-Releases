package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class aig implements AdEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdEvent.AdEventType f19831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ad f19832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19833c;

    public aig(AdEvent.AdEventType adEventType, Ad ad, Map map) {
        this.f19831a = adEventType;
        this.f19832b = ad;
        this.f19833c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aig)) {
            return false;
        }
        aig aigVar = (aig) obj;
        return this.f19831a == aigVar.f19831a && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f19832b, aigVar.f19832b) && com.google.ads.interactivemedia.v3.impl.data.k.c(this.f19833c, aigVar.f19833c);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Ad getAd() {
        return this.f19832b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Map<String, String> getAdData() {
        return this.f19833c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final AdEvent.AdEventType getType() {
        return this.f19831a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19831a, this.f19832b, this.f19833c});
    }

    public final String toString() {
        String str;
        String str2 = String.format("AdEvent[type=%s, ad=%s", this.f19831a, this.f19832b);
        if (this.f19833c == null) {
            str = "]";
        } else {
            StringBuilder sb = new StringBuilder("{");
            Iterator it = this.f19833c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            str = String.format(", adData=%s]", sb.toString());
        }
        return str2.concat(str);
    }
}
