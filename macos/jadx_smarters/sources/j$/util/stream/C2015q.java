package j$.util.stream;

import j$.util.C1923g;
import j$.util.C1924h;
import j$.util.C1926j;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2015q implements BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, BinaryOperator, IntFunction, DoubleBinaryOperator, DoubleFunction, ToDoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42733a;

    public /* synthetic */ C2015q(int i9) {
        this.f42733a = i9;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d9) {
        switch (this.f42733a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC1990l.a(dArr, d9);
                dArr[3] = dArr[3] + d9;
                break;
            case 2:
            default:
                ((C1923g) obj).accept(d9);
                break;
            case 3:
                double[] dArr2 = (double[]) obj;
                AbstractC1990l.a(dArr2, d9);
                dArr2[2] = dArr2[2] + d9;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f42733a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC1990l.a(dArr, dArr2[0]);
                AbstractC1990l.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 2:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC1990l.a(dArr3, dArr4[0]);
                AbstractC1990l.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C1923g) obj).b((C1923g) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f42733a) {
            case 0:
                break;
            case 2:
                break;
            case 20:
                break;
            case 21:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f42733a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d9) {
        return Double.valueOf(d9);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i9) {
        switch (this.f42733a) {
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return new Object[i9];
            default:
                return new Double[i9];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j9) {
        switch (this.f42733a) {
            case 8:
                return AbstractC2055y0.J(j9);
            case 9:
            default:
                return AbstractC2055y0.U(j9);
            case 10:
                return AbstractC2055y0.S(j9);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f42733a) {
            case 9:
                return new S0((E0) obj, (E0) obj2);
            case 10:
            case 12:
            default:
                return new W0((K0) obj, (K0) obj2);
            case 11:
                return new T0((G0) obj, (G0) obj2);
            case 13:
                return new U0((I0) obj, (I0) obj2);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d9, double d10) {
        switch (this.f42733a) {
            case 22:
                return Math.min(d9, d10);
            default:
                return Math.max(d9, d10);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f42733a) {
            case 4:
                return new H();
            case 5:
                return new I();
            case 6:
                return new J();
            case 7:
                return new K();
            case 16:
                return new C1923g();
            case LangUtils.HASH_SEED /* 17 */:
                return new C1924h();
            case 18:
                return new C1926j();
            case 19:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }
}
