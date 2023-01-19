package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener{
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged(this);
    }
}
