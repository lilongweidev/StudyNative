package com.llw.studynative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.llw.studynative.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'studynative' library on application startup.
    static {
        System.loadLibrary("studynative");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(testFromJNI());
    }

    /**
     * A native method that is implemented by the 'studynative' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public native String testFromJNI();
}