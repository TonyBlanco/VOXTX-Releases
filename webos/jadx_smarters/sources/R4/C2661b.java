package r4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1145e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.cast.zzbs;
import com.google.android.gms.internal.cast.zzbt;
import com.google.android.gms.internal.cast.zzbu;
import com.google.android.gms.internal.cast.zzby;
import com.google.android.gms.internal.cast.zzbz;
import com.google.android.gms.internal.cast.zzca;
import com.google.android.gms.internal.cast.zzcb;
import com.google.android.gms.internal.cast.zzcd;
import com.google.android.gms.internal.cast.zzcf;
import com.google.android.gms.internal.cast.zzcg;
import com.google.android.gms.internal.cast.zzch;
import com.google.android.gms.internal.cast.zzci;
import com.google.android.gms.internal.cast.zzcl;
import com.google.android.gms.internal.cast.zzcm;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzcq;
import com.google.android.gms.internal.cast.zzcs;
import com.google.android.gms.internal.cast.zzln;
import com.google.android.gms.internal.cast.zzr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n4.C2285q;
import o4.AbstractC2345w;
import o4.C2325b;
import o4.C2328e;
import o4.C2346x;
import o4.InterfaceC2347y;
import p4.C2426a;
import p4.C2427b;
import p4.C2434i;
import p4.C2435j;
import t4.C2775b;

