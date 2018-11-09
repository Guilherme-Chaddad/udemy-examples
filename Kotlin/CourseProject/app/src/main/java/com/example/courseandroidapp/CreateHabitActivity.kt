package com.example.courseandroidapp

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_create_habit.*
import java.io.IOException

class CreateHabitActivity : AppCompatActivity() {

    private val TAG = CreateHabitActivity::class.java.simpleName
    private val CHOOSE_IMAGE_REQUEST = 1
    private var imageBitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_habit)
    }

    fun storeHabit(v: View) {
        if(et_title.isBlank() || et_descr.isBlank()) {
            Log.d(TAG, "No habit logged: title or description missing")
            displayErrorMessage("Your habit needs an engagin title and description")
            return
        } else if(imageBitmap == null) {
            Log.d(TAG, "No habit logged: image missing")
            displayErrorMessage("Add a motivating picture to your habit")
            return
        }
        tv_error.visibility = View.INVISIBLE
        //Store the habit...
    }

    private fun EditText.isBlank() = this.text.toString().isBlank()

    private fun displayErrorMessage(message: String) {
        tv_error.text = message
        tv_error.visibility = View.VISIBLE
    }

    fun chooseImage(v: View) {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT

        val chooser = Intent.createChooser(intent, "Choose image for habit")
        startActivityForResult(chooser, CHOOSE_IMAGE_REQUEST)

        Log.d(TAG, "Intent to choose image sent...")

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == CHOOSE_IMAGE_REQUEST  && data != null&& data.data != null) {
            Log.d(TAG, "An image was chosen")

            val bitmap = tryReadBitmap(data.data)

            bitmap?.let {
                this.imageBitmap = bitmap
                iv_image.setImageBitmap(bitmap)
                Log.d(TAG, "Read image bitmap and updated image view")
            }
        }
    }

    private fun tryReadBitmap(data: Uri): Bitmap? {
        try {
            MediaStore.Images.Media.getBitmap(contentResolver, data)
        } catch(e: IOException) {
            e.printStackTrace()
            null
        }
    }
}
