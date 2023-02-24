package com.example.botloner.command;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import com.example.botloner.utils.MessageUtils;

@Component
public class NotSupported implements Command{
    private final MessageUtils messageUtils;

    public NotSupported(MessageUtils messageUtils) {
        this.messageUtils = messageUtils;
    }

    @Override
    public SendMessage execute(Update update) {
        String name = update.getMessage().getChat().getFirstName();
        return messageUtils.generationSendMessage(update,
                "Не поддерживаю эти операции " + name);
    }
}
