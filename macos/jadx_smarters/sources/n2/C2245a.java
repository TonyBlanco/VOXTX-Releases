package n2;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import n2.f;

/* JADX INFO: renamed from: n2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2245a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f44887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f44889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f44890d;

    /* JADX INFO: renamed from: n2.a$a, reason: collision with other inner class name */
    public static class C0393a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44891a;

        public C0393a(int i9) {
            this.f44891a = i9;
        }

        @Override // n2.f.a
        public Animation build() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.f44891a);
            return alphaAnimation;
        }
    }

    public C2245a() {
        this(300);
    }

    public C2245a(int i9) {
        this(new g(new C0393a(i9)), i9);
    }

    public C2245a(g gVar, int i9) {
        this.f44887a = gVar;
        this.f44888b = i9;
    }

    @Override // n2.d
    public c a(boolean z9, boolean z10) {
        return z9 ? e.c() : z10 ? b() : c();
    }

    public final c b() {
        if (this.f44889c == null) {
            this.f44889c = new b(this.f44887a.a(false, true), this.f44888b);
        }
        return this.f44889c;
    }

    public final c c() {
        if (this.f44890d == null) {
            this.f44890d = new b(this.f44887a.a(false, false), this.f44888b);
        }
        return this.f44890d;
    }
}
