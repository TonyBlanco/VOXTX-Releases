package com.onesignal;

import com.amazonaws.util.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V1 {
    public static SimpleDateFormat a() {
        return new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
    }
}
