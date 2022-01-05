package study.my.menunavigation.ui.fragments.fragment4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import study.my.menunavigation.databinding.Fragment4Binding
import study.my.menunavigation.ui.models.Fragment4ViewModel

class Fragment4 : Fragment() {

    private lateinit var fragment4ViewModel: Fragment4ViewModel
    private var _binding: Fragment4Binding? = null
    private val binding get() = _binding!!
    private lateinit var cars: MutableList<Car>
    private var carsAdapter: CarAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragment4ViewModel =
            ViewModelProvider(this).get(Fragment4ViewModel::class.java)

        _binding = Fragment4Binding.inflate(inflater, container, false)
        val root: View = binding.root

        cars = generateCarList()

        setupRecyclerView()

        return root
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        carsAdapter = CarAdapter(cars, object: CarAdapter.CarClickListener {
            override fun onCarClick(car: Car?) {
                Toast.makeText(activity, car?.manufacturer, Toast.LENGTH_SHORT).show()
            }
        })

        recyclerView.adapter = carsAdapter
        recyclerView.layoutManager = LinearLayoutManager(activity)
    }

    private fun generateCarList(): MutableList<Car> {
        val list = mutableListOf<Car>()

        for (i in 0..10) {
            list.add(generateCar(i))
        }
        return list
    }

    private fun generateCar(int: Int): Car {
        return Car("bmw $int", "m4 $int")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}