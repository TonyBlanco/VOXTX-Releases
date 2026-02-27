package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f26494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(T t9, ArrayList arrayList) {
        super(t9, null);
        this.f26494d = t9;
        this.f26493c = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.S
    public final void a() {
        T t9 = this.f26494d;
        t9.f26515a.f26608o.f26564p = T.y(t9);
        ArrayList arrayList = this.f26493c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a.f fVar = (a.f) arrayList.get(i9);
            T t10 = this.f26494d;
            fVar.getRemoteService(t10.f26529o, t10.f26515a.f26608o.f26564p);
        }
    }
}
