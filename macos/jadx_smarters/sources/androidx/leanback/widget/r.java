package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15765a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15766b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15767c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f15768d = 50.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15769e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f15770f;

        public final int a() {
            return this.f15767c;
        }

        public final float b() {
            return this.f15768d;
        }

        public final int c() {
            return this.f15765a;
        }

        public boolean d() {
            return this.f15770f;
        }

        public final void e(int i9) {
            this.f15767c = i9;
        }

        public final void f(float f9) {
            if ((f9 < 0.0f || f9 > 100.0f) && f9 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f15768d = f9;
        }

        public final void g(boolean z9) {
            this.f15769e = z9;
        }

        public final void h(int i9) {
            this.f15765a = i9;
        }
    }
}
