package com.example.lesson_6_month3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson_6_month3.databinding.FragmentUpBinding
import com.example.lesson_6_month3.databinding.ItemSongBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FragmentUpBinding
    private val songList = arrayListOf(
        SongModel("Let me down Slowly", "Alec Benjamin", 1),
        SongModel("Without Me", "Eminem",2),
        SongModel("И через года", "Jandro",3),
        SongModel("Дениздеги", "Акжолтой",4),
        SongModel("I'am still standing","Elon John",5),
        SongModel("Очи", "Bakr",6),
        SongModel("За любовь", "Bakr",7),
        SongModel("Госпожа", "ADIL",8),
        SongModel("TAMADA", "MiyaGi & AndyPanda",9),
        SongModel("I need a Dollar", "Aloe Blacc",10),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = SongAdapter(songList, this::onClick)
        binding.rvSongs.adapter = adapter


    }

private fun onClick(position: Int){

    val secondActivity = SecondActivity()
    val intent = Intent(this@MainActivity, secondActivity::class.java)
    intent.putExtra("name", songList[position].name)
    startActivity(intent)

}
}
