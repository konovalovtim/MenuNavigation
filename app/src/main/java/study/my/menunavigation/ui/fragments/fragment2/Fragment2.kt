package study.my.menunavigation.ui.fragments.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import study.my.menunavigation.databinding.Fragment2Binding
import study.my.menunavigation.ui.models.Fragment2ViewModel

class Fragment2 : Fragment() {

    private lateinit var fragment2ViewModel: Fragment2ViewModel
    private var _binding: Fragment2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = Fragment2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}