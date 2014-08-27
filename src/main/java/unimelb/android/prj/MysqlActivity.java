package unimelb.android.prj;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MysqlActivity extends Activity {
  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mysql);

    final DatabaseHandler db = new DatabaseHandler(this);

    /**
     * CRUD Operations
     * */
    // Inserting Contacts
    Log.d("Insert: ", "Inserting ..");
    final Address addr = new Address();
    addr.setId(1);
    addr.setTitle("testTitle");

    db.addAddress(addr);

    // Reading all contacts
    Log.d("Reading: ", "Reading all addresses..");
    final List<Address> addresses = db.getAllAddresses();
    for (final Address cn : addresses) {
      final String log = "Id: " + cn.getId() + " ,Title: " + cn.getTitle();
      // Writing Contacts to log
      Log.d("Name: ", log);

    }
  }
}
