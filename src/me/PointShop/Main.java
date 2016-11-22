package me.PointShop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private static Main plugin;

	public static Main getPlugin() {
		return plugin;
	}

	public void onEnable() {
		plugin = this;
		saveDefaultConfig();

		ConsoleCommandSender console = getServer().getConsoleSender();

		console.sendMessage(ChatColor.RED + "GUI Shop has been enabled");

	}

	PluginManager pm = Bukkit.getPluginManager();

	public void registerEvents() {
		pm.registerEvents(new EntityDeathListener(), this);
		pm.registerEvents(new PlayerJoinListener(), this);
	}

	public void onDisable() {
		saveConfig();

		ConsoleCommandSender console = getServer().getConsoleSender();

		console.sendMessage(ChatColor.RED + "GUI Shop has been disabled");

	}

}
