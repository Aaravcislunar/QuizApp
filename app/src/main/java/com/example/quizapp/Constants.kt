package com.example.quizapp

object Constants{

    const val USER_NAME : String= "user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS : String= "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What is the capital of India?",
            "Delhi",
            "Mumbai",
            "Chennai",
            "Madhya Pradesh",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            2,
            "Which the national fruit of India?",
            "Grapes",
            "Apple",
            "Pineapple",
            "Mango",
             4
        )
        questionsList.add(que2)
        val que3 = Question(
            3,
            "Which of the following states is not located in the North?",
            "Jharkhand",
            "Jammu & Kashmir",
            "Himachal Pradesh",
            "Haryana",
            1
        )
        questionsList.add(que3)
        val que4 = Question(
            4,
            "Which state has the largest area?",
            "Madhya Pradesh",
            "Uttar Pradesh",
            "Chennai",
            "Jammu & Kashmir",
            2
        )
        questionsList.add(que4)
        val que5 = Question(
            5,
            "Which city in India is known as pink city?",
            "Delhi",
            "Mumbai",
            "Surat",
            "Jaipur",
            4
        )
        questionsList.add(que5)
        return questionsList
    }
}