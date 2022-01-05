package study.my.menunavigation.ui.fragments.fragment3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import study.my.menunavigation.databinding.Fragment3Binding
import study.my.menunavigation.ui.models.Fragment3ViewModel

class Fragment3 : Fragment() {

    private lateinit var fragment3ViewModel: Fragment3ViewModel
    private var _binding: Fragment3Binding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragment3ViewModel =
            ViewModelProvider(this).get(Fragment3ViewModel::class.java)

        _binding = Fragment3Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFragment3
        fragment3ViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}