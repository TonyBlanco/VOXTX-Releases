package pl.droidsonroids.gif;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class GifIOException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f46698a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46699c;

    public GifIOException(int i9, String str) {
        this.f46698a = b.fromCode(i9);
        this.f46699c = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f46699c == null) {
            return this.f46698a.getFormattedDescription();
        }
        return this.f46698a.getFormattedDescription() + ": " + this.f46699c;
    }
}
