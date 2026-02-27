package R8;

import D.AbstractC0519b;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.m;

/* JADX INFO: loaded from: classes4.dex */
public class b extends c {
    public b(androidx.appcompat.app.b bVar) {
        super(bVar);
    }

    @Override // R8.e
    public void a(int i9, String... strArr) {
        AbstractC0519b.h((Activity) c(), strArr, i9);
    }

    @Override // R8.e
    public Context b() {
        return (Context) c();
    }

    @Override // R8.e
    public boolean i(String str) {
        return AbstractC0519b.l((Activity) c(), str);
    }

    @Override // R8.c
    public m l() {
        return ((androidx.appcompat.app.b) c()).getSupportFragmentManager();
    }
}
