import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.api.message

suspend fun main() {
    val bot = TelegramBot("5425795377:AAFpD2STi6lQdlieBS8z9xPAIh3w-QNvdLk")

    bot.handleUpdates { update ->
        onCommand("/start") {
            message { "Ni hao" }.send(update.message!!.from!!.id, bot)
        }
        onCommand("/bye") {
            message { "bye bye" }.send(update.message!!.from!!.id, bot)
        }
    }
}
