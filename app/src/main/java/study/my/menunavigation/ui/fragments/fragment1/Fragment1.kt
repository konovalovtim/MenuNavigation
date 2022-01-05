package study.my.menunavigation.ui.fragments.fragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import study.my.menunavigation.databinding.Fragment1Binding
import study.my.menunavigation.ui.models.Fragment1ViewModel

class Fragment1 : Fragment() {

    private lateinit var fragment1ViewModel: Fragment1ViewModel
    private var _binding: Fragment1Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragment1ViewModel =
            ViewModelProvider(this).get(Fragment1ViewModel::class.java)

        _binding = Fragment1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFragment1
        fragment1ViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}