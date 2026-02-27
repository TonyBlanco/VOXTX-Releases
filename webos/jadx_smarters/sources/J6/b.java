package J6;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f3380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f3381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Intent f3384g;

    public b(Intent intent) {
        this(null, null, null, null, null, null, intent);
    }

    public b(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f3378a = str;
        this.f3379b = str2;
        this.f3380c = bArr;
        this.f3381d = num;
        this.f3382e = str3;
        this.f3383f = str4;
        this.f3384g = intent;
    }

    public String a() {
        return this.f3378a;
    }

    public String toString() {
        byte[] bArr = this.f3380c;
        return "Format: " + this.f3379b + "\nContents: " + this.f3378a + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\nOrientation: " + this.f3381d + "\nEC level: " + this.f3382e + "\nBarcode image: " + this.f3383f + "\nOriginal intent: " + this.f3384g + '\n';
    }
}
