package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahv extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ahw f19808a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final aly f19809d;

    public ahv(aly alyVar, byte[] bArr) {
        this.f19809d = alyVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        ahw ahwVar = this.f19808a;
        if (ahwVar != null) {
            ahwVar.b();
        }
    }

    public final void b(ahw ahwVar) {
        this.f19808a = ahwVar;
    }
}
