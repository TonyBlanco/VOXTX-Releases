package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.r;

/* JADX INFO: renamed from: androidx.leanback.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1162q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15759a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f15762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f15763e;

    /* JADX INFO: renamed from: androidx.leanback.widget.q$a */
    public static final class a extends r.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15764g;

        public a(int i9) {
            this.f15764g = i9;
        }

        public int i(View view) {
            return AbstractC1163s.a(view, this, this.f15764g);
        }
    }

    public C1162q() {
        a aVar = new a(1);
        this.f15760b = aVar;
        a aVar2 = new a(0);
        this.f15761c = aVar2;
        this.f15762d = aVar2;
        this.f15763e = aVar;
    }

    public final a a() {
        return this.f15762d;
    }

    public final void b(int i9) {
        a aVar;
        this.f15759a = i9;
        if (i9 == 0) {
            this.f15762d = this.f15761c;
            aVar = this.f15760b;
        } else {
            this.f15762d = this.f15760b;
            aVar = this.f15761c;
        }
        this.f15763e = aVar;
    }
}
