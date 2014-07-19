package activity;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class CadastrarProfissionalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_profissional);
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_home_actions, menu);
 
        return super.onCreateOptionsMenu(menu);
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
        case R.id.action_home:
        	LocationFound();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
	
	private void LocationFound() {
        Intent i = new Intent(CadastrarProfissionalActivity.this, BuscarActivity.class);
        startActivity(i);
    }
}
