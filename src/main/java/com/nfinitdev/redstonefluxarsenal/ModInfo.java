package com.nfinitdev.redstonefluxarsenal;

public class ModInfo {
    public static final String PACKAGE_NAME = "com.";
    public static final String MOD_ID = "redstonefluxarsenal";
    public static final String MOD_NAME = "Redstone Flux Arsenal";
    public static final String VERSION_BUILD = "1.2.0";
    public static final String MINECRAFT_VERSION = "@MCVERSION@";
    public static final String FORGE_VERSION = "@FORGEVERSION@";
    public static final String DEPENDENCIES = "required-after:Forge";
    public static final String SERVER_PROXY_CLASS = PACKAGE_NAME + MOD_ID + ".proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = PACKAGE_NAME + MOD_ID + ".proxy.ClientProxy";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String GUI_FACTORY = PACKAGE_NAME + MOD_ID + ".client.gui.GuiFactoryTeslaArsenal";

    private ModInfo() {

    }
}