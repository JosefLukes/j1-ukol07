package cz.czechitas.ukol7.controller;

import com.jgoodies.binding.PresentationModel;
import com.jgoodies.binding.beans.ExtendedPropertyChangeSupport;
import cz.czechitas.ukol7.formbuilder.ActionBuilder;
import cz.czechitas.ukol7.model.PreferenceBean;

import javax.swing.*;

public class PreferenceController  {
    private final PresentationModel<PreferenceBean> model;
//    private final Action novyAction;
    private final Action ulozitAction;


    public PreferenceController() {
        model = new PresentationModel<>(new PreferenceBean());
        ulozitAction = ActionBuilder.create("&Uložit", this::ulozitAction);
        
    }

    private void ulozitAction() {
        PreferenceBean bean = this.model.getBean();

        System.out.printf("Predzdivka: %s", bean.getPredzdivka()).println();
        System.out.printf("Barva: %s", bean.getBarva()).println();

    }

    public Action getUlozitAction() {
        return ulozitAction;
    }

    public PresentationModel<PreferenceBean> getModel() {
        return model;
    }
}
