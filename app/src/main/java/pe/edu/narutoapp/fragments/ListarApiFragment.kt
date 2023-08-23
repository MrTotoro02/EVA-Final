package pe.edu.narutoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.narutoapp.R
import pe.edu.narutoapp.RvPersonAdapter
import pe.edu.narutoapp.databinding.FragmentListarApiBinding


class ListarApiFragment : Fragment() {

    private lateinit var binding: FragmentListarApiBinding
    private lateinit var viewModel: ListarApiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ListarApiViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentListarApiBinding.inflate(inflater, container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RvPersonAdapter(listOf())
        binding.rvLisrproduct.adapter = adapter
        binding.rvLisrproduct.layoutManager = GridLayoutManager(requireContext(),2, RecyclerView.VERTICAL, false)
        viewModel.person.observe(requireActivity()){
            adapter.person = it
            adapter.notifyDataSetChanged()
        }

        viewModel.getPersonFromService()

    }
}