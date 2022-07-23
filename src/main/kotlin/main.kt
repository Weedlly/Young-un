
import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.annotations.TelegramCommand
import eu.vendeli.tgbot.annotations.TelegramInput
import eu.vendeli.tgbot.api.message
import eu.vendeli.tgbot.types.User
import eu.vendeli.tgbot.types.internal.ProcessedUpdate
import eu.vendeli.tgbot.types.internal.UpdateType

suspend fun main() {
    val BOT_TOKEN : String = "5425795377:AAFpD2STi6lQdlieBS8z9xPAIh3w-QNvdLk"
    val bot = TelegramBot(BOT_TOKEN, "org.example")
    /**
     * Second parameter is the package in which commands/inputs will be searched.
     */

    bot.handleUpdates()
    // start long-polling listener
}

@TelegramCommand(["/start"])
suspend fun start(user: User, bot: TelegramBot) {
    message { "Hello" }.send(to = user, via = bot)
}
