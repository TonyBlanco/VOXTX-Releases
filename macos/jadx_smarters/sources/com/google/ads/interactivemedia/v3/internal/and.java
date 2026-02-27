package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class and {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20320a = "=";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20321b = "/pagead/ads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20322c = "=";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f20323d = {"TryRoom", "TryRoom", "TryRoom"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final amv f20324e;

    @Deprecated
    public and(amv amvVar) {
        this.f20324e = amvVar;
    }

    private final Uri h(Uri uri, String str) throws ane {
        String str2;
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.f20322c)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new ane("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i9 = iIndexOf + 1;
                        str2 = string.substring(0, i9) + "dc_ms=" + str + ";" + string.substring(i9);
                    } else {
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        str2 = string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (UnsupportedOperationException unused) {
                throw new ane("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new ane("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i10 = iIndexOf3 + 1;
        return Uri.parse(string2.substring(0, i10) + "ms=" + str + "&" + string2.substring(i10));
    }

    @Deprecated
    public final Uri a(Uri uri, Context context) throws ane {
        return h(uri, this.f20324e.f(context));
    }

    @Deprecated
    public final void b(MotionEvent motionEvent) {
        this.f20324e.k(motionEvent);
    }

    public final void c(String str, String str2) {
        this.f20320a = str;
        this.f20321b = str2;
    }

    public final void d(String str) {
        this.f20323d = str.split(",");
    }

    public final boolean e(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.f20323d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            if (uri.getHost().equals(this.f20320a)) {
                if (uri.getPath().equals(this.f20321b)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Deprecated
    public final Uri g(Uri uri, Context context) throws ane {
        try {
            return h(uri, this.f20324e.e(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new ane("Provided Uri is not in a valid state");
        }
    }
}
