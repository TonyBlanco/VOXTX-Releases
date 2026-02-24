package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2652a implements c {
    @Override // r.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f9, float f10, float f11) {
        bVar.b(new d(colorStateList, f9));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f10);
        m(bVar, f11);
    }

    @Override // r.c
    public float b(b bVar) {
        return k(bVar) * 2.0f;
    }

    @Override // r.c
    public void c(b bVar, float f9) {
        bVar.f().setElevation(f9);
    }

    @Override // r.c
    public void d(b bVar) {
        m(bVar, i(bVar));
    }

    @Override // r.c
    public void e(b bVar) {
        m(bVar, i(bVar));
    }

    @Override // r.c
    public void f(b bVar, float f9) {
        o(bVar).h(f9);
    }

    @Override // r.c
    public ColorStateList g(b bVar) {
        return o(bVar).b();
    }

    @Override // r.c
    public float h(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // r.c
    public float i(b bVar) {
        return o(bVar).c();
    }

    @Override // r.c
    public float j(b bVar) {
        return k(bVar) * 2.0f;
    }

    @Override // r.c
    public float k(b bVar) {
        return o(bVar).d();
    }

    @Override // r.c
    public void l() {
    }

    @Override // r.c
    public void m(b bVar, float f9) {
        o(bVar).g(f9, bVar.c(), bVar.e());
        p(bVar);
    }

    @Override // r.c
    public void n(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    public final d o(b bVar) {
        return (d) bVar.d();
    }

    public void p(b bVar) {
        if (!bVar.c()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fI = i(bVar);
        float fK = k(bVar);
        int iCeil = (int) Math.ceil(e.a(fI, fK, bVar.e()));
        int iCeil2 = (int) Math.ceil(e.b(fI, fK, bVar.e()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }
}
