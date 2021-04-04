package com.mcsoapthgr8.plausiblyvanilla.utils;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import net.minecraft.util.Identifier;

public class Factory {
    public static Identifier createIdentifier(String name) {
        return new Identifier(Constants.MOD_ID, name);
    }
}
