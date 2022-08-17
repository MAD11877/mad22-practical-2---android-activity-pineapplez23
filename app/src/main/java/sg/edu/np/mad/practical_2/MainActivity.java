package sg.edu.np.mad.practical_2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MyMessageButton = findViewById(R.id.MessageButton);
        Button MyFollowButton = findViewById(R.id.FollowButton);
        User MyUser = new User();
        MyUser.setName("MAD practical 2");
        MyUser.setDescription("App for practical 2");
        TextView MyName = findViewById(R.id.Name);
        TextView MyDescription = findViewById(R.id.Discription);

        MyName.setText(MyUser.getName());
        MyDescription.setText(MyUser.getDescription());


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
                MyFollowButton.setText("unfollow");
            }

        });

    }
    }