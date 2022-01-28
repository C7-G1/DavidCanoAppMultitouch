package david.cano.davidcanoappmultitouch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MultitouchView(this));
    }
}