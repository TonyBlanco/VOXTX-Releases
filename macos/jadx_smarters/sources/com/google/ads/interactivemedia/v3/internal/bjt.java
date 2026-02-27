package com.google.ads.interactivemedia.v3.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
public final class bjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final bkj f21570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final bkj f21571b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21572e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f21573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f21574d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ThreadLocal f21575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentMap f21576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bkw f21577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bma f21578i;

    static {
        bjl bjlVar = bjl.IDENTITY;
        f21570a = bki.DOUBLE;
        f21571b = bki.LAZILY_PARSED_NUMBER;
    }

    public bjt() {
        bky bkyVar = bky.f21629a;
        throw null;
    }

    public bjt(bky bkyVar, bjm bjmVar, Map map, boolean z9, boolean z10, int i9, List list, bkj bkjVar, bkj bkjVar2, List list2) {
        this.f21575f = new ThreadLocal();
        this.f21576g = new ConcurrentHashMap();
        bkw bkwVar = new bkw(map, true, list2);
        this.f21577h = bkwVar;
        this.f21574d = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bnw.f21777U);
        arrayList.add(bmi.a(bkjVar));
        arrayList.add(bkyVar);
        arrayList.addAll(list);
        arrayList.add(bnw.f21757A);
        arrayList.add(bnw.f21791m);
        arrayList.add(bnw.f21785g);
        arrayList.add(bnw.f21787i);
        arrayList.add(bnw.f21789k);
        bkl bjpVar = i9 == bkg.f21598a ? bnw.f21798t : new bjp();
        arrayList.add(bnw.c(Long.TYPE, Long.class, bjpVar));
        arrayList.add(bnw.c(Double.TYPE, Double.class, new bjn()));
        arrayList.add(bnw.c(Float.TYPE, Float.class, new bjo()));
        arrayList.add(bmg.a(bkjVar2));
        arrayList.add(bnw.f21793o);
        arrayList.add(bnw.f21795q);
        arrayList.add(bnw.b(AtomicLong.class, new bjq(bjpVar).nullSafe()));
        arrayList.add(bnw.b(AtomicLongArray.class, new bjr(bjpVar).nullSafe()));
        arrayList.add(bnw.f21797s);
        arrayList.add(bnw.f21800v);
        arrayList.add(bnw.f21759C);
        arrayList.add(bnw.f21761E);
        arrayList.add(bnw.b(BigDecimal.class, bnw.f21802x));
        arrayList.add(bnw.b(BigInteger.class, bnw.f21803y));
        arrayList.add(bnw.b(blb.class, bnw.f21804z));
        arrayList.add(bnw.f21763G);
        arrayList.add(bnw.f21765I);
        arrayList.add(bnw.f21769M);
        arrayList.add(bnw.f21771O);
        arrayList.add(bnw.f21775S);
        arrayList.add(bnw.f21767K);
        arrayList.add(bnw.f21782d);
        arrayList.add(blx.f21681a);
        arrayList.add(bnw.f21773Q);
        if (boe.f21816a) {
            arrayList.add(boe.f21820e);
            arrayList.add(boe.f21819d);
            arrayList.add(boe.f21821f);
        }
        arrayList.add(blu.f21675a);
        arrayList.add(bnw.f21780b);
        arrayList.add(new bma(bkwVar, 1));
        arrayList.add(new bma(bkwVar, 2));
        bma bmaVar = new bma(bkwVar, 0);
        this.f21578i = bmaVar;
        arrayList.add(bmaVar);
        arrayList.add(bnw.f21778V);
        arrayList.add(new bml(bkwVar, bjmVar, bkyVar, bmaVar, list2));
        this.f21573c = Collections.unmodifiableList(arrayList);
    }

    public static void h(double d9) {
        if (Double.isNaN(d9) || Double.isInfinite(d9)) {
            throw new IllegalArgumentException(d9 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final bkl a(bof bofVar) {
        boolean z9;
        bkl bklVar = (bkl) this.f21576g.get(bofVar);
        if (bklVar != null) {
            return bklVar;
        }
        Map map = (Map) this.f21575f.get();
        if (map == null) {
            map = new HashMap();
            this.f21575f.set(map);
            z9 = true;
        } else {
            z9 = false;
        }
        bjs bjsVar = (bjs) map.get(bofVar);
        if (bjsVar != null) {
            return bjsVar;
        }
        try {
            bjs bjsVar2 = new bjs();
            map.put(bofVar, bjsVar2);
            Iterator it = this.f21573c.iterator();
            while (it.hasNext()) {
                bkl bklVarA = ((bkm) it.next()).a(this, bofVar);
                if (bklVarA != null) {
                    bkl bklVar2 = (bkl) this.f21576g.putIfAbsent(bofVar, bklVarA);
                    if (bklVar2 != null) {
                        bklVarA = bklVar2;
                    }
                    bjsVar2.a(bklVarA);
                    return bklVarA;
                }
            }
            throw new IllegalArgumentException("GSON (${project.version}) cannot handle " + bofVar.toString());
        } finally {
            map.remove(bofVar);
            if (z9) {
                this.f21575f.remove();
            }
        }
    }

    public final bkl b(Class cls) {
        return a(bof.a(cls));
    }

    public final bkl c(bkm bkmVar, bof bofVar) {
        if (!this.f21573c.contains(bkmVar)) {
            bkmVar = this.f21578i;
        }
        boolean z9 = false;
        for (bkm bkmVar2 : this.f21573c) {
            if (z9) {
                bkl bklVarA = bkmVar2.a(this, bofVar);
                if (bklVarA != null) {
                    return bklVarA;
                }
            } else if (bkmVar2 == bkmVar) {
                z9 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(bofVar)));
    }

    public final boj d(Writer writer) throws IOException {
        boj bojVar = new boj(writer);
        bojVar.n(this.f21574d);
        bojVar.o(false);
        bojVar.p(false);
        return bojVar;
    }

    public final Object e(boh bohVar, bof bofVar) throws bjz, bkf {
        boolean zV = bohVar.v();
        boolean z9 = true;
        bohVar.u(true);
        try {
            try {
                try {
                    try {
                        bohVar.r();
                        try {
                            return a(bofVar).read(bohVar);
                        } catch (EOFException e9) {
                            e = e9;
                            z9 = false;
                            if (!z9) {
                                throw new bkf(e);
                            }
                            bohVar.u(zV);
                            return null;
                        }
                    } finally {
                        bohVar.u(zV);
                    }
                } catch (EOFException e10) {
                    e = e10;
                }
            } catch (IllegalStateException e11) {
                throw new bkf(e11);
            }
        } catch (IOException e12) {
            throw new bkf(e12);
        } catch (AssertionError e13) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON ${project.version}): " + e13.getMessage());
            assertionError.initCause(e13);
            throw assertionError;
        }
    }

    public final Object f(String str, Class cls) throws bkf {
        Object obj;
        bof bofVarA = bof.a(cls);
        if (str == null) {
            obj = null;
        } else {
            boh bohVar = new boh(new StringReader(str));
            bohVar.u(false);
            Object objE = e(bohVar, bofVarA);
            if (objE != null) {
                try {
                    if (bohVar.r() != 10) {
                        throw new bkf("JSON document was not fully consumed.");
                    }
                } catch (bok e9) {
                    throw new bkf(e9);
                } catch (IOException e10) {
                    throw new bjz(e10);
                }
            }
            obj = objE;
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    public final String g(Object obj) {
        if (obj == null) {
            bjy bjyVar = bka.f21595a;
            StringWriter stringWriter = new StringWriter();
            try {
                i(bjyVar, d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e9) {
                throw new bjz(e9);
            }
        }
        Type type = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            j(obj, type, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new bjz(e10);
        }
    }

    public final void i(bjy bjyVar, boj bojVar) throws bjz {
        boolean zS = bojVar.s();
        bojVar.o(true);
        boolean zR = bojVar.r();
        bojVar.n(this.f21574d);
        boolean zQ = bojVar.q();
        bojVar.p(false);
        try {
            try {
                blo.b(bjyVar, bojVar);
            } catch (IOException e9) {
                throw new bjz(e9);
            } catch (AssertionError e10) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON ${project.version}): " + e10.getMessage());
                assertionError.initCause(e10);
                throw assertionError;
            }
        } finally {
            bojVar.o(zS);
            bojVar.n(zR);
            bojVar.p(zQ);
        }
    }

    public final void j(Object obj, Type type, boj bojVar) throws bjz {
        bkl bklVarA = a(bof.b(type));
        boolean zS = bojVar.s();
        bojVar.o(true);
        boolean zR = bojVar.r();
        bojVar.n(this.f21574d);
        boolean zQ = bojVar.q();
        bojVar.p(false);
        try {
            try {
                bklVarA.write(bojVar, obj);
            } catch (IOException e9) {
                throw new bjz(e9);
            } catch (AssertionError e10) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON ${project.version}): " + e10.getMessage());
                assertionError.initCause(e10);
                throw assertionError;
            }
        } finally {
            bojVar.o(zS);
            bojVar.n(zR);
            bojVar.p(zQ);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f21573c + ",instanceCreators:" + this.f21577h + "}";
    }
}
