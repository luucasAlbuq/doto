package activity;

import com.example.seudoto.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private ImageButton botaoLogin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        botaoLogin = (ImageButton) findViewById(R.id.botaoLogin);
        
        botaoLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 
				Intent telaBusca = new Intent(MainActivity.this, Busca.class);
				MainActivity.this.startActivity(telaBusca);
			}
		});
    }
}
