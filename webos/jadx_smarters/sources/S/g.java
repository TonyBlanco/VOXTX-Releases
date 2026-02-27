package S;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9365a;

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f9366a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9366a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f9366a = (InputContentInfo) obj;
        }

        @Override // S.g.c
        public Object a() {
            return this.f9366a;
        }

        @Override // S.g.c
        public Uri b() {
            return this.f9366a.getContentUri();
        }

        @Override // S.g.c
        public void c() {
            this.f9366a.requestPermission();
        }

        @Override // S.g.c
        public Uri d() {
            return this.f9366a.getLinkUri();
        }

        @Override // S.g.c
        public ClipDescription getDescription() {
            return this.f9366a.getDescription();
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClipDescription f9368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f9369c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9367a = uri;
            this.f9368b = clipDescription;
            this.f9369c = uri2;
        }

        @Override // S.g.c
        public Object a() {
            return null;
        }

        @Override // S.g.c
        public Uri b() {
            return this.f9367a;
        }

        @Override // S.g.c
        public void c() {
        }

        @Override // S.g.c
        public Uri d() {
            return this.f9369c;
        }

        @Override // S.g.c
        public ClipDescription getDescription() {
            return this.f9368b;
        }
    }

    public interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public g(c cVar) {
        this.f9365a = cVar;
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f9365a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public static g f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new g(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f9365a.b();
    }

    public ClipDescription b() {
        return this.f9365a.getDescription();
    }

    public Uri c() {
        return this.f9365a.d();
    }

    public void d() {
        this.f9365a.c();
    }

    public Object e() {
        return this.f9365a.a();
    }
}
