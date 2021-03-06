package io.github.theepicblock.polymc.mixins.wizards;

import net.minecraft.entity.Entity;
import net.minecraft.entity.data.TrackedData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.concurrent.atomic.AtomicInteger;

@Mixin(Entity.class)
public interface EntityAccessor {
    @Accessor("MAX_ENTITY_ID")
    static AtomicInteger getMaxEntityId() {
        throw new IllegalStateException();
    }

    @Accessor("FLAGS")
    static TrackedData<Byte> getFlagTracker() {
        throw new IllegalStateException();
    }
}
