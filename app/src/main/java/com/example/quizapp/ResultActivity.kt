package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_username.text = username

        val Score = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        val total = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        score.text = "Your score is $Score out of $total"

        btn_home.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        btn_reset.setOnClickListener{
            intent = Intent(this, QuizQuestionActivity::class.java)
            startActivity(intent)
            tv_username.text= username
            finish()
        }

    }
}