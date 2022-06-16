package net.goldorion.fabricgenerator.elements;

import net.mcreator.element.GeneratableElement;
import net.mcreator.workspace.elements.ModElement;

public class FabricFluid extends GeneratableElement {

    private FabricFluid() {
        this(null);
    }

    public FabricFluid(ModElement element) {
        super(element);
    }
}
