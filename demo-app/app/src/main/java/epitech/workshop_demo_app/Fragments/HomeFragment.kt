package epitech.workshop_demo_app.Fragments

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import epitech.workshop_demo_app.Adapters.HomeAdapter
import epitech.workshop_demo_app.BaseClass.BaseFragment
import epitech.workshop_demo_app.R
import kotlinx.android.synthetic.main.frag_home_layout.*

class HomeFragment: BaseFragment() {
    override fun getLayout(): Int { return R.layout.frag_home_layout }

    val data = listOf<String>("1 janvier", "2 février", "3 mars", "4 avril", "5 mai", "6 juin", "7 juillet", "8 aout", "9 septembre", "10 octobre", "11 novembre", "12 décembre")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recview.layoutManager = LinearLayoutManager(context)
        recview.adapter = HomeAdapter(data)
    }
}