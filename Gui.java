//Make sure to make this your package
package yourPackage;

//The imports
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Gui {

    //Define the variables
    Inventory gui;
    String guiName;
    Player player;
    int rows;
    ItemStack[] items;

    //The actual creationg of the GUI
    public Gui(Player player, String guiName, int rows, ItemStack[] items) {

        this.guiName = guiName;
        this.player = player;
        this.rows = rows;
        this.items = items;

    }

    //The rest are the methods
    public void setPlayer(Player player) {
        this.player = (player);
    }

    public void setItems(ItemStack[] items) {
        this.items = items;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setGuiName(String newGuiName) {
        this.guiName = newGuiName;
    }

    public void setItem(ItemStack item, int slot) {
        this.gui.setItem(slot, item);
    }

    public void openGui() {

        this.gui = Bukkit.createInventory(this.player, this.rows * 9, ChatColor.translateAlternateColorCodes('&', this.guiName));
        this.gui.setContents(this.items);
        this.player.openInventory(this.gui);

    }

    public void refreshGuiContents() {
        this.gui.setContents(this.items);
    }

    public String getGuiName() {
        return this.guiName;
    }

    public ItemStack getItem(int itemSlot) {
        return this.gui.getItem(itemSlot);
    }

    public String getPlayerName() {
        return this.player.getDisplayName();
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getRows() {
        return this.rows;
    }
}
