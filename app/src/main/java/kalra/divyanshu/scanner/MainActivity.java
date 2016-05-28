package kalra.divyanshu.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.android.gms.vision.barcode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarcodeDetector barcodeDetector = new BarcodeDetector.Builder(context).build();
    }

    protected void startscanner(View view){
        Intent intent = new Intent(this, barcode.class);
        startActivity(intent);
    }
}
