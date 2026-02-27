package f6;

/* JADX INFO: loaded from: classes3.dex */
public class i implements c6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40853a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40854b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c6.d f40855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f40856d;

    public i(f fVar) {
        this.f40856d = fVar;
    }

    public final void a() {
        if (this.f40853a) {
            throw new c6.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f40853a = true;
    }

    @Override // c6.h
    public c6.h add(String str) {
        a();
        this.f40856d.d(this.f40855c, str, this.f40854b);
        return this;
    }

    @Override // c6.h
    public c6.h add(boolean z9) {
        a();
        this.f40856d.j(this.f40855c, z9, this.f40854b);
        return this;
    }

    public void b(c6.d dVar, boolean z9) {
        this.f40853a = false;
        this.f40855c = dVar;
        this.f40854b = z9;
    }
}
