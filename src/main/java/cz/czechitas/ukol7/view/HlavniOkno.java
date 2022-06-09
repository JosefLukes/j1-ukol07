package cz.czechitas.ukol7.view;

import cz.czechitas.ukol7.controller.PreferenceController;
import cz.czechitas.ukol7.formbuilder.FormBuilder;
import cz.czechitas.ukol7.formbuilder.FormBuilderWithContainer;
import cz.czechitas.ukol7.model.Barva;
import cz.czechitas.ukol7.model.PreferenceBean;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class HlavniOkno extends JFrame {


    private final PreferenceController controller;

    public HlavniOkno(PreferenceController controller) throws HeadlessException {
        super("Vyber barvu");
        this.controller = controller;
        this.init();
    }

    public void start() {
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setIconImage(new ImageIcon(Aplikace.class.getResource("czechitas-icon.png")).getImage());
        setLayout(new MigLayout("wrap 4", "[right]rel[50:75:250,grow,fill]unrel[right]rel[50:75:250,grow,fill]"));
        setMinimumSize(new Dimension(400, 200));

        FormBuilderWithContainer<PreferenceBean> formBuilder = FormBuilder.create(controller.getModel())
                .container(this);

        for (Barva value : Barva.values()) {
            formBuilder
                    .label("&Barva")
                    .radioButton(value.getBarva(), "barva", value)

                    .add();
        }



        formBuilder
                .label("&Předzdívka")
                .textField("predzdivka")
                .add();


        formBuilder
                .panel(panel -> {
                    //JButton novyButton = new JButton(controller.getNovyAction());
                    JButton ulozitButton = new JButton(controller.getUlozitAction());

                    getRootPane().setDefaultButton(ulozitButton);


                    panel.add(ulozitButton);
                })
                .add("right, span");

        pack();
    }

}
