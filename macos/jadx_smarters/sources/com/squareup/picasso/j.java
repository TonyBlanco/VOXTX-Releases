package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f39102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f39103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f39104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f39105d;

        public a(InputStream inputStream, boolean z9, long j9) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f39102a = inputStream;
            this.f39103b = null;
            this.f39104c = z9;
            this.f39105d = j9;
        }

        public Bitmap a() {
            return this.f39103b;
        }

        public long b() {
            return this.f39105d;
        }

        public InputStream c() {
            return this.f39102a;
        }
    }

    public static class b extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f39106a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39107c;

        public b(String str, int i9, int i10) {
            super(str);
            this.f39106a = q.isOfflineOnly(i9);
            this.f39107c = i10;
        }
    }

    a a(Uri uri, int i9);
}
