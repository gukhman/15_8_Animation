package com.example.a15_8_animation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView: ImageView = view.findViewById(R.id.imageView)
        val startButton: Button = view.findViewById(R.id.startButton)
        
        imageView.visibility = View.VISIBLE
        startButton.visibility = View.VISIBLE

        val imageFadeIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val buttonSlideIn = AnimationUtils.loadAnimation(context, R.anim.slide_in_left)

        imageView.startAnimation(imageFadeIn)
        startButton.startAnimation(buttonSlideIn)

        startButton.setOnClickListener {
            (activity as MainActivity).replaceFragment(RegistrationFragment())
        }
    }
}