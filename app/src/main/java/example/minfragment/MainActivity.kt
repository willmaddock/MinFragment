package example.minfragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView // Correct import

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startFragment(view: View) {
        // 1. Get the FragmentContainerView using findViewById (as per instructions)
        val framelayout = findViewById<FragmentContainerView>(R.id.fragment_container)

        // 2. Create BlueFragment instance with parameter
        val blueFragment = BlueFragment.newInstance("FIRST")

        // 3. Perform the fragment transaction
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, blueFragment) // Use the container's ID
            .addToBackStack(null) // Add to back stack
            .commit()
    }
}