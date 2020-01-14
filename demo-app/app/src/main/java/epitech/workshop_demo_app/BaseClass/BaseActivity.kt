package epitech.workshop_demo_app.BaseClass

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import epitech.workshop_demo_app.R

open class BaseActivity: AppCompatActivity() {

    fun placeFragment(new_fragment: BaseFragment, view_location: Int = R.id.frag_rootview) {
        val fragment = supportFragmentManager.beginTransaction()

        fragment.replace(view_location, new_fragment, new_fragment.javaClass.name)
        fragment.addToBackStack(new_fragment.tag)
        fragment.commit()
    }

    fun setRootFragment(new_fragment: BaseFragment, view_root: Int = R.id.frag_rootview) {
        val fragment = supportFragmentManager.beginTransaction()

        supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        fragment.replace(view_root, new_fragment)
        fragment.commit()
    }
}