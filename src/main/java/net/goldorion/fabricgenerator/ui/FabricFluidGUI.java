package net.goldorion.fabricgenerator.ui;

import net.goldorion.fabricgenerator.elements.FabricFluid;
import net.mcreator.ui.MCreator;
import net.mcreator.ui.modgui.ModElementGUI;
import net.mcreator.ui.validation.AggregatedValidationResult;
import net.mcreator.workspace.elements.ModElement;

import javax.annotation.Nonnull;

public class FabricFluidGUI extends ModElementGUI<FabricFluid> {

    public FabricFluidGUI(MCreator mcreator, @Nonnull ModElement modElement, boolean editingMode) {
        super(mcreator, modElement, editingMode);
    }

    @Override
    protected void initGUI() {

    }

    @Override
    protected AggregatedValidationResult validatePage(int i) {
        return new AggregatedValidationResult.PASS();
    }

    @Override
    protected void openInEditingMode(FabricFluid fabricFluid) {

    }

    @Override
    public FabricFluid getElementFromGUI() {
        return null;
    }
}
