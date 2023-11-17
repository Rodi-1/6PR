package i;

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
import m.b;

/* loaded from: classes.dex */
class d extends h {
    private File h(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // i.h, i.c.a
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        if (fVarArr.length < 1) {
            return null;
        }
        b.f g2 = g(fVarArr, i2);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g2.c(), "r", cancellationSignal);
            File h2 = h(openFileDescriptor);
            if (h2 != null && h2.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(h2);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                Typeface d2 = super.d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d2;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}