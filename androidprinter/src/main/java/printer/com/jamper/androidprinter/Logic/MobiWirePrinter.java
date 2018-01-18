package printer.com.jamper.androidprinter.Logic;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;

import com.nbbse.printapi.Printer;

/**
 * Created by jamper on 10/9/2017.
 * <p>
 * This MobiWirePrinter class is specifically designed to print message sent here to the MobiWire POS printer.
 */

public class MobiWirePrinter {
    Context mContext;
    private Printer printer;


    /**
     * Default Constructor
     **/
    public MobiWirePrinter(Context mContext) {
        this.mContext = mContext;
        printer = Printer.getInstance();
    }



    /**
     * Print the message sent to the printer
     *
     * @param message The message to be printed
     **/
    public MobiWirePrinter printMessage(String message) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printText(message);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }


    /**
     * Print the message to the printer and specify the size of letters
     * Size of letters, default is 1 when omitted
     *
     * @param message    The message to be printed
     * @param letterSize The Size of letters, default is 1 when omitted
     **/
    public MobiWirePrinter printMessage(String message, int letterSize) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printText(message, letterSize);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }


    /**
     * Print the message to the printer and specify the size of letters
     * Size of letters, default is 1 when omitted
     *
     * @param message    The message to be printed
     * @param letterSize The Size of letters, default is 1 when omitted
     **/
    public MobiWirePrinter printMessage(String message, int letterSize, boolean r2lFlag) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printText(message, letterSize,r2lFlag);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }


    /**
     * Print the Bitmap to the Printer
     *
     * @param path the path of the bitmap or image from the SD-Card
     **/
    public MobiWirePrinter printBitmap(String path) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printBitmap(path);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }

    /**
     * Print the Bitmap to the Printer
     *
     * @param path the path of the bitmap or image from the SD-Card
     **/
    public MobiWirePrinter printBitmap(String path, int speed) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printBitmap(path,speed);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }

    /**
     * Print the Bitmap to the Printer
     *
     * @param bitmap the path of the bitmap or image from the SD-Card
     **/
    public MobiWirePrinter printBitmap(Bitmap bitmap, int speed) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printBitmap(bitmap,speed);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }

    /**
     * Print the Bitmap to the Printer
     *
     * @param bitmap the path of the bitmap or image from the SD-Card
     **/
    public MobiWirePrinter printBitmap(Bitmap bitmap) {
        try {
            if (isVoltageGood() && isPaperStatusOK() && isPrinterStatusOK())
                printer.printBitmap(bitmap);
            printer.printEndLine();
        } catch (Exception e) {
            Toast.makeText(mContext, "Error with Printing. >>> " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return this;
    }


    /**
     * Check if the Voltage of the Printer is LOW or GOOD to do the printing
     **/
    private boolean isVoltageGood() {
        return printer.voltageCheck();
    }

    /**
     * Check the status of the paper. Check whether if there is paper in the printer or format of printer is Error
     **/
    private boolean isPaperStatusOK() {
        switch (printer.getPaperStatus()) {
            case Printer.PRINTER_EXIST_PAPER:
                //  Toast.makeText(mContext, "Paper exist", Toast.LENGTH_SHORT).show();
                return true;
            case Printer.PRINTER_NO_PAPER:
                Toast.makeText(mContext, "Check the paper in Printer. Please insert new paper", Toast.LENGTH_SHORT).show();
                return false;
            case Printer.PRINTER_PAPER_ERROR:
                Toast.makeText(mContext, "Check the paper in Printer. Invalid Paper format", Toast.LENGTH_SHORT).show();
                return false;
            default:
                return true;
        }
    }

    /**
     * check the Printer status whether the printer is Ok to print
     **/
    private boolean isPrinterStatusOK() {
        switch (printer.getPrinterStatus()) {
            case Printer.PRINTER_STATUS_OK:
                //Toast.makeText(mContext, "Printer is ok to print", Toast.LENGTH_SHORT).show();
                return true;
            case Printer.PRINTER_STATUS_NO_PAPER:
                Toast.makeText(mContext, "Printer has no paper", Toast.LENGTH_SHORT).show();
                return false;
            case Printer.PRINTER_STATUS_OVER_HEAT:
                Toast.makeText(mContext, "Printer is over heated", Toast.LENGTH_SHORT).show();
                return false;
            case Printer.PRINTER_STATUS_GET_FAILED:
                Toast.makeText(mContext, "Printer is not in good state to print. Please restart device", Toast.LENGTH_SHORT).show();
                return false;
            default:
                return true;
        }
    }


}
