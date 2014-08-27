package unimelb.android.prj;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class HelloAndroidActivity extends Activity {

  /**
   * Called when the activity is first created.
   * 
   * @param savedInstanceState
   *          If the activity is being re-initialized after previously being
   *          shut down then this Bundle contains the data it most recently
   *          supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is
   *          null.</b>
   */
  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    
    /*  for rest-web service
    
    final StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
        .permitAll().build();

    StrictMode.setThreadPolicy(policy);

   final String url = "http://10.1.195.48:8080/persist/restGeo";
    final RestTemplate restTemplate = new RestTemplate();
    final HttpHeaders headers = new HttpHeaders();
    headers.add("X-AURIN-USER-ID", "aurin");

    // final HttpEntity<String> entity = new HttpEntity<String>("parameters",
    // headers);

    // final ResponseEntity<String> st = restTemplate.exchange(url,
    // HttpMethod.GET, entity, String.class);

    final EditText editText = (EditText) findViewById(R.id.edit_message);

    restTemplate.getMessageConverters().add(
        new MappingJackson2HttpMessageConverter());
    
     * final List<Address> greeting = (List<Address>) restTemplate.getForObject(
     * url, Address.class);
     

    final ResponseEntity<Address[]> responseEntity = restTemplate.getForEntity(
        url, Address[].class);

    Address[] lst;
    lst = responseEntity.getBody();

    editText.setText(lst[0].getTitle());*/
    // editText.setText(st.getBody());

  }

  @Override
  public boolean onCreateOptionsMenu(final Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(unimelb.android.prj.R.menu.main, menu);
    return true;
  }

  public void sendMessage(final View view) {
    final Intent intent = new Intent(this, MysqlActivity.class);
    startActivity(intent);
  }

}
