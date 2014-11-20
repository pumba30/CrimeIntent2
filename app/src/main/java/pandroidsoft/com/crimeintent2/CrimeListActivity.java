package pandroidsoft.com.crimeintent2;

import android.support.v4.app.Fragment;

/**
 * Created by pumba30 on 20.11.2014.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
