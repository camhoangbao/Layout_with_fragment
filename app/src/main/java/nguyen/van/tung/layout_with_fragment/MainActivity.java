package nguyen.van.tung.layout_with_fragment;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appbarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        tabLayout = findViewById(R.id.tab_layout);
        appbarLayout = findViewById(R.id.appbar);
        viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //add adapter
        viewPagerAdapter.AddFragment(new FragmentQuiz(),"Quiz");
        viewPagerAdapter.AddFragment(new FragmentExplorer(),"Explorer");
        viewPagerAdapter.AddFragment(new FragmentStore(),"Store");
        //setup adapter
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        
    }

    private void addEvents() {

    }
}
