package p010i;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import p014m.C0427b;

/* renamed from: i.d */
/* loaded from: classes.dex */
class C0404d extends C0408h {
    /* renamed from: h */
    private File m672h(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // p010i.C0408h, p010i.C0402c.InterfaceC0403a
    /* renamed from: c */
    public Typeface mo651c(Context context, CancellationSignal cancellationSignal, C0427b.C0433f[] c0433fArr, int i) {
        if (c0433fArr.length < 1) {
            return null;
        }
        C0427b.C0433f m647g = m647g(c0433fArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m647g.m581c(), "r", cancellationSignal);
            File m672h = m672h(openFileDescriptor);
            if (m672h != null && m672h.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m672h);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface m650d = super.m650d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return m650d;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}