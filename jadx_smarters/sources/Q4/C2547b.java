package q4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.s3.internal.Constants;
import p4.C2427b;

/* JADX INFO: renamed from: q4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2547b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2427b f46834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f46835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f46836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2548c f46837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f46838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2546a f46840h;

    public C2547b(Context context) {
        this(context, new C2427b(-1, 0, 0));
    }

    public C2547b(Context context, C2427b c2427b) {
        this.f46833a = context;
        this.f46834b = c2427b;
        this.f46837e = new C2548c();
        e();
    }

    public final void a() {
        e();
        this.f46840h = null;
    }

    public final void b(Bitmap bitmap) {
        this.f46838f = bitmap;
        this.f46839g = true;
        InterfaceC2546a interfaceC2546a = this.f46840h;
        if (interfaceC2546a != null) {
            interfaceC2546a.zza(bitmap);
        }
        this.f46836d = null;
    }

    public final void c(InterfaceC2546a interfaceC2546a) {
        this.f46840h = interfaceC2546a;
    }

    public final boolean d(Uri uri) {
        if (uri == null) {
            e();
            return true;
        }
        if (uri.equals(this.f46835c)) {
            return this.f46839g;
        }
        e();
        this.f46835c = uri;
        this.f46836d = (this.f46834b.J() == 0 || this.f46834b.H() == 0) ? new f(this.f46833a, 0, 0, false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS, this) : new f(this.f46833a, this.f46834b.J(), this.f46834b.H(), false, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS, this);
        ((f) com.google.android.gms.common.internal.r.m(this.f46836d)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Uri) com.google.android.gms.common.internal.r.m(this.f46835c));
        return false;
    }

    public final void e() {
        f fVar = this.f46836d;
        if (fVar != null) {
            fVar.cancel(true);
            this.f46836d = null;
        }
        this.f46835c = null;
        this.f46838f = null;
        this.f46839g = false;
    }
}
