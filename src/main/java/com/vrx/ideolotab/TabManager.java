package com.vrx.ideolotab;

import net.minecraft.server.v1_16_R3.ChatComponentText;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class TabManager {

    private List<ChatComponentText> headers = new ArrayList<>();
    private List<ChatComponentText> footers = new ArrayList<>();

    private Ideolotab plugin;
    public TabManager(Ideolotab plugin) {
        this.plugin = plugin;
    }

    public void addHeader(String header) {
        headers.add(new ChatComponentText(header));
    }

    public void addFooter(String footer) {
        headers.add(new ChatComponentText(footer));
    }

    private String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg)
    }
}
