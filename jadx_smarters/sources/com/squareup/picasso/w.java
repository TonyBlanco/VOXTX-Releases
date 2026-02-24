package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.t;
import d.AbstractC1617D;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f39166s = TimeUnit.SECONDS.toNanos(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f39170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f39173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f39175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f39176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f39177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f39178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f39179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f39180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f39181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f39182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bitmap.Config f39183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t.f f39184r;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f39185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f39189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f39190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f39191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f39192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f39193i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f39194j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f39195k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f39196l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f39197m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Bitmap.Config f39198n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public t.f f39199o;

        public b(Uri uri, int i9, Bitmap.Config config) {
            this.f39185a = uri;
            this.f39186b = i9;
            this.f39198n = config;
        }

        public w a() {
            boolean z9 = this.f39191g;
            if (z9 && this.f39190f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f39190f && this.f39188d == 0 && this.f39189e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z9 && this.f39188d == 0 && this.f39189e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f39199o == null) {
                this.f39199o = t.f.NORMAL;
            }
            return new w(this.f39185a, this.f39186b, this.f39187c, this.f39197m, this.f39188d, this.f39189e, this.f39190f, this.f39191g, this.f39192h, this.f39193i, this.f39194j, this.f39195k, this.f39196l, this.f39198n, this.f39199o);
        }

        public b b() {
            if (this.f39191g) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f39190f = true;
            return this;
        }

        public b c() {
            if (this.f39190f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.f39191g = true;
            return this;
        }

        public boolean d() {
            return (this.f39185a == null && this.f39186b == 0) ? false : true;
        }

        public boolean e() {
            return (this.f39188d == 0 && this.f39189e == 0) ? false : true;
        }

        public b f(int i9, int i10) {
            if (i9 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i10 == 0 && i9 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f39188d = i9;
            this.f39189e = i10;
            return this;
        }
    }

    public w(Uri uri, int i9, String str, List list, int i10, int i11, boolean z9, boolean z10, boolean z11, float f9, float f10, float f11, boolean z12, Bitmap.Config config, t.f fVar) {
        this.f39170d = uri;
        this.f39171e = i9;
        this.f39172f = str;
        this.f39173g = list == null ? null : Collections.unmodifiableList(list);
        this.f39174h = i10;
        this.f39175i = i11;
        this.f39176j = z9;
        this.f39177k = z10;
        this.f39178l = z11;
        this.f39179m = f9;
        this.f39180n = f10;
        this.f39181o = f11;
        this.f39182p = z12;
        this.f39183q = config;
        this.f39184r = fVar;
    }

    public String a() {
        Uri uri = this.f39170d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f39171e);
    }

    public boolean b() {
        return this.f39173g != null;
    }

    public boolean c() {
        return (this.f39174h == 0 && this.f39175i == 0) ? false : true;
    }

    public String d() {
        StringBuilder sb;
        long jNanoTime = System.nanoTime() - this.f39168b;
        if (jNanoTime > f39166s) {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(jNanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    public boolean e() {
        return c() || this.f39179m != 0.0f;
    }

    public boolean f() {
        return e() || b();
    }

    public String g() {
        return "[R" + this.f39167a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i9 = this.f39171e;
        if (i9 > 0) {
            sb.append(i9);
        } else {
            sb.append(this.f39170d);
        }
        List list = this.f39173g;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f39173g.iterator();
            if (it.hasNext()) {
                AbstractC1617D.a(it.next());
                sb.append(TokenParser.SP);
                throw null;
            }
        }
        if (this.f39172f != null) {
            sb.append(" stableKey(");
            sb.append(this.f39172f);
            sb.append(')');
        }
        if (this.f39174h > 0) {
            sb.append(" resize(");
            sb.append(this.f39174h);
            sb.append(',');
            sb.append(this.f39175i);
            sb.append(')');
        }
        if (this.f39176j) {
            sb.append(" centerCrop");
        }
        if (this.f39177k) {
            sb.append(" centerInside");
        }
        if (this.f39179m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f39179m);
            if (this.f39182p) {
                sb.append(" @ ");
                sb.append(this.f39180n);
                sb.append(',');
                sb.append(this.f39181o);
            }
            sb.append(')');
        }
        if (this.f39183q != null) {
            sb.append(TokenParser.SP);
            sb.append(this.f39183q);
        }
        sb.append('}');
        return sb.toString();
    }
}
