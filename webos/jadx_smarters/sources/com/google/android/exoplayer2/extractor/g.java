package com.google.android.exoplayer2.extractor;

import d3.u;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f25422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f25423b;

        public a(u uVar) {
            this(uVar, uVar);
        }

        public a(u uVar, u uVar2) {
            this.f25422a = (u) AbstractC1684a.e(uVar);
            this.f25423b = (u) AbstractC1684a.e(uVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25422a.equals(aVar.f25422a) && this.f25423b.equals(aVar.f25423b);
        }

        public int hashCode() {
            return (this.f25422a.hashCode() * 31) + this.f25423b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f25422a);
            if (this.f25422a.equals(this.f25423b)) {
                str = "";
            } else {
                str = ", " + this.f25423b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f25425b;

        public b(long j9) {
            this(j9, 0L);
        }

        public b(long j9, long j10) {
            this.f25424a = j9;
            this.f25425b = new a(j10 == 0 ? u.f39609c : new u(0L, j10));
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public a e(long j9) {
            return this.f25425b;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public boolean g() {
            return false;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public long i() {
            return this.f25424a;
        }
    }

    a e(long j9);

    boolean g();

    long i();
}
