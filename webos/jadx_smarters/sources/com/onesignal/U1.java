package com.onesignal;

import com.onesignal.T1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class U1 implements G1 {

    public class a extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I1 f38605a;

        public a(I1 i12) {
            this.f38605a = i12;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            this.f38605a.a(i9, str, th);
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            this.f38605a.onSuccess(str);
        }
    }

    @Override // com.onesignal.G1
    public void a(String str, JSONObject jSONObject, I1 i12) {
        T1.j(str, jSONObject, new a(i12));
    }
}
