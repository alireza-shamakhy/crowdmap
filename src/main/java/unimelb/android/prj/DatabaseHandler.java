package unimelb.android.prj;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

  // All Static variables
  // Database Version
  private static final int DATABASE_VERSION = 1;

  // Database Name
  private static final String DATABASE_NAME = "AddresssManager";

  // Addresss table name
  private static final String TABLE_ADDRESS = "addresses";

  // Addresss Table Columns names
  private static final String KEY_ID = "id";
  private static final String KEY_TITLE = "title";

  public DatabaseHandler(final Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  // Creating Tables
  @Override
  public void onCreate(final SQLiteDatabase db) {
    final String CREATE_ADDRESS_TABLE = "CREATE TABLE " + TABLE_ADDRESS + "("
        + KEY_ID + " LONG PRIMARY KEY," + KEY_TITLE + " TEXT" + ")";
    db.execSQL(CREATE_ADDRESS_TABLE);
  }

  // Upgrading database
  @Override
  public void onUpgrade(final SQLiteDatabase db, final int oldVersion,
      final int newVersion) {
    // Drop older table if existed
    db.execSQL("DROP TABLE IF EXISTS " + TABLE_ADDRESS);

    // Create tables again
    onCreate(db);
  }

  // Adding new Address
  public void addAddress(final Address address) {
    final SQLiteDatabase db = this.getWritableDatabase();

    final ContentValues values = new ContentValues();
    values.put(KEY_ID, address.getId()); // Address Name
    values.put(KEY_TITLE, address.getTitle()); // Address Phone Number

    // Inserting Row
    db.insert(TABLE_ADDRESS, null, values);
    db.close(); // Closing database connection
  }

  // Getting single Address
  public Address getAddress(final int id) {

    final SQLiteDatabase db = this.getReadableDatabase();

    final Cursor cursor = db.query(TABLE_ADDRESS, new String[] { KEY_ID,
        KEY_TITLE }, KEY_ID + "=?", new String[] { String.valueOf(id) }, null,
        null, null);
    if (cursor != null) {
      cursor.moveToFirst();
    }

    final Address address = new Address();
    address.setId(Long.parseLong(cursor.getString(0)));
    address.setTitle(cursor.getString(1));
    // return Address
    return address;
  }

  // Getting All Addresss
  public List<Address> getAllAddresses() {

    final List<Address> AddressList = new ArrayList<Address>();
    // Select All Query
    final String selectQuery = "SELECT  * FROM " + TABLE_ADDRESS;

    final SQLiteDatabase db = this.getWritableDatabase();
    final Cursor cursor = db.rawQuery(selectQuery, null);

    // looping through all rows and adding to list
    if (cursor.moveToFirst()) {
      do {
        final Address Address = new Address();
        Address.setId(Long.parseLong(cursor.getString(0)));
        Address.setTitle(cursor.getString(1));
        // Adding Address to list
        AddressList.add(Address);
      } while (cursor.moveToNext());
    }

    // return Address list
    return AddressList;

  }

  // Getting Addresss Count
  public int getAddressCount() {

    final String countQuery = "SELECT  * FROM " + TABLE_ADDRESS;
    final SQLiteDatabase db = this.getReadableDatabase();
    final Cursor cursor = db.rawQuery(countQuery, null);
    cursor.close();

    // return count
    return cursor.getCount();
  }

  // Updating single Address
  public int updateAddress(final Address address) {
    final SQLiteDatabase db = this.getWritableDatabase();

    final ContentValues values = new ContentValues();
    values.put(KEY_TITLE, address.getTitle());

    // updating row
    return db.update(TABLE_ADDRESS, values, KEY_ID + " = ?",
        new String[] { String.valueOf(address.getId()) });
  }

  // Deleting single Address
  public void deleteAddress(final Address address) {
    final SQLiteDatabase db = this.getWritableDatabase();
    db.delete(TABLE_ADDRESS, KEY_ID + " = ?",
        new String[] { String.valueOf(address.getId()) });
    db.close();
  }

}
