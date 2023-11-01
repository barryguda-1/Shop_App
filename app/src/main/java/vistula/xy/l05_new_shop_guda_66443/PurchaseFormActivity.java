package vistula.xy.l05_new_shop_guda_66443;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PurchaseFormActivity extends AppCompatActivity {
    private TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_form);

        displayTextView = findViewById(R.id.dummy_text_view_id);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // Retrieve data from the Bundle
            String surname = bundle.getString("SURNAME");
            String town = bundle.getString("TOWN");
            String spinner = bundle.getString("SPINNER_ITEM");

            // Display the data
            String displayText = "Surname: " + surname + "\nTown: " + town + "\nSpinner Item: " + spinner;
            displayTextView.setText(displayText);
        } else {
            // Handle the case when the Bundle is null (no data sent)
            displayTextView.setText("No data received.");
        }
    }
}