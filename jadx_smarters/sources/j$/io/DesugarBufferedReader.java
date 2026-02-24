package j$.io;

import j$.util.Spliterators;
import j$.util.stream.AbstractC2055y0;
import j$.util.stream.Stream;
import java.io.BufferedReader;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarBufferedReader {
    public static Stream lines(BufferedReader bufferedReader) {
        return AbstractC2055y0.f0(Spliterators.n(new a(bufferedReader), 272), false);
    }
}
