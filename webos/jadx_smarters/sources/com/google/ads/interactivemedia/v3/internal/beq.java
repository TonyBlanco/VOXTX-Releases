package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class beq implements bes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjj f21148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bpb f21149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bhq f21150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bid f21151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f21152f;

    private beq(String str, bpb bpbVar, bhq bhqVar, bid bidVar, Integer num) {
        this.f21147a = str;
        this.f21148b = com.google.ads.interactivemedia.v3.impl.data.p.a(str);
        this.f21149c = bpbVar;
        this.f21150d = bhqVar;
        this.f21151e = bidVar;
        this.f21152f = num;
    }

    public static beq a(String str, bpb bpbVar, bhq bhqVar, bid bidVar, Integer num) throws GeneralSecurityException {
        if (bidVar == bid.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new beq(str, bpbVar, bhqVar, bidVar, num);
    }

    public final bhq b() {
        return this.f21150d;
    }

    public final bid c() {
        return this.f21151e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bes
    public final bjj d() {
        return this.f21148b;
    }

    public final bpb e() {
        return this.f21149c;
    }

    public final Integer f() {
        return this.f21152f;
    }

    public final String g() {
        return this.f21147a;
    }
}
