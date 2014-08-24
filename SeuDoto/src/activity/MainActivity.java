package activity;

import com.example.seudoto.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.parse.Parse;

import android.widget.TextView;

import com.facebook.*;
import com.facebook.model.*;

import controller.UserController;

public class MainActivity extends Activity {
	
	private ImageButton botaoLogin;
	private static MainActivity activity ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		activity = this;
		Parse.initialize(this, "7EqoOy2DDnMMHlXUGAbi9aJkqIgryikPIRv7CzX3",
				"nvT2iYY8AfuMJgH7cJQeoemBFFQsrXDqoR4wy2OJ");

		botaoLogin = (ImageButton) findViewById(R.id.botaoLogin);

		botaoLogin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//start Facebook Login
				Session.openActiveSession(activity, true, new Session.StatusCallback() {
				
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
												//ID user
												UserController.getInstance().setIdUser(user.getId());
												
												Intent telaBusca = new Intent(MainActivity.this,
												BuscarActivity.class);
												MainActivity.this.startActivity(telaBusca);
											}
										}
									}).executeAsync();
						}
					}
				});
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