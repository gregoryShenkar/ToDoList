package il.ac.shenkar.grisha.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] listItems = {"Go to supermarkets" ,"Call home", "MOCK1", "MOCK2", "MOCK3", "MOCK4", "MOCK5", "MOCK6", "MOCK7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    public void createTask(View view){
        Intent intent = new Intent(this, CreateTaskActivity.class);
        startActivity(intent);
    }
}
