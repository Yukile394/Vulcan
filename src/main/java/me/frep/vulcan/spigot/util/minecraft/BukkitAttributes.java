package me.frep.vulcan.spigot.util.minecraft;

import org.bukkit.Registry;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;

public final class BukkitAttributes {

    private static final Attribute MOVEMENT_SPEED = resolve();

    private static Attribute resolve() {
        Attribute attribute = Registry.ATTRIBUTE.get(NamespacedKey.minecraft("movement_speed"));
        if (attribute == null) {
            attribute = Registry.ATTRIBUTE.get(NamespacedKey.minecraft("generic.movement_speed"));
        }
        return attribute;
    }

    public static Attribute movementSpeed() {
        return MOVEMENT_SPEED;
    }

    private BukkitAttributes() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
