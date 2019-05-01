package io.github.nicholaschiang.vifi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;

public class MainActivity extends AppCompatActivity {

    private TextView signalStrengthTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiManager manager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = manager.getConnectionInfo();

        // Set info TextView data
        signalStrengthTextView = findViewById(R.id.signalStrength);
        String signalFreq = info.getFrequency() + " MHz";
        signalStrengthTextView.setText(signalFreq);
    }
}
