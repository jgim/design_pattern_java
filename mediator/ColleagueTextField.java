package mediator;

import java.awt.*;
import java.awt.event.*;

public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String text, int size) {
        super(text, size);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

}
