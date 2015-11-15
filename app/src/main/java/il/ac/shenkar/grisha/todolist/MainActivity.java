package il.ac.shenkar.grisha.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> listItems;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public ArrayList<String> getListItems() {
        return listItems;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItems = new ArrayList<>();
        /*listItems.add("Mock Task 1");
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
        listItems.add("Mock Task 20");*/
        mAdapter = new MyRecyclerAdapter(listItems);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        //MyListAdapter adapter = new MyListAdapter(this, listItems);
        //ListView listView = (ListView) findViewById(R.id.my_list);
        //listView.setAdapter(adapter);
        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //        Toast.makeText(MainActivity.this, "Item number "+(position+1)+" was clicked" , Toast.LENGTH_LONG).show();
        //    }
        //});
    }

    public void createTask(View view){
        Intent intent = new Intent(this, CreateTaskActivity.class);
        intent.putExtra("listItems", listItems);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
                listItems.add(result);
            }
        }
    }
}
