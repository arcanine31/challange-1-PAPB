package com.example.challange

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
//companion object for parameter on imageview selection
    companion object{
        val SELECT_HEAD_PICTURE = 200
        val SELECT_HAIR_PICTURE = 201
        val SELECT_MOUSTACHE_PICTURE = 202
        val SELECT_EYES_PICTURE = 203
        val SELECT_EYEBROW_PICTURE = 204
        val SELECT_BEARD_PICTURE = 205

    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }

//button onCLickListener
    fun initListener(){
        findViewById<Button>(R.id.btn_head).setOnClickListener{
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_HEAD_PICTURE)
        }

        findViewById<Button>(R.id.btn_hair).setOnClickListener{
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_HAIR_PICTURE)

        }

        findViewById<Button>(R.id.btn_moustache).setOnClickListener{
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_MOUSTACHE_PICTURE)
        }

        findViewById<Button>(R.id.btn_eyes).setOnClickListener{
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_EYES_PICTURE)
        }

        findViewById<Button>(R.id.btn_eyebrow).setOnClickListener{
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_EYEBROW_PICTURE)
        }

        findViewById<Button>(R.id.btn_beard).setOnClickListener{
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_BEARD_PICTURE)

        }

    }

//    to replace image in activity
    override fun onActivityResult(reqCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(reqCode, resultCode, data)
        if (resultCode === Activity.RESULT_OK) {

            if (reqCode === SELECT_HEAD_PICTURE) {
                    findViewById<ImageView>(R.id.img_head).setImageURI(data?.data)
                    findViewById<ImageView>(R.id.img_head).visibility = View.VISIBLE
            }
            else if (reqCode === SELECT_HAIR_PICTURE) {
                findViewById<ImageView>(R.id.img_hair).setImageURI(data?.data)
                findViewById<ImageView>(R.id.img_hair).visibility = View.VISIBLE
            }
            else if (reqCode === SELECT_MOUSTACHE_PICTURE) {
                findViewById<ImageView>(R.id.img_moustache).setImageURI(data?.data)
                findViewById<ImageView>(R.id.img_moustache).visibility = View.VISIBLE
            }
            else if (reqCode === SELECT_EYES_PICTURE) {
                findViewById<ImageView>(R.id.img_eyes).setImageURI(data?.data)
                findViewById<ImageView>(R.id.img_eyes).visibility = View.VISIBLE
            }
            else if (reqCode === SELECT_EYEBROW_PICTURE) {
                findViewById<ImageView>(R.id.img_eyebrow).setImageURI(data?.data)
                findViewById<ImageView>(R.id.img_eyebrow).visibility = View.VISIBLE
            }
            else if (reqCode === SELECT_BEARD_PICTURE) {
                findViewById<ImageView>(R.id.img_beard).setImageURI(data?.data)
                findViewById<ImageView>(R.id.img_beard).visibility = View.VISIBLE
            }
        }
    }
}