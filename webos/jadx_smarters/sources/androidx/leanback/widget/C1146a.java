package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.leanback.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1146a extends AbstractC1169y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Boolean f15619f = Boolean.FALSE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f15621e;

    public C1146a(E e9) {
        super(e9);
        this.f15620d = new ArrayList();
        this.f15621e = new ArrayList();
    }

    @Override // androidx.leanback.widget.AbstractC1169y
    public Object a(int i9) {
        return this.f15620d.get(i9);
    }

    @Override // androidx.leanback.widget.AbstractC1169y
    public int i() {
        return this.f15620d.size();
    }
}
