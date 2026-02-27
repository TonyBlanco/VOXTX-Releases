package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f22680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f22682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f22683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f22686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22687h;

    public db() {
        this.f22681b = 1;
        this.f22683d = Collections.emptyMap();
        this.f22685f = -1L;
    }

    public /* synthetic */ db(dc dcVar) {
        this.f22680a = dcVar.f22688a;
        this.f22681b = dcVar.f22689b;
        this.f22682c = dcVar.f22690c;
        this.f22683d = dcVar.f22691d;
        this.f22684e = dcVar.f22692e;
        this.f22685f = dcVar.f22693f;
        this.f22686g = dcVar.f22694g;
        this.f22687h = dcVar.f22695h;
    }

    public final dc a() {
        if (this.f22680a != null) {
            return new dc(this.f22680a, this.f22681b, this.f22682c, this.f22683d, this.f22684e, this.f22685f, this.f22686g, this.f22687h, null);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void b(int i9) {
        this.f22687h = i9;
    }

    public final void c(byte[] bArr) {
        this.f22682c = bArr;
    }

    public final void d() {
        this.f22681b = 2;
    }

    public final void e(Map map) {
        this.f22683d = map;
    }

    public final void f(String str) {
        this.f22686g = str;
    }

    public final void g(long j9) {
        this.f22685f = j9;
    }

    public final void h(long j9) {
        this.f22684e = j9;
    }

    public final void i(Uri uri) {
        this.f22680a = uri;
    }

    public final void j(String str) {
        this.f22680a = Uri.parse(str);
    }
}
