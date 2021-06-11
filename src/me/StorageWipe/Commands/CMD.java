package me.StorageWipe.Commands;

import me.StorageWipe.API.API;
import me.StorageWipe.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD implements CommandExecutor {
  Player p;
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    this.p = (Player)sender;
    if (!this.p.hasPermission("storagewipe.cmd")) {
      this.p.sendMessage(Main.perms);
      return true;
    } 
    if (args.length == 0) {
      this.p.sendMessage("§b➤ §6/storagewipe §f<blockname>§6 chunk §b[ §aClear storage of block in your current chunk. §b]");
      this.p.sendMessage("§b➤ §6/storagewipe §f<blockname>§6 world §b[ §aClear storage of block in your current world. §b]");
      this.p.sendMessage("§b➤ §6/storagewipe §f<blockname>§6 server §b[ §aClear storage of block in the server. §b]");
      this.p.sendMessage("§b➤ §6Supported Blocks§b: §aBarrel§b, §aChest§b, §aBlastFurnace§b, §aDispenser§b, §aDropper§b, §aFurnace§b, §aHopper");
      this.p.sendMessage("§6Plugin made by§b: §aantonschouten §b| §6Updated by§b: §aSirDankenstein");
      return true;
    } 
    else if ( !args[0].equalsIgnoreCase("Barrel") && !args[0].equalsIgnoreCase("Chest") && !args[0].equalsIgnoreCase("BlastFurnace") && !args[0].equalsIgnoreCase("Dispenser") && !args[0].equalsIgnoreCase("Dropper") && !args[0].equalsIgnoreCase("Furnace") && !args[0].equalsIgnoreCase("Hopper") ) {
      this.p.sendMessage("§cBlock not supported§f!");
      return true;
    }
    else if (args[1].equalsIgnoreCase("chunk")) {
        API.clearChunk(this.p, args[0]);
        this.p.sendMessage(String.valueOf(Main.prefix) + "§6All §a" + args[0] + "s§6 in your current §achunk §6have been reset!");
        return true;
    } 
    else if (args[1].equalsIgnoreCase("world")) {
      API.clearWorld(this.p, args[0]);
      this.p.sendMessage(String.valueOf(Main.prefix) + "§6All §a" + args[0] + "s§6 in world §b{ §a" + this.p.getWorld().getName() + "§b } §6 have been reset!");
      return true;
    } 
    else if (args[1].equalsIgnoreCase("server")) {
      API.clearServer(this.p, args[0]);
      this.p.sendMessage(String.valueOf(Main.prefix) + "§6All §a" + args[0] + "s§6 on the §aserver §6have been reset!");
      return true;
    } 
    else {
      this.p.sendMessage("§b➤ §6/storagewipe §f<blockname>§6 chunk §b[ §aClear storage of block in your current chunk. §b]");
      this.p.sendMessage("§b➤ §6/storagewipe §f<blockname>§6 world §b[ §aClear storage of block in your current world. §b]");
      this.p.sendMessage("§b➤ §6/storagewipe §f<blockname>§6 server §b[ §aClear storage of block in the server. §b]");
      this.p.sendMessage("§b➤ §6Supported Blocks§b: §aBarrel§b, §aChest§b, §aBlastFurnace§b, §aDispenser§b, §aDropper§b, §aFurnace§b, §aHopper");
      this.p.sendMessage("§6Plugin made by§b: §aantonschouten §b| §6Updated by§b: §aSirDankenstein");
      return true;
    }
  }
}
