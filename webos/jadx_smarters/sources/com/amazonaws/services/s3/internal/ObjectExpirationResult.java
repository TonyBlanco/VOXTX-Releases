package com.amazonaws.services.s3.internal;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface ObjectExpirationResult {
    Date getExpirationTime();

    String getExpirationTimeRuleId();

    void setExpirationTime(Date date);

    void setExpirationTimeRuleId(String str);
}
