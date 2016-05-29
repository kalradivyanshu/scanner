package kalra.divyanshu.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (data.hasExtra("qrcode")) {
                Toast.makeText(this, data.getExtras().getString("qrcode"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    protected void startscanner(View view){
        Intent intent = new Intent(this, barcode.class);
        startActivityForResult(intent, 1);
    }


}
