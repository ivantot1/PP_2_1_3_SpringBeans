package app.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog extends Animal {

    @Override
    @Qualifier
    public String toString() {
        return "Im a Dog";
    }
}
