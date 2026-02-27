package r0;

import D.AbstractC0529l;
import D.InterfaceC0528k;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: r0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2654b extends AbstractC0529l.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f49627e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaSessionCompat.Token f49628f;

    @Override // D.AbstractC0529l.h
    public void b(InterfaceC0528k interfaceC0528k) {
        AbstractC2653a.d(interfaceC0528k.a(), AbstractC2653a.b(AbstractC2653a.a(), this.f49627e, this.f49628f));
    }

    @Override // D.AbstractC0529l.h
    public RemoteViews d(InterfaceC0528k interfaceC0528k) {
        return null;
    }

    @Override // D.AbstractC0529l.h
    public RemoteViews e(InterfaceC0528k interfaceC0528k) {
        return null;
    }

    public C2654b h(MediaSessionCompat.Token token) {
        this.f49628f = token;
        return this;
    }

    public C2654b i(int... iArr) {
        this.f49627e = iArr;
        return this;
    }
}
