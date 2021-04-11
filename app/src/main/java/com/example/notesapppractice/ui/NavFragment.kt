package com.example.notesapppractice.ui

import android.app.TaskStackBuilder.create
import android.media.MediaParser.create
import android.media.MediaPlayer
import android.media.MediaPlayer.create
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.notesapppractice.R
import kotlinx.android.synthetic.main.fragment_creating.*
import kotlinx.android.synthetic.main.fragment_nav.*
import kotlinx.android.synthetic.main.fragment_nav.createNewButtonNav

class NavFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var sound = MediaPlayer.create(requireContext(), R.raw.sound)
        createNewButtonNav.setOnClickListener {
            sound!!.start()
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, CreatingFragment())
                ?.addToBackStack(null)
                ?.commit()
        }

        listOfNotes.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, ListFragment())
                ?.addToBackStack(null)
                ?.commit()
        }

    }

}