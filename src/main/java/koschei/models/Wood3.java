package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Wood3 {
    @Autowired
    private Rabbit4 rabbit;

    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
