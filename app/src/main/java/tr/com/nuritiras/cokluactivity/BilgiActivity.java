package tr.com.nuritiras.cokluactivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import tr.com.nuritiras.cokluactivity.databinding.ActivityBilgiBinding;

public class BilgiActivity extends AppCompatActivity {
    private ActivityBilgiBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityBilgiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent=getIntent();
        String bilgiAdiSoyAdi= intent.getStringExtra("adiSoyadiKey");
        String bilgiTelefonNo=intent.getStringExtra("telefonNoKey");
        binding.textViewAdiSoyadi.setText(bilgiAdiSoyAdi);
        binding.textViewTelefonNo.setText(bilgiTelefonNo);
    }
}