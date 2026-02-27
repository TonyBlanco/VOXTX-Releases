package C8;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends a {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    m getReturnType();

    List getTypeParameters();

    n getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
