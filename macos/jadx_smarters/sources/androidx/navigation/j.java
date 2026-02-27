package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16398c;

    public j(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public j(Uri uri, String str, String str2) {
        this.f16396a = uri;
        this.f16397b = str;
        this.f16398c = str2;
    }

    public String a() {
        return this.f16397b;
    }

    public String b() {
        return this.f16398c;
    }

    public Uri c() {
        return this.f16396a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.f16396a != null) {
            sb.append(" uri=");
            sb.append(this.f16396a.toString());
        }
        if (this.f16397b != null) {
            sb.append(" action=");
            sb.append(this.f16397b);
        }
        if (this.f16398c != null) {
            sb.append(" mimetype=");
            sb.append(this.f16398c);
        }
        sb.append(" }");
        return sb.toString();
    }
}
