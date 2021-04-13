package hu.itatti.navcomponentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import hu.itatti.navcomponentdemo.databinding.FragmentDetailBinding

class FragmentDetail: Fragment() {

    val args: FragmentMainArgs by navArgs()

    private var _binding : FragmentDetailBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater,
                              container:
                              ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentDetailBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)

        binding.tvData.text= args.person.name
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}