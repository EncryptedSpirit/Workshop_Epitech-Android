package epitech.workshop_demo_app

import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import epitech.workshop_demo_app.BaseClass.BaseActivity
import epitech.workshop_demo_app.BaseClass.BaseFragment
import epitech.workshop_demo_app.Fragments.AccountFragment
import epitech.workshop_demo_app.Fragments.HomeFragment
import epitech.workshop_demo_app.Fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    lateinit var fragment: BaseFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navbar.setOnNavigationItemSelectedListener(this)
        navbar.selectedItemId = R.id.nav_home
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        fragment = when(p0.itemId) {
            R.id.nav_home -> {
                HomeFragment()
            }
            R.id.nav_account -> {
                AccountFragment()
            }
            R.id.nav_settings -> {
                SettingsFragment()
            }
            else -> {
                return false
            }
        }
        placeFragment(fragment)
        return true
    }
}
