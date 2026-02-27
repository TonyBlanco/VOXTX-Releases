package p4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o4.AbstractC2340q;
import o4.AbstractC2341s;
import o4.AbstractC2342t;
import o4.C2325b;
import o4.C2328e;

/* JADX INFO: renamed from: p4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2435j extends DialogInterfaceOnCancelListenerC1144d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46529a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f46530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f46531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f46532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f46533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2434i f46534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaInfo f46535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f46536i;

    @Deprecated
    public C2435j() {
    }

    public static C2435j A() {
        return new C2435j();
    }

    public static /* bridge */ /* synthetic */ void E(C2435j c2435j, U u9, U u10) {
        if (!c2435j.f46529a) {
            c2435j.P();
            return;
        }
        C2434i c2434i = (C2434i) com.google.android.gms.common.internal.r.m(c2435j.f46534g);
        if (!c2434i.q()) {
            c2435j.P();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack mediaTrackA = u9.a();
        if (mediaTrackA != null && mediaTrackA.J() != -1) {
            arrayList.add(Long.valueOf(mediaTrackA.J()));
        }
        MediaTrack mediaTrackA2 = u10.a();
        if (mediaTrackA2 != null) {
            arrayList.add(Long.valueOf(mediaTrackA2.J()));
        }
        long[] jArr = c2435j.f46532e;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            Iterator it = c2435j.f46531d.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it.next()).J()));
            }
            Iterator it2 = c2435j.f46530c.iterator();
            while (it2.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it2.next()).J()));
            }
            for (long j9 : jArr) {
                Long lValueOf = Long.valueOf(j9);
                if (!hashSet.contains(lValueOf)) {
                    arrayList.add(lValueOf);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            jArr2[i9] = ((Long) arrayList.get(i9)).longValue();
        }
        Arrays.sort(jArr2);
        c2434i.U(jArr2);
        c2435j.P();
    }

    public static int J(List list, long[] jArr, int i9) {
        if (jArr != null && list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                for (long j9 : jArr) {
                    if (j9 == ((MediaTrack) list.get(i10)).J()) {
                        return i10;
                    }
                }
            }
        }
        return i9;
    }

    public static ArrayList L(List list, int i9) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaTrack mediaTrack = (MediaTrack) it.next();
            if (mediaTrack.O() == i9) {
                arrayList.add(mediaTrack);
            }
        }
        return arrayList;
    }

    public final void P() {
        Dialog dialog = this.f46533f;
        if (dialog != null) {
            dialog.cancel();
            this.f46533f = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46529a = true;
        this.f46531d = new ArrayList();
        this.f46530c = new ArrayList();
        this.f46532e = new long[0];
        C2328e c2328eC = C2325b.e(getContext()).c().c();
        if (c2328eC == null || !c2328eC.c()) {
            this.f46529a = false;
            return;
        }
        C2434i c2434iR = c2328eC.r();
        this.f46534g = c2434iR;
        if (c2434iR == null || !c2434iR.q() || this.f46534g.j() == null) {
            this.f46529a = false;
            return;
        }
        C2434i c2434i = this.f46534g;
        long[] jArr = this.f46536i;
        if (jArr != null) {
            this.f46532e = jArr;
        } else {
            n4.r rVarL = c2434i.l();
            if (rVarL != null) {
                this.f46532e = rVarL.H();
            }
        }
        MediaInfo mediaInfoJ = this.f46535h;
        if (mediaInfoJ == null) {
            mediaInfoJ = c2434i.j();
        }
        if (mediaInfoJ == null) {
            this.f46529a = false;
            return;
        }
        List listP = mediaInfoJ.P();
        if (listP == null) {
            this.f46529a = false;
            return;
        }
        this.f46531d = L(listP, 2);
        ArrayList arrayListL = L(listP, 1);
        this.f46530c = arrayListL;
        if (arrayListL.isEmpty()) {
            return;
        }
        List list = this.f46530c;
        MediaTrack.a aVar = new MediaTrack.a(-1L, 1);
        aVar.c(getActivity().getString(AbstractC2342t.f45993A));
        aVar.d(2);
        aVar.b("");
        list.add(0, aVar.a());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        int iJ = J(this.f46530c, this.f46532e, 0);
        int iJ2 = J(this.f46531d, this.f46532e, -1);
        U u9 = new U(getActivity(), this.f46530c, iJ);
        U u10 = new U(getActivity(), this.f46531d, iJ2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = getActivity().getLayoutInflater().inflate(AbstractC2341s.f45991e, (ViewGroup) null);
        ListView listView = (ListView) viewInflate.findViewById(AbstractC2340q.f45958c0);
        ListView listView2 = (ListView) viewInflate.findViewById(AbstractC2340q.f45967h);
        TabHost tabHost = (TabHost) viewInflate.findViewById(AbstractC2340q.f45954a0);
        tabHost.setup();
        if (u9.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) u9);
            TabHost.TabSpec tabSpecNewTabSpec = tabHost.newTabSpec("textTab");
            tabSpecNewTabSpec.setContent(AbstractC2340q.f45958c0);
            tabSpecNewTabSpec.setIndicator(getActivity().getString(AbstractC2342t.f45995C));
            tabHost.addTab(tabSpecNewTabSpec);
        }
        if (u10.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) u10);
            TabHost.TabSpec tabSpecNewTabSpec2 = tabHost.newTabSpec("audioTab");
            tabSpecNewTabSpec2.setContent(AbstractC2340q.f45967h);
            tabSpecNewTabSpec2.setIndicator(getActivity().getString(AbstractC2342t.f46021w));
            tabHost.addTab(tabSpecNewTabSpec2);
        }
        builder.setView(viewInflate).setPositiveButton(getActivity().getString(AbstractC2342t.f45994B), new Q(this, u9, u10)).setNegativeButton(AbstractC2342t.f46022x, new P(this));
        Dialog dialog = this.f46533f;
        if (dialog != null) {
            dialog.cancel();
            this.f46533f = null;
        }
        AlertDialog alertDialogCreate = builder.create();
        this.f46533f = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
