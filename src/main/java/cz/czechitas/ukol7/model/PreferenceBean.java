package cz.czechitas.ukol7.model;

import com.jgoodies.binding.beans.ExtendedPropertyChangeSupport;
import com.jgoodies.common.bean.ObservableBean;

import java.beans.PropertyChangeListener;

public class PreferenceBean implements ObservableBean {
    private final ExtendedPropertyChangeSupport pcs = new ExtendedPropertyChangeSupport(this);

    private String predzdivka;

    private Barva barva;

    public String getPredzdivka() {
        return predzdivka;
    }

    public void setPredzdivka(String predzdivka) {
        String oldValue = this.predzdivka;
        this.predzdivka = predzdivka;
        pcs.firePropertyChange("predzdivka", oldValue, predzdivka);
    }

    public Barva getBarva() {
        return barva;
    }

    public void setBarva(Barva barva) {
        Barva oldValue = this.barva;
        this.barva = barva;
        pcs.firePropertyChange("barva", oldValue, barva);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
