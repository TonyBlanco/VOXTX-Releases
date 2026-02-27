package d0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f39454a;

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f39455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f39456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39457c = true;

        public a(TextView textView) {
            this.f39455a = textView;
            this.f39456b = new d(textView);
        }

        @Override // d0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f39457c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // d0.f.b
        public boolean b() {
            return this.f39457c;
        }

        @Override // d0.f.b
        public void c(boolean z9) {
            if (z9) {
                l();
            }
        }

        @Override // d0.f.b
        public void d(boolean z9) {
            this.f39457c = z9;
            l();
            k();
        }

        @Override // d0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f39457c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f39456b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f39456b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i9 = 0; i9 < inputFilterArr.length; i9++) {
                InputFilter inputFilter = inputFilterArr[i9];
                if (inputFilter instanceof d) {
                    sparseArray.put(i9, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (sparseArrayG.indexOfKey(i10) < 0) {
                    inputFilterArr2[i9] = inputFilterArr[i10];
                    i9++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z9) {
            this.f39457c = z9;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f39455a.setFilters(a(this.f39455a.getFilters()));
        }

        public void l() {
            this.f39455a.setTransformationMethod(e(this.f39455a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }
    }

    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        public abstract void c(boolean z9);

        public abstract void d(boolean z9);

        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f39458a;

        public c(TextView textView) {
            this.f39458a = new a(textView);
        }

        @Override // d0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f39458a.a(inputFilterArr);
        }

        @Override // d0.f.b
        public boolean b() {
            return this.f39458a.b();
        }

        @Override // d0.f.b
        public void c(boolean z9) {
            if (f()) {
                return;
            }
            this.f39458a.c(z9);
        }

        @Override // d0.f.b
        public void d(boolean z9) {
            if (f()) {
                this.f39458a.i(z9);
            } else {
                this.f39458a.d(z9);
            }
        }

        @Override // d0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f39458a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.e.h();
        }
    }

    public f(TextView textView, boolean z9) {
        O.h.g(textView, "textView cannot be null");
        this.f39454a = !z9 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f39454a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f39454a.b();
    }

    public void c(boolean z9) {
        this.f39454a.c(z9);
    }

    public void d(boolean z9) {
        this.f39454a.d(z9);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f39454a.e(transformationMethod);
    }
}
