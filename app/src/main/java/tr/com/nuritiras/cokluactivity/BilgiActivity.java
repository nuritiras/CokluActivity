package tr.com.nuritiras.cokluactivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import tr.com.nuritiras.cokluactivity.databinding.ActivityMainBinding;

public class BilgiActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent=getIntent();
        String bilgiAdiSoyAdi= intent.getStringExtra("adiSoyadiKey");
        String bilgiTelefonNo=intent.getStringExtra("telefonNoKey");
        binding.editTextAdiSoyad.setText(bilgiAdiSoyAdi);
        binding.editTextTelefon.setText(bilgiTelefonNo);
    }
}