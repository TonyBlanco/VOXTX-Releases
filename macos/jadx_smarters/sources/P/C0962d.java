package P;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import j$.util.Objects;

/* JADX INFO: renamed from: P.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0962d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6813a;

    /* JADX INFO: renamed from: P.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f6814a;

        public a(ClipData clipData, int i9) {
            this.f6814a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i9) : new C0080d(clipData, i9);
        }

        public C0962d a() {
            return this.f6814a.build();
        }

        public a b(Bundle bundle) {
            this.f6814a.setExtras(bundle);
            return this;
        }

        public a c(int i9) {
            this.f6814a.setFlags(i9);
            return this;
        }

        public a d(Uri uri) {
            this.f6814a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: P.d$b */
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f6815a;

        public b(ClipData clipData, int i9) {
            this.f6815a = AbstractC0965g.a(clipData, i9);
        }

        @Override // P.C0962d.c
        public void a(Uri uri) {
            this.f6815a.setLinkUri(uri);
        }

        @Override // P.C0962d.c
        public C0962d build() {
            return new C0962d(new e(this.f6815a.build()));
        }

        @Override // P.C0962d.c
        public void setExtras(Bundle bundle) {
            this.f6815a.setExtras(bundle);
        }

        @Override // P.C0962d.c
        public void setFlags(int i9) {
            this.f6815a.setFlags(i9);
        }
    }

    /* JADX INFO: renamed from: P.d$c */
    public interface c {
        void a(Uri uri);

        C0962d build();

        void setExtras(Bundle bundle);

        void setFlags(int i9);
    }

    /* JADX INFO: renamed from: P.d$d, reason: collision with other inner class name */
    public static final class C0080d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f6816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f6819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f6820e;

        public C0080d(ClipData clipData, int i9) {
            this.f6816a = clipData;
            this.f6817b = i9;
        }

        @Override // P.C0962d.c
        public void a(Uri uri) {
            this.f6819d = uri;
        }

        @Override // P.C0962d.c
        public C0962d build() {
            return new C0962d(new g(this));
        }

        @Override // P.C0962d.c
        public void setExtras(Bundle bundle) {
            this.f6820e = bundle;
        }

        @Override // P.C0962d.c
        public void setFlags(int i9) {
            this.f6818c = i9;
        }
    }

    /* JADX INFO: renamed from: P.d$e */
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f6821a;

        public e(ContentInfo contentInfo) {
            this.f6821a = AbstractC0961c.a(O.h.f(contentInfo));
        }

        @Override // P.C0962d.f
        public ContentInfo a() {
            return this.f6821a;
        }

        @Override // P.C0962d.f
        public ClipData b() {
            return this.f6821a.getClip();
        }

        @Override // P.C0962d.f
        public int getFlags() {
            return this.f6821a.getFlags();
        }

        @Override // P.C0962d.f
        public int getSource() {
            return this.f6821a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f6821a + "}";
        }
    }

    /* JADX INFO: renamed from: P.d$f */
    public interface f {
        ContentInfo a();

        ClipData b();

        int getFlags();

        int getSource();
    }

    /* JADX INFO: renamed from: P.d$g */
    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f6822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f6825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f6826e;

        public g(C0080d c0080d) {
            this.f6822a = (ClipData) O.h.f(c0080d.f6816a);
            this.f6823b = O.h.b(c0080d.f6817b, 0, 5, "source");
            this.f6824c = O.h.e(c0080d.f6818c, 1);
            this.f6825d = c0080d.f6819d;
            this.f6826e = c0080d.f6820e;
        }

        @Override // P.C0962d.f
        public ContentInfo a() {
            return null;
        }

        @Override // P.C0962d.f
        public ClipData b() {
            return this.f6822a;
        }

        @Override // P.C0962d.f
        public int getFlags() {
            return this.f6824c;
        }

        @Override // P.C0962d.f
        public int getSource() {
            return this.f6823b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f6822a.getDescription());
            sb.append(", source=");
            sb.append(C0962d.e(this.f6823b));
            sb.append(", flags=");
            sb.append(C0962d.a(this.f6824c));
            if (this.f6825d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f6825d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f6826e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public C0962d(f fVar) {
        this.f6813a = fVar;
    }

    public static String a(int i9) {
        return (i9 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i9);
    }

    public static String e(int i9) {
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? String.valueOf(i9) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C0962d g(ContentInfo contentInfo) {
        return new C0962d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f6813a.b();
    }

    public int c() {
        return this.f6813a.getFlags();
    }

    public int d() {
        return this.f6813a.getSource();
    }

    public ContentInfo f() {
        ContentInfo contentInfoA = this.f6813a.a();
        Objects.requireNonNull(contentInfoA);
        return AbstractC0961c.a(contentInfoA);
    }

    public String toString() {
        return this.f6813a.toString();
    }
}
