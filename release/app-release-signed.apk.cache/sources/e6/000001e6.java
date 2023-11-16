package p015n;

import android.util.Log;
import java.io.Writer;

/* renamed from: n.e */
/* loaded from: classes.dex */
public class C0451e extends Writer {

    /* renamed from: b */
    private final String f2156b;

    /* renamed from: c */
    private StringBuilder f2157c = new StringBuilder(128);

    public C0451e(String str) {
        this.f2156b = str;
    }

    /* renamed from: a */
    private void m539a() {
        if (this.f2157c.length() > 0) {
            Log.d(this.f2156b, this.f2157c.toString());
            StringBuilder sb = this.f2157c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m539a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m539a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m539a();
            } else {
                this.f2157c.append(c);
            }
        }
    }
}