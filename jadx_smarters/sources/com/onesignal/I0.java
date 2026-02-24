package com.onesignal;

import com.onesignal.F1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38334a = false;

    public abstract String a();

    public abstract void b(F1.x xVar);

    public boolean c() {
        return this.f38334a;
    }

    public void d(boolean z9) {
        this.f38334a = z9;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + a() + " prompted=" + this.f38334a + '}';
    }
}
