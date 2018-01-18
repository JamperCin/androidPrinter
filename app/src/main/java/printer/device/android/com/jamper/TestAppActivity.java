package printer.device.android.com.jamper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import printer.com.jamper.androidprinter.Bridge.AndroidPrinter;
import printer.com.jamper.androidprinter.Constants.PrinterType;


public class TestAppActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_app);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        new AndroidPrinter(this).Builder(PrinterType.MOBI_WIRE_POS).printText("Hello world");
    }
}
