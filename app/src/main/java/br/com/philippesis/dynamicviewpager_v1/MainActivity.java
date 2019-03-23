package br.com.philippesis.dynamicviewpager_v1;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private DemoFragmentCollectionAdaoter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.id_recycleview_pager);
        adapter = new DemoFragmentCollectionAdaoter(getSupportFragmentManager(), 6);
        viewPager.setAdapter(adapter);
    }

}
