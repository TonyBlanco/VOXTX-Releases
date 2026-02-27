package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes3.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j9) {
        this.zza = j9;
    }

    public static void createAndAddCallback(Task<Object> task, long j9) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j9));
    }

    public native void nativeOnComplete(long j9, Object obj, boolean z9, boolean z10, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
