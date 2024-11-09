package com.example.a15_8_animation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val registrationTitle: TextView = view.findViewById(R.id.registrationTitle)
        val loginEditText: EditText = view.findViewById(R.id.loginEditText)
        val passwordEditText: EditText = view.findViewById(R.id.passwordEditText)
        val registerButton: Button = view.findViewById(R.id.registerButton)

        registrationTitle.visibility = View.VISIBLE
        loginEditText.visibility = View.VISIBLE
        passwordEditText.visibility = View.VISIBLE
        registerButton.visibility = View.VISIBLE

        val titleSlideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        val fieldsSlideUp = AnimationUtils.loadAnimation(context, R.anim.slide_up)

        registrationTitle.startAnimation(titleSlideDown)
        loginEditText.startAnimation(fieldsSlideUp)
        passwordEditText.startAnimation(fieldsSlideUp)
        registerButton.startAnimation(fieldsSlideUp)

        registerButton.setOnClickListener {
            (activity as MainActivity).replaceFragment(MainFragment())
        }
    }
}