/* JADX INFO: renamed from: r4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2661b implements C2434i.b, InterfaceC2347y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2775b f49696h = new C2775b("UIMediaController");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f49697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2346x f49698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f49699c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f49700d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2662c f49701e = C2662c.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2434i.b f49702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2434i f49703g;

    public C2661b(Activity activity) {
        this.f49697a = activity;
        C2325b c2325bG = C2325b.g(activity);
        zzr.zzd(zzln.UI_MEDIA_CONTROLLER);
        C2346x c2346xC = c2325bG != null ? c2325bG.c() : null;
        this.f49698b = c2346xC;
        if (c2346xC != null) {
            c2346xC.a(this, C2328e.class);
            a0(c2346xC.c());
        }
    }

    public boolean A() {
        r.f("Must be called from the main thread.");
        return this.f49703g != null;
    }

    public void B(View view) {
        C2434i c2434iZ = z();
        if (c2434iZ != null && c2434iZ.q() && (this.f49697a instanceof AbstractActivityC1145e)) {
            C2435j c2435jA = C2435j.A();
            AbstractActivityC1145e abstractActivityC1145e = (AbstractActivityC1145e) this.f49697a;
            w wVarM = abstractActivityC1145e.getSupportFragmentManager().m();
            Fragment fragmentH0 = abstractActivityC1145e.getSupportFragmentManager().h0("TRACKS_CHOOSER_DIALOG_TAG");
            if (fragmentH0 != null) {
                wVarM.p(fragmentH0);
            }
            c2435jA.show(wVarM, "TRACKS_CHOOSER_DIALOG_TAG");
        }
    }

    public void C(View view, long j9) {
        C2434i c2434iZ = z();
        if (c2434iZ == null || !c2434iZ.q()) {
            return;
        }
        if (!c2434iZ.r0()) {
            c2434iZ.R(c2434iZ.g() + j9);
            return;
        }
        long jG = c2434iZ.g() + j9;
        C2662c c2662c = this.f49701e;
        c2434iZ.R(Math.min(jG, ((long) c2662c.c()) + c2662c.e()));
    }

    public void D(View view) {
        C2426a c2426aH = C2325b.e(this.f49697a).a().H();
        if (c2426aH == null || TextUtils.isEmpty(c2426aH.H())) {
            return;
        }
        ComponentName componentName = new ComponentName(this.f49697a.getApplicationContext(), c2426aH.H());
        Intent intent = new Intent();
        intent.setComponent(componentName);
        this.f49697a.startActivity(intent);
    }

    public void E(ImageView imageView) {
        C2328e c2328eC = C2325b.e(this.f49697a.getApplicationContext()).c().c();
        if (c2328eC == null || !c2328eC.c()) {
            return;
        }
        try {
            c2328eC.u(!c2328eC.s());
        } catch (IOException | IllegalArgumentException e9) {
            f49696h.c("Unable to call CastSession.setMute(boolean).", e9);
        }
    }

    public void F(ImageView imageView) {
        C2434i c2434iZ = z();
        if (c2434iZ == null || !c2434iZ.q()) {
            return;
        }
        c2434iZ.W();
    }

    public void G(View view, long j9) {
        C2434i c2434iZ = z();
        if (c2434iZ == null || !c2434iZ.q()) {
            return;
        }
        if (!c2434iZ.r0()) {
            c2434iZ.R(c2434iZ.g() - j9);
            return;
        }
        long jG = c2434iZ.g() - j9;
        C2662c c2662c = this.f49701e;
        c2434iZ.R(Math.max(jG, ((long) c2662c.d()) + c2662c.e()));
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void onSessionEnded(C2328e c2328e, int i9) {
        Z();
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void onSessionEnding(C2328e c2328e) {
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void onSessionResumeFailed(C2328e c2328e, int i9) {
        Z();
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void onSessionResumed(C2328e c2328e, boolean z9) {
        a0(c2328e);
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onSessionResuming(C2328e c2328e, String str) {
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void onSessionStartFailed(C2328e c2328e, int i9) {
        Z();
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void onSessionStarted(C2328e c2328e, String str) {
        a0(c2328e);
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void onSessionStarting(C2328e c2328e) {
    }

    @Override // o4.InterfaceC2347y
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void onSessionSuspended(C2328e c2328e, int i9) {
    }

    public void Q(View view) {
        C2434i c2434iZ = z();
        if (c2434iZ == null || !c2434iZ.q()) {
            return;
        }
        c2434iZ.J(null);
    }

    public void R(View view) {
        C2434i c2434iZ = z();
        if (c2434iZ == null || !c2434iZ.q()) {
            return;
        }
        c2434iZ.K(null);
    }

    public void S(C2434i.b bVar) {
        r.f("Must be called from the main thread.");
        this.f49702f = bVar;
    }

    public final C2662c T() {
        return this.f49701e;
    }

    public final void U(ImageView imageView, C2427b c2427b, View view, zzby zzbyVar) {
        r.f("Must be called from the main thread.");
        e0(imageView, new zzbz(imageView, this.f49697a, c2427b, 0, view, zzbyVar));
    }

    public final void V(CastSeekBar castSeekBar, int i9, boolean z9) {
        b0(i9, z9);
    }

    public final void W(CastSeekBar castSeekBar) {
        c0();
    }

    public final void X(CastSeekBar castSeekBar) {
        d0(castSeekBar.getProgress());
    }

    public final void Y(zzcq zzcqVar) {
        this.f49700d.add(zzcqVar);
    }

    public final void Z() {
        if (A()) {
            this.f49701e.f49704a = null;
            Iterator it = this.f49699c.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((AbstractC2660a) it2.next()).onSessionEnded();
                }
            }
            r.m(this.f49703g);
            this.f49703g.O(this);
            this.f49703g = null;
        }
    }

    @Override // p4.C2434i.b
    public void a() {
        f0();
        C2434i.b bVar = this.f49702f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void a0(AbstractC2345w abstractC2345w) {
        if (A() || abstractC2345w == null || !abstractC2345w.c()) {
            return;
        }
        C2328e c2328e = (C2328e) abstractC2345w;
        C2434i c2434iR = c2328e.r();
        this.f49703g = c2434iR;
        if (c2434iR != null) {
            c2434iR.b(this);
            r.m(this.f49701e);
            this.f49701e.f49704a = c2328e.r();
            Iterator it = this.f49699c.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((AbstractC2660a) it2.next()).onSessionConnected(c2328e);
                }
            }
            f0();
        }
    }

    @Override // p4.C2434i.b
    public void b() {
        f0();
        C2434i.b bVar = this.f49702f;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void b0(int i9, boolean z9) {
        if (z9) {
            Iterator it = this.f49700d.iterator();
            while (it.hasNext()) {
                ((zzcq) it.next()).zzb(((long) i9) + this.f49701e.e());
            }
        }
    }

    @Override // p4.C2434i.b
    public void c() {
        f0();
        C2434i.b bVar = this.f49702f;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void c0() {
        Iterator it = this.f49700d.iterator();
        while (it.hasNext()) {
            ((zzcq) it.next()).zza(false);
        }
    }

    @Override // p4.C2434i.b
    public void d() {
        Iterator it = this.f49699c.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((AbstractC2660a) it2.next()).onSendingRemoteMediaRequest();
            }
        }
        C2434i.b bVar = this.f49702f;
        if (bVar != null) {
            bVar.d();
        }
    }

    public final void d0(int i9) {
        Iterator it = this.f49700d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((zzcq) it.next()).zza(true);
            }
        }
        C2434i c2434iZ = z();
        if (c2434iZ == null || !c2434iZ.q()) {
            return;
        }
        long jE = ((long) i9) + this.f49701e.e();
        C2285q.a aVar = new C2285q.a();
        aVar.d(jE);
        aVar.c(c2434iZ.s() && this.f49701e.n(jE));
        c2434iZ.T(aVar.a());
    }

    @Override // p4.C2434i.b
    public void e() {
        f0();
        C2434i.b bVar = this.f49702f;
        if (bVar != null) {
            bVar.e();
        }
    }

    public final void e0(View view, AbstractC2660a abstractC2660a) {
        if (this.f49698b == null) {
            return;
        }
        List arrayList = (List) this.f49699c.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f49699c.put(view, arrayList);
        }
        arrayList.add(abstractC2660a);
        if (A()) {
            abstractC2660a.onSessionConnected((C2328e) r.m(this.f49698b.c()));
            f0();
        }
    }

    @Override // p4.C2434i.b
    public void f() {
        f0();
        C2434i.b bVar = this.f49702f;
        if (bVar != null) {
            bVar.f();
        }
    }

    public final void f0() {
        Iterator it = this.f49699c.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((AbstractC2660a) it2.next()).onMediaStatusUpdated();
            }
        }
    }

    public void g(ImageView imageView, C2427b c2427b, int i9) {
        r.f("Must be called from the main thread.");
        e0(imageView, new zzbz(imageView, this.f49697a, c2427b, i9, null, null));
    }

    public void h(ImageView imageView) {
        r.f("Must be called from the main thread.");
        imageView.setOnClickListener(new ViewOnClickListenerC2663d(this));
        e0(imageView, new zzcf(imageView, this.f49697a));
    }

    public void i(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z9) {
        r.f("Must be called from the main thread.");
        zzr.zzd(zzln.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new ViewOnClickListenerC2664e(this));
        e0(imageView, new zzcg(imageView, this.f49697a, drawable, drawable2, drawable3, view, z9));
    }

    public void j(ProgressBar progressBar) {
        k(progressBar, 1000L);
    }

    public void k(ProgressBar progressBar, long j9) {
        r.f("Must be called from the main thread.");
        e0(progressBar, new zzch(progressBar, j9));
    }

    public void l(CastSeekBar castSeekBar, long j9) {
        r.f("Must be called from the main thread.");
        zzr.zzd(zzln.SEEK_CONTROLLER);
        castSeekBar.f26374g = new C2669j(this);
        e0(castSeekBar, new zzbs(castSeekBar, j9, this.f49701e));
    }

    public void m(TextView textView, String str) {
        r.f("Must be called from the main thread.");
        n(textView, Collections.singletonList(str));
    }

    public void n(TextView textView, List list) {
        r.f("Must be called from the main thread.");
        e0(textView, new zzcd(textView, list));
    }

    public void o(TextView textView) {
        r.f("Must be called from the main thread.");
        e0(textView, new zzcn(textView));
    }

    public void p(View view) {
        r.f("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC2671l(this));
        e0(view, new zzbt(view, this.f49697a));
    }

    public void q(View view, long j9) {
        r.f("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC2667h(this, j9));
        e0(view, new zzbu(view, this.f49701e));
    }

    public void r(View view) {
        r.f("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC2670k(this));
        e0(view, new zzca(view));
    }

    public void s(View view) {
        r.f("Must be called from the main thread.");
        e0(view, new zzcb(view));
    }

    public void t(View view, long j9) {
        r.f("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC2668i(this, j9));
        e0(view, new zzci(view, this.f49701e));
    }

    public void u(View view, int i9) {
        r.f("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC2665f(this));
        e0(view, new zzcl(view, i9));
    }

    public void v(View view, int i9) {
        r.f("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC2666g(this));
        e0(view, new zzcm(view, i9));
    }

    public void w(View view, AbstractC2660a abstractC2660a) {
        r.f("Must be called from the main thread.");
        e0(view, abstractC2660a);
    }

    public void x(View view, int i9) {
        r.f("Must be called from the main thread.");
        e0(view, new zzcs(view, i9));
    }

    public void y() {
        r.f("Must be called from the main thread.");
        Z();
        this.f49699c.clear();
        C2346x c2346x = this.f49698b;
        if (c2346x != null) {
            c2346x.e(this, C2328e.class);
        }
        this.f49702f = null;
    }

    public C2434i z() {
        r.f("Must be called from the main thread.");
        return this.f49703g;
    }
}
