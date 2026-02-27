package de.blinkt.openvpn.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f39957a = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList f39958c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedList f39959d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f39960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f39961f;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public E createFromParcel(Parcel parcel) {
            return new E(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E[] newArray(int i9) {
            return new E[i9];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f39962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f39963b;

        public b(c cVar, c cVar2) {
            this.f39963b = cVar;
            this.f39962a = cVar2;
        }

        public /* synthetic */ b(c cVar, c cVar2, a aVar) {
            this(cVar, cVar2);
        }

        public long a() {
            return Math.max(0L, this.f39962a.f39965c - this.f39963b.f39965c);
        }

        public long b() {
            return Math.max(0L, this.f39962a.f39966d - this.f39963b.f39966d);
        }

        public long c() {
            return this.f39962a.f39965c;
        }

        public long d() {
            return this.f39962a.f39966d;
        }
    }

    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39964a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f39965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f39966d;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i9) {
                return new c[i9];
            }
        }

        public c(long j9, long j10, long j11) {
            this.f39965c = j9;
            this.f39966d = j10;
            this.f39964a = j11;
        }

        public /* synthetic */ c(long j9, long j10, long j11, a aVar) {
            this(j9, j10, j11);
        }

        public c(Parcel parcel) {
            this.f39964a = parcel.readLong();
            this.f39965c = parcel.readLong();
            this.f39966d = parcel.readLong();
        }

        public /* synthetic */ c(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            parcel.writeLong(this.f39964a);
            parcel.writeLong(this.f39965c);
            parcel.writeLong(this.f39966d);
        }
    }

    public E() {
    }

    public E(Parcel parcel) {
        parcel.readList(this.f39957a, getClass().getClassLoader());
        parcel.readList(this.f39958c, getClass().getClassLoader());
        parcel.readList(this.f39959d, getClass().getClassLoader());
        this.f39960e = (c) parcel.readParcelable(getClass().getClassLoader());
        this.f39961f = (c) parcel.readParcelable(getClass().getClassLoader());
    }

    public b a(long j9, long j10) {
        c cVar = new c(j9, j10, System.currentTimeMillis(), null);
        b bVarD = d(cVar);
        c(cVar);
        return bVarD;
    }

    public final void c(c cVar) {
        this.f39957a.add(cVar);
        if (this.f39960e == null) {
            this.f39960e = new c(0L, 0L, 0L, null);
            this.f39961f = new c(0L, 0L, 0L, null);
        }
        e(cVar, true);
    }

    public b d(c cVar) {
        c cVar2;
        if (this.f39957a.size() == 0) {
            cVar2 = new c(0L, 0L, System.currentTimeMillis(), null);
        } else {
            cVar2 = (c) this.f39957a.getLast();
        }
        if (cVar == null) {
            if (this.f39957a.size() < 2) {
                cVar = cVar2;
            } else {
                this.f39957a.descendingIterator().next();
                cVar = (c) this.f39957a.descendingIterator().next();
            }
        }
        return new b(cVar2, cVar, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(c cVar, boolean z9) {
        LinkedList<c> linkedList;
        LinkedList linkedList2;
        c cVar2;
        long j9;
        HashSet hashSet = new HashSet();
        new Vector();
        if (z9) {
            linkedList = this.f39957a;
            linkedList2 = this.f39958c;
            cVar2 = this.f39960e;
            j9 = 60000;
        } else {
            linkedList = this.f39958c;
            linkedList2 = this.f39959d;
            cVar2 = this.f39961f;
            j9 = 3600000;
        }
        if (cVar.f39964a / j9 > cVar2.f39964a / j9) {
            linkedList2.add(cVar);
            if (z9) {
                this.f39960e = cVar;
                e(cVar, false);
            } else {
                this.f39961f = cVar;
            }
            for (c cVar3 : linkedList) {
                if ((cVar.f39964a - cVar3.f39964a) / j9 >= 5) {
                    hashSet.add(cVar3);
                }
            }
            linkedList.removeAll(hashSet);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.f39957a);
        parcel.writeList(this.f39958c);
        parcel.writeList(this.f39959d);
        parcel.writeParcelable(this.f39960e, 0);
        parcel.writeParcelable(this.f39961f, 0);
    }
}
