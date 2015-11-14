package il.ac.shenkar.grisha.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listItems.add("Mock Task 1");
        listItems.add("Mock Task 2");
        listItems.add("Mock Task 3");
        listItems.add("Mock Task 4");
        listItems.add("Mock Task 5");
        listItems.add("Mock Task 6");
        listItems.add("Mock Task 7");
        listItems.add("Mock Task 8");
        listItems.add("Mock Task 9");
        listItems.add("Mock Task 10");
        listItems.add("Mock Task 11");
        listItems.add("Mock Task 12");
        listItems.add("Mock Task 13");
        listItems.add("Mock Task 14");
        listItems.add("Mock Task 15");
        listItems.add("Mock Task 16");
        listItems.add("Mock Task 17");
        listItems.add("Mock Task 18");
        listItems.add("Mock Task 19");
        listItems.add("Mock Task 20");
        setContentView(R.layout.activity_main);
        MyListAdapter adapter = new MyListAdapter(this,
                R.layout.list_item, listItems);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

    public void createTask(View view){
        Intent intent = new Intent(this, CreateTaskActivity.class);
        startActivity(intent);
    }
}
