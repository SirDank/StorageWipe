package me.StorageWipe;

import me.StorageWipe.Commands.CMD;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.stipess1.updater.Updater;

public class Main extends JavaPlugin {
  public static String prefix = "§6[§a§lStorageWipe§6] §a";
  
  public static String perms = String.valueOf(prefix) + "§b➤ §cYou don't have required permission.";
  
  public static Plugin pl;
  
  public void onEnable() {
    pl = (Plugin)this;
    registerCommands();
    Bukkit.getConsoleSender().sendMessage(String.valueOf(prefix) + "§aPlugin succesfully enabled");
    int ID = 93195;
    Updater updater = new Updater(this, ID, this.getFile(), Updater.UpdateType.CHECK_DOWNLOAD, true);
  }
  
  public void onDisable() {
    pl = null;
    Bukkit.getConsoleSender().sendMessage(String.valueOf(prefix) + "§cPlugin succesfully disabled");
  }
  
  public void registerCommands() {
    getCommand("storagewipe").setExecutor((CommandExecutor)new CMD());
  }
}
