package my.edu.tarc.demo23navigation.ui.send

import android.os.Bundle
import android.view.*
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_send.*
import my.edu.tarc.demo23navigation.MainActivity
import my.edu.tarc.demo23navigation.R

class SendFragment : Fragment() {

    private lateinit var sendViewModel: SendViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sendViewModel =
            ViewModelProviders.of(this).get(SendViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_send, container, false)
        val textView: TextView = root.findViewById(R.id.text_send)

        val fab: FloatingActionButton? = activity?.findViewById(R.id.fab)

        if (fab != null) {
            fab.isVisible = true
        }

        sendViewModel.text.observe(this, Observer {
            textView.text = it
        })

        return root
    }

    override fun onPause() {
        super.onPause()
        val fab: FloatingActionButton? = activity?.findViewById(R.id.fab)

        if (fab != null) {
            fab.isVisible = false
        }
    }
}