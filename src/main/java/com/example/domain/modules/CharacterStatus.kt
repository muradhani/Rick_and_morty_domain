package com.example.domain.modules

import android.graphics.Color


sealed class CharacterStatus(val displayName :String , val color: Int)  {
    object Alive : CharacterStatus("Alive", Color.GREEN)
    object Dead : CharacterStatus("Dead", Color.RED)
    object Unknown : CharacterStatus("Unknown", Color.YELLOW)

}