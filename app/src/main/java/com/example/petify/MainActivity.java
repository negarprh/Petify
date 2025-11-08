package com.example.petify;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ScreenCycler";
    private int index = 0;

    // List every layout you want to screenshot
    private final int[] layouts = new int[] {
            R.layout.activity_sign_up,
            R.layout.activity_login,
            R.layout.activity_admin_dashboard,
            R.layout.activity_admin_products,
            R.layout.activity_admin_add_product,
            R.layout.activity_admin_product_editor,
            R.layout.activity_admin_orders,
            R.layout.activity_admin_payments,
            R.layout.activity_main
    };

    // Names to display in toasts for context
    private final String[] names = new String[] {
            "Sign Up",
            "Login",
            "Admin Dashboard",
            "Admin Products",
            "Admin Add Product",
            "Admin Product Editor",
            "Admin Orders",
            "Admin Payments",
            "User Home (activity_main)"
    };

    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);
        Button next = findViewById(R.id.btnNext);
        Button prev = findViewById(R.id.btnPrev);

        next.setOnClickListener(v -> {
            index = (index + 1) % layouts.length;
            loadCurrent();
        });
        prev.setOnClickListener(v -> {
            index = (index - 1 + layouts.length) % layouts.length;
            loadCurrent();
        });

        loadCurrent();
    }

    private void loadCurrent() {
        try {
            container.removeAllViews();
            LayoutInflater.from(this).inflate(layouts[index], container, true);
            Toast.makeText(this, "Showing: " + names[index], Toast.LENGTH_SHORT).show();
        } catch (Throwable t) {  // catches InflateException and others
            Log.e(TAG, "Failed to inflate " + names[index], t);
            Toast.makeText(this, "Inflate error: " + names[index], Toast.LENGTH_LONG).show();
        }
    }
}
