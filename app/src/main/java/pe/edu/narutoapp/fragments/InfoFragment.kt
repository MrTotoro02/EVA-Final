package pe.edu.narutoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import pe.edu.narutoapp.R
import pe.edu.narutoapp.databinding.FragmentInfoBinding


class InfoFragment : Fragment(R.layout.fragment_info) {

    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)

        binding.btnLogout.setOnClickListener {
            firebaseAuth.signOut()
            findNavController().navigate(R.id.action_infoFragment_to_loginActivity)
        }
    }


}