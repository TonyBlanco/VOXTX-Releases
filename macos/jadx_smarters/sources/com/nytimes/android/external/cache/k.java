package com.nytimes.android.external.cache;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.external.cache.e;
import com.nytimes.android.external.cache.f;
import j$.util.concurrent.ConcurrentMap;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public class k extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f37978v = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y f37979w = new C1518a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Queue f37980x = new C1519b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37981a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p[] f37983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f37985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f37986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f37987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f37988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f37989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.nytimes.android.external.cache.x f37990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f37991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f37992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f37993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Queue f37994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.nytimes.android.external.cache.q f37995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.nytimes.android.external.cache.u f37996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC1523f f37997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Set f37998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f37999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Set f38000u;

    public static final class A extends C {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f38001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o f38002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f38003g;

        public A(ReferenceQueue referenceQueue, Object obj, int i9, o oVar) {
            super(referenceQueue, obj, i9, oVar);
            this.f38001e = Long.MAX_VALUE;
            this.f38002f = k.r();
            this.f38003g = k.r();
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public long getAccessTime() {
            return this.f38001e;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getNextInAccessQueue() {
            return this.f38002f;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getPreviousInAccessQueue() {
            return this.f38003g;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setAccessTime(long j9) {
            this.f38001e = j9;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setNextInAccessQueue(o oVar) {
            this.f38002f = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setPreviousInAccessQueue(o oVar) {
            this.f38003g = oVar;
        }
    }

    public static final class B extends C {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f38004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o f38005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f38006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile long f38007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public o f38008i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public o f38009j;

        public B(ReferenceQueue referenceQueue, Object obj, int i9, o oVar) {
            super(referenceQueue, obj, i9, oVar);
            this.f38004e = Long.MAX_VALUE;
            this.f38005f = k.r();
            this.f38006g = k.r();
            this.f38007h = Long.MAX_VALUE;
            this.f38008i = k.r();
            this.f38009j = k.r();
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public long getAccessTime() {
            return this.f38004e;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getNextInAccessQueue() {
            return this.f38005f;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getNextInWriteQueue() {
            return this.f38008i;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getPreviousInAccessQueue() {
            return this.f38006g;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getPreviousInWriteQueue() {
            return this.f38009j;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public long getWriteTime() {
            return this.f38007h;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setAccessTime(long j9) {
            this.f38004e = j9;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setNextInAccessQueue(o oVar) {
            this.f38005f = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setNextInWriteQueue(o oVar) {
            this.f38008i = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setPreviousInAccessQueue(o oVar) {
            this.f38006g = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setPreviousInWriteQueue(o oVar) {
            this.f38009j = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setWriteTime(long j9) {
            this.f38007h = j9;
        }
    }

    public static class C extends WeakReference implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38010a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f38011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile y f38012d;

        public C(ReferenceQueue referenceQueue, Object obj, int i9, o oVar) {
            super(obj, referenceQueue);
            this.f38012d = k.F();
            this.f38010a = i9;
            this.f38011c = oVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public int getHash() {
            return this.f38010a;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public Object getKey() {
            return get();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNext() {
            return this.f38011c;
        }

        public o getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public o getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public o getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public o getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public y getValueReference() {
            return this.f38012d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j9) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setValueReference(y yVar) {
            this.f38012d = yVar;
        }

        public void setWriteTime(long j9) {
            throw new UnsupportedOperationException();
        }
    }

    public static class D extends WeakReference implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f38013a;

        public D(ReferenceQueue referenceQueue, Object obj, o oVar) {
            super(obj, referenceQueue);
            this.f38013a = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public void a(Object obj) {
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean b() {
            return false;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public int c() {
            return 1;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return new D(referenceQueue, obj, oVar);
        }

        @Override // com.nytimes.android.external.cache.k.y
        public o getEntry() {
            return this.f38013a;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean isActive() {
            return true;
        }
    }

    public static final class E extends C {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f38014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o f38015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f38016g;

        public E(ReferenceQueue referenceQueue, Object obj, int i9, o oVar) {
            super(referenceQueue, obj, i9, oVar);
            this.f38014e = Long.MAX_VALUE;
            this.f38015f = k.r();
            this.f38016g = k.r();
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getNextInWriteQueue() {
            return this.f38015f;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public o getPreviousInWriteQueue() {
            return this.f38016g;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public long getWriteTime() {
            return this.f38014e;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setNextInWriteQueue(o oVar) {
            this.f38015f = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setPreviousInWriteQueue(o oVar) {
            this.f38016g = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.C, com.nytimes.android.external.cache.k.o
        public void setWriteTime(long j9) {
            this.f38014e = j9;
        }
    }

    public static final class F extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f38017c;

        public F(ReferenceQueue referenceQueue, Object obj, o oVar, int i9) {
            super(referenceQueue, obj, oVar);
            this.f38017c = i9;
        }

        @Override // com.nytimes.android.external.cache.k.q, com.nytimes.android.external.cache.k.y
        public int c() {
            return this.f38017c;
        }

        @Override // com.nytimes.android.external.cache.k.q, com.nytimes.android.external.cache.k.y
        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return new F(referenceQueue, obj, oVar, this.f38017c);
        }
    }

    public static final class G extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f38018c;

        public G(Object obj, int i9) {
            super(obj);
            this.f38018c = i9;
        }

        @Override // com.nytimes.android.external.cache.k.v, com.nytimes.android.external.cache.k.y
        public int c() {
            return this.f38018c;
        }
    }

    public static final class H extends D {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f38019c;

        public H(ReferenceQueue referenceQueue, Object obj, o oVar, int i9) {
            super(referenceQueue, obj, oVar);
            this.f38019c = i9;
        }

        @Override // com.nytimes.android.external.cache.k.D, com.nytimes.android.external.cache.k.y
        public int c() {
            return this.f38019c;
        }

        @Override // com.nytimes.android.external.cache.k.D, com.nytimes.android.external.cache.k.y
        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return new H(referenceQueue, obj, oVar, this.f38019c);
        }
    }

    public static final class I extends AbstractQueue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f38020a = new a();

        public class a extends AbstractC1521d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public o f38021a = this;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public o f38022c = this;

            public a() {
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public o getNextInWriteQueue() {
                return this.f38021a;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public o getPreviousInWriteQueue() {
                return this.f38022c;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public void setNextInWriteQueue(o oVar) {
                this.f38021a = oVar;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public void setPreviousInWriteQueue(o oVar) {
                this.f38022c = oVar;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public void setWriteTime(long j9) {
            }
        }

        public class b extends com.nytimes.android.external.cache.b {
            public b(o oVar) {
                super(oVar);
            }

            @Override // com.nytimes.android.external.cache.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o a(o oVar) {
                o nextInWriteQueue = oVar.getNextInWriteQueue();
                if (nextInWriteQueue == I.this.f38020a) {
                    return null;
                }
                return nextInWriteQueue;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(o oVar) {
            k.d(oVar.getPreviousInWriteQueue(), oVar.getNextInWriteQueue());
            k.d(this.f38020a.getPreviousInWriteQueue(), oVar);
            k.d(oVar, this.f38020a);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o nextInWriteQueue = this.f38020a.getNextInWriteQueue();
            while (true) {
                o oVar = this.f38020a;
                if (nextInWriteQueue == oVar) {
                    oVar.setNextInWriteQueue(oVar);
                    o oVar2 = this.f38020a;
                    oVar2.setPreviousInWriteQueue(oVar2);
                    return;
                } else {
                    o nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    k.t(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((o) obj).getNextInWriteQueue() != n.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o peek() {
            o nextInWriteQueue = this.f38020a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f38020a) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o poll() {
            o nextInWriteQueue = this.f38020a.getNextInWriteQueue();
            if (nextInWriteQueue == this.f38020a) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f38020a.getNextInWriteQueue() == this.f38020a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            o oVar = (o) obj;
            o previousInWriteQueue = oVar.getPreviousInWriteQueue();
            o nextInWriteQueue = oVar.getNextInWriteQueue();
            k.d(previousInWriteQueue, nextInWriteQueue);
            k.t(oVar);
            return nextInWriteQueue != n.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i9 = 0;
            for (o nextInWriteQueue = this.f38020a.getNextInWriteQueue(); nextInWriteQueue != this.f38020a; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i9++;
            }
            return i9;
        }
    }

    public final class J implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f38025a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f38026c;

        public J(Object obj, Object obj2) {
            this.f38025a = obj;
            this.f38026c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f38025a.equals(entry.getKey()) && this.f38026c.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f38025a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38026c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f38025a.hashCode() ^ this.f38026c.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$a, reason: case insensitive filesystem */
    public class C1518a implements y {
        @Override // com.nytimes.android.external.cache.k.y
        public void a(Object obj) {
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean b() {
            return false;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public int c() {
            return 0;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return this;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public Object get() {
            return null;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public o getEntry() {
            return null;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean isActive() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$b, reason: case insensitive filesystem */
    public class C1519b extends AbstractQueue {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new HashSet().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$c, reason: case insensitive filesystem */
    public abstract class AbstractC1520c extends AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcurrentMap f38028a;

        public AbstractC1520c(ConcurrentMap concurrentMap) {
            this.f38028a = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f38028a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f38028a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f38028a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return k.E(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return k.E(this).toArray(objArr);
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$d, reason: case insensitive filesystem */
    public static abstract class AbstractC1521d implements o {
        @Override // com.nytimes.android.external.cache.k.o
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public y getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setAccessTime(long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setNextInAccessQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setNextInWriteQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setPreviousInAccessQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setPreviousInWriteQueue(o oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setValueReference(y yVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setWriteTime(long j9) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$e, reason: case insensitive filesystem */
    public static final class C1522e extends AbstractQueue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f38030a = new a();

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$e$a */
        public class a extends AbstractC1521d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public o f38031a = this;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public o f38032c = this;

            public a() {
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public o getNextInAccessQueue() {
                return this.f38031a;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public o getPreviousInAccessQueue() {
                return this.f38032c;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public void setAccessTime(long j9) {
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public void setNextInAccessQueue(o oVar) {
                this.f38031a = oVar;
            }

            @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
            public void setPreviousInAccessQueue(o oVar) {
                this.f38032c = oVar;
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$e$b */
        public class b extends com.nytimes.android.external.cache.b {
            public b(o oVar) {
                super(oVar);
            }

            @Override // com.nytimes.android.external.cache.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o a(o oVar) {
                o nextInAccessQueue = oVar.getNextInAccessQueue();
                if (nextInAccessQueue == C1522e.this.f38030a) {
                    return null;
                }
                return nextInAccessQueue;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(o oVar) {
            k.c(oVar.getPreviousInAccessQueue(), oVar.getNextInAccessQueue());
            k.c(this.f38030a.getPreviousInAccessQueue(), oVar);
            k.c(oVar, this.f38030a);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o nextInAccessQueue = this.f38030a.getNextInAccessQueue();
            while (true) {
                o oVar = this.f38030a;
                if (nextInAccessQueue == oVar) {
                    oVar.setNextInAccessQueue(oVar);
                    o oVar2 = this.f38030a;
                    oVar2.setPreviousInAccessQueue(oVar2);
                    return;
                } else {
                    o nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    k.s(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((o) obj).getNextInAccessQueue() != n.INSTANCE;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o peek() {
            o nextInAccessQueue = this.f38030a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f38030a) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public o poll() {
            o nextInAccessQueue = this.f38030a.getNextInAccessQueue();
            if (nextInAccessQueue == this.f38030a) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f38030a.getNextInAccessQueue() == this.f38030a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            o oVar = (o) obj;
            o previousInAccessQueue = oVar.getPreviousInAccessQueue();
            o nextInAccessQueue = oVar.getNextInAccessQueue();
            k.c(previousInAccessQueue, nextInAccessQueue);
            k.s(oVar);
            return nextInAccessQueue != n.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i9 = 0;
            for (o nextInAccessQueue = this.f38030a.getNextInAccessQueue(); nextInAccessQueue != this.f38030a; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i9++;
            }
            return i9;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f, reason: case insensitive filesystem */
    public static abstract class EnumC1523f {
        private static final /* synthetic */ EnumC1523f[] $VALUES;
        static final int ACCESS_MASK = 1;
        public static final EnumC1523f STRONG;
        public static final EnumC1523f STRONG_ACCESS;
        public static final EnumC1523f STRONG_ACCESS_WRITE;
        public static final EnumC1523f STRONG_WRITE;
        public static final EnumC1523f WEAK;
        public static final EnumC1523f WEAK_ACCESS;
        public static final EnumC1523f WEAK_ACCESS_WRITE;
        static final int WEAK_MASK = 4;
        public static final EnumC1523f WEAK_WRITE;
        static final int WRITE_MASK = 2;
        static final EnumC1523f[] factories;

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$a */
        public enum a extends EnumC1523f {
            public a(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new u(k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$b */
        public enum b extends EnumC1523f {
            public b(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
                o oVarCopyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, oVarCopyEntry);
                return oVarCopyEntry;
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new s(k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$c */
        public enum c extends EnumC1523f {
            public c(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
                o oVarCopyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyWriteEntry(oVar, oVarCopyEntry);
                return oVarCopyEntry;
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new w(k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$d */
        public enum d extends EnumC1523f {
            public d(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
                o oVarCopyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, oVarCopyEntry);
                copyWriteEntry(oVar, oVarCopyEntry);
                return oVarCopyEntry;
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new t(k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$e */
        public enum e extends EnumC1523f {
            public e(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new C(pVar.f38058i, k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$f, reason: collision with other inner class name */
        public enum C0296f extends EnumC1523f {
            public C0296f(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
                o oVarCopyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, oVarCopyEntry);
                return oVarCopyEntry;
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new A(pVar.f38058i, k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$g */
        public enum g extends EnumC1523f {
            public g(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
                o oVarCopyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyWriteEntry(oVar, oVarCopyEntry);
                return oVarCopyEntry;
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new E(pVar.f38058i, k9, i9, oVar);
            }
        }

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$f$h */
        public enum h extends EnumC1523f {
            public h(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
                o oVarCopyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, oVarCopyEntry);
                copyWriteEntry(oVar, oVarCopyEntry);
                return oVarCopyEntry;
            }

            @Override // com.nytimes.android.external.cache.k.EnumC1523f
            public <K, V> o newEntry(p pVar, K k9, int i9, o oVar) {
                return new B(pVar.f38058i, k9, i9, oVar);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            STRONG_ACCESS = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            STRONG_WRITE = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e("WEAK", 4);
            WEAK = eVar;
            C0296f c0296f = new C0296f("WEAK_ACCESS", 5);
            WEAK_ACCESS = c0296f;
            g gVar = new g("WEAK_WRITE", 6);
            WEAK_WRITE = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = new EnumC1523f[]{aVar, bVar, cVar, dVar, eVar, c0296f, gVar, hVar};
            factories = new EnumC1523f[]{aVar, bVar, cVar, dVar, eVar, c0296f, gVar, hVar};
        }

        private EnumC1523f(String str, int i9) {
        }

        public /* synthetic */ EnumC1523f(String str, int i9, C1518a c1518a) {
            this(str, i9);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EnumC1523f getFactory(r rVar, boolean z9, boolean z10) {
            return factories[(rVar == r.WEAK ? (char) 4 : (char) 0) | (z9 ? 1 : 0) | (z10 ? 2 : 0)];
        }

        public static EnumC1523f valueOf(String str) {
            return (EnumC1523f) Enum.valueOf(EnumC1523f.class, str);
        }

        public static EnumC1523f[] values() {
            return (EnumC1523f[]) $VALUES.clone();
        }

        public <K, V> void copyAccessEntry(o oVar, o oVar2) {
            oVar2.setAccessTime(oVar.getAccessTime());
            k.c(oVar.getPreviousInAccessQueue(), oVar2);
            k.c(oVar2, oVar.getNextInAccessQueue());
            k.s(oVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <K, V> o copyEntry(p pVar, o oVar, o oVar2) {
            return newEntry(pVar, oVar.getKey(), oVar.getHash(), oVar2);
        }

        public <K, V> void copyWriteEntry(o oVar, o oVar2) {
            oVar2.setWriteTime(oVar.getWriteTime());
            k.d(oVar.getPreviousInWriteQueue(), oVar2);
            k.d(oVar2, oVar.getNextInWriteQueue());
            k.t(oVar);
        }

        public abstract <K, V> o newEntry(p pVar, K k9, int i9, o oVar);
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$g, reason: case insensitive filesystem */
    public final class C1524g extends AbstractC1526i {
        public C1524g() {
            super();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            return d();
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$h, reason: case insensitive filesystem */
    public final class C1525h extends AbstractC1520c {
        public C1525h(ConcurrentMap concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = k.this.get(key)) != null && k.this.f37986g.d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return k.this.new C1524g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && k.this.remove(key, entry.getValue());
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$i, reason: case insensitive filesystem */
    public abstract class AbstractC1526i implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38037a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38038c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f38039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AtomicReferenceArray f38040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o f38041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public J f38042g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public J f38043h;

        public AbstractC1526i() {
            this.f38037a = k.this.f37983d.length - 1;
            b();
        }

        public final void b() {
            this.f38042g = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i9 = this.f38037a;
                if (i9 < 0) {
                    return;
                }
                p[] pVarArr = k.this.f37983d;
                this.f38037a = i9 - 1;
                p pVar = pVarArr[i9];
                this.f38039d = pVar;
                if (pVar.f38052c != 0) {
                    this.f38040e = this.f38039d.f38056g;
                    this.f38038c = r0.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        public boolean c(o oVar) {
            try {
                long jA = k.this.f37996q.a();
                Object key = oVar.getKey();
                Object objM = k.this.m(oVar, jA);
                if (objM == null) {
                    this.f38039d.C();
                    return false;
                }
                this.f38042g = k.this.new J(key, objM);
                this.f38039d.C();
                return true;
            } catch (Throwable th) {
                this.f38039d.C();
                throw th;
            }
        }

        public J d() {
            J j9 = this.f38042g;
            if (j9 == null) {
                throw new NoSuchElementException();
            }
            this.f38043h = j9;
            b();
            return this.f38043h;
        }

        public boolean e() {
            o oVar = this.f38041f;
            if (oVar == null) {
                return false;
            }
            while (true) {
                this.f38041f = oVar.getNext();
                o oVar2 = this.f38041f;
                if (oVar2 == null) {
                    return false;
                }
                if (c(oVar2)) {
                    return true;
                }
                oVar = this.f38041f;
            }
        }

        public boolean f() {
            while (true) {
                int i9 = this.f38038c;
                if (i9 < 0) {
                    return false;
                }
                AtomicReferenceArray atomicReferenceArray = this.f38040e;
                this.f38038c = i9 - 1;
                o oVar = (o) atomicReferenceArray.get(i9);
                this.f38041f = oVar;
                if (oVar != null && (c(oVar) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38042g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.nytimes.android.external.cache.o.c(this.f38043h != null);
            k.this.remove(this.f38043h.getKey());
            this.f38043h = null;
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$j, reason: case insensitive filesystem */
    public final class C1527j extends AbstractC1526i {
        public C1527j() {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return d().getKey();
        }
    }

    /* JADX INFO: renamed from: com.nytimes.android.external.cache.k$k, reason: collision with other inner class name */
    public final class C0297k extends AbstractC1520c {
        public C0297k(ConcurrentMap concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f38028a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return k.this.new C1527j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f38028a.remove(obj) != null;
        }
    }

    public static class l implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile y f38047a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.nytimes.android.external.cache.s f38048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.nytimes.android.external.cache.t f38049d;

        public l() {
            this(k.F());
        }

        public l(y yVar) {
            this.f38048c = com.nytimes.android.external.cache.s.t();
            this.f38049d = com.nytimes.android.external.cache.t.c();
            this.f38047a = yVar;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public void a(Object obj) {
            if (obj != null) {
                h(obj);
            } else {
                this.f38047a = k.F();
            }
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean b() {
            return true;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public int c() {
            return this.f38047a.c();
        }

        @Override // com.nytimes.android.external.cache.k.y
        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return this;
        }

        public final j e(Throwable th) {
            return i.a(th);
        }

        public y f() {
            return this.f38047a;
        }

        public j g(Object obj, f fVar) {
            try {
                this.f38049d.e();
                this.f38047a.get().getClass();
                throw null;
            } catch (Throwable th) {
                j jVarE = i(th) ? this.f38048c : e(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return jVarE;
            }
        }

        @Override // com.nytimes.android.external.cache.k.y
        public Object get() {
            return this.f38047a.get();
        }

        @Override // com.nytimes.android.external.cache.k.y
        public o getEntry() {
            return null;
        }

        public boolean h(Object obj) {
            return this.f38048c.r(obj);
        }

        public boolean i(Throwable th) {
            return this.f38048c.s(th);
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean isActive() {
            return this.f38047a.isActive();
        }
    }

    public static class m implements d, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f38050a;

        public m(e eVar) {
            this(new k(eVar, null));
        }

        public m(k kVar) {
            this.f38050a = kVar;
        }

        @Override // com.nytimes.android.external.cache.d
        public void a(Object obj) {
            com.nytimes.android.external.cache.o.a(obj);
            this.f38050a.remove(obj);
        }

        @Override // com.nytimes.android.external.cache.d
        public Object b(Object obj) {
            return this.f38050a.k(obj);
        }

        @Override // com.nytimes.android.external.cache.d
        public void c() {
            this.f38050a.clear();
        }

        @Override // com.nytimes.android.external.cache.d
        public void put(Object obj, Object obj2) {
            this.f38050a.put(obj, obj2);
        }
    }

    public enum n implements o {
        INSTANCE;

        @Override // com.nytimes.android.external.cache.k.o
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public int getHash() {
            return 0;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public Object getKey() {
            return null;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNext() {
            return null;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNextInAccessQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getNextInWriteQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public o getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public y getValueReference() {
            return null;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setAccessTime(long j9) {
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setNextInAccessQueue(o oVar) {
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setNextInWriteQueue(o oVar) {
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setPreviousInAccessQueue(o oVar) {
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setPreviousInWriteQueue(o oVar) {
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setValueReference(y yVar) {
        }

        @Override // com.nytimes.android.external.cache.k.o
        public void setWriteTime(long j9) {
        }
    }

    public interface o {
        long getAccessTime();

        int getHash();

        Object getKey();

        o getNext();

        o getNextInAccessQueue();

        o getNextInWriteQueue();

        o getPreviousInAccessQueue();

        o getPreviousInWriteQueue();

        y getValueReference();

        long getWriteTime();

        void setAccessTime(long j9);

        void setNextInAccessQueue(o oVar);

        void setNextInWriteQueue(o oVar);

        void setPreviousInAccessQueue(o oVar);

        void setPreviousInWriteQueue(o oVar);

        void setValueReference(y yVar);

        void setWriteTime(long j9);
    }

    public static class p extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f38051a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f38052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f38053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f38054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f38055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile AtomicReferenceArray f38056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f38057h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ReferenceQueue f38058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ReferenceQueue f38059j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Queue f38060k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicInteger f38061l = new AtomicInteger();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Queue f38062m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Queue f38063n;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f38064a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f38065c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l f38066d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ j f38067e;

            public a(Object obj, int i9, l lVar, j jVar) {
                this.f38064a = obj;
                this.f38065c = i9;
                this.f38066d = lVar;
                this.f38067e = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    p.this.r(this.f38064a, this.f38065c, this.f38066d, this.f38067e);
                } catch (Throwable th) {
                    k.f37978v.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f38066d.i(th);
                }
            }
        }

        public p(k kVar, int i9, long j9) {
            this.f38051a = kVar;
            this.f38057h = j9;
            x(B(i9));
            this.f38058i = kVar.I() ? new ReferenceQueue() : null;
            this.f38059j = kVar.J() ? new ReferenceQueue() : null;
            this.f38060k = kVar.H() ? new ConcurrentLinkedQueue() : k.g();
            this.f38062m = kVar.L() ? new I() : k.g();
            this.f38063n = kVar.H() ? new C1522e() : k.g();
        }

        public o A(Object obj, int i9, o oVar) {
            return this.f38051a.f37997r.newEntry(this, com.nytimes.android.external.cache.o.a(obj), i9, oVar);
        }

        public AtomicReferenceArray B(int i9) {
            return new AtomicReferenceArray(i9);
        }

        public void C() {
            if ((this.f38061l.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        public void D() {
            W();
        }

        public void E(long j9) {
            V(j9);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object F(java.lang.Object r11, int r12, java.lang.Object r13, boolean r14) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.F(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        public boolean G(o oVar, int i9) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f38056g;
                int length = (atomicReferenceArray.length() - 1) & i9;
                o oVar2 = (o) atomicReferenceArray.get(length);
                for (o next = oVar2; next != null; next = next.getNext()) {
                    if (next == oVar) {
                        this.f38054e++;
                        o oVarS = S(oVar2, next, next.getKey(), i9, next.getValueReference(), com.nytimes.android.external.cache.p.COLLECTED);
                        int i10 = this.f38052c - 1;
                        atomicReferenceArray.set(length, oVarS);
                        this.f38052c = i10;
                        return true;
                    }
                }
                unlock();
                D();
                return false;
            } finally {
                unlock();
                D();
            }
        }

        public boolean H(Object obj, int i9, y yVar) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f38056g;
                int length = (atomicReferenceArray.length() - 1) & i9;
                o oVar = (o) atomicReferenceArray.get(length);
                for (o next = oVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i9 && key != null && this.f38051a.f37985f.d(obj, key)) {
                        if (next.getValueReference() != yVar) {
                            unlock();
                            if (!isHeldByCurrentThread()) {
                                D();
                            }
                            return false;
                        }
                        this.f38054e++;
                        o oVarS = S(oVar, next, key, i9, yVar, com.nytimes.android.external.cache.p.COLLECTED);
                        int i10 = this.f38052c - 1;
                        atomicReferenceArray.set(length, oVarS);
                        this.f38052c = i10;
                        return true;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    D();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    D();
                }
            }
        }

        public void I(o oVar, long j9) {
            if (this.f38051a.x()) {
                oVar.setAccessTime(j9);
            }
            this.f38063n.add(oVar);
        }

        public void J(o oVar, long j9) {
            if (this.f38051a.x()) {
                oVar.setAccessTime(j9);
            }
            this.f38060k.add(oVar);
        }

        public void K(o oVar, int i9, long j9) {
            i();
            this.f38053d += (long) i9;
            if (this.f38051a.x()) {
                oVar.setAccessTime(j9);
            }
            if (this.f38051a.z()) {
                oVar.setWriteTime(j9);
            }
            this.f38063n.add(oVar);
            this.f38062m.add(oVar);
        }

        public Object L(Object obj, int i9, f fVar, boolean z9) {
            l lVarY = y(obj, i9, z9);
            if (lVarY == null) {
                return null;
            }
            j jVarZ = z(obj, i9, lVarY, fVar);
            if (jVarZ.isDone()) {
                try {
                    return com.nytimes.android.external.cache.v.a(jVarZ);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r8 = r5.getValueReference();
            r11 = r8.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            if (r11 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            r2 = com.nytimes.android.external.cache.p.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            r9 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r8.isActive() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            r2 = com.nytimes.android.external.cache.p.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        
            r10.f38054e++;
            r12 = S(r4, r5, r6, r12, r8, r9);
            r2 = r10.f38052c - 1;
            r0.set(r1, r12);
            r10.f38052c = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            return r11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object M(java.lang.Object r11, int r12) {
            /*
                r10 = this;
                r10.lock()
                com.nytimes.android.external.cache.k r0 = r10.f38051a     // Catch: java.lang.Throwable -> L46
                com.nytimes.android.external.cache.u r0 = r0.f37996q     // Catch: java.lang.Throwable -> L46
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L46
                r10.E(r0)     // Catch: java.lang.Throwable -> L46
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r10.f38056g     // Catch: java.lang.Throwable -> L46
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L46
                int r1 = r1 + (-1)
                r1 = r1 & r12
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L46
                r4 = r2
                com.nytimes.android.external.cache.k$o r4 = (com.nytimes.android.external.cache.k.o) r4     // Catch: java.lang.Throwable -> L46
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6d
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L46
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L46
                if (r3 != r12) goto L74
                if (r6 == 0) goto L74
                com.nytimes.android.external.cache.k r3 = r10.f38051a     // Catch: java.lang.Throwable -> L46
                com.nytimes.android.external.cache.h r3 = r3.f37985f     // Catch: java.lang.Throwable -> L46
                boolean r3 = r3.d(r11, r6)     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L74
                com.nytimes.android.external.cache.k$y r8 = r5.getValueReference()     // Catch: java.lang.Throwable -> L46
                java.lang.Object r11 = r8.get()     // Catch: java.lang.Throwable -> L46
                if (r11 == 0) goto L48
                com.nytimes.android.external.cache.p r2 = com.nytimes.android.external.cache.p.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r9 = r2
                goto L51
            L46:
                r11 = move-exception
                goto L79
            L48:
                boolean r3 = r8.isActive()     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L6d
                com.nytimes.android.external.cache.p r2 = com.nytimes.android.external.cache.p.COLLECTED     // Catch: java.lang.Throwable -> L46
                goto L44
            L51:
                int r2 = r10.f38054e     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + 1
                r10.f38054e = r2     // Catch: java.lang.Throwable -> L46
                r3 = r10
                r7 = r12
                com.nytimes.android.external.cache.k$o r12 = r3.S(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L46
                int r2 = r10.f38052c     // Catch: java.lang.Throwable -> L46
                int r2 = r2 + (-1)
                r0.set(r1, r12)     // Catch: java.lang.Throwable -> L46
                r10.f38052c = r2     // Catch: java.lang.Throwable -> L46
                r10.unlock()
                r10.D()
                return r11
            L6d:
                r10.unlock()
                r10.D()
                return r2
            L74:
                com.nytimes.android.external.cache.k$o r5 = r5.getNext()     // Catch: java.lang.Throwable -> L46
                goto L1f
            L79:
                r10.unlock()
                r10.D()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.M(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            r9 = r6.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        
            if (r11.f38051a.f37986g.d(r14, r12) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            r12 = com.nytimes.android.external.cache.p.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        
            if (r12 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r9.isActive() == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            r12 = com.nytimes.android.external.cache.p.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            r11.f38054e++;
            r13 = S(r5, r6, r7, r13, r9, r12);
            r14 = r11.f38052c - 1;
            r0.set(r1, r13);
            r11.f38052c = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        
            if (r12 != com.nytimes.android.external.cache.p.EXPLICIT) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        
            unlock();
            D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean N(java.lang.Object r12, int r13, java.lang.Object r14) {
            /*
                r11 = this;
                r11.lock()
                com.nytimes.android.external.cache.k r0 = r11.f38051a     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache.u r0 = r0.f37996q     // Catch: java.lang.Throwable -> L4d
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L4d
                r11.E(r0)     // Catch: java.lang.Throwable -> L4d
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.f38056g     // Catch: java.lang.Throwable -> L4d
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L4d
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r13
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L4d
                r5 = r3
                com.nytimes.android.external.cache.k$o r5 = (com.nytimes.android.external.cache.k.o) r5     // Catch: java.lang.Throwable -> L4d
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L7a
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L4d
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L4d
                if (r4 != r13) goto L81
                if (r7 == 0) goto L81
                com.nytimes.android.external.cache.k r4 = r11.f38051a     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache.h r4 = r4.f37985f     // Catch: java.lang.Throwable -> L4d
                boolean r4 = r4.d(r12, r7)     // Catch: java.lang.Throwable -> L4d
                if (r4 == 0) goto L81
                com.nytimes.android.external.cache.k$y r9 = r6.getValueReference()     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache.k r4 = r11.f38051a     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache.h r4 = r4.f37986g     // Catch: java.lang.Throwable -> L4d
                boolean r14 = r4.d(r14, r12)     // Catch: java.lang.Throwable -> L4d
                if (r14 == 0) goto L4f
                com.nytimes.android.external.cache.p r12 = com.nytimes.android.external.cache.p.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                goto L59
            L4d:
                r12 = move-exception
                goto L86
            L4f:
                if (r12 != 0) goto L7a
                boolean r12 = r9.isActive()     // Catch: java.lang.Throwable -> L4d
                if (r12 == 0) goto L7a
                com.nytimes.android.external.cache.p r12 = com.nytimes.android.external.cache.p.COLLECTED     // Catch: java.lang.Throwable -> L4d
            L59:
                int r14 = r11.f38054e     // Catch: java.lang.Throwable -> L4d
                int r14 = r14 + r2
                r11.f38054e = r14     // Catch: java.lang.Throwable -> L4d
                r4 = r11
                r8 = r13
                r10 = r12
                com.nytimes.android.external.cache.k$o r13 = r4.S(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4d
                int r14 = r11.f38052c     // Catch: java.lang.Throwable -> L4d
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L4d
                r11.f38052c = r14     // Catch: java.lang.Throwable -> L4d
                com.nytimes.android.external.cache.p r13 = com.nytimes.android.external.cache.p.EXPLICIT     // Catch: java.lang.Throwable -> L4d
                if (r12 != r13) goto L72
                goto L73
            L72:
                r2 = 0
            L73:
                r11.unlock()
                r11.D()
                return r2
            L7a:
                r11.unlock()
                r11.D()
                return r3
            L81:
                com.nytimes.android.external.cache.k$o r6 = r6.getNext()     // Catch: java.lang.Throwable -> L4d
                goto L1f
            L86:
                r11.unlock()
                r11.D()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.N(java.lang.Object, int, java.lang.Object):boolean");
        }

        public void O(o oVar) {
            l(oVar, com.nytimes.android.external.cache.p.COLLECTED);
            this.f38062m.remove(oVar);
            this.f38063n.remove(oVar);
        }

        public boolean P(o oVar, int i9, com.nytimes.android.external.cache.p pVar) {
            AtomicReferenceArray atomicReferenceArray = this.f38056g;
            int length = (atomicReferenceArray.length() - 1) & i9;
            o oVar2 = (o) atomicReferenceArray.get(length);
            for (o next = oVar2; next != null; next = next.getNext()) {
                if (next == oVar) {
                    this.f38054e++;
                    o oVarS = S(oVar2, next, next.getKey(), i9, next.getValueReference(), pVar);
                    int i10 = this.f38052c - 1;
                    atomicReferenceArray.set(length, oVarS);
                    this.f38052c = i10;
                    return true;
                }
            }
            return false;
        }

        public o Q(o oVar, o oVar2) {
            int i9 = this.f38052c;
            o next = oVar2.getNext();
            while (oVar != oVar2) {
                o oVarG = g(oVar, next);
                if (oVarG != null) {
                    next = oVarG;
                } else {
                    O(oVar);
                    i9--;
                }
                oVar = oVar.getNext();
            }
            this.f38052c = i9;
            return next;
        }

        public boolean R(Object obj, int i9, l lVar) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f38056g;
                int length = (atomicReferenceArray.length() - 1) & i9;
                o oVar = (o) atomicReferenceArray.get(length);
                o next = oVar;
                while (true) {
                    if (next == null) {
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() != i9 || key == null || !this.f38051a.f37985f.d(obj, key)) {
                        next = next.getNext();
                    } else if (next.getValueReference() == lVar) {
                        if (lVar.isActive()) {
                            next.setValueReference(lVar.f());
                        } else {
                            atomicReferenceArray.set(length, Q(oVar, next));
                        }
                        unlock();
                        D();
                        return true;
                    }
                }
                unlock();
                D();
                return false;
            } catch (Throwable th) {
                unlock();
                D();
                throw th;
            }
        }

        public o S(o oVar, o oVar2, Object obj, int i9, y yVar, com.nytimes.android.external.cache.p pVar) {
            m(obj, i9, yVar, pVar);
            this.f38062m.remove(oVar2);
            this.f38063n.remove(oVar2);
            if (!yVar.b()) {
                return Q(oVar, oVar2);
            }
            yVar.a(null);
            return oVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object T(java.lang.Object r16, int r17, java.lang.Object r18) {
            /*
                r15 = this;
                r8 = r15
                r0 = r16
                r5 = r17
                r15.lock()
                com.nytimes.android.external.cache.k r1 = r8.f38051a     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache.u r1 = r1.f37996q     // Catch: java.lang.Throwable -> L69
                long r6 = r1.a()     // Catch: java.lang.Throwable -> L69
                r15.E(r6)     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray r9 = r8.f38056g     // Catch: java.lang.Throwable -> L69
                int r1 = r9.length()     // Catch: java.lang.Throwable -> L69
                int r1 = r1 + (-1)
                r10 = r5 & r1
                java.lang.Object r1 = r9.get(r10)     // Catch: java.lang.Throwable -> L69
                r2 = r1
                com.nytimes.android.external.cache.k$o r2 = (com.nytimes.android.external.cache.k.o) r2     // Catch: java.lang.Throwable -> L69
                r11 = r2
            L25:
                r12 = 0
                if (r11 == 0) goto L6b
                java.lang.Object r4 = r11.getKey()     // Catch: java.lang.Throwable -> L69
                int r1 = r11.getHash()     // Catch: java.lang.Throwable -> L69
                if (r1 != r5) goto L91
                if (r4 == 0) goto L91
                com.nytimes.android.external.cache.k r1 = r8.f38051a     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache.h r1 = r1.f37985f     // Catch: java.lang.Throwable -> L69
                boolean r1 = r1.d(r0, r4)     // Catch: java.lang.Throwable -> L69
                if (r1 == 0) goto L91
                com.nytimes.android.external.cache.k$y r13 = r11.getValueReference()     // Catch: java.lang.Throwable -> L69
                java.lang.Object r14 = r13.get()     // Catch: java.lang.Throwable -> L69
                if (r14 != 0) goto L72
                boolean r0 = r13.isActive()     // Catch: java.lang.Throwable -> L69
                if (r0 == 0) goto L6b
                int r0 = r8.f38054e     // Catch: java.lang.Throwable -> L69
                int r0 = r0 + 1
                r8.f38054e = r0     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache.p r7 = com.nytimes.android.external.cache.p.COLLECTED     // Catch: java.lang.Throwable -> L69
                r1 = r15
                r3 = r11
                r5 = r17
                r6 = r13
                com.nytimes.android.external.cache.k$o r0 = r1.S(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L69
                int r1 = r8.f38052c     // Catch: java.lang.Throwable -> L69
                int r1 = r1 + (-1)
                r9.set(r10, r0)     // Catch: java.lang.Throwable -> L69
                r8.f38052c = r1     // Catch: java.lang.Throwable -> L69
                goto L6b
            L69:
                r0 = move-exception
                goto L96
            L6b:
                r15.unlock()
                r15.D()
                return r12
            L72:
                int r1 = r8.f38054e     // Catch: java.lang.Throwable -> L69
                int r1 = r1 + 1
                r8.f38054e = r1     // Catch: java.lang.Throwable -> L69
                com.nytimes.android.external.cache.p r1 = com.nytimes.android.external.cache.p.REPLACED     // Catch: java.lang.Throwable -> L69
                r15.m(r0, r5, r13, r1)     // Catch: java.lang.Throwable -> L69
                r1 = r15
                r2 = r11
                r3 = r16
                r4 = r18
                r5 = r6
                r1.Y(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L69
                r15.n(r11)     // Catch: java.lang.Throwable -> L69
                r15.unlock()
                r15.D()
                return r14
            L91:
                com.nytimes.android.external.cache.k$o r11 = r11.getNext()     // Catch: java.lang.Throwable -> L69
                goto L25
            L96:
                r15.unlock()
                r15.D()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.T(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean U(java.lang.Object r16, int r17, java.lang.Object r18, java.lang.Object r19) {
            /*
                r15 = this;
                r8 = r15
                r0 = r16
                r5 = r17
                r15.lock()
                com.nytimes.android.external.cache.k r1 = r8.f38051a     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache.u r1 = r1.f37996q     // Catch: java.lang.Throwable -> L67
                long r6 = r1.a()     // Catch: java.lang.Throwable -> L67
                r15.E(r6)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicReferenceArray r9 = r8.f38056g     // Catch: java.lang.Throwable -> L67
                int r1 = r9.length()     // Catch: java.lang.Throwable -> L67
                r10 = 1
                int r1 = r1 - r10
                r11 = r5 & r1
                java.lang.Object r1 = r9.get(r11)     // Catch: java.lang.Throwable -> L67
                r2 = r1
                com.nytimes.android.external.cache.k$o r2 = (com.nytimes.android.external.cache.k.o) r2     // Catch: java.lang.Throwable -> L67
                r12 = r2
            L25:
                r13 = 0
                if (r12 == 0) goto L69
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> L67
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> L67
                if (r1 != r5) goto L9e
                if (r4 == 0) goto L9e
                com.nytimes.android.external.cache.k r1 = r8.f38051a     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache.h r1 = r1.f37985f     // Catch: java.lang.Throwable -> L67
                boolean r1 = r1.d(r0, r4)     // Catch: java.lang.Throwable -> L67
                if (r1 == 0) goto L9e
                com.nytimes.android.external.cache.k$y r14 = r12.getValueReference()     // Catch: java.lang.Throwable -> L67
                java.lang.Object r1 = r14.get()     // Catch: java.lang.Throwable -> L67
                if (r1 != 0) goto L70
                boolean r0 = r14.isActive()     // Catch: java.lang.Throwable -> L67
                if (r0 == 0) goto L69
                int r0 = r8.f38054e     // Catch: java.lang.Throwable -> L67
                int r0 = r0 + r10
                r8.f38054e = r0     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache.p r7 = com.nytimes.android.external.cache.p.COLLECTED     // Catch: java.lang.Throwable -> L67
                r1 = r15
                r3 = r12
                r5 = r17
                r6 = r14
                com.nytimes.android.external.cache.k$o r0 = r1.S(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
                int r1 = r8.f38052c     // Catch: java.lang.Throwable -> L67
                int r1 = r1 - r10
                r9.set(r11, r0)     // Catch: java.lang.Throwable -> L67
                r8.f38052c = r1     // Catch: java.lang.Throwable -> L67
                goto L69
            L67:
                r0 = move-exception
                goto La5
            L69:
                r15.unlock()
                r15.D()
                return r13
            L70:
                com.nytimes.android.external.cache.k r2 = r8.f38051a     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache.h r2 = r2.f37986g     // Catch: java.lang.Throwable -> L67
                r3 = r18
                boolean r1 = r2.d(r3, r1)     // Catch: java.lang.Throwable -> L67
                if (r1 == 0) goto L9a
                int r1 = r8.f38054e     // Catch: java.lang.Throwable -> L67
                int r1 = r1 + r10
                r8.f38054e = r1     // Catch: java.lang.Throwable -> L67
                com.nytimes.android.external.cache.p r1 = com.nytimes.android.external.cache.p.REPLACED     // Catch: java.lang.Throwable -> L67
                r15.m(r0, r5, r14, r1)     // Catch: java.lang.Throwable -> L67
                r1 = r15
                r2 = r12
                r3 = r16
                r4 = r19
                r5 = r6
                r1.Y(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
                r15.n(r12)     // Catch: java.lang.Throwable -> L67
                r15.unlock()
                r15.D()
                return r10
            L9a:
                r15.I(r12, r6)     // Catch: java.lang.Throwable -> L67
                goto L69
            L9e:
                r3 = r18
                com.nytimes.android.external.cache.k$o r12 = r12.getNext()     // Catch: java.lang.Throwable -> L67
                goto L25
            La5:
                r15.unlock()
                r15.D()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.U(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        public void V(long j9) {
            if (tryLock()) {
                try {
                    j();
                    p(j9);
                    this.f38061l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void W() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f38051a.u();
        }

        public Object X(o oVar, Object obj, int i9, Object obj2, long j9, f fVar) {
            Object objL;
            return (!this.f38051a.A() || j9 - oVar.getWriteTime() <= this.f38051a.f37993n || oVar.getValueReference().b() || (objL = L(obj, i9, fVar, true)) == null) ? obj2 : objL;
        }

        public void Y(o oVar, Object obj, Object obj2, long j9) {
            y valueReference = oVar.getValueReference();
            int iWeigh = this.f38051a.f37990k.weigh(obj, obj2);
            com.nytimes.android.external.cache.o.d(iWeigh >= 0, "Weights must be non-negative");
            oVar.setValueReference(this.f38051a.f37988i.referenceValue(this, oVar, obj2, iWeigh));
            K(oVar, iWeigh, j9);
            valueReference.a(obj2);
        }

        public boolean Z(Object obj, int i9, l lVar, Object obj2) {
            lock();
            try {
                long jA = this.f38051a.f37996q.a();
                E(jA);
                int i10 = this.f38052c + 1;
                if (i10 > this.f38055f) {
                    o();
                    i10 = this.f38052c + 1;
                }
                AtomicReferenceArray atomicReferenceArray = this.f38056g;
                int length = i9 & (atomicReferenceArray.length() - 1);
                o oVar = (o) atomicReferenceArray.get(length);
                o next = oVar;
                while (true) {
                    if (next == null) {
                        this.f38054e++;
                        o oVarA = A(obj, i9, oVar);
                        Y(oVarA, obj, obj2, jA);
                        atomicReferenceArray.set(length, oVarA);
                        this.f38052c = i10;
                        n(oVarA);
                        break;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i9 && key != null && this.f38051a.f37985f.d(obj, key)) {
                        y valueReference = next.getValueReference();
                        Object obj3 = valueReference.get();
                        if (lVar != valueReference && (obj3 != null || valueReference == k.f37979w)) {
                            m(obj, i9, new G(obj2, 0), com.nytimes.android.external.cache.p.REPLACED);
                            unlock();
                            D();
                            return false;
                        }
                        this.f38054e++;
                        if (lVar.isActive()) {
                            m(obj, i9, lVar, obj3 == null ? com.nytimes.android.external.cache.p.COLLECTED : com.nytimes.android.external.cache.p.REPLACED);
                            i10--;
                        }
                        Y(next, obj, obj2, jA);
                        this.f38052c = i10;
                        n(next);
                    } else {
                        next = next.getNext();
                    }
                }
                unlock();
                D();
                return true;
            } catch (Throwable th) {
                unlock();
                D();
                throw th;
            }
        }

        public void a() {
            V(this.f38051a.f37996q.a());
            W();
        }

        public void a0() {
            if (tryLock()) {
                try {
                    j();
                } finally {
                    unlock();
                }
            }
        }

        public void b() {
            if (this.f38052c != 0) {
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = this.f38056g;
                    for (int i9 = 0; i9 < atomicReferenceArray.length(); i9++) {
                        for (o next = (o) atomicReferenceArray.get(i9); next != null; next = next.getNext()) {
                            if (next.getValueReference().isActive()) {
                                l(next, com.nytimes.android.external.cache.p.EXPLICIT);
                            }
                        }
                    }
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    d();
                    this.f38062m.clear();
                    this.f38063n.clear();
                    this.f38061l.set(0);
                    this.f38054e++;
                    this.f38052c = 0;
                    unlock();
                    D();
                } catch (Throwable th) {
                    unlock();
                    D();
                    throw th;
                }
            }
        }

        public void b0(long j9) {
            if (tryLock()) {
                try {
                    p(j9);
                } finally {
                    unlock();
                }
            }
        }

        public void c() {
            while (this.f38058i.poll() != null) {
            }
        }

        public void d() {
            if (this.f38051a.I()) {
                c();
            }
            if (this.f38051a.J()) {
                e();
            }
        }

        public void e() {
            while (this.f38059j.poll() != null) {
            }
        }

        public boolean f(Object obj, int i9) {
            try {
                if (this.f38052c == 0) {
                    return false;
                }
                o oVarU = u(obj, i9, this.f38051a.f37996q.a());
                if (oVarU == null) {
                    return false;
                }
                return oVarU.getValueReference().get() != null;
            } finally {
                C();
            }
        }

        public o g(o oVar, o oVar2) {
            if (oVar.getKey() == null) {
                return null;
            }
            y valueReference = oVar.getValueReference();
            Object obj = valueReference.get();
            if (obj == null && valueReference.isActive()) {
                return null;
            }
            o oVarCopyEntry = this.f38051a.f37997r.copyEntry(this, oVar, oVar2);
            oVarCopyEntry.setValueReference(valueReference.d(this.f38059j, obj, oVarCopyEntry));
            return oVarCopyEntry;
        }

        public void h() {
            int i9 = 0;
            do {
                Object objPoll = this.f38058i.poll();
                if (objPoll == null) {
                    return;
                }
                this.f38051a.v((o) objPoll);
                i9++;
            } while (i9 != 16);
        }

        public void i() {
            while (true) {
                o oVar = (o) this.f38060k.poll();
                if (oVar == null) {
                    return;
                }
                if (this.f38063n.contains(oVar)) {
                    this.f38063n.add(oVar);
                }
            }
        }

        public void j() {
            if (this.f38051a.I()) {
                h();
            }
            if (this.f38051a.J()) {
                k();
            }
        }

        public void k() {
            int i9 = 0;
            do {
                Object objPoll = this.f38059j.poll();
                if (objPoll == null) {
                    return;
                }
                this.f38051a.w((y) objPoll);
                i9++;
            } while (i9 != 16);
        }

        public void l(o oVar, com.nytimes.android.external.cache.p pVar) {
            m(oVar.getKey(), oVar.getHash(), oVar.getValueReference(), pVar);
        }

        public void m(Object obj, int i9, y yVar, com.nytimes.android.external.cache.p pVar) {
            this.f38053d -= (long) yVar.c();
            if (this.f38051a.f37994o != k.f37980x) {
                this.f38051a.f37994o.offer(com.nytimes.android.external.cache.r.a(obj, yVar.get(), pVar));
            }
        }

        public void n(o oVar) {
            if (this.f38051a.h()) {
                i();
                if (oVar.getValueReference().c() > this.f38057h && !P(oVar, oVar.getHash(), com.nytimes.android.external.cache.p.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f38053d > this.f38057h) {
                    o oVarW = w();
                    if (!P(oVarW, oVarW.getHash(), com.nytimes.android.external.cache.p.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        public void o() {
            AtomicReferenceArray atomicReferenceArray = this.f38056g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i9 = this.f38052c;
            AtomicReferenceArray atomicReferenceArrayB = B(length << 1);
            this.f38055f = (atomicReferenceArrayB.length() * 3) / 4;
            int length2 = atomicReferenceArrayB.length() - 1;
            for (int i10 = 0; i10 < length; i10++) {
                o next = (o) atomicReferenceArray.get(i10);
                if (next != null) {
                    o next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayB.set(hash, next);
                    } else {
                        o oVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                oVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayB.set(hash, oVar);
                        while (next != oVar) {
                            int hash3 = next.getHash() & length2;
                            o oVarG = g(next, (o) atomicReferenceArrayB.get(hash3));
                            if (oVarG != null) {
                                atomicReferenceArrayB.set(hash3, oVarG);
                            } else {
                                O(next);
                                i9--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f38056g = atomicReferenceArrayB;
            this.f38052c = i9;
        }

        public void p(long j9) {
            o oVar;
            o oVar2;
            i();
            do {
                oVar = (o) this.f38062m.peek();
                if (oVar == null || !this.f38051a.o(oVar, j9)) {
                    do {
                        oVar2 = (o) this.f38063n.peek();
                        if (oVar2 == null || !this.f38051a.o(oVar2, j9)) {
                            return;
                        }
                    } while (P(oVar2, oVar2.getHash(), com.nytimes.android.external.cache.p.EXPIRED));
                    throw new AssertionError();
                }
            } while (P(oVar, oVar.getHash(), com.nytimes.android.external.cache.p.EXPIRED));
            throw new AssertionError();
        }

        public Object q(Object obj, int i9) {
            try {
                if (this.f38052c != 0) {
                    long jA = this.f38051a.f37996q.a();
                    o oVarU = u(obj, i9, jA);
                    if (oVarU == null) {
                        return null;
                    }
                    Object obj2 = oVarU.getValueReference().get();
                    if (obj2 != null) {
                        J(oVarU, jA);
                        Object key = oVarU.getKey();
                        this.f38051a.getClass();
                        return X(oVarU, key, i9, obj2, jA, null);
                    }
                    a0();
                }
                return null;
            } finally {
                C();
            }
        }

        public Object r(Object obj, int i9, l lVar, j jVar) throws Throwable {
            Object objA;
            try {
                objA = com.nytimes.android.external.cache.v.a(jVar);
            } catch (Throwable th) {
                th = th;
                objA = null;
            }
            try {
                if (objA != null) {
                    Z(obj, i9, lVar, objA);
                    return objA;
                }
                throw new f.a("CacheLoader returned null for key " + obj + InstructionFileId.DOT);
            } catch (Throwable th2) {
                th = th2;
                if (objA == null) {
                    R(obj, i9, lVar);
                }
                throw th;
            }
        }

        public o s(Object obj, int i9) {
            for (o oVarT = t(i9); oVarT != null; oVarT = oVarT.getNext()) {
                if (oVarT.getHash() == i9) {
                    Object key = oVarT.getKey();
                    if (key == null) {
                        a0();
                    } else if (this.f38051a.f37985f.d(obj, key)) {
                        return oVarT;
                    }
                }
            }
            return null;
        }

        public o t(int i9) {
            return (o) this.f38056g.get(i9 & (r0.length() - 1));
        }

        public o u(Object obj, int i9, long j9) {
            o oVarS = s(obj, i9);
            if (oVarS == null) {
                return null;
            }
            if (!this.f38051a.o(oVarS, j9)) {
                return oVarS;
            }
            b0(j9);
            return null;
        }

        public Object v(o oVar, long j9) {
            if (oVar.getKey() == null) {
                a0();
                return null;
            }
            Object obj = oVar.getValueReference().get();
            if (obj == null) {
                a0();
                return null;
            }
            if (!this.f38051a.o(oVar, j9)) {
                return obj;
            }
            b0(j9);
            return null;
        }

        public o w() {
            for (o oVar : this.f38063n) {
                if (oVar.getValueReference().c() > 0) {
                    return oVar;
                }
            }
            throw new AssertionError();
        }

        public void x(AtomicReferenceArray atomicReferenceArray) {
            this.f38055f = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f38051a.f()) {
                int i9 = this.f38055f;
                if (i9 == this.f38057h) {
                    this.f38055f = i9 + 1;
                }
            }
            this.f38056g = atomicReferenceArray;
        }

        /* JADX WARN: Finally extract failed */
        public l y(Object obj, int i9, boolean z9) {
            lock();
            try {
                long jA = this.f38051a.f37996q.a();
                E(jA);
                AtomicReferenceArray atomicReferenceArray = this.f38056g;
                int length = (atomicReferenceArray.length() - 1) & i9;
                o oVar = (o) atomicReferenceArray.get(length);
                for (o next = oVar; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i9 && key != null && this.f38051a.f37985f.d(obj, key)) {
                        y valueReference = next.getValueReference();
                        if (!valueReference.b() && (!z9 || jA - next.getWriteTime() >= this.f38051a.f37993n)) {
                            this.f38054e++;
                            l lVar = new l(valueReference);
                            next.setValueReference(lVar);
                            unlock();
                            D();
                            return lVar;
                        }
                        unlock();
                        D();
                        return null;
                    }
                }
                this.f38054e++;
                l lVar2 = new l();
                o oVarA = A(obj, i9, oVar);
                oVarA.setValueReference(lVar2);
                atomicReferenceArray.set(length, oVarA);
                unlock();
                D();
                return lVar2;
            } catch (Throwable th) {
                unlock();
                D();
                throw th;
            }
        }

        public j z(Object obj, int i9, l lVar, f fVar) {
            j jVarG = lVar.g(obj, fVar);
            jVarG.addListener(new a(obj, i9, lVar, jVarG), g.INSTANCE);
            return jVarG;
        }
    }

    public static class q extends SoftReference implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f38069a;

        public q(ReferenceQueue referenceQueue, Object obj, o oVar) {
            super(obj, referenceQueue);
            this.f38069a = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public void a(Object obj) {
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean b() {
            return false;
        }

        public int c() {
            return 1;
        }

        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return new q(referenceQueue, obj, oVar);
        }

        @Override // com.nytimes.android.external.cache.k.y
        public o getEntry() {
            return this.f38069a;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class r {
        private static final /* synthetic */ r[] $VALUES;
        public static final r SOFT;
        public static final r STRONG;
        public static final r WEAK;

        public enum a extends r {
            public a(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.r
            public h defaultEquivalence() {
                return h.c();
            }

            @Override // com.nytimes.android.external.cache.k.r
            public <K, V> y referenceValue(p pVar, o oVar, V v9, int i9) {
                return i9 == 1 ? new v(v9) : new G(v9, i9);
            }
        }

        public enum b extends r {
            public b(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.r
            public h defaultEquivalence() {
                return h.f();
            }

            @Override // com.nytimes.android.external.cache.k.r
            public <K, V> y referenceValue(p pVar, o oVar, V v9, int i9) {
                return i9 == 1 ? new q(pVar.f38059j, v9, oVar) : new F(pVar.f38059j, v9, oVar, i9);
            }
        }

        public enum c extends r {
            public c(String str, int i9) {
                super(str, i9, null);
            }

            @Override // com.nytimes.android.external.cache.k.r
            public h defaultEquivalence() {
                return h.f();
            }

            @Override // com.nytimes.android.external.cache.k.r
            public <K, V> y referenceValue(p pVar, o oVar, V v9, int i9) {
                return i9 == 1 ? new D(pVar.f38059j, v9, oVar) : new H(pVar.f38059j, v9, oVar, i9);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("SOFT", 1);
            SOFT = bVar;
            c cVar = new c("WEAK", 2);
            WEAK = cVar;
            $VALUES = new r[]{aVar, bVar, cVar};
        }

        private r(String str, int i9) {
        }

        public /* synthetic */ r(String str, int i9, C1518a c1518a) {
            this(str, i9);
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        public abstract h defaultEquivalence();

        public abstract <K, V> y referenceValue(p pVar, o oVar, V v9, int i9);
    }

    public static final class s extends u {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f38070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f38071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public o f38072h;

        public s(Object obj, int i9, o oVar) {
            super(obj, i9, oVar);
            this.f38070f = Long.MAX_VALUE;
            this.f38071g = k.r();
            this.f38072h = k.r();
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public long getAccessTime() {
            return this.f38070f;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getNextInAccessQueue() {
            return this.f38071g;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getPreviousInAccessQueue() {
            return this.f38072h;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setAccessTime(long j9) {
            this.f38070f = j9;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setNextInAccessQueue(o oVar) {
            this.f38071g = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setPreviousInAccessQueue(o oVar) {
            this.f38072h = oVar;
        }
    }

    public static final class t extends u {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f38073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f38074g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public o f38075h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile long f38076i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public o f38077j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public o f38078k;

        public t(Object obj, int i9, o oVar) {
            super(obj, i9, oVar);
            this.f38073f = Long.MAX_VALUE;
            this.f38074g = k.r();
            this.f38075h = k.r();
            this.f38076i = Long.MAX_VALUE;
            this.f38077j = k.r();
            this.f38078k = k.r();
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public long getAccessTime() {
            return this.f38073f;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getNextInAccessQueue() {
            return this.f38074g;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getNextInWriteQueue() {
            return this.f38077j;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getPreviousInAccessQueue() {
            return this.f38075h;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getPreviousInWriteQueue() {
            return this.f38078k;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public long getWriteTime() {
            return this.f38076i;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setAccessTime(long j9) {
            this.f38073f = j9;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setNextInAccessQueue(o oVar) {
            this.f38074g = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setNextInWriteQueue(o oVar) {
            this.f38077j = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setPreviousInAccessQueue(o oVar) {
            this.f38075h = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setPreviousInWriteQueue(o oVar) {
            this.f38078k = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setWriteTime(long j9) {
            this.f38076i = j9;
        }
    }

    public static class u extends AbstractC1521d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f38079a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f38080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o f38081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile y f38082e = k.F();

        public u(Object obj, int i9, o oVar) {
            this.f38079a = obj;
            this.f38080c = i9;
            this.f38081d = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public int getHash() {
            return this.f38080c;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public Object getKey() {
            return this.f38079a;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getNext() {
            return this.f38081d;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public y getValueReference() {
            return this.f38082e;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setValueReference(y yVar) {
            this.f38082e = yVar;
        }
    }

    public static class v implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f38083a;

        public v(Object obj) {
            this.f38083a = obj;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public void a(Object obj) {
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean b() {
            return false;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public int c() {
            return 1;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public y d(ReferenceQueue referenceQueue, Object obj, o oVar) {
            return this;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public Object get() {
            return this.f38083a;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public o getEntry() {
            return null;
        }

        @Override // com.nytimes.android.external.cache.k.y
        public boolean isActive() {
            return true;
        }
    }

    public static final class w extends u {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f38084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f38085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public o f38086h;

        public w(Object obj, int i9, o oVar) {
            super(obj, i9, oVar);
            this.f38084f = Long.MAX_VALUE;
            this.f38085g = k.r();
            this.f38086h = k.r();
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getNextInWriteQueue() {
            return this.f38085g;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public o getPreviousInWriteQueue() {
            return this.f38086h;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public long getWriteTime() {
            return this.f38084f;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setNextInWriteQueue(o oVar) {
            this.f38085g = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setPreviousInWriteQueue(o oVar) {
            this.f38086h = oVar;
        }

        @Override // com.nytimes.android.external.cache.k.AbstractC1521d, com.nytimes.android.external.cache.k.o
        public void setWriteTime(long j9) {
            this.f38084f = j9;
        }
    }

    public final class x extends AbstractC1526i {
        public x() {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return d().getValue();
        }
    }

    public interface y {
        void a(Object obj);

        boolean b();

        int c();

        y d(ReferenceQueue referenceQueue, Object obj, o oVar);

        Object get();

        o getEntry();

        boolean isActive();
    }

    public final class z extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcurrentMap f38088a;

        public z(ConcurrentMap concurrentMap) {
            this.f38088a = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f38088a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f38088a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f38088a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return k.this.new x();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f38088a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return k.E(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return k.E(this).toArray(objArr);
        }
    }

    public k(e eVar, f fVar) {
        this.f37984e = Math.min(eVar.d(), 65536);
        r rVarI = eVar.i();
        this.f37987h = rVarI;
        this.f37988i = eVar.o();
        this.f37985f = eVar.h();
        this.f37986g = eVar.n();
        long j9 = eVar.j();
        this.f37989j = j9;
        this.f37990k = eVar.p();
        this.f37991l = eVar.e();
        this.f37992m = eVar.f();
        this.f37993n = eVar.k();
        com.nytimes.android.external.cache.q qVarL = eVar.l();
        this.f37995p = qVarL;
        this.f37994o = qVarL == e.b.INSTANCE ? g() : new ConcurrentLinkedQueue();
        this.f37996q = eVar.m(y());
        this.f37997r = EnumC1523f.getFactory(rVarI, G(), K());
        int iMin = Math.min(eVar.g(), 1073741824);
        if (h() && !f()) {
            iMin = Math.min(iMin, (int) j9);
        }
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 < this.f37984e && (!h() || i11 * 20 <= this.f37989j)) {
            i12++;
            i11 <<= 1;
        }
        this.f37982c = 32 - i12;
        this.f37981a = i11 - 1;
        this.f37983d = q(i11);
        int i13 = iMin / i11;
        while (i10 < (i13 * i11 < iMin ? i13 + 1 : i13)) {
            i10 <<= 1;
        }
        if (h()) {
            long j10 = this.f37989j;
            long j11 = i11;
            long j12 = (j10 / j11) + 1;
            long j13 = j10 % j11;
            while (true) {
                p[] pVarArr = this.f37983d;
                if (i9 >= pVarArr.length) {
                    return;
                }
                if (i9 == j13) {
                    j12--;
                }
                pVarArr[i9] = e(i10, j12);
                i9++;
            }
        } else {
            while (true) {
                p[] pVarArr2 = this.f37983d;
                if (i9 >= pVarArr2.length) {
                    return;
                }
                pVarArr2[i9] = e(i10, -1L);
                i9++;
            }
        }
    }

    public static int B(int i9) {
        int i10 = i9 + ((i9 << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = i13 + (i13 << 2) + (i13 << 14);
        return i14 ^ (i14 >>> 16);
    }

    public static char C(long j9) {
        if (j9 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return (char) 65535;
        }
        if (j9 < 0) {
            return (char) 0;
        }
        return (char) j9;
    }

    public static ArrayList E(Collection collection) {
        return new ArrayList(collection);
    }

    public static y F() {
        return f37979w;
    }

    public static void c(o oVar, o oVar2) {
        oVar.setNextInAccessQueue(oVar2);
        oVar2.setPreviousInAccessQueue(oVar);
    }

    public static void d(o oVar, o oVar2) {
        oVar.setNextInWriteQueue(oVar2);
        oVar2.setPreviousInWriteQueue(oVar);
    }

    public static Queue g() {
        return f37980x;
    }

    public static o r() {
        return n.INSTANCE;
    }

    public static void s(o oVar) {
        o oVarR = r();
        oVar.setNextInAccessQueue(oVarR);
        oVar.setPreviousInAccessQueue(oVarR);
    }

    public static void t(o oVar) {
        o oVarR = r();
        oVar.setNextInWriteQueue(oVarR);
        oVar.setPreviousInWriteQueue(oVarR);
    }

    public boolean A() {
        return this.f37993n > 0;
    }

    public p D(int i9) {
        return this.f37983d[(i9 >>> this.f37982c) & this.f37981a];
    }

    public boolean G() {
        return H() || x();
    }

    public boolean H() {
        return i() || h();
    }

    public boolean I() {
        return this.f37987h != r.STRONG;
    }

    public boolean J() {
        return this.f37988i != r.STRONG;
    }

    public boolean K() {
        return L() || z();
    }

    public boolean L() {
        return j();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (p pVar : this.f37983d) {
            pVar.b();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iN = n(obj);
        return D(iN).f(obj, iN);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long jA = this.f37996q.a();
        p[] pVarArr = this.f37983d;
        long j9 = -1;
        int i9 = 0;
        while (i9 < 3) {
            int length = pVarArr.length;
            long j10 = 0;
            int i10 = 0;
            while (i10 < length) {
                p pVar = pVarArr[i10];
                int i11 = pVar.f38052c;
                AtomicReferenceArray atomicReferenceArray = pVar.f38056g;
                for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                    o next = (o) atomicReferenceArray.get(i12);
                    while (next != null) {
                        p[] pVarArr2 = pVarArr;
                        Object objV = pVar.v(next, jA);
                        long j11 = jA;
                        if (objV != null && this.f37986g.d(obj, objV)) {
                            return true;
                        }
                        next = next.getNext();
                        pVarArr = pVarArr2;
                        jA = j11;
                    }
                }
                j10 += (long) pVar.f38054e;
                i10++;
                jA = jA;
            }
            long j12 = jA;
            p[] pVarArr3 = pVarArr;
            if (j10 == j9) {
                return false;
            }
            i9++;
            j9 = j10;
            pVarArr = pVarArr3;
            jA = j12;
        }
        return false;
    }

    public p e(int i9, long j9) {
        return new p(this, i9, j9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f38000u;
        if (set != null) {
            return set;
        }
        C1525h c1525h = new C1525h(this);
        this.f38000u = c1525h;
        return c1525h;
    }

    public boolean f() {
        return this.f37990k != e.c.INSTANCE;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iN = n(obj);
        return D(iN).q(obj, iN);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    public boolean h() {
        return this.f37989j >= 0;
    }

    public boolean i() {
        return this.f37991l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        p[] pVarArr = this.f37983d;
        long j9 = 0;
        for (int i9 = 0; i9 < pVarArr.length; i9++) {
            if (pVarArr[i9].f38052c != 0) {
                return false;
            }
            j9 += (long) pVarArr[i9].f38054e;
        }
        if (j9 == 0) {
            return true;
        }
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            if (pVarArr[i10].f38052c != 0) {
                return false;
            }
            j9 -= (long) pVarArr[i10].f38054e;
        }
        return j9 == 0;
    }

    public boolean j() {
        return this.f37992m > 0;
    }

    public Object k(Object obj) {
        int iN = n(com.nytimes.android.external.cache.o.a(obj));
        return D(iN).q(obj, iN);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f37998s;
        if (set != null) {
            return set;
        }
        C0297k c0297k = new C0297k(this);
        this.f37998s = c0297k;
        return c0297k;
    }

    public Object m(o oVar, long j9) {
        Object obj;
        if (oVar.getKey() == null || (obj = oVar.getValueReference().get()) == null || o(oVar, j9)) {
            return null;
        }
        return obj;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public int n(Object obj) {
        return B(this.f37985f.e(obj));
    }

    public boolean o(o oVar, long j9) {
        com.nytimes.android.external.cache.o.a(oVar);
        if (!i() || j9 - oVar.getAccessTime() < this.f37991l) {
            return j() && j9 - oVar.getWriteTime() >= this.f37992m;
        }
        return true;
    }

    public long p() {
        long jMax = 0;
        for (p pVar : this.f37983d) {
            jMax += (long) Math.max(0, pVar.f38052c);
        }
        return jMax;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        com.nytimes.android.external.cache.o.a(obj);
        com.nytimes.android.external.cache.o.a(obj2);
        int iN = n(obj);
        return D(iN).F(obj, iN, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        com.nytimes.android.external.cache.o.a(obj);
        com.nytimes.android.external.cache.o.a(obj2);
        int iN = n(obj);
        return D(iN).F(obj, iN, obj2, true);
    }

    public final p[] q(int i9) {
        return new p[i9];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iN = n(obj);
        return D(iN).M(obj, iN);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iN = n(obj);
        return D(iN).N(obj, iN, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        com.nytimes.android.external.cache.o.a(obj);
        com.nytimes.android.external.cache.o.a(obj2);
        int iN = n(obj);
        return D(iN).T(obj, iN, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        com.nytimes.android.external.cache.o.a(obj);
        com.nytimes.android.external.cache.o.a(obj3);
        if (obj2 == null) {
            return false;
        }
        int iN = n(obj);
        return D(iN).U(obj, iN, obj2, obj3);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return C(p());
    }

    public void u() {
        while (true) {
            com.nytimes.android.external.cache.r rVar = (com.nytimes.android.external.cache.r) this.f37994o.poll();
            if (rVar == null) {
                return;
            }
            try {
                this.f37995p.onRemoval(rVar);
            } catch (Throwable th) {
                f37978v.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    public void v(o oVar) {
        int hash = oVar.getHash();
        D(hash).G(oVar, hash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f37999t;
        if (collection != null) {
            return collection;
        }
        z zVar = new z(this);
        this.f37999t = zVar;
        return zVar;
    }

    public void w(y yVar) {
        o entry = yVar.getEntry();
        int hash = entry.getHash();
        D(hash).H(entry.getKey(), hash, yVar);
    }

    public boolean x() {
        return i();
    }

    public boolean y() {
        return z() || x();
    }

    public boolean z() {
        return j() || A();
    }
}
