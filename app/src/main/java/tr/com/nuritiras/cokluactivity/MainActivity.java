package tr.com.nuritiras.cokluactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import tr.com.nuritiras.cokluactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void digerActivity(View view) {
        String adiSoyadi=binding.editTextAdiSoyad.getText().toString();
        String telefonNo=binding.editTextTelefon.getText().toString();
        Intent intent=new Intent(MainActivity.this,BilgiActivity.class);
        intent.putExtra("adiSoyadiKey",adiSoyadi);
        intent.putExtra("telefonNoKey",telefonNo);
        startActivity(intent);
    }
}