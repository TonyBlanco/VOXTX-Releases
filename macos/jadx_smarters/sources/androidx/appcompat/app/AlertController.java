package androidx.appcompat.app;

import P.L;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.b;
import androidx.core.widget.NestedScrollView;
import c.AbstractC1238a;
import c.j;
import d.DialogC1642u;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NestedScrollView f13558A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f13560C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f13561D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f13562E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f13563F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f13564G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ListAdapter f13565H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f13567J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f13568K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f13569L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f13570M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f13571N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f13572O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f13573P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Handler f13575R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogC1642u f13578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f13579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f13581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f13582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f13583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f13584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13589m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f13591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f13592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f13593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f13594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f13595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f13596t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f13597u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f13598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f13599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f13600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f13601y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f13602z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13590n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13559B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f13566I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f13574Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final View.OnClickListener f13576S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13603a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13604c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18101k2);
            this.f13604c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f18106l2, -1);
            this.f13603a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f18111m2, -1);
        }

        public void a(boolean z9, boolean z10) {
            if (z10 && z9) {
                return;
            }
            setPadding(getPaddingLeft(), z9 ? getPaddingTop() : this.f13603a, getPaddingRight(), z10 ? getPaddingBottom() : this.f13604c);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f13591o || (message2 = alertController.f13593q) == null) && (view != alertController.f13595s || (message2 = alertController.f13597u) == null)) ? (view != alertController.f13599w || (message = alertController.f13601y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f13575R.obtainMessage(1, alertController2.f13578b).sendToTarget();
        }
    }

    public class b implements NestedScrollView.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f13607b;

        public b(View view, View view2) {
            this.f13606a = view;
            this.f13607b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i9, int i10, int i11, int i12) {
            AlertController.g(nestedScrollView, this.f13606a, this.f13607b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f13610c;

        public c(View view, View view2) {
            this.f13609a = view;
            this.f13610c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f13558A, this.f13609a, this.f13610c);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f13613b;

        public d(View view, View view2) {
            this.f13612a = view;
            this.f13613b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i9, int i10, int i11) {
            AlertController.g(absListView, this.f13612a, this.f13613b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i9) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13615a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f13616c;

        public e(View view, View view2) {
            this.f13615a = view;
            this.f13616c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f13583g, this.f13615a, this.f13616c);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f13618A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f13619B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f13620C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f13621D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f13623F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f13624G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f13625H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f13627J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f13628K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f13629L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f13630M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f13631N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f13633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f13634b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f13636d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f13638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f13639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f13640h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f13641i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f13642j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f13643k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f13644l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f13645m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f13646n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f13647o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f13648p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f13649q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f13651s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f13652t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f13653u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f13654v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f13655w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f13656x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13657y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f13658z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13635c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13637e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f13622E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f13626I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f13632O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f13650r = true;

        public class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f13659a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i9, int i10, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i9, i10, charSequenceArr);
                this.f13659a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i9, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i9, view, viewGroup);
                boolean[] zArr = f.this.f13623F;
                if (zArr != null && zArr[i9]) {
                    this.f13659a.setItemChecked(i9, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f13661a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f13662c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f13663d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AlertController f13664e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z9, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z9);
                this.f13663d = recycleListView;
                this.f13664e = alertController;
                Cursor cursor2 = getCursor();
                this.f13661a = cursor2.getColumnIndexOrThrow(f.this.f13629L);
                this.f13662c = cursor2.getColumnIndexOrThrow(f.this.f13630M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f13661a));
                this.f13663d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f13662c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f13634b.inflate(this.f13664e.f13570M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f13666a;

            public c(AlertController alertController) {
                this.f13666a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
                f.this.f13656x.onClick(this.f13666a.f13578b, i9);
                if (f.this.f13625H) {
                    return;
                }
                this.f13666a.f13578b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f13668a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AlertController f13669c;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f13668a = recycleListView;
                this.f13669c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
                boolean[] zArr = f.this.f13623F;
                if (zArr != null) {
                    zArr[i9] = this.f13668a.isItemChecked(i9);
                }
                f.this.f13627J.onClick(this.f13669c.f13578b, i9, this.f13668a.isItemChecked(i9));
            }
        }

        public f(Context context) {
            this.f13633a = context;
            this.f13634b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f13639g;
            if (view != null) {
                alertController.m(view);
            } else {
                CharSequence charSequence = this.f13638f;
                if (charSequence != null) {
                    alertController.r(charSequence);
                }
                Drawable drawable = this.f13636d;
                if (drawable != null) {
                    alertController.o(drawable);
                }
                int i9 = this.f13635c;
                if (i9 != 0) {
                    alertController.n(i9);
                }
                int i10 = this.f13637e;
                if (i10 != 0) {
                    alertController.n(alertController.d(i10));
                }
            }
            CharSequence charSequence2 = this.f13640h;
            if (charSequence2 != null) {
                alertController.p(charSequence2);
            }
            CharSequence charSequence3 = this.f13641i;
            if (charSequence3 != null || this.f13642j != null) {
                alertController.l(-1, charSequence3, this.f13643k, null, this.f13642j);
            }
            CharSequence charSequence4 = this.f13644l;
            if (charSequence4 != null || this.f13645m != null) {
                alertController.l(-2, charSequence4, this.f13646n, null, this.f13645m);
            }
            CharSequence charSequence5 = this.f13647o;
            if (charSequence5 != null || this.f13648p != null) {
                alertController.l(-3, charSequence5, this.f13649q, null, this.f13648p);
            }
            if (this.f13654v != null || this.f13628K != null || this.f13655w != null) {
                b(alertController);
            }
            View view2 = this.f13658z;
            if (view2 != null) {
                if (this.f13622E) {
                    alertController.u(view2, this.f13618A, this.f13619B, this.f13620C, this.f13621D);
                    return;
                } else {
                    alertController.t(view2);
                    return;
                }
            }
            int i11 = this.f13657y;
            if (i11 != 0) {
                alertController.s(i11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(androidx.appcompat.app.AlertController r10) {
            /*
                r9 = this;
                android.view.LayoutInflater r0 = r9.f13634b
                int r1 = r10.f13569L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r9.f13624G
                if (r1 == 0) goto L34
                android.database.Cursor r1 = r9.f13628K
                if (r1 != 0) goto L25
                androidx.appcompat.app.AlertController$f$a r8 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r9.f13633a
                int r4 = r10.f13570M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r9.f13654v
                r1 = r8
                r2 = r9
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L69
            L25:
                androidx.appcompat.app.AlertController$f$b r8 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r9.f13633a
                android.database.Cursor r4 = r9.f13628K
                r5 = 0
                r1 = r8
                r2 = r9
                r6 = r0
                r7 = r10
                r1.<init>(r3, r4, r5, r6, r7)
                goto L69
            L34:
                boolean r1 = r9.f13625H
                if (r1 == 0) goto L3c
                int r1 = r10.f13571N
            L3a:
                r4 = r1
                goto L3f
            L3c:
                int r1 = r10.f13572O
                goto L3a
            L3f:
                android.database.Cursor r1 = r9.f13628K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5b
                android.widget.SimpleCursorAdapter r8 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r9.f13633a
                android.database.Cursor r5 = r9.f13628K
                java.lang.String r1 = r9.f13629L
                java.lang.String[] r6 = new java.lang.String[]{r1}
                int[] r7 = new int[]{r2}
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                goto L69
            L5b:
                android.widget.ListAdapter r8 = r9.f13655w
                if (r8 == 0) goto L60
                goto L69
            L60:
                androidx.appcompat.app.AlertController$h r8 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r9.f13633a
                java.lang.CharSequence[] r3 = r9.f13654v
                r8.<init>(r1, r4, r2, r3)
            L69:
                r10.f13565H = r8
                int r1 = r9.f13626I
                r10.f13566I = r1
                android.content.DialogInterface$OnClickListener r1 = r9.f13656x
                if (r1 == 0) goto L7c
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r10)
            L78:
                r0.setOnItemClickListener(r1)
                goto L86
            L7c:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r9.f13627J
                if (r1 == 0) goto L86
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r10)
                goto L78
            L86:
                android.widget.AdapterView$OnItemSelectedListener r1 = r9.f13631N
                if (r1 == 0) goto L8d
                r0.setOnItemSelectedListener(r1)
            L8d:
                boolean r1 = r9.f13625H
                if (r1 == 0) goto L96
                r1 = 1
            L92:
                r0.setChoiceMode(r1)
                goto L9c
            L96:
                boolean r1 = r9.f13624G
                if (r1 == 0) goto L9c
                r1 = 2
                goto L92
            L9c:
                r10.f13583g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }
    }

    public static final class g extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f13671a;

        public g(DialogInterface dialogInterface) {
            this.f13671a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == -3 || i9 == -2 || i9 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f13671a.get(), message.what);
            } else {
                if (i9 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class h extends ArrayAdapter {
        public h(Context context, int i9, int i10, CharSequence[] charSequenceArr) {
            super(context, i9, i10, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i9) {
            return i9;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC1642u dialogC1642u, Window window) {
        this.f13577a = context;
        this.f13578b = dialogC1642u;
        this.f13579c = window;
        this.f13575R = new g(dialogC1642u);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.f17941F, AbstractC1238a.f17752k, 0);
        this.f13567J = typedArrayObtainStyledAttributes.getResourceId(j.f17946G, 0);
        this.f13568K = typedArrayObtainStyledAttributes.getResourceId(j.f17956I, 0);
        this.f13569L = typedArrayObtainStyledAttributes.getResourceId(j.f17966K, 0);
        this.f13570M = typedArrayObtainStyledAttributes.getResourceId(j.f17971L, 0);
        this.f13571N = typedArrayObtainStyledAttributes.getResourceId(j.f17981N, 0);
        this.f13572O = typedArrayObtainStyledAttributes.getResourceId(j.f17961J, 0);
        this.f13573P = typedArrayObtainStyledAttributes.getBoolean(j.f17976M, true);
        this.f13580d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17951H, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC1642u.supportRequestWindowFeature(1);
    }

    public static boolean A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1238a.f17751j, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i9) {
        if (i9 == -3) {
            return this.f13599w;
        }
        if (i9 == -2) {
            return this.f13595s;
        }
        if (i9 != -1) {
            return null;
        }
        return this.f13591o;
    }

    public int d(int i9) {
        TypedValue typedValue = new TypedValue();
        this.f13577a.getTheme().resolveAttribute(i9, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f13583g;
    }

    public void f() {
        this.f13578b.setContentView(k());
        z();
    }

    public boolean h(int i9, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13558A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public boolean i(int i9, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13558A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public final ViewGroup j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int k() {
        int i9 = this.f13568K;
        return (i9 != 0 && this.f13574Q == 1) ? i9 : this.f13567J;
    }

    public void l(int i9, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f13575R.obtainMessage(i9, onClickListener);
        }
        if (i9 == -3) {
            this.f13600x = charSequence;
            this.f13601y = message;
            this.f13602z = drawable;
        } else if (i9 == -2) {
            this.f13596t = charSequence;
            this.f13597u = message;
            this.f13598v = drawable;
        } else {
            if (i9 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f13592p = charSequence;
            this.f13593q = message;
            this.f13594r = drawable;
        }
    }

    public void m(View view) {
        this.f13564G = view;
    }

    public void n(int i9) {
        this.f13560C = null;
        this.f13559B = i9;
        ImageView imageView = this.f13561D;
        if (imageView != null) {
            if (i9 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13561D.setImageResource(this.f13559B);
            }
        }
    }

    public void o(Drawable drawable) {
        this.f13560C = drawable;
        this.f13559B = 0;
        ImageView imageView = this.f13561D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13561D.setImageDrawable(drawable);
            }
        }
    }

    public void p(CharSequence charSequence) {
        this.f13582f = charSequence;
        TextView textView = this.f13563F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void q(ViewGroup viewGroup, View view, int i9, int i10) {
        View view2;
        Runnable eVar;
        View viewFindViewById = this.f13579c.findViewById(c.f.f17872v);
        View viewFindViewById2 = this.f13579c.findViewById(c.f.f17871u);
        if (Build.VERSION.SDK_INT < 23) {
            if (viewFindViewById != null && (i9 & 1) == 0) {
                viewGroup.removeView(viewFindViewById);
                viewFindViewById = null;
            }
            if (viewFindViewById2 != null && (i9 & 2) == 0) {
                viewGroup.removeView(viewFindViewById2);
                viewFindViewById2 = null;
            }
            if (viewFindViewById == null && viewFindViewById2 == null) {
                return;
            }
            if (this.f13582f != null) {
                this.f13558A.setOnScrollChangeListener(new b(viewFindViewById, viewFindViewById2));
                view2 = this.f13558A;
                eVar = new c(viewFindViewById, viewFindViewById2);
            } else {
                ListView listView = this.f13583g;
                if (listView != null) {
                    listView.setOnScrollListener(new d(viewFindViewById, viewFindViewById2));
                    view2 = this.f13583g;
                    eVar = new e(viewFindViewById, viewFindViewById2);
                } else {
                    if (viewFindViewById != null) {
                        viewGroup.removeView(viewFindViewById);
                    }
                    if (viewFindViewById2 == null) {
                        return;
                    }
                }
            }
            view2.post(eVar);
            return;
        }
        L.I0(view, i9, i10);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 == null) {
            return;
        }
        viewGroup.removeView(viewFindViewById2);
    }

    public void r(CharSequence charSequence) {
        this.f13581e = charSequence;
        TextView textView = this.f13562E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(int i9) {
        this.f13584h = null;
        this.f13585i = i9;
        this.f13590n = false;
    }

    public void t(View view) {
        this.f13584h = view;
        this.f13585i = 0;
        this.f13590n = false;
    }

    public void u(View view, int i9, int i10, int i11, int i12) {
        this.f13584h = view;
        this.f13585i = 0;
        this.f13590n = true;
        this.f13586j = i9;
        this.f13587k = i10;
        this.f13588l = i11;
        this.f13589m = i12;
    }

    public final void v(ViewGroup viewGroup) {
        int i9;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f13591o = button2;
        button2.setOnClickListener(this.f13576S);
        if (TextUtils.isEmpty(this.f13592p) && this.f13594r == null) {
            this.f13591o.setVisibility(8);
            i9 = 0;
        } else {
            this.f13591o.setText(this.f13592p);
            Drawable drawable = this.f13594r;
            if (drawable != null) {
                int i10 = this.f13580d;
                drawable.setBounds(0, 0, i10, i10);
                this.f13591o.setCompoundDrawables(this.f13594r, null, null, null);
            }
            this.f13591o.setVisibility(0);
            i9 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f13595s = button3;
        button3.setOnClickListener(this.f13576S);
        if (TextUtils.isEmpty(this.f13596t) && this.f13598v == null) {
            this.f13595s.setVisibility(8);
        } else {
            this.f13595s.setText(this.f13596t);
            Drawable drawable2 = this.f13598v;
            if (drawable2 != null) {
                int i11 = this.f13580d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f13595s.setCompoundDrawables(this.f13598v, null, null, null);
            }
            this.f13595s.setVisibility(0);
            i9 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f13599w = button4;
        button4.setOnClickListener(this.f13576S);
        if (TextUtils.isEmpty(this.f13600x) && this.f13602z == null) {
            this.f13599w.setVisibility(8);
        } else {
            this.f13599w.setText(this.f13600x);
            Drawable drawable3 = this.f13602z;
            if (drawable3 != null) {
                int i12 = this.f13580d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f13599w.setCompoundDrawables(this.f13602z, null, null, null);
            }
            this.f13599w.setVisibility(0);
            i9 |= 4;
        }
        if (A(this.f13577a)) {
            if (i9 == 1) {
                button = this.f13591o;
            } else if (i9 == 2) {
                button = this.f13595s;
            } else if (i9 == 4) {
                button = this.f13599w;
            }
            b(button);
        }
        if (i9 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f13579c.findViewById(c.f.f17873w);
        this.f13558A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f13558A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f13563F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f13582f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f13558A.removeView(this.f13563F);
        if (this.f13583g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f13558A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f13558A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f13583g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void x(ViewGroup viewGroup) {
        View viewInflate = this.f13584h;
        if (viewInflate == null) {
            viewInflate = this.f13585i != 0 ? LayoutInflater.from(this.f13577a).inflate(this.f13585i, viewGroup, false) : null;
        }
        boolean z9 = viewInflate != null;
        if (!z9 || !a(viewInflate)) {
            this.f13579c.setFlags(131072, 131072);
        }
        if (!z9) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f13579c.findViewById(c.f.f17864n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f13590n) {
            frameLayout.setPadding(this.f13586j, this.f13587k, this.f13588l, this.f13589m);
        }
        if (this.f13583g != null) {
            ((LinearLayout.LayoutParams) ((b.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void y(ViewGroup viewGroup) {
        View viewFindViewById;
        if (this.f13564G != null) {
            viewGroup.addView(this.f13564G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewFindViewById = this.f13579c.findViewById(c.f.f17849O);
        } else {
            this.f13561D = (ImageView) this.f13579c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f13581e)) && this.f13573P) {
                TextView textView = (TextView) this.f13579c.findViewById(c.f.f17860j);
                this.f13562E = textView;
                textView.setText(this.f13581e);
                int i9 = this.f13559B;
                if (i9 != 0) {
                    this.f13561D.setImageResource(i9);
                    return;
                }
                Drawable drawable = this.f13560C;
                if (drawable != null) {
                    this.f13561D.setImageDrawable(drawable);
                    return;
                } else {
                    this.f13562E.setPadding(this.f13561D.getPaddingLeft(), this.f13561D.getPaddingTop(), this.f13561D.getPaddingRight(), this.f13561D.getPaddingBottom());
                    this.f13561D.setVisibility(8);
                    return;
                }
            }
            this.f13579c.findViewById(c.f.f17849O).setVisibility(8);
            this.f13561D.setVisibility(8);
            viewFindViewById = viewGroup;
        }
        viewFindViewById.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[PHI: r1
      0x00a5: PHI (r1v6 android.view.View) = (r1v5 android.view.View), (r1v13 android.view.View) binds: [B:36:0x00a3, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.z():void");
    }
}
