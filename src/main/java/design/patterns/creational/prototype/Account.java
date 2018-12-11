package design.patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Account implements Cloneable {

    abstract public void accountType();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            log.warn(e.getMessage(), e);
        }
        return clone;
    }
}
