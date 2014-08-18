package activity;

import java.util.HashMap;
import java.util.Map;

import com.example.seudoto.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseFacebookUtils;
import com.parse.ParseObject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import com.facebook.*;
import com.facebook.model.*;

public class MainActivity extends Activity {

	private ImageButton botaoLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Parse.initialize(this, "7EqoOy2DDnMMHlXUGAbi9aJkqIgryikPIRv7CzX3",
				"nvT2iYY8AfuMJgH7cJQeoemBFFQsrXDqoR4wy2OJ");

		ParseFacebookUtils.initialize("1460332747563538");

		botaoLogin = (ImageButton) findViewById(R.id.botaoLogin);

		botaoLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				 Intent telaBusca = new Intent(MainActivity.this,
				 BuscarActivity.class);
				 MainActivity.this.startActivity(telaBusca);
			}
		});

		// start Facebook Login
		Session.openActiveSession(this, true, new Session.StatusCallback() {

			// callback when session changes state
			@Override
			public void call(Session session, SessionState state,
					Exception exception) {
				if (session.isOpened()) {

					// make request to the /me API
					Request.newMeRequest(session,
							new Request.GraphUserCallback() {

								// callback after Graph API response with user
								// object
								@Override
								public void onCompleted(GraphUser user,
										Response response) {
									if (user != null) {
										 TextView welcome = (TextView) findViewById(R.id.welcome);
							                welcome.setText("ID: " + user.getId());
									}
								}
							}).executeAsync();
				}
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		Session.getActiveSession().onActivityResult(this, requestCode,
				resultCode, data);
	}
}
