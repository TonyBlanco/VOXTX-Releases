package a4;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import d4.k0;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: renamed from: a4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1089c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1089c f11611g = new C1089c(-1, DefaultRenderer.BACKGROUND_COLOR, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f11617f;

    public C1089c(int i9, int i10, int i11, int i12, int i13, Typeface typeface) {
        this.f11612a = i9;
        this.f11613b = i10;
        this.f11614c = i11;
        this.f11615d = i12;
        this.f11616e = i13;
        this.f11617f = typeface;
    }

    public static C1089c a(CaptioningManager.CaptionStyle captionStyle) {
        return k0.f39777a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    public static C1089c b(CaptioningManager.CaptionStyle captionStyle) {
        return new C1089c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public static C1089c c(CaptioningManager.CaptionStyle captionStyle) {
        return new C1089c(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f11611g.f11612a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f11611g.f11613b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f11611g.f11614c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f11611g.f11615d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f11611g.f11616e, captionStyle.getTypeface());
    }
}
