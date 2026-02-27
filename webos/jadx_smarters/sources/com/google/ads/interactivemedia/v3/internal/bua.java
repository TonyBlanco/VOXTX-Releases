package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum bua implements bqp {
    DF_NONE(0),
    DF_HTTPHEADER(1),
    DF_COOKIE(2),
    DF_URL(3),
    DF_CGI_ARGS(4),
    DF_HOST_ORDER(5),
    DF_BYTE_SWAPPED(6),
    DF_LOGGING_ELEMENT_TYPE_ID(7);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bqq f22416i = new bug(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22418k;

    bua(int i9) {
        this.f22418k = i9;
    }

    public static bqq a() {
        return f22416i;
    }

    public static bua b(int i9) {
        switch (i9) {
            case 0:
                return DF_NONE;
            case 1:
                return DF_HTTPHEADER;
            case 2:
                return DF_COOKIE;
            case 3:
                return DF_URL;
            case 4:
                return DF_CGI_ARGS;
            case 5:
                return DF_HOST_ORDER;
            case 6:
                return DF_BYTE_SWAPPED;
            case 7:
                return DF_LOGGING_ELEMENT_TYPE_ID;
            default:
                return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqp
    public final int getNumber() {
        return this.f22418k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22418k);
    }
}
