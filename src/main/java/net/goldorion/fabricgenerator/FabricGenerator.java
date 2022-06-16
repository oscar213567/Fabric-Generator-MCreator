package net.goldorion.fabricgenerator;

import net.goldorion.fabricgenerator.elements.FabricFluid;
import net.goldorion.fabricgenerator.ui.FabricFluidGUI;
import net.mcreator.element.BaseType;
import net.mcreator.element.ModElementType;
import net.mcreator.element.ModElementTypeLoader;
import net.mcreator.element.RecipeType;
import net.mcreator.plugin.JavaPlugin;
import net.mcreator.plugin.Plugin;
import net.mcreator.plugin.events.PreGeneratorsLoadingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricGenerator extends JavaPlugin {

    public static final Logger LOG = LogManager.getLogger("Fabric Generator");

    public static ModElementType<?> FABRIC_FLUID;

    public FabricGenerator(Plugin plugin) {
        super(plugin);

        addListener(PreGeneratorsLoadingEvent.class, e -> {
            FABRIC_FLUID = ModElementTypeLoader.register(new ModElementType<>("fabric_fluid", 'f',
                    BaseType.BLOCK, RecipeType.BUCKET, FabricFluidGUI::new, FabricFluid.class));
        });
    }
}
