package com.example.botloner.command;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import com.example.botloner.component.ComponentMenu;
import com.example.botloner.utils.MessageUtils;

@Component
public class App implements Command {
    private final MessageUtils messageUtils;
    private final ComponentMenu componentMenu;

    public App(MessageUtils messageUtils, ComponentMenu componentMenu) {
        this.messageUtils = messageUtils;
        this.componentMenu = componentMenu;
    }

    @Override
    public SendMessage execute(Update update) {
        String text = "Выберети пункт меню";
        return messageUtils.generationSendMessage(update, componentMenu.createMenuApp(), text);
    }
}
