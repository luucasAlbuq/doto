package activity;

import java.util.HashMap;
import java.util.Map;

import com.example.seudoto.R;
import com.facebook.android.Facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

import controller.UserController;

public class MainActivity extends Activity {
	
	private ImageButton botaoLogin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Parse.initialize(this, "7EqoOy2DDnMMHlXUGAbi9aJkqIgryikPIRv7CzX3", "nvT2iYY8AfuMJgH7cJQeoemBFFQsrXDqoR4wy2OJ");
        
        botaoLogin = (ImageButton) findViewById(R.id.botaoLogin);
        
        botaoLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent telaBusca = new Intent(MainActivity.this, BuscarActivity.class);
				MainActivity.this.startActivity(telaBusca);
			}
		});
    }
}