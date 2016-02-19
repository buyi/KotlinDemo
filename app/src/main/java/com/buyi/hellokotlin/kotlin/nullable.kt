package com.buyi.hellokotlin.kotlin

import android.support.annotation.Nullable

/**
 * Created by buyi on 16/2/19.
 */

 //If the expression to the left of ?: is not null, the elvis operator returns it,
 // otherwise it returns the expression to the right.
 // Note that the right-hand side expression is evaluated only if the left-hand side is null.
//http://kotlinlang.org/docs/reference/null-safety.html
class nullable {
    fun sendMessageToClient(
            client: Client?, message: String?, mailer: Mailer
    ){

        if (client == null || message == null) return

        val personalInfo = client.personalInfo ?: return

        val email = personalInfo.email ?: return

        mailer.sendMessage(email, message)

    }

    class Client (val personalInfo: PersonalInfo?)
    class PersonalInfo (val email: String?)
    interface Mailer {
        fun sendMessage(email: String, message: String)
    }
}