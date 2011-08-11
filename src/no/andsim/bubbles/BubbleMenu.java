package no.andsim.bubbles;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BubbleMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bubblemenu);

		// set up button sound
		final MediaPlayer mpButtonClick = MediaPlayer.create(this,
				R.raw.buttonclick);
		
		Button startBtn = (Button) findViewById(R.id.startBtn);
		startBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("no.andsim.bubbles.BUBBLESONE"));
				if(Settings.isSound())mpButtonClick.start();
			}
		});
		
		Button settingBtn = (Button) findViewById(R.id.settingBtn);
		settingBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("no.andsim.bubbles.SETTINGSMENU"));
				if(Settings.isSound())mpButtonClick.start();
			}
		});

	}

}