package com.example.petify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboardActivity extends AppCompatActivity {

    // Product section
    private Button btnAddProductShortcut, btnViewProducts;

    // Orders section
    private Button btnViewOrders;

    // Payments section
    private Button btnViewPayments;

    // Users section
    private Button btnViewUsers;

    // Cards (optional click actions)
    private LinearLayout cardProducts, cardOrders, cardPayments, cardUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        // ==== FIND VIEWS BY ID (MATCHING YOUR XML) ====

        // Product card + buttons
        cardProducts = findViewById(R.id.cardProducts);
        btnAddProductShortcut = findViewById(R.id.btnAddProductShortcut);
        btnViewProducts = findViewById(R.id.btnViewProducts);

        // Order card + button
        cardOrders = findViewById(R.id.cardOrders);
        btnViewOrders = findViewById(R.id.btnViewOrders);

        // Payment card + button
        cardPayments = findViewById(R.id.cardPayments);
        btnViewPayments = findViewById(R.id.btnViewPayments);

        // Users card + button
        cardUsers = findViewById(R.id.cardUsers);
        btnViewUsers = findViewById(R.id.btnViewUsers);



    }
}
