package org.apache.http.cookie;

import java.util.Date;
import org.apache.http.annotation.Obsolete;

/* JADX INFO: loaded from: classes4.dex */
public interface SetCookie extends Cookie {
    @Obsolete
    void setComment(String str);

    void setDomain(String str);

    void setExpiryDate(Date date);

    void setPath(String str);

    void setSecure(boolean z9);

    void setValue(String str);

    @Obsolete
    void setVersion(int i9);
}
