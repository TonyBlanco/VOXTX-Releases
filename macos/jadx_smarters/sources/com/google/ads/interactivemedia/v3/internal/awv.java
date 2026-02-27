package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class awv extends att {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient atq f20859a;

    public awv(Map map, atq atqVar) {
        super(map);
        this.f20859a = atqVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f20859a = (atq) objectInputStream.readObject();
        p((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f20859a);
        objectOutputStream.writeObject(i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.att, com.google.ads.interactivemedia.v3.internal.auj
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.f20859a.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auj, com.google.ads.interactivemedia.v3.internal.aum
    public final Map j() {
        return k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auj, com.google.ads.interactivemedia.v3.internal.aum
    public final Set l() {
        return m();
    }
}
