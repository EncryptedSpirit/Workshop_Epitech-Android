package epitech.workshop_demo_app.BaseClass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import epitech.workshop_demo_app.MainActivity
import epitech.workshop_demo_app.R

open class BaseFragment: Fragment() {
    fun getAct(): MainActivity { return activity as MainActivity }
    fun setRootFragment(newFragment: BaseFragment) { getAct().setRootFragment(newFragment) }
    fun placeFragmen(newFragment: BaseFragment, container: Int = R.id.frag_rootview) { getAct().placeFragment(newFragment, container) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayout(), container, false)
    }

    open fun getLayout(): Int { return R.layout.empty_layout }
}