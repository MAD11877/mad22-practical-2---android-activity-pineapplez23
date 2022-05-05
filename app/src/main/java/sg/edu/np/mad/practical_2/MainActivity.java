package sg.edu.np.mad.practical_2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] follow = {1};
        Button MyMessageButton = findViewById(R.id.MessageButton);
        Button MyFollowButton = findViewById(R.id.FollowButton);
        MyMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.v(TAG, "Message button pressed");
            }
        });
        MyFollowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MyFollowButton.setText("Unfollow");
                Log.v(TAG, "Follow button pressed");
            }

        });

    }
    }