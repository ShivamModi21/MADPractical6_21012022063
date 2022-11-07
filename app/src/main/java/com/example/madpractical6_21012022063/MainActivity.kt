package com.example.madpractical6_21012022063

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myvideoview=findViewById<VideoView>(R.id.Playview)
        val mybuttonview=findViewById<FloatingActionButton>(R.id.Playbtn1)
        val mediaController=MediaController(this)
        val uri:Uri=Uri.parse(("android.resource://"+packageName+"/"+R.raw.thestoryoflight))
        myvideoview.setMediaController((mediaController))
        mediaController.setAnchorView((myvideoview))
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()

    }
}