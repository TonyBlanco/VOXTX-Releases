package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1919c implements java.util.Comparator, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f42269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42270c;

    public /* synthetic */ C1919c(java.util.Comparator comparator, Object obj, int i9) {
        this.f42268a = i9;
        this.f42269b = comparator;
        this.f42270c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f42268a) {
            case 0:
                int iCompare = this.f42269b.compare(obj, obj2);
                return iCompare != 0 ? iCompare : ((java.util.Comparator) this.f42270c).compare(obj, obj2);
            default:
                Function function = (Function) this.f42270c;
                return this.f42269b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
