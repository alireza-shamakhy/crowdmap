package unimelb.android.prj;


public class AndroidAddress {

  public AndroidAddress() {

  }
  /*
   * public static abstract class FeedEntry implements BaseColumns { public
   * static final String TABLE_NAME = "entry"; public static final String
   * COLUMN_NAME_ENTRY_ID = "entryid"; public static final String
   * COLUMN_NAME_TITLE = "title"; public static final String
   * COLUMN_NAME_SUBTITLE = "subtitle"; private static final String TEXT_TYPE =
   * " TEXT"; private static final String COMMA_SEP = ","; private static final
   * String SQL_CREATE_ENTRIES = "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
   * FeedEntry._ID + " INTEGER PRIMARY KEY," + FeedEntry.COLUMN_NAME_ENTRY_ID +
   * TEXT_TYPE + COMMA_SEP + FeedEntry.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP
   * + " )"; final FeedReaderDbHelper mDbHelper = new
   * FeedReaderDbHelper(getContext()); private static final String
   * SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME; public
   * class FeedReaderDbHelper extends SQLiteOpenHelper { // If you change the
   * database schema, you must increment the database // version. public static
   * final int DATABASE_VERSION = 1; public static final String DATABASE_NAME =
   * "FeedReader.db"; public FeedReaderDbHelper(final Context context) {
   * super(context, DATABASE_NAME, null, DATABASE_VERSION); }
   * @Override public void onCreate(final SQLiteDatabase db) {
   * db.execSQL(SQL_CREATE_ENTRIES); }
   * @Override public void onUpgrade(final SQLiteDatabase db, final int
   * oldVersion, final int newVersion) { // This database is only a cache for
   * online data, so its upgrade policy // is // to simply to discard the data
   * and start over db.execSQL(SQL_DELETE_ENTRIES); onCreate(db); }
   * @Override public void onDowngrade(final SQLiteDatabase db, final int
   * oldVersion, final int newVersion) { onUpgrade(db, oldVersion, newVersion);
   * } void createRecord(final Context context) { final SQLiteDatabase db =
   * mDbHelper.getWritableDatabase(); // Create a new map of values, where
   * column names are the keys final ContentValues values = new ContentValues();
   * final String id = "1"; values.put(FeedEntry.COLUMN_NAME_ENTRY_ID, id);
   * final String title = "title"; values.put(FeedEntry.COLUMN_NAME_TITLE,
   * title); // Insert the new row, returning the primary key value of the new
   * row long newRowId; newRowId = db.insert(FeedEntry.TABLE_NAME,
   * FeedEntry.COLUMN_NAME_NULLABLE, values); } void ReadRecord() { final
   * SQLiteDatabase db = mDbHelper.getReadableDatabase(); // Define a projection
   * that specifies which columns from the database // you will actually use
   * after this query. final String[] projection = { FeedEntry._ID,
   * FeedEntry.COLUMN_NAME_TITLE, FeedEntry.COLUMN_NAME_UPDATED, }; // How you
   * want the results sorted in the resulting Cursor final String sortOrder =
   * FeedEntry.COLUMN_NAME_UPDATED + " DESC"; final Cursor cursor =
   * db.query(FeedEntry.TABLE_NAME, // The table to // query projection, // The
   * columns to return selection, // The columns for the WHERE clause
   * selectionArgs, // The values for the WHERE clause null, // don't group the
   * rows null, // don't filter by row groups sortOrder // The sort order );
   * cursor.moveToFirst(); final long itemId = cursor.getLong(cursor
   * .getColumnIndexOrThrow(FeedEntry._ID)); } void deleteRecord() { // Define
   * 'where' part of query. final String selection =
   * FeedEntry.COLUMN_NAME_ENTRY_ID + " LIKE ?"; // Specify arguments in
   * placeholder order. final String[] selectionArgs = { String.valueOf(rowId)
   * }; // Issue SQL statement. db.delete(table_name, selection, selectionArgs);
   * } void updateRecord() { final SQLiteDatabase db =
   * mDbHelper.getReadableDatabase(); // New value for one column final
   * ContentValues values = new ContentValues();
   * values.put(FeedEntry.COLUMN_NAME_TITLE, title); // Which row to update,
   * based on the ID final String selection = FeedEntry.COLUMN_NAME_ENTRY_ID +
   * " LIKE ?"; final String[] selectionArgs = { String.valueOf(rowId) }; final
   * int count = db.update(FeedReaderDbHelper.FeedEntry.TABLE_NAME, values,
   * selection, selectionArgs); } } }
   */
}
