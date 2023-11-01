package vistula.xy.l05_new_shop_guda_66443;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText surnameEditText, townEditText;
    private Spinner spinnerData;
    private Button sendDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surnameEditText = findViewById(R.id.surname_edit_id);
        townEditText = findViewById(R.id.town_edit_text_id);
        sendDataButton = findViewById(R.id.btn_purchase_form_id);
        spinnerData = findViewById(R.id.spinner_id);

        sendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String surname = surnameEditText.getText().toString();
                String town = townEditText.getText().toString();
                String spinner = spinnerData.getSelectedItem().toString();
                // Create an Intent to send data to another activity

                // Create a Bundle object to store the data
                Bundle bundle = new Bundle();
                bundle.putString("SURNAME", surname);
                bundle.putString("TOWN", town);
                bundle.putString("SPINNER_ITEM", spinner);

                Intent intent = new Intent(MainActivity.this, PurchaseFormActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}