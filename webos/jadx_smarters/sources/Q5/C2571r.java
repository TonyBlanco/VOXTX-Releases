package q5;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: q5.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2571r extends AbstractRunnableC2568o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractRunnableC2568o f46924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2578y f46925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2571r(C2578y c2578y, TaskCompletionSource taskCompletionSource, AbstractRunnableC2568o abstractRunnableC2568o) {
        super(taskCompletionSource);
        this.f46925g = c2578y;
        this.f46924f = abstractRunnableC2568o;
    }

    @Override // q5.AbstractRunnableC2568o
    public final void b() {
        C2578y.m(this.f46925g, this.f46924f);
    }
}
