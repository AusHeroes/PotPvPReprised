package net.frozenorb.potpvp.command.impl;

import net.frozenorb.potpvp.command.PotPvPCommand;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import xyz.refinedev.api.annotation.Command;
import xyz.refinedev.api.annotation.Require;

public class SetSpawnCommand implements PotPvPCommand {

    @Command(name = "", desc = "Set spawn command")
    @Require("potpvp.setspawn")
    public void setSpawn(Player sender) {
        Location loc = sender.getLocation();

        sender.getWorld().setSpawnLocation(
            loc.getBlockX(),
            loc.getBlockY(),
            loc.getBlockZ()
        );

        sender.sendMessage(ChatColor.YELLOW + "Spawn point updated!");
    }

    @Override
    public String getCommandName() {
        return "setspawn";
    }

    @Override
    public String[] getAliases() {
        return new String[]{};
    }
}