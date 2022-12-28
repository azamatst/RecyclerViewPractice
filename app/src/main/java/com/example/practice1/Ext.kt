package com.example.practice1

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Context.showToast(msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}
fun Fragment.showToast(msg:String){
    Toast.makeText(requireContext() , msg, Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.addFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
}

fun Fragment.replaceFragment(fragment: Fragment){
    requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,fragment).addToBackStack(null)
        .commit()
}