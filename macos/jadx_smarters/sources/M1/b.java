package M1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f4176a = new ArrayList();

    public boolean a() {
        return this.f4176a.isEmpty();
    }

    public Object b() {
        if (a()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return this.f4176a.remove(r0.size() - 1);
    }

    public void c(Object obj) {
        this.f4176a.add(obj);
    }
}
