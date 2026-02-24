package N8;

import C8.i;
import android.view.View;
import kotlin.jvm.internal.g;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements y8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5382c;

    public a(Object obj, l lVar, l lVar2) {
        this.f5380a = lVar;
        this.f5381b = lVar2;
        this.f5382c = obj;
    }

    public /* synthetic */ a(Object obj, l lVar, l lVar2, int i9, g gVar) {
        this(obj, (i9 & 2) != 0 ? null : lVar, (i9 & 4) != 0 ? null : lVar2);
    }

    @Override // y8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(View thisRef, i property) {
        kotlin.jvm.internal.l.e(thisRef, "thisRef");
        kotlin.jvm.internal.l.e(property, "property");
        return this.f5382c;
    }

    public void c(View thisRef, i property, Object obj) {
        Object objInvoke;
        kotlin.jvm.internal.l.e(thisRef, "thisRef");
        kotlin.jvm.internal.l.e(property, "property");
        if (kotlin.jvm.internal.l.a(this.f5382c, obj)) {
            return;
        }
        l lVar = this.f5380a;
        if (lVar == null || (objInvoke = lVar.invoke(obj)) == null) {
            objInvoke = obj;
        }
        this.f5382c = objInvoke;
        l lVar2 = this.f5381b;
        if (lVar2 != null) {
            lVar2.invoke(obj);
        }
        thisRef.postInvalidate();
    }
}
