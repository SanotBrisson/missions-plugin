package me.sanotbrisson.missions.command;

import io.github.lemon.core.annotation.Command;
import org.bukkit.command.CommandSender;

public class MissionsCommand<Execution> {

    @Command(
            name = "missoes",
            aliases = {"missions"},
            inGameOnly = true
    )
    public void missions(Execution execution, CommandSender sender) {

    }

}
