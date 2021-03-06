package de.geisslerbenjamin.jkmap.rectangle;

import de.geisslerbenjamin.jkmap.configuration.interfaces.TranslationInterface;
import de.geisslerbenjamin.jkmap.data.interfaces.RowCreatorInterface;
import de.geisslerbenjamin.jkmap.dialog.interfaces.CreateDialogInterface;
import de.geisslerbenjamin.jkmap.dialog.interfaces.InputParameterInterface;
import de.geisslerbenjamin.jkmap.drawable.interfaces.DrawableConfigurationInterface;
import javafx.stage.Stage;

/**
 * Display a dialog to create a new rectangle.
 *
 * @author Benjamin Geißler <benjamin.geissler@gmail.com>
 * @licence MIT
 */
public class CreateDialog extends AbstractRectangleDialog implements CreateDialogInterface {
    private DrawableConfigurationInterface standardConfig;
    private RowCreatorInterface creator;

    /**
     * Constructor.
     *
     * @param stage
     * @param translation
     * @param standardConfig
     * @param creator
     */
    public CreateDialog(
            Stage stage,
            TranslationInterface translation,
            DrawableConfigurationInterface standardConfig,
            RowCreatorInterface creator) {
        super(stage, translation);

        this.standardConfig = standardConfig;
        this.creator = creator;
    }

    @Override
    public void create() {
        this.display(new InputParameter(), "create");
    }

    @Override
    protected void handleInput(InputParameterInterface input) {
        this.creator.create(
                "rectangle",
                new Configuration(
                        this.standardConfig.getId(),
                        this.standardConfig.getX(),
                        this.standardConfig.getY(),
                        ((InputParameter) input).rotation,
                        this.standardConfig.getColor(),
                        this.standardConfig.getInformation(),
                        ((InputParameter) input).width,
                        ((InputParameter) input).height
                )
        );
    }
}
