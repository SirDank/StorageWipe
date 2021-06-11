package me.StorageWipe.API;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;

import org.bukkit.block.Barrel;
import org.bukkit.block.Chest;
import org.bukkit.block.BlastFurnace;
import org.bukkit.block.Dispenser;
import org.bukkit.block.Dropper;
import org.bukkit.block.Furnace;
import org.bukkit.block.Hopper;

public class API {
  public static void clearWorld(Player p, String Blockname) {
    World w = p.getWorld();
    byte b;
    int i;
    Chunk[] arrayOfChunk;
    for (i = (arrayOfChunk = w.getLoadedChunks()).length, b = 0; b < i; ) {
      Chunk c = arrayOfChunk[b];
      byte b1;
      int j;
      BlockState[] arrayOfBlockState;
      for (j = (arrayOfBlockState = c.getTileEntities()).length, b1 = 0; b1 < j; ) {
        BlockState blockState = arrayOfBlockState[b1];
        if (Blockname.equalsIgnoreCase("Barrel")) {
          if (blockState instanceof Barrel) {
            Barrel barrel = (Barrel)blockState;
            barrel.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Chest")) {
          if (blockState instanceof Chest) {
            Chest chest = (Chest)blockState;
            chest.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("BlastFurnace")) {
          if (blockState instanceof BlastFurnace) {
        	BlastFurnace blastfurnace = (BlastFurnace)blockState;
        	blastfurnace.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Dispenser")) {
          if (blockState instanceof Dispenser) {
        	Dispenser dispenser = (Dispenser)blockState;
        	dispenser.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Dropper")) {
          if (blockState instanceof Dropper) {
        	Dropper dropper = (Dropper)blockState;
        	dropper.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Furnace")) {
          if (blockState instanceof Furnace) {
            Furnace furnace = (Furnace)blockState;
          	furnace.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Hopper")) {
          if (blockState instanceof Hopper) {
        	Hopper hopper = (Hopper)blockState;
        	hopper.getInventory().clear();
          } 
        }
        b1++;
      } 
      b++;
    } 
  }
  
  public static void clearChunk(Player p, String Blockname) {
    Chunk c = p.getLocation().getChunk();
    byte b;
    int i;
    BlockState[] arrayOfBlockState;
    for (i = (arrayOfBlockState = c.getTileEntities()).length, b = 0; b < i; ) {
      BlockState blockState = arrayOfBlockState[b];
      if (Blockname.equalsIgnoreCase("Barrel")) {
        if (blockState instanceof Barrel) {
          Barrel barrel = (Barrel)blockState;
          barrel.getInventory().clear();
        } 
      }
      else if (Blockname.equalsIgnoreCase("Chest")) {
        if (blockState instanceof Chest) {
          Chest chest = (Chest)blockState;
          chest.getInventory().clear();
        } 
      }
      else if (Blockname.equalsIgnoreCase("BlastFurnace")) {
        if (blockState instanceof BlastFurnace) {
          BlastFurnace blastfurnace = (BlastFurnace)blockState;
          blastfurnace.getInventory().clear();
        } 
      }
      else if (Blockname.equalsIgnoreCase("Dispenser")) {
        if (blockState instanceof Dispenser) {
          Dispenser dispenser = (Dispenser)blockState;
          dispenser.getInventory().clear();
        } 
      }
      else if (Blockname.equalsIgnoreCase("Dropper")) {
        if (blockState instanceof Dropper) {
          Dropper dropper = (Dropper)blockState;
          dropper.getInventory().clear();
        } 
      }
      else if (Blockname.equalsIgnoreCase("Furnace")) {
        if (blockState instanceof Furnace) {
          Furnace furnace = (Furnace)blockState;
          furnace.getInventory().clear();
        } 
      }
      else if (Blockname.equalsIgnoreCase("Hopper")) {
        if (blockState instanceof Hopper) {
          Hopper hopper = (Hopper)blockState;
          hopper.getInventory().clear();
        } 
      }
      b++;
    } 
  }
  
  public static void clearServer(Player p, String Blockname) {
    World w = (World)Bukkit.getWorlds();
    byte b;
    int i;
    Chunk[] arrayOfChunk;
    for (i = (arrayOfChunk = w.getLoadedChunks()).length, b = 0; b < i; ) {
      Chunk c = arrayOfChunk[b];
      byte b1;
      int j;
      BlockState[] arrayOfBlockState;
      for (j = (arrayOfBlockState = c.getTileEntities()).length, b1 = 0; b1 < j; ) {
        BlockState blockState = arrayOfBlockState[b1];
        if (blockState instanceof Chest) {
          Chest chest = (Chest)blockState;
          chest.getInventory().clear();
        } 
        if (Blockname.equalsIgnoreCase("Barrel")) {
          if (blockState instanceof Barrel) {
            Barrel barrel = (Barrel)blockState;
            barrel.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Chest")) {
          if (blockState instanceof Chest) {
            Chest chest = (Chest)blockState;
            chest.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("BlastFurnace")) {
          if (blockState instanceof BlastFurnace) {
            BlastFurnace blastfurnace = (BlastFurnace)blockState;
            blastfurnace.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Dispenser")) {
          if (blockState instanceof Dispenser) {
            Dispenser dispenser = (Dispenser)blockState;
            dispenser.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Dropper")) {
          if (blockState instanceof Dropper) {
            Dropper dropper = (Dropper)blockState;
            dropper.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Furnace")) {
          if (blockState instanceof Furnace) {
            Furnace furnace = (Furnace)blockState;
            furnace.getInventory().clear();
          } 
        }
        else if (Blockname.equalsIgnoreCase("Hopper")) {
          if (blockState instanceof Hopper) {
            Hopper hopper = (Hopper)blockState;
            hopper.getInventory().clear();
          } 
        }
        b1++;
      } 
      b++;
    } 
  }
}
