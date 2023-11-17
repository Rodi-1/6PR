package n;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public class e extends Writer {

    /* renamed from: b  reason: collision with root package name */
    private final String f1638b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f1639c = new StringBuilder(128);

    public e(String str) {
        this.f1638b = str;
    }

    private void a() {
        if (this.f1639c.length() > 0) {
            Log.d(this.f1638b, this.f1639c.toString());
            StringBuilder sb = this.f1639c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f1639c.append(c2);
            }
        }
    }
}