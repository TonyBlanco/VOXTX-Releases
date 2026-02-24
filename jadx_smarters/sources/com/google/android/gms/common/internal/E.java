package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f26751a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f26752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26753d;

    public E(Intent intent, Activity activity, int i9) {
        this.f26751a = intent;
        this.f26752c = activity;
        this.f26753d = i9;
    }

    @Override // com.google.android.gms.common.internal.G
    public final void a() {
        Intent intent = this.f26751a;
        if (intent != null) {
            this.f26752c.startActivityForResult(intent, this.f26753d);
        }
    }
}
