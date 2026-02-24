package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class avu extends avx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ awb f20829a;

    public avu() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public avu(awb awbVar) {
        this();
        this.f20829a = awbVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final axq listIterator() {
        return d().iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final boolean f() {
        return j().i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx
    public final boolean h() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx
    public final avo i() {
        return new avy(this);
    }

    public final avs j() {
        return this.f20829a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return j().size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avx, com.google.ads.interactivemedia.v3.internal.avi
    public Object writeReplace() {
        return new avt(j());
    }
}
