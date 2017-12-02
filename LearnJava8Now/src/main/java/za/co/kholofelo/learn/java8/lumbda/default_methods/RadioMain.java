package za.co.kholofelo.learn.java8.lumbda.default_methods;

import za.co.kholofelo.learn.java8.lumbda.entities.Person;

/**
 * @author Kholofelo Maloma
 * @since 2017/11/29.
 */
public class RadioMain implements RadioProgram{

    public static void main(String[] args) {
        new RadioMain().findCurrentSpeaker();
    }

    @Override
    public void speak(Person person, long duration) {
    }


}
