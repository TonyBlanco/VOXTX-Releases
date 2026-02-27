package y0;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;
import s.C2695a;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2981b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f52095f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f52096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f52097b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f52099d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f52098c = new C2695a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f52100e = a();

    /* JADX INFO: renamed from: y0.b$a */
    public static class a implements c {
        @Override // y0.C2981b.c
        public boolean a(int i9, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            float f9 = fArr[0];
            return f9 >= 10.0f && f9 <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* JADX INFO: renamed from: y0.b$b, reason: collision with other inner class name */
    public static final class C0483b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f52101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f52102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f52103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f52104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f52106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f52107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Rect f52108h;

        /* JADX INFO: renamed from: y0.b$b$a */
        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f52109a;

            public a(d dVar) {
                this.f52109a = dVar;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2981b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C0483b.this.b();
                } catch (Exception e9) {
                    Log.e("Palette", "Exception thrown during async generate", e9);
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(C2981b c2981b) {
                this.f52109a.a(c2981b);
            }
        }

        public C0483b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f52103c = arrayList;
            this.f52104d = 16;
            this.f52105e = 12544;
            this.f52106f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f52107g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C2981b.f52095f);
            this.f52102b = bitmap;
            this.f52101a = null;
            arrayList.add(y0.c.f52120e);
            arrayList.add(y0.c.f52121f);
            arrayList.add(y0.c.f52122g);
            arrayList.add(y0.c.f52123h);
            arrayList.add(y0.c.f52124i);
            arrayList.add(y0.c.f52125j);
        }

        public AsyncTask a(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f52102b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public C2981b b() {
            List listD;
            c[] cVarArr;
            Bitmap bitmap = this.f52102b;
            if (bitmap != null) {
                Bitmap bitmapE = e(bitmap);
                Rect rect = this.f52108h;
                if (bitmapE != this.f52102b && rect != null) {
                    double width = ((double) bitmapE.getWidth()) / ((double) this.f52102b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapE.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapE.getHeight());
                }
                int[] iArrC = c(bitmapE);
                int i9 = this.f52104d;
                if (this.f52107g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List list = this.f52107g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                C2980a c2980a = new C2980a(iArrC, i9, cVarArr);
                if (bitmapE != this.f52102b) {
                    bitmapE.recycle();
                }
                listD = c2980a.d();
            } else {
                listD = this.f52101a;
                if (listD == null) {
                    throw new AssertionError();
                }
            }
            C2981b c2981b = new C2981b(listD, this.f52103c);
            c2981b.c();
            return c2981b;
        }

        public final int[] c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f52108h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f52108h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i9 = 0; i9 < iHeight; i9++) {
                Rect rect2 = this.f52108h;
                System.arraycopy(iArr, ((rect2.top + i9) * width) + rect2.left, iArr2, i9 * iWidth, iWidth);
            }
            return iArr2;
        }

        public C0483b d(int i9) {
            this.f52104d = i9;
            return this;
        }

        public final Bitmap e(Bitmap bitmap) {
            int iMax;
            int i9;
            double dSqrt = -1.0d;
            if (this.f52105e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i10 = this.f52105e;
                if (width > i10) {
                    dSqrt = Math.sqrt(((double) i10) / ((double) width));
                }
            } else if (this.f52106f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i9 = this.f52106f)) {
                dSqrt = ((double) i9) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }
    }

    /* JADX INFO: renamed from: y0.b$c */
    public interface c {
        boolean a(int i9, float[] fArr);
    }

    /* JADX INFO: renamed from: y0.b$d */
    public interface d {
        void a(C2981b c2981b);
    }

    /* JADX INFO: renamed from: y0.b$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f52114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f52115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f52116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f52119i;

        public e(int i9, int i10) {
            this.f52111a = Color.red(i9);
            this.f52112b = Color.green(i9);
            this.f52113c = Color.blue(i9);
            this.f52114d = i9;
            this.f52115e = i10;
        }

        public final void a() {
            int iO;
            if (this.f52116f) {
                return;
            }
            int iF = G.a.f(-1, this.f52114d, 4.5f);
            int iF2 = G.a.f(-1, this.f52114d, 3.0f);
            if (iF == -1 || iF2 == -1) {
                int iF3 = G.a.f(DefaultRenderer.BACKGROUND_COLOR, this.f52114d, 4.5f);
                int iF4 = G.a.f(DefaultRenderer.BACKGROUND_COLOR, this.f52114d, 3.0f);
                if (iF3 == -1 || iF4 == -1) {
                    this.f52118h = iF != -1 ? G.a.o(-1, iF) : G.a.o(DefaultRenderer.BACKGROUND_COLOR, iF3);
                    this.f52117g = iF2 != -1 ? G.a.o(-1, iF2) : G.a.o(DefaultRenderer.BACKGROUND_COLOR, iF4);
                    this.f52116f = true;
                    return;
                }
                this.f52118h = G.a.o(DefaultRenderer.BACKGROUND_COLOR, iF3);
                iO = G.a.o(DefaultRenderer.BACKGROUND_COLOR, iF4);
            } else {
                this.f52118h = G.a.o(-1, iF);
                iO = G.a.o(-1, iF2);
            }
            this.f52117g = iO;
            this.f52116f = true;
        }

        public int b() {
            a();
            return this.f52118h;
        }

        public float[] c() {
            if (this.f52119i == null) {
                this.f52119i = new float[3];
            }
            G.a.a(this.f52111a, this.f52112b, this.f52113c, this.f52119i);
            return this.f52119i;
        }

        public int d() {
            return this.f52115e;
        }

        public int e() {
            return this.f52114d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f52115e == eVar.f52115e && this.f52114d == eVar.f52114d;
        }

        public int f() {
            a();
            return this.f52117g;
        }

        public int hashCode() {
            return (this.f52114d * 31) + this.f52115e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f52115e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    public C2981b(List list, List list2) {
        this.f52096a = list;
        this.f52097b = list2;
    }

    public static C0483b b(Bitmap bitmap) {
        return new C0483b(bitmap);
    }

    public final e a() {
        int size = this.f52096a.size();
        int iD = Integer.MIN_VALUE;
        e eVar = null;
        for (int i9 = 0; i9 < size; i9++) {
            e eVar2 = (e) this.f52096a.get(i9);
            if (eVar2.d() > iD) {
                iD = eVar2.d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public void c() {
        int size = this.f52097b.size();
        for (int i9 = 0; i9 < size; i9++) {
            y0.c cVar = (y0.c) this.f52097b.get(i9);
            cVar.k();
            this.f52098c.put(cVar, e(cVar));
        }
        this.f52099d.clear();
    }

    public final float d(e eVar, y0.c cVar) {
        float[] fArrC = eVar.c();
        e eVar2 = this.f52100e;
        return (cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(fArrC[1] - cVar.i())) : 0.0f) + (cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(fArrC[2] - cVar.h())) : 0.0f) + (cVar.f() > 0.0f ? cVar.f() * (eVar.d() / (eVar2 != null ? eVar2.d() : 1)) : 0.0f);
    }

    public final e e(y0.c cVar) {
        e eVarG = g(cVar);
        if (eVarG != null && cVar.j()) {
            this.f52099d.append(eVarG.e(), true);
        }
        return eVarG;
    }

    public int f(int i9) {
        e eVar = this.f52100e;
        return eVar != null ? eVar.e() : i9;
    }

    public final e g(y0.c cVar) {
        int size = this.f52096a.size();
        float f9 = 0.0f;
        e eVar = null;
        for (int i9 = 0; i9 < size; i9++) {
            e eVar2 = (e) this.f52096a.get(i9);
            if (i(eVar2, cVar)) {
                float fD = d(eVar2, cVar);
                if (eVar == null || fD > f9) {
                    eVar = eVar2;
                    f9 = fD;
                }
            }
        }
        return eVar;
    }

    public List h() {
        return Collections.unmodifiableList(this.f52096a);
    }

    public final boolean i(e eVar, y0.c cVar) {
        float[] fArrC = eVar.c();
        return fArrC[1] >= cVar.e() && fArrC[1] <= cVar.c() && fArrC[2] >= cVar.d() && fArrC[2] <= cVar.b() && !this.f52099d.get(eVar.e());
    }
}
