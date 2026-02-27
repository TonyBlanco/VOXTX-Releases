package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f19989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f19990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f19991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f19992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f19993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f19994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f19995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f19996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f19997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f19998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f19999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f20000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f20001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f20002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f20003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f20004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f20005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f20006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f20007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f20008t;

    public ak() {
    }

    public /* synthetic */ ak(al alVar) {
        this.f19989a = alVar.f20084b;
        this.f19990b = alVar.f20085c;
        this.f19991c = alVar.f20086d;
        this.f19992d = alVar.f20087e;
        this.f19993e = alVar.f20088f;
        this.f19994f = alVar.f20089g;
        this.f19995g = alVar.f20090h;
        this.f19996h = alVar.f20091i;
        this.f19997i = alVar.f20092j;
        this.f19998j = alVar.f20094l;
        this.f19999k = alVar.f20095m;
        this.f20000l = alVar.f20096n;
        this.f20001m = alVar.f20097o;
        this.f20002n = alVar.f20098p;
        this.f20003o = alVar.f20099q;
        this.f20004p = alVar.f20100r;
        this.f20005q = alVar.f20101s;
        this.f20006r = alVar.f20102t;
        this.f20007s = alVar.f20103u;
        this.f20008t = alVar.f20104v;
    }

    public final void A(byte[] bArr, Integer num) {
        this.f19994f = (byte[]) bArr.clone();
        this.f19995g = num;
    }

    public final void B(CharSequence charSequence) {
        this.f20005q = charSequence;
    }

    public final void C(CharSequence charSequence) {
        this.f20006r = charSequence;
    }

    public final void D(CharSequence charSequence) {
        this.f20007s = charSequence;
    }

    public final void E(Integer num) {
        this.f20000l = num;
    }

    public final void F(Integer num) {
        this.f19999k = num;
    }

    public final void G(Integer num) {
        this.f19998j = num;
    }

    public final void H(Integer num) {
        this.f20003o = num;
    }

    public final void I(Integer num) {
        this.f20002n = num;
    }

    public final void J(Integer num) {
        this.f20001m = num;
    }

    public final void K(CharSequence charSequence) {
        this.f20008t = charSequence;
    }

    public final void L(CharSequence charSequence) {
        this.f19989a = charSequence;
    }

    public final void M(Integer num) {
        this.f19997i = num;
    }

    public final void N(Integer num) {
        this.f19996h = num;
    }

    public final void O(CharSequence charSequence) {
        this.f20004p = charSequence;
    }

    public final al a() {
        return new al(this);
    }

    public final void v(byte[] bArr, int i9) {
        if (this.f19994f == null || cq.V(Integer.valueOf(i9), 3) || !cq.V(this.f19995g, 3)) {
            this.f19994f = (byte[]) bArr.clone();
            this.f19995g = Integer.valueOf(i9);
        }
    }

    public final void w(al alVar) {
        CharSequence charSequence = alVar.f20084b;
        if (charSequence != null) {
            this.f19989a = charSequence;
        }
        CharSequence charSequence2 = alVar.f20085c;
        if (charSequence2 != null) {
            this.f19990b = charSequence2;
        }
        CharSequence charSequence3 = alVar.f20086d;
        if (charSequence3 != null) {
            this.f19991c = charSequence3;
        }
        CharSequence charSequence4 = alVar.f20087e;
        if (charSequence4 != null) {
            this.f19992d = charSequence4;
        }
        CharSequence charSequence5 = alVar.f20088f;
        if (charSequence5 != null) {
            this.f19993e = charSequence5;
        }
        byte[] bArr = alVar.f20089g;
        if (bArr != null) {
            A(bArr, alVar.f20090h);
        }
        Integer num = alVar.f20091i;
        if (num != null) {
            this.f19996h = num;
        }
        Integer num2 = alVar.f20092j;
        if (num2 != null) {
            this.f19997i = num2;
        }
        Integer num3 = alVar.f20093k;
        if (num3 != null) {
            this.f19998j = num3;
        }
        Integer num4 = alVar.f20094l;
        if (num4 != null) {
            this.f19998j = num4;
        }
        Integer num5 = alVar.f20095m;
        if (num5 != null) {
            this.f19999k = num5;
        }
        Integer num6 = alVar.f20096n;
        if (num6 != null) {
            this.f20000l = num6;
        }
        Integer num7 = alVar.f20097o;
        if (num7 != null) {
            this.f20001m = num7;
        }
        Integer num8 = alVar.f20098p;
        if (num8 != null) {
            this.f20002n = num8;
        }
        Integer num9 = alVar.f20099q;
        if (num9 != null) {
            this.f20003o = num9;
        }
        CharSequence charSequence6 = alVar.f20100r;
        if (charSequence6 != null) {
            this.f20004p = charSequence6;
        }
        CharSequence charSequence7 = alVar.f20101s;
        if (charSequence7 != null) {
            this.f20005q = charSequence7;
        }
        CharSequence charSequence8 = alVar.f20102t;
        if (charSequence8 != null) {
            this.f20006r = charSequence8;
        }
        CharSequence charSequence9 = alVar.f20103u;
        if (charSequence9 != null) {
            this.f20007s = charSequence9;
        }
        CharSequence charSequence10 = alVar.f20104v;
        if (charSequence10 != null) {
            this.f20008t = charSequence10;
        }
    }

    public final void x(CharSequence charSequence) {
        this.f19992d = charSequence;
    }

    public final void y(CharSequence charSequence) {
        this.f19991c = charSequence;
    }

    public final void z(CharSequence charSequence) {
        this.f19990b = charSequence;
    }
}
