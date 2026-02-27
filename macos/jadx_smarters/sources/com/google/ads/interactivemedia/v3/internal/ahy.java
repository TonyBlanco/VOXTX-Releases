package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ahy extends ahu {
    public ahy(aly alyVar, HashSet hashSet, JSONObject jSONObject, long j9, byte[] bArr) {
        super(alyVar, hashSet, jSONObject, j9, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahv
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        agz agzVarA = agz.a();
        if (agzVarA != null) {
            for (agt agtVar : agzVarA.c()) {
                if (((ahu) this).f19805a.contains(agtVar.i())) {
                    agtVar.h().d(str, this.f19807c);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f19806b.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahv, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
