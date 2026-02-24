package X7;

import W7.c;

/* JADX INFO: loaded from: classes4.dex */
public class b extends W7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10482a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10483c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10485e;

    public void a(c cVar) {
        boolean z9 = this.f10482a;
        if (z9 && this.f10483c == 1) {
            cVar.d(this.f10484d, this.f10485e);
        } else if (!z9 && this.f10483c == 1) {
            cVar.a(this.f10484d, this.f10485e);
        }
        this.f10483c = Integer.MIN_VALUE;
    }

    @Override // W7.a, W7.g
    public void c(String str) {
        this.f10484d = str;
    }

    @Override // W7.a, W7.g
    public void h(int i9) {
        if (i9 == 0) {
            this.f10482a = false;
        } else if (i9 == 1) {
            this.f10482a = true;
        } else {
            if (i9 != 2) {
                return;
            }
            this.f10482a = false;
        }
    }

    @Override // W7.a, W7.g
    public void n(float f9) {
        this.f10485e = f9;
    }

    @Override // W7.a, W7.g
    public void onError(int i9) {
        if (i9 == 1) {
            this.f10483c = i9;
        }
    }
}
