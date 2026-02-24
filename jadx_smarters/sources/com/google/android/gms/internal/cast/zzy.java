package com.google.android.gms.internal.cast;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.app.a;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o4.AbstractC2340q;
import o4.AbstractC2341s;
import o4.AbstractC2342t;
import o4.C2325b;
import t0.f;
import t4.C2775b;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy extends a implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final C2775b zzh = new C2775b("DeviceChooserDialog");
    TextView zza;
    ListView zzb;
    View zzc;
    LinearLayout zzd;
    LinearLayout zze;
    LinearLayout zzf;
    RelativeLayout zzg;
    private final zzw zzi;
    private final List zzj;
    private final long zzk;
    private final boolean zzl;
    private C2812L zzm;
    private zzdy zzn;
    private C2811K zzo;
    private ArrayAdapter zzp;
    private boolean zzq;
    private Runnable zzr;
    private C2812L.h zzs;

    public zzy(Context context, int i9) {
        super(context, 0);
        this.zzj = new CopyOnWriteArrayList();
        this.zzo = C2811K.f50924c;
        this.zzi = new zzw(this);
        this.zzk = zzac.zza();
        this.zzl = zzac.zzc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        C2812L c2812l = this.zzm;
        if (c2812l != null) {
            ArrayList arrayList = new ArrayList(c2812l.m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, zzx.zza);
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzv) it.next()).zza(arrayList);
            }
        }
    }

    private final void zzg() {
        C2775b c2775b = zzh;
        c2775b.a("startDiscovery", new Object[0]);
        C2812L c2812l = this.zzm;
        if (c2812l == null) {
            c2775b.a("Can't start discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        c2812l.b(this.zzo, this.zzi, 1);
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzc(1);
        }
    }

    private final void zzh() {
        C2775b c2775b = zzh;
        c2775b.a("stopDiscovery", new Object[0]);
        C2812L c2812l = this.zzm;
        if (c2812l == null) {
            c2775b.a("Can't stop discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        c2812l.s(this.zzi);
        this.zzm.b(this.zzo, this.zzi, 0);
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzd();
        }
    }

    private final void zzi(int i9) {
        if (this.zzd == null || this.zze == null || this.zzf == null || this.zzg == null) {
            return;
        }
        C2325b c2325bD = C2325b.d();
        if (this.zzl && c2325bD != null && !c2325bD.k().zza()) {
            i9 = 3;
        }
        int i10 = i9 - 1;
        if (i10 == 0) {
            setTitle(AbstractC2342t.f46003e);
            ((LinearLayout) r.m(this.zzd)).setVisibility(0);
            ((LinearLayout) r.m(this.zze)).setVisibility(8);
            ((LinearLayout) r.m(this.zzf)).setVisibility(8);
            ((RelativeLayout) r.m(this.zzg)).setVisibility(8);
            return;
        }
        if (i10 != 1) {
            setTitle(AbstractC2342t.f45997E);
            ((LinearLayout) r.m(this.zzd)).setVisibility(8);
            ((LinearLayout) r.m(this.zze)).setVisibility(8);
            ((LinearLayout) r.m(this.zzf)).setVisibility(0);
            ((RelativeLayout) r.m(this.zzg)).setVisibility(0);
            return;
        }
        setTitle(AbstractC2342t.f46003e);
        ((LinearLayout) r.m(this.zzd)).setVisibility(8);
        ((LinearLayout) r.m(this.zze)).setVisibility(0);
        ((LinearLayout) r.m(this.zzf)).setVisibility(8);
        ((RelativeLayout) r.m(this.zzg)).setVisibility(0);
    }

    @Override // d.DialogC1642u, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        zzdy zzdyVar = this.zzn;
        if (zzdyVar != null) {
            zzdyVar.removeCallbacks(this.zzr);
        }
        View view = this.zzc;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzb(this.zzs);
        }
        this.zzj.clear();
    }

    public final C2811K getRouteSelector() {
        return this.zzo;
    }

    @Override // androidx.mediarouter.app.a, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.zzq = true;
        zzg();
        zzf();
    }

    @Override // androidx.mediarouter.app.a, d.DialogC1642u, androidx.activity.g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) super.findViewById(f.f50554u);
        if (listView == null) {
            return;
        }
        setContentView(AbstractC2341s.f45987a);
        this.zzp = (ArrayAdapter) listView.getAdapter();
        ListView listView2 = (ListView) findViewById(AbstractC2340q.f45927A);
        this.zzb = listView2;
        if (listView2 != null) {
            listView2.setAdapter((ListAdapter) this.zzp);
            this.zzb.setOnItemClickListener(listView.getOnItemClickListener());
        }
        this.zza = (TextView) findViewById(AbstractC2340q.f45929C);
        this.zzd = (LinearLayout) findViewById(AbstractC2340q.f45928B);
        this.zze = (LinearLayout) findViewById(AbstractC2340q.f45932F);
        this.zzf = (LinearLayout) findViewById(AbstractC2340q.f45930D);
        this.zzg = (RelativeLayout) findViewById(AbstractC2340q.f45941O);
        TextView textView = (TextView) findViewById(AbstractC2340q.f45985z);
        TextView textView2 = (TextView) findViewById(AbstractC2340q.f45931E);
        zzt zztVar = new zzt(this);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnClickListener(zztVar);
        }
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setOnClickListener(zztVar);
        }
        Button button = (Button) findViewById(AbstractC2340q.f45938L);
        if (button != null) {
            button.setOnClickListener(new zzu(this));
        }
        View viewFindViewById = findViewById(R.id.empty);
        this.zzc = viewFindViewById;
        if (this.zzb != null && viewFindViewById != null) {
            ((View) r.m(viewFindViewById)).getViewTreeObserver().addOnGlobalLayoutListener(this);
            ((ListView) r.m(this.zzb)).setEmptyView((View) r.m(this.zzc));
        }
        this.zzr = new Runnable() { // from class: com.google.android.gms.internal.cast.zzs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        };
    }

    @Override // androidx.mediarouter.app.a, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.zzq = false;
        super.onDetachedFromWindow();
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.zzc;
        if (view == null) {
            return;
        }
        Object tag = view.getTag();
        int visibility = this.zzc.getVisibility();
        if (tag == null || ((Integer) tag).intValue() != visibility) {
            if (visibility == 0) {
                zzi(1);
                zzdy zzdyVar = this.zzn;
                if (zzdyVar != null) {
                    zzdyVar.removeCallbacks(this.zzr);
                    this.zzn.postDelayed(this.zzr, this.zzk);
                }
            } else {
                setTitle(AbstractC2342t.f46003e);
            }
            ((View) r.m(this.zzc)).setTag(Integer.valueOf(visibility));
        }
    }

    @Override // androidx.mediarouter.app.a
    public final void refreshRoutes() {
        super.refreshRoutes();
        zzf();
    }

    @Override // androidx.mediarouter.app.a
    public final void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        super.setRouteSelector(c2811k);
        if (this.zzo.equals(c2811k)) {
            return;
        }
        this.zzo = c2811k;
        zzh();
        if (this.zzq) {
            zzg();
        }
        zzf();
    }

    @Override // androidx.mediarouter.app.a, d.DialogC1642u, android.app.Dialog
    public final void setTitle(int i9) {
        TextView textView = this.zza;
        if (textView != null) {
            textView.setText(i9);
        }
    }

    @Override // androidx.mediarouter.app.a, d.DialogC1642u, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.zza;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final /* synthetic */ void zzd() {
        zzi(2);
        for (zzv zzvVar : this.zzj) {
        }
    }

    public final void zze() {
        this.zzm = C2812L.j(getContext());
        this.zzn = new zzdy(Looper.getMainLooper());
        zzv zzvVarZza = zzp.zza();
        if (zzvVarZza != null) {
            this.zzj.add(zzvVarZza);
        }
    }
}
