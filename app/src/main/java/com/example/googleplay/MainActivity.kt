package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rowGames = ArrayList<Items>()

        rowGames.add(Items(R.drawable.darkrise, "Darkrise - Pixel Action RPG", "4.7 ⭐"))
        rowGames.add(Items(R.drawable.lifeinadventure, "Life in Adventure", "4.5 ⭐"))
        rowGames.add(Items(R.drawable.chikechase, "Chiki's Chase", "4.4 ⭐"))
        rowGames.add(Items(R.drawable.kinggodcastle, "King God Castle", "4.3 ⭐"))
        rowGames.add(Items(R.drawable.root, "Root Board Game", "5.0 ⭐"))
        rowGames.add(Items(R.drawable.dawncaster, "Dawncaster: Deckbuilding RPG", "4.5 ⭐"))
        rowGames.add(Items(R.drawable.stardewvalley, "Stardew Valley", "4.8 ⭐"))

        val rowEducation = ArrayList<Items>()

        rowEducation.add(Items(R.drawable.duolingo, "Duolingo: Language Lessons", "4.7 ⭐"))
        rowEducation.add(Items(R.drawable.wikipedia, "Wikipedia", "4.6 ⭐"))
        rowEducation.add(Items(R.drawable.ted, "TED", "4.1 ⭐"))
        rowEducation.add(Items(R.drawable.blinkist, "Blinkist: Big Ideas in 15 Min", "4.8 ⭐"))
        rowEducation.add(Items(R.drawable.falou, "Falou - Fast language learning", "4.7 ⭐"))
        rowEducation.add(Items(R.drawable.elsa, "ELSA: AI Learn & Speak English", "4.7 ⭐"))
        rowEducation.add(Items(R.drawable.neuronation, "NeuroNation - Brain Training", "4.9 ⭐"))

        val rowRecommend = ArrayList<Items>()

        rowRecommend.add(Items(R.drawable.renshuu, "renshuu - Japanese learning", "4.9 ⭐"))
        rowRecommend.add(Items(R.drawable.japanese, "Japanese Kanji Study", "4.8 ⭐"))
        rowRecommend.add(Items(R.drawable.samnote, "Samsung Notes", "4.8 ⭐"))
        rowRecommend.add(Items(R.drawable.deepstash, "GitHub", "4.6 ⭐"))
        rowRecommend.add(Items(R.drawable.github, "renshuu - Japanese learning", "4.9 ⭐"))
        rowRecommend.add(Items(R.drawable.microsoftedge, "Microsoft Edge: Browse with AI", "4.7 ⭐"))
        rowRecommend.add(Items(R.drawable.questionai, "Question.AI - Homework Helper", "4.1 ⭐"))

        val rowGames2 = ArrayList<Items>()

        rowGames2.add(Items(R.drawable.kinggodcastle, "King God Castle", "4.3 ⭐"))
        rowGames2.add(Items(R.drawable.root, "Root Board Game", "5.0 ⭐"))
        rowGames2.add(Items(R.drawable.dawncaster, "Dawncaster: Deckbuilding RPG", "4.5 ⭐"))
        rowGames2.add(Items(R.drawable.stardewvalley, "Stardew Valley", "4.8 ⭐"))
        rowGames2.add(Items(R.drawable.darkrise, "Darkrise - Pixel Action RPG", "4.7 ⭐"))
        rowGames2.add(Items(R.drawable.lifeinadventure, "Life in Adventure", "4.5 ⭐"))
        rowGames2.add(Items(R.drawable.chikechase, "Chiki's Chase", "4.4 ⭐"))

        val rowEducation2 = ArrayList<Items>()

        rowEducation2.add(Items(R.drawable.falou, "Falou - Fast language learning", "4.7 ⭐"))
        rowEducation2.add(Items(R.drawable.elsa, "ELSA: AI Learn & Speak English", "4.7 ⭐"))
        rowEducation2.add(Items(R.drawable.neuronation, "NeuroNation - Brain Training", "4.9 ⭐"))
        rowEducation2.add(Items(R.drawable.duolingo, "Duolingo: Language Lessons", "4.7 ⭐"))
        rowEducation2.add(Items(R.drawable.wikipedia, "Wikipedia", "4.6 ⭐"))
        rowEducation2.add(Items(R.drawable.ted, "TED", "4.1 ⭐"))
        rowEducation2.add(Items(R.drawable.blinkist, "Blinkist: Big Ideas in 15 Min", "4.8 ⭐"))
        
        val apps = ArrayList<ArrayItem>()

        apps.add(ArrayItem("Top-rated games", rowGames))
        apps.add(ArrayItem("Educational apps", rowEducation))
        apps.add(ArrayItem("Recommended for you", rowRecommend))
        apps.add(ArrayItem("Strategy", rowGames2))
        apps.add(ArrayItem("Productivity", rowEducation2))

        val Recycleradapter = findViewById<RecyclerView>(R.id.main_rv)
        Recycleradapter.adapter = ItemAdapter(this, apps)
        Recycleradapter.layoutManager = LinearLayoutManager(this)
    }
}