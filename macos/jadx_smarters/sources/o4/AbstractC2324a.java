package o4;

import P.AbstractC0980w;
import android.content.Context;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.internal.cast.zzaa;
import com.google.android.gms.internal.cast.zzln;
import com.google.android.gms.internal.cast.zzr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import t4.C2775b;
import u0.C2811K;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2324a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2775b f45816a = new C2775b("CastButtonFactory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f45817b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f45818c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static AbstractC2319B f45819d = null;

    public static MenuItem a(Context context, Menu menu, int i9) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        com.google.android.gms.common.internal.r.m(menu);
        MenuItem menuItemFindItem = menu.findItem(i9);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i9)));
        }
        boolean zI = i(context);
        try {
            MediaRouteActionProvider mediaRouteActionProviderD = d(menuItemFindItem);
            if (mediaRouteActionProviderD != null && j(context, null)) {
                mediaRouteActionProviderD.o(true);
            }
            g(context, menuItemFindItem, e(null, zI));
            f45817b.add(new WeakReference(menuItemFindItem));
            f(null, zI);
            return menuItemFindItem;
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i9)), e9);
        }
    }

    public static void b(Context context, MediaRouteButton mediaRouteButton) {
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        boolean zI = i(context);
        if (mediaRouteButton != null) {
            if (j(context, null)) {
                mediaRouteButton.setAlwaysVisible(true);
            }
            h(context, mediaRouteButton, e(null, zI));
            f45818c.add(new WeakReference(mediaRouteButton));
        }
        f(null, zI);
    }

    public static void c(AbstractC2319B abstractC2319B) {
        f45819d = abstractC2319B;
        try {
            ((e0) abstractC2319B).f45880a.f45825b.m0(false);
        } catch (RemoteException e9) {
            C2325b.f45821q.b(e9, "Unable to call %s on %s.", "setCustomMediaRouteDialogFactorySetUp", w0.class.getSimpleName());
        }
    }

    public static MediaRouteActionProvider d(MenuItem menuItem) {
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) AbstractC0980w.a(menuItem);
        if (mediaRouteActionProvider == null) {
            return null;
        }
        return mediaRouteActionProvider;
    }

    public static androidx.mediarouter.app.e e(androidx.mediarouter.app.e eVar, boolean z9) {
        if (z9) {
            return zzaa.zza();
        }
        return null;
    }

    public static void f(androidx.mediarouter.app.e eVar, boolean z9) {
        zzr.zzd(z9 ? zzln.CAST_SDK_DEFAULT_DEVICE_DIALOG : zzln.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    public static void g(Context context, MenuItem menuItem, androidx.mediarouter.app.e eVar) {
        C2811K c2811kB;
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        MediaRouteActionProvider mediaRouteActionProviderD = d(menuItem);
        if (mediaRouteActionProviderD == null) {
            throw new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider");
        }
        C2325b c2325bG = C2325b.g(context);
        if (c2325bG != null && (c2811kB = c2325bG.b()) != null) {
            mediaRouteActionProviderD.q(c2811kB);
        }
        if (eVar != null) {
            mediaRouteActionProviderD.p(eVar);
        }
    }

    public static void h(Context context, MediaRouteButton mediaRouteButton, androidx.mediarouter.app.e eVar) {
        C2811K c2811kB;
        com.google.android.gms.common.internal.r.f("Must be called from the main thread.");
        C2325b c2325bG = C2325b.g(context);
        if (c2325bG != null && (c2811kB = c2325bG.b()) != null) {
            mediaRouteButton.setRouteSelector(c2811kB);
        }
        if (eVar != null) {
            mediaRouteButton.setDialogFactory(eVar);
        }
    }

    public static boolean i(Context context) {
        C2325b c2325bG = C2325b.g(context);
        return c2325bG != null && c2325bG.a().R();
    }

    public static boolean j(Context context, androidx.mediarouter.app.e eVar) {
        return i(context);
    }
}
