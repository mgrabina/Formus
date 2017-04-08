package com.example.martinegrabina.myapplication;
import com.google.*;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.ingartek.bizkaimove.R;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private TextView mTextMessage;
    private GoogleMap mMap;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Object mGoogleApiClient=null;
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        // Se agregan los refugios
        LatLng refugio2 = new LatLng(-34.597736, -58.416826);
        mMap.addMarker(new MarkerOptions().position(refugio2).title("Refugio Cordoba"));
        LatLng refugio3 = new LatLng(-34.572299, -58.429800);
        mMap.addMarker(new MarkerOptions().position(refugio3).title("Refugio Canitas"));
        LatLng refugio4 = new LatLng(-34.592458, -58.404217);
        mMap.addMarker(new MarkerOptions().position(refugio4).title("Refugio Arenales"));
        LatLng refugio5 = new LatLng(-34.608813, -58.376414);
        mMap.addMarker(new MarkerOptions().position(refugio5).title("Refugio Arcos"));
        LatLng refugio6 = new LatLng(-34.598708, -58.394537);
        mMap.addMarker(new MarkerOptions().position(refugio6).title("Refugio Riobamba"));
        LatLng refugio7 = new LatLng(-34.601466, -58.392754);
        mMap.addMarker(new MarkerOptions().position(refugio7).title("Refugio Callao"));
        LatLng refugio8 = new LatLng(-34.598394, -58.387542);
        mMap.addMarker(new MarkerOptions().position(refugio8).title("Refugio Paraguay"));
        LatLng refugio9 = new LatLng(-34.597733, -58.416847);
        mMap.addMarker(new MarkerOptions().position(refugio9).title("Refugio Cordoba"));
        LatLng refugio10 = new LatLng(-34.620432, -58.372210);
        mMap.addMarker(new MarkerOptions().position(refugio10).title("Refugio Don Anselmo"));
        LatLng refugio11 = new LatLng(-34.614963, -58.374532);
        mMap.addMarker(new MarkerOptions().position(refugio11).title("Refugio San Telmo"));
        LatLng refugio12 = new LatLng(-34.601017, -58.399828);
        mMap.addMarker(new MarkerOptions().position(refugio12).title("Refugio Pasteur"));

        LatLng capital = new LatLng( -34.599722, -58.381944);
        mMap.addMarker(new MarkerOptions().position(refugio5).title("C.A.B.A."));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(capital));
        mMap.setMinZoomPreference(10);

    }
}
