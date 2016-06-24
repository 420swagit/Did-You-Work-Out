package fannyu.didyouworkout;

import android.widget.EditText;

/**
 * Created by fanny on 6/24/2016.
 */
public class Workout {

    EditText exerciseName;
    EditText numberOfTimes;

    public Workout(EditText name, EditText time)
    {
        exerciseName = name;
        numberOfTimes = time;
    }

}
