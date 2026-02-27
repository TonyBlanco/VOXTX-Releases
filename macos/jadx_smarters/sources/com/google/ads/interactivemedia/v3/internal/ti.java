package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ti implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f24590e;

    public /* synthetic */ ti(alm almVar, azd azdVar, com.google.ads.interactivemedia.v3.impl.data.bi biVar, com.google.ads.interactivemedia.v3.impl.data.bj bjVar, int i9) {
        this.f24590e = i9;
        this.f24586a = almVar;
        this.f24587b = azdVar;
        this.f24589d = biVar;
        this.f24588c = bjVar;
    }

    public /* synthetic */ ti(tj tjVar, tk tkVar, sw swVar, tb tbVar, int i9) {
        this.f24590e = i9;
        this.f24586a = tjVar;
        this.f24587b = tkVar;
        this.f24589d = swVar;
        this.f24588c = tbVar;
    }

    public /* synthetic */ ti(tj tjVar, tk tkVar, te teVar, tb tbVar, int i9) {
        this.f24590e = i9;
        this.f24586a = tjVar;
        this.f24587b = tkVar;
        this.f24588c = teVar;
        this.f24589d = tbVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.f24590e;
        if (i9 == 0) {
            Object obj = this.f24586a;
            this.f24587b.aj(((tj) obj).f24591a, (te) this.f24588c, (tb) this.f24589d);
            return;
        }
        if (i9 == 1) {
            Object obj2 = this.f24586a;
            tj tjVar = (tj) obj2;
            this.f24587b.af(tjVar.f24591a, tjVar.f24592b, (sw) this.f24589d, (tb) this.f24588c);
            return;
        }
        if (i9 == 2) {
            Object obj3 = this.f24586a;
            tj tjVar2 = (tj) obj3;
            this.f24587b.ai(tjVar2.f24591a, tjVar2.f24592b, (sw) this.f24589d, (tb) this.f24588c);
            return;
        }
        if (i9 == 3) {
            Object obj4 = this.f24586a;
            tj tjVar3 = (tj) obj4;
            this.f24587b.ag(tjVar3.f24591a, tjVar3.f24592b, (sw) this.f24589d, (tb) this.f24588c);
            return;
        }
        Object obj5 = this.f24586a;
        ?? r12 = this.f24587b;
        Object obj6 = this.f24589d;
        Object obj7 = this.f24588c;
        try {
            azh.e(r12, Exception.class);
        } catch (Exception e9) {
            com.google.ads.interactivemedia.v3.impl.data.m.b("Exception in " + String.valueOf(obj6) + InstructionFileId.DOT + String.valueOf(obj7), e9);
            ((alm) obj5).b((com.google.ads.interactivemedia.v3.impl.data.bi) obj6, (com.google.ads.interactivemedia.v3.impl.data.bj) obj7, e9);
        }
    }
}
