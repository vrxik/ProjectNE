package com.vrx.ideolotab;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ideolotab extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("x-ray")) {
            if(sender instanceof Player){
                Player player = (Player) sender;
                player.sendMessage("Ten serwer jest zabezpieczony");
            }else{
                System.out.println("Musisz byc graczem aby użyć tej komendy.");
            }

        }





        return false;
    }
}
