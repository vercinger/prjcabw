package com.VerciApps.snyd;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends Activity {

	ImageButton terning1, terning2, terning3, terning4, terning5, terning6;
	Button rafle;
	TextView display;
	int x, count1, count2, count3, count4,count5,count6;
	boolean terning1Clicked, terning2Clicked, terning3Clicked, terning4Clicked, terning5Clicked, terning6Clicked;


	/*TODO: 
	 * Ændre imagebuttons til image..
	 * Host 
	 * - modtage spilleres terning slag
	 * Client - lave og afsende terning slag
	 * Lave et call/bluff
	 * Call bluff
	 *  - tillad bluff
	 *  - 
	 * Vise sidste call
	 * 
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		terning1 = (ImageButton) findViewById(R.id.terning1);
		terning2 = (ImageButton) findViewById(R.id.terning2);
		terning3 = (ImageButton) findViewById(R.id.terning3);
		terning4 = (ImageButton) findViewById(R.id.terning4);
		terning5 = (ImageButton) findViewById(R.id.terning5);
		terning6 = (ImageButton) findViewById(R.id.terning6);
		display = (TextView) findViewById(R.id.textView1);
		rafle = (Button) findViewById(R.id.rafle);

		final int[]terningImg = { R.drawable.terning_1,R.drawable.terning_2,R.drawable.terning_3,R.drawable.terning_4,R.drawable.terning_5,R.drawable.terning_6};


		rafle.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				terning1.setBackgroundResource(terningImg[randomWTimeSeed(1)]);
				terning2.setBackgroundResource(terningImg[randomWTimeSeed(2)]);
				terning3.setBackgroundResource(terningImg[randomWTimeSeed(3)]);
				terning4.setBackgroundResource(terningImg[randomWTimeSeed(4)]);
				terning5.setBackgroundResource(terningImg[randomWTimeSeed(5)]);
				terning6.setBackgroundResource(terningImg[randomWTimeSeed(6)]);
				display.setText("Så skal der snydes!");
				count1 = 0;
				count2 = 0;
				count3 = 0;
				count4 = 0;
				count5 = 0;
				count6 = 0;
				terning1Clicked = false;
				terning2Clicked = false;
				terning3Clicked = false;
				terning4Clicked = false;
				terning5Clicked = false;
				terning6Clicked = false;
			}
		});
		
	
	}

	private int randomWTimeSeed(int seed){
		Random rand = new Random(System.currentTimeMillis()+seed);
		x = rand.nextInt(6);
		return x;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
