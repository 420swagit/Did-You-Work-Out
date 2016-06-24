package fannyu.didyouworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
    }

    //get the text
    EditText exerciseName;
    EditText exerciseQuantity;

    public void onAdd()
    {
        exerciseName =(EditText)findViewById(R.id.inputName);
        String name = exerciseName.toString();
        exerciseQuantity = (EditText)findViewById(R.id.inputQuantity);
        String quantity = exerciseQuantity.toString();
        Workout workout = new Workout(exerciseName,exerciseQuantity);
    }
}
