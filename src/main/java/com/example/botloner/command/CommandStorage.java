package com.example.botloner.command;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Getter
public class CommandStorage {
    private final Map<String, Command> storage;

    public CommandStorage(Map<String, Command> storage) {
        this.storage = storage;
    }
}
