package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s5.AbstractC2736q;

/* JADX INFO: renamed from: q7.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2640y extends RecyclerView.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static SharedPreferences f49572t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f49573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f49574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f49575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f49576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LiveStreamDBHandler f49577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SimpleDateFormat f49578i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f49580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow f49581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PopupWindow f49582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z7.h f49583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f49584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f49585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f49586q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f49588s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49579j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f49587r = "";

    /* JADX INFO: renamed from: q7.y$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamsDBModel liveStreamsDBModel, LiveStreamsDBModel liveStreamsDBModel2) {
            return AbstractC2736q.j().d(liveStreamsDBModel.getIdAuto(), liveStreamsDBModel2.getIdAuto()).i();
        }
    }

    /* JADX INFO: renamed from: q7.y$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveStreamsDBModel f49590a;

        public b(LiveStreamsDBModel liveStreamsDBModel) {
            this.f49590a = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z7.h hVar;
            String url;
            if (C2640y.this.f49581l != null) {
                C2640y.this.f49581l.dismiss();
            }
            if (C2640y.this.f49582m != null) {
                C2640y.this.f49582m.dismiss();
            }
            if (C2640y.this.f49583n != null) {
                if (SharepreferenceDBHandler.getCurrentAPPType(C2640y.this.f49574e).equals("m3u")) {
                    hVar = C2640y.this.f49583n;
                    url = this.f49590a.getUrl();
                } else {
                    hVar = C2640y.this.f49583n;
                    url = C2640y.this.f49588s + this.f49590a.getStreamId() + C2640y.this.f49586q;
                }
                hVar.p(String.valueOf(Uri.parse(url)), this.f49590a.getNum());
            }
        }
    }

    /* JADX INFO: renamed from: q7.y$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveStreamsDBModel f49592a;

        public c(LiveStreamsDBModel liveStreamsDBModel) {
            this.f49592a = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z7.h hVar;
            String url;
            if (C2640y.this.f49581l != null) {
                C2640y.this.f49581l.dismiss();
            }
            if (C2640y.this.f49582m != null) {
                C2640y.this.f49582m.dismiss();
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(C2640y.this.f49574e).equals("m3u")) {
                hVar = C2640y.this.f49583n;
                url = this.f49592a.getUrl();
            } else {
                hVar = C2640y.this.f49583n;
                url = C2640y.this.f49588s + this.f49592a.getStreamId() + C2640y.this.f49586q;
            }
            hVar.p(String.valueOf(Uri.parse(url)), this.f49592a.getNum());
        }
    }

    /* JADX INFO: renamed from: q7.y$d */
    public static class d extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ProgressBar f49594A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public TextView f49595B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ImageView f49596C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49597t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f49598u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f49599v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f49600w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f49601x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f49602y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f49603z;

        public d(View view) {
            super(view);
            this.f49597t = (TextView) view.findViewById(a7.f.fk);
            this.f49598u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f49599v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f49600w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f49601x = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f49602y = (TextView) view.findViewById(a7.f.di);
            this.f49603z = (TextView) view.findViewById(a7.f.em);
            this.f49594A = (ProgressBar) view.findViewById(a7.f.Nc);
            this.f49595B = (TextView) view.findViewById(a7.f.si);
            this.f49596C = (ImageView) view.findViewById(a7.f.f12417h6);
            J(false);
        }
    }

    /* JADX INFO: renamed from: q7.y$e */
    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49604a;

        public e(View view) {
            this.f49604a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49604a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49604a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49604a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                Log.e("id is", "" + this.f49604a.getTag());
                view2 = this.f49604a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f49604a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public C2640y(List list, Context context, PopupWindow popupWindow, z7.h hVar, PopupWindow popupWindow2) {
        this.f49580k = "";
        ArrayList arrayList = new ArrayList();
        this.f49575f = arrayList;
        arrayList.addAll(list);
        this.f49576g = list;
        this.f49583n = hVar;
        this.f49573d = list;
        this.f49574e = context;
        this.f49577h = new LiveStreamDBHandler(context);
        this.f49580k = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        Collections.sort(this.f49573d, new a());
        this.f49581l = popupWindow;
        this.f49582m = popupWindow2;
        if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("m3u")) {
            return;
        }
        q0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f49573d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x015b A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #0 {Exception -> 0x016d, blocks: (B:40:0x013f, B:42:0x0145, B:43:0x015b), top: B:53:0x013f }] */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(q7.C2640y.d r18, int r19) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2640y.E(q7.y$d, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12808h3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (this.f49580k.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new d(viewInflate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2640y.q0():void");
    }
}
