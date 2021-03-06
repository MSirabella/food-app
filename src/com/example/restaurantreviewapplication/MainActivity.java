package com.example.restaurantreviewapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText usernameText;
	private EditText passwordText;
	private Button loginButton;
	private Button skipLoginButton;
	private Button forgotPassword;
	private Button exitButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		usernameText = (EditText)findViewById(R.id.Username);
		passwordText = (EditText)findViewById(R.id.Password);
		loginButton = (Button)findViewById(R.id.LogIn);
		skipLoginButton = (Button)findViewById(R.id.SkipLogin);
		forgotPassword = (Button)findViewById(R.id.ForgotPassword);
		exitButton = (Button)findViewById(R.id.ExitApplication);
		
		usernameText.setSingleLine();
		passwordText.setSingleLine();
		
		//OnClickListener for "Login" Button
		loginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
			
		});

		//OnClickListener for "Skip Login" Button
		skipLoginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
			
		});
		
		//OnClickListener for "Forgot Password?" Button
		forgotPassword.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
			
		});
		
		//OnClickListener for "Exit" Button
		exitButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
