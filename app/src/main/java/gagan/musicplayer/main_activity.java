package gagan.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView library = (TextView) findViewById(R.id.library_intent_go);
        TextView now_play = (TextView) findViewById(R.id.now_play_intent_go);
        TextView discover = (TextView) findViewById(R.id.discover_intent_go);
        TextView buy = (TextView) findViewById(R.id.buy_intent_go);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_activity.this,activity_library.class);
                startActivity(intent);
            }
        });
        now_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_activity.this,activity_now_playing.class);
                startActivity(intent);
            }
        });
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_activity.this,activity_discover.class);
                startActivity(intent);
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_activity.this,payment_activity.class);
                startActivity(intent);
            }
        });
    }
}
