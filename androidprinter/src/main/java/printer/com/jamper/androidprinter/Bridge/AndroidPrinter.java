package printer.com.jamper.androidprinter.Bridge;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;

import printer.com.jamper.androidprinter.Constants.PrinterType;
import printer.com.jamper.androidprinter.Logic.MobiWirePrinter;

/**
 * Created by jamper on 1/18/2018.
 */

public class AndroidPrinter {
    private Context mContext;
    private int printerType;
    MobiWirePrinter mobi;


    public AndroidPrinter(Context mContext) {
        this.mContext = mContext;
        mobi = new MobiWirePrinter(mContext);
        printerType = 0;
    }


    public AndroidPrinter printText(String text) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printMessage(text);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter printText(String text, int letterSize) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printMessage(text, letterSize);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter printText(String text, int letterSize, boolean r2lFlag) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printMessage(text, letterSize, r2lFlag);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter printBitmap(Bitmap bitmap) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printBitmap(bitmap);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter printBitmap(Bitmap bitmap, int speed) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printBitmap(bitmap, speed);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter printBitmap(String path, int speed) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printBitmap(path, speed);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter printBitmap(String path) {
        switch (printerType) {
            case 0:
                break;
            case 1:
                mobi.printBitmap(path);
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();

        }

        return this;
    }

    public AndroidPrinter Builder(int printerType) {
        switch (printerType) {
            case 0:
                this.printerType = PrinterType.BLUE_TOOTH;
                break;
            case 1:
                this.printerType = PrinterType.MOBI_WIRE_POS;
                break;
            default:
                Toast.makeText(mContext, "Printer not recognised", Toast.LENGTH_SHORT).show();
        }
        return this;
    }


}
