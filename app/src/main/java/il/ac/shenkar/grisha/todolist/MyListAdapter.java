package il.ac.shenkar.grisha.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<String> {

    public MyListAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_item, null);
        }
        String task = getItem(position);
        if (task != null) {
            TextView textView = (TextView) v.findViewById(R.id.list_item_text);
            textView.setText(task);
            Button button = (Button) v.findViewById(R.id.list_item_button);
        }
        return v;
    }
}
