package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import lonelibs.net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permissible;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Class representing ItemAdder custom images feature.
 */
public class FontImageWrapper
{
    /**
     * Get a wrapper for the internal font image of ItemsAdder.
     *
     * @param namespacedID
     */
    public FontImageWrapper(String namespacedID)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to replace all the font images placeholders in a String.
     *
     * @param string String you want to get placeholders replaced.
     * @return String with placeholders replaced with unicode characters.
     */
    public static String replaceFontImages(String string)
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static Component replaceFontImages(Component adventureComponentLoneLibs)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static net.kyori.adventure.text.Component replaceFontImages(net.kyori.adventure.text.Component adventureComponent)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to replace all the font images placeholders in a String.
     *
     * @param player Player to check permissions to use the placeholders.
     *               Each placeholder permission is checked, and it won't be replaced if the player has no permission to use it.
     * @param string String you want to get placeholders replaced.
     * @return String with placeholders replaced with unicode characters.
     */
    public static String replaceFontImages(Player player, String string)
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static Component replaceFontImages(Permissible player, Component adventureComponentLoneLibs)
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    public static net.kyori.adventure.text.Component replaceFontImages(Permissible player, net.kyori.adventure.text.Component adventureComponent)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Shift a text/font image back or forward.
     * Useful to create complex HUDs or similar effects.
     *
     * @param str    the String you want to apply the offset to.
     * @param offset int offset in pixels
     * @return the modified String.
     */
    public static String applyPixelsOffsetToString(String str, int offset)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the internal ItemsAdder object. Should only be used by the plugin developer.
     */
    @Nullable
    public Object getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Namespace and ID in the format {@code namespace:id} for this font_image.
     *
     * @return String representing the namespace and ID of the font_image.
     */
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Checks if the font_image exists in ItemsAdder registry.
     *
     * @return true if the font_image exists in ItemsAdder registry.
     */
    public boolean exists()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the color + font_image unicode character + {@code ChatColor.RESET}.
     *
     * @return color + font_image unicode character + {@code ChatColor.RESET}.
     */
    public String getString()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get width of the font_image character.
     *
     * @return Width of the font_image character.
     */
    public int getWidth()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get height of the font_image character.
     *
     * @return Height of the font_image character.
     */
    public int getHeight()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get a copy of the font_image String with pixel offset applied to it.
     * Doesn't modify the original one.
     *
     * @param offset int offset in pixels.
     * @return A copy of the font_image String with pixel offset applied to it.
     * Doesn't modify the original one.
     */
    public String applyPixelsOffset(int offset)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the text color of this wrapper.
     *
     * @return Text color of this wrapper.
     */
    public ChatColor getColor()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Set color of this wrapper.
     *
     * @param color Color to set.
     */
    public void setColor(ChatColor color)
    {
        throw new NotActuallyItemsAdderException();
    }
}
