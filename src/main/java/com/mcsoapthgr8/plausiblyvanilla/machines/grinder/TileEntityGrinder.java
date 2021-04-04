package mcsoapthgr8.plausiblyvanilla.machines.grinder;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.items.ItemStackHandler;

import java.util.HashMap;

public class TileEntityGrinder extends TileEntity {
    private enum SlotType {
        INPUT_TOP(1, "topItems"),
        INPUT_FUEL(1, "fuelItems"),
        INPUT_GEAR_SET(1, "gearSet"),
        OUTPUT_BOTTOM(3, "outputItems");

        private int slotSize;
        private String nbtKey;

        SlotType(final int slotSize, final String nbtKey) {
            this.slotSize = slotSize;
            this.nbtKey = nbtKey;
        }
    }

    private HashMap<String, ItemStackHandler> itemStackHandlers = new HashMap<>();

    public TileEntityGrinder() {
        for (SlotType st : SlotType.values()) {
            if (!itemStackHandlers.containsKey(st.nbtKey)) {
                itemStackHandlers.put(st.nbtKey, createItemStackHandler(st));
            }
        }
    }

    private ItemStackHandler createItemStackHandler(SlotType st) {
        return new ItemStackHandler(st.slotSize) {
            @Override
            protected void onContentsChanged(int slot) {
                TileEntityGrinder.this.markDirty();
            }
        };
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        for (HashMap.Entry<String, ItemStackHandler> entry : itemStackHandlers.entrySet()) {
            if (compound.hasKey(entry.getKey())) {
                entry.getValue().deserializeNBT((NBTTagCompound) compound.getTag(entry.getKey()));
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        for (HashMap.Entry<String, ItemStackHandler> entry : itemStackHandlers.entrySet()) {
            compound.setTag(entry.getKey(), entry.getValue().serializeNBT());
        }

        return compound;
    }
}
