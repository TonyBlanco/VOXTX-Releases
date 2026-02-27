package G5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H {
    private static final A4.a zza = new A4.a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, G g9);

    public abstract void onVerificationCompleted(F f9);

    public abstract void onVerificationFailed(A5.m mVar);
}